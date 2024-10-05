package io.github.doenisf.comlink4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.exception.ErrorResponse;
import io.github.doenisf.comlink4j.util.ApiRequestSigner;
import io.github.doenisf.comlink4j.util.GsonAdapterRegistrar;
import okhttp3.*;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;

/**
 * A client for interacting with the SWGOH Comlink API.
 */
public class SwgohComlinkClient implements SwgohComlinkApi {

    private final String BASE_URL;
    private final String accessKey;
    private final String secretKey;
    private final OkHttpClient client;
    private final Gson gson;

    /**
     * Default constructor with predefined base URL and empty access and secret keys. This won't work
     * if you have set up your comlink to require authentication.
     * <br>
     * The default url is <a href="http://localhost:3000">http://localhost:3000"</a>
     * <br>
     * Use this setup when using the setup described <a href="https://github.com/swgoh-utils/swgoh-comlink/wiki/Getting-Started#deploying-with-docker">here</a>.
     */
    public SwgohComlinkClient() {
        this("http://localhost:3000", null, null);
    }

    /**
     * Default constructor with your specific base URL and empty access and secret keys.
     * This won't work if you have set up your comlink to require authentication.
     *
     * @param baseUrl the base URL (URL and port) of the API
     */
    public SwgohComlinkClient(String baseUrl) {
        this(baseUrl, null, null);
    }

    /**
     * Constructs a new SwgohComlinkClient with the specified parameters.
     *
     * @param baseUrl   the base URL (URL and port) of the API
     * @param accessKey the access key for authentication
     * @param secretKey the secret key for authentication
     */
    public SwgohComlinkClient(String baseUrl, String accessKey, String secretKey) {
        this.BASE_URL = baseUrl;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.client = new OkHttpClient();
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        this.gson = builder.create();
    }

    /**
     * Sends a POST request to the specified API endpoint with the given JSON body.
     *
     * @param <T>      the type of the response object
     * @param target   the class of the response object
     * @param endpoint the API endpoint to send the request to
     * @param jsonBody the JSON body to include in the request
     * @return the response object parsed from JSON
     * @throws ApiException if the request fails or if there is a network error
     */
    @Override
    public <T> Object postToApi(Class<T> target, String endpoint, String jsonBody) throws ApiException {
        // HTTP request
        Request.Builder requestBuilder = new Request.Builder()
                .url(BASE_URL + endpoint);

        if (jsonBody != null && !jsonBody.isEmpty() && !jsonBody.isBlank()) {
            // Request body
            RequestBody body = RequestBody.create(
                    jsonBody, MediaType.get("application/json; charset=utf-8"));
            requestBuilder.post(body);
        }
        else {
            RequestBody body = RequestBody.create(
                    "", MediaType.get("application/json; charset=utf-8"));
            requestBuilder.post(body);
        }

        if (accessKey != null && secretKey != null) {
            try {
                Map<String, String> headers = ApiRequestSigner
                        .signPostRequest(gson, new Date().getTime(), BASE_URL + endpoint,
                                "POST", jsonBody, accessKey, secretKey);
                requestBuilder.addHeader("X-Date", headers.getOrDefault("X-Date", ""));
                requestBuilder.addHeader("Authorization", headers.getOrDefault("Authorization", ""));
            } catch (NoSuchAlgorithmException | InvalidKeyException e) {
                throw new ApiException("Error while signing the request.", e, null);
            }
        }

        Request request = requestBuilder.build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful() || response.body() == null) {
                if (response.body() == null) {
                    throw new ApiException("Request failed with status code " + response.code() + ": " + response.message(), response);
                } else {
                    ErrorResponse errorResponse = gson.fromJson(response.body().string(), ErrorResponse.class);
                    throw new ApiException("Request failed with status code " + response.code() + ": " + errorResponse.getMessage(), response);
                }
            }
            String jsonResponse = response.body().string();
            return gson.fromJson(jsonResponse, target);
        } catch (IOException | ApiException e) {
            throw new ApiException(e.getMessage(), e, null);
        }
    }

}
