package io.github.doenisf.comlink4j.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ApiRequestSigner {
    private static final Logger LOGGER = Logger.getLogger(ApiRequestSigner.class.getName());

    /**
     * Create the headers required if the API was set up requiring authentication.
     *
     * @param url       target url
     * @param method    REST method
     * @param body      JSON body of the request
     * @param accessKey access key of the API
     * @param secretKey secret key of the API
     * @return map of Strings with the header name as the key and the actual header as the value
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static Map<String, String> signPostRequest(Gson gson, Long reqTime, String url, String method, String body, String accessKey, String secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Security.addProvider(new BouncyCastleProvider());
        String reqTimeStr = String.valueOf(reqTime);

        String path = getPath(url);

        // Create HMAC-SHA256 signature
        Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        hmacSHA256.init(secretKeySpec);
        hmacSHA256.update(reqTimeStr.getBytes(StandardCharsets.UTF_8));
        hmacSHA256.update(method.getBytes(StandardCharsets.UTF_8));
        hmacSHA256.update(path.getBytes(StandardCharsets.UTF_8));

        // Stringify JSON body
        JsonElement jsonElement = JsonParser.parseString(body);
        String jsonString = gson.toJson(jsonElement);

        // Create MD5 hash of the body
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        byte[] bodyBytes = jsonString.getBytes(StandardCharsets.UTF_8);
        byte[] bodyMd5 = md5Digest.digest(bodyBytes);
        String bodyMd5Hex = bytesToHex(bodyMd5);

        hmacSHA256.update(bodyMd5Hex.getBytes(StandardCharsets.UTF_8));
        byte[] hmacDigest = hmacSHA256.doFinal();
        String hmacDigestHex = bytesToHex(hmacDigest);
        LOGGER.info(hmacDigestHex);

        // Create headers
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Date", reqTimeStr);
        headers.put("Authorization", "HMAC-SHA256 Credential=" + accessKey + ",Signature=" + hmacDigestHex);

        headers.forEach((k, v) -> {
            LOGGER.info(k + " :: " + v);
        });

        return headers;
    }

    protected static String getPath(String url) {
        String pathRegex = "https?://[^/]+(/[^?#]*)(?:\\?|#|$)";
        return url.replaceAll(pathRegex, "$1");
    }

    protected static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
