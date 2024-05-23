package io.github.doenisf.comlink4j.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class ApiRequestSignerTest {

    @Test
    public void testGetPath() {
        String url = "http://localhost:3010/player";
        String target = "/player";
        String actual = ApiRequestSigner.getPath(url);
        assertEquals(target, actual);
    }

    @Test
    public void testBytesToHex() {
        String body = "{\"payload\":{\"allyCode\":\"315242232\"},\"enums\":false}";
        String expected = "3638326432666538313137653332663862646138373233636565353934323137";
        try {
            String actual = ApiRequestSigner
                    .bytesToHex(MessageDigest
                            .getInstance("MD5")
                            .digest(body.getBytes()));
            assertEquals(expected, actual);
        } catch (NoSuchAlgorithmException e) {
            fail(e);
        }
    }

    @Test
    public void testSignPostRequest() {
        Long reqTime = 1716488927032L;
        String url = "http://localhost:3010/player";
        String method = "POST";
        String body = "{\n" +
                "    \"payload\": {\n" +
                "        \"allyCode\": \"315242232\"\n" +
                "    },\n" +
                "    \"enums\": false\n" +
                "}";
        String accessKey = "my-access-key";
        String secretKey = "my-secret-key";
        String expected = "HMAC-SHA256 Credential=my-access-key,Signature=b61d36bcad7c9938316c6ffcf3a3ef200e22f8c1cd12a8e08785d4145902a8cf";
        Gson gson = new GsonBuilder().create();
        try {
            Map<String, String> header = ApiRequestSigner.signPostRequest(gson,
                    reqTime, url, method, body, accessKey, secretKey);
            assertEquals(expected, header.get("Authorization"));
        } catch (Exception e) {
            fail(e);
        }

    }
}