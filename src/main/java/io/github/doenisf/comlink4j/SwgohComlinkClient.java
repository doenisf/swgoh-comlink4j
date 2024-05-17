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

public class SwgohComlinkClient {

    private final String BASE_URL;
    private final String accessKey;
    private final String secretKey;
    private final OkHttpClient client;
    private final Gson gson;
    private final PreRequest preRequest;
    private final String apiKey;

    public SwgohComlinkClient() {
        this("http://localhost:8080", "my-access-key", "my-secret-key", "");
    }

    public SwgohComlinkClient(String baseUrl, String accessKey, String secretKey, String apiKey) {
        this.BASE_URL = baseUrl;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.client = new OkHttpClient();
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        this.gson = builder.create();
        this.preRequest = new PreRequest();
        this.apiKey = apiKey;
    }

    public Player getPlayerByAllyCode(Integer allyCode) throws Exception {
        String endpoint = "/player";
        // JSON payload
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\" } }";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    public Player getPlayerById(String playerId) throws Exception {
        String endpoint = "/player";
        // JSON payload
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\" } }";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    public PlayerArenaProfile getPlayerArenaProfileByAllyCode(Integer allyCode) throws Exception {
        String endpoint = "/playerArena";
        // JSON payload
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\" } }";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    public PlayerArenaProfile getPlayerArenaProfileById(String playerId) throws Exception {
        String endpoint = "/playerArena";
        // JSON payload
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\" } }";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    public Guild getGuildById(String guildId) throws ApiException {
        String endpoint = "/guild";
        // JSON payload
        String json = "{ \"payload\": { \"guildId\": \"" + guildId + "\" } }";
        return ((GuildResponse) postToApi(GuildResponse.class, endpoint, json)).getGuild();
    }

    private <T> Object postToApi(Class<T> target, String endpoint, String jsonBody) throws ApiException {
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
