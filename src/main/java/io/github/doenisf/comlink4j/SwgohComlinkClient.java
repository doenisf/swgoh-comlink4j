package io.github.doenisf.comlink4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.model.guild.Guild;
import io.github.doenisf.comlink4j.model.guild.GuildResponse;
import io.github.doenisf.comlink4j.model.player.PlayerArenaProfile;
import io.github.doenisf.comlink4j.model.player.Player;
import io.github.doenisf.comlink4j.util.GsonAdapterRegistrar;
import io.github.doenisf.comlink4j.util.PreRequest;
import okhttp3.*;

import java.io.IOException;

/**
 * A client for interacting with the SWGOH Comlink API.
 */
public class SwgohComlinkClient implements SwgohComlinkApi {

    private final String BASE_URL;
    private final String accessKey;
    private final String secretKey;
    private final OkHttpClient client;
    private final Gson gson;
    private final PreRequest preRequest;

    /**
     * Default constructor with predefined base URL, access key, and secret key.
     * Defaults are:
     *
     * <table>
     *     <tr><td>baseUrl</td><td>http://localhost:8080</td></tr>
     *     <tr><td>accessKey</td><td>my-access-key</td></tr>
     *     <tr><td>secretKey</td><td>my-secret-key</td></tr>
     * </table>
     */
    public SwgohComlinkClient() {
        this("http://localhost:8080", "my-access-key", "my-secret-key");
    }

    /**
     * Constructs a new SwgohComlinkClient with the specified parameters.
     *
     * @param baseUrl    the base URL of the API
     * @param accessKey  the access key for authentication
     * @param secretKey  the secret key for authentication
     */
    public SwgohComlinkClient(String baseUrl, String accessKey, String secretKey) {
        this.BASE_URL = baseUrl;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.client = new OkHttpClient();
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        this.gson = builder.create();
        this.preRequest = new PreRequest();
    }

    /**
     * Sends a POST request to the specified API endpoint with the given JSON body.
     *
     * @param <T>        the type of the response object
     * @param target     the class of the response object
     * @param endpoint   the API endpoint to send the request to
     * @param jsonBody   the JSON body to include in the request
     * @return           the response object parsed from JSON
     * @throws ApiException if the request fails or if there is a network error
     */
    @Override
    public <T> Object postToApi(Class<T> target, String endpoint, String jsonBody) throws ApiException {
        // Request body
        RequestBody body = RequestBody.create(
                jsonBody, MediaType.get("application/json; charset=utf-8"));

        // HTTP request
        Request request = new Request.Builder()
                .url(BASE_URL + endpoint)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response);
            if (!response.isSuccessful() || response.body() == null) {
                throw new ApiException("Request failed: " + response.message());
            }
            String jsonResponse = response.body().string();
            return gson.fromJson(jsonResponse, target);
        } catch (IOException | ApiException e) {
            throw new ApiException("Network error", e);
        }
    }
}
