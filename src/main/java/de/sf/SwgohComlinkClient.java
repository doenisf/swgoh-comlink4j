package de.sf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.sf.exception.ApiException;
import de.sf.model.guild.Guild;
import de.sf.model.guild.GuildResponse;
import de.sf.model.player.PlayerArenaProfile;
import de.sf.model.player.pvp.BattleTargetingTactic;
import de.sf.model.player.Player;
import de.sf.model.player.PlayerProfileTab;
import de.sf.model.player.pvp.SquadType;
import de.sf.model.player.pvp.SquadUnitType;
import de.sf.model.player.unit.*;
import de.sf.model.player.stat.StatModTier;
import de.sf.model.player.stat.ThreatLevel;
import de.sf.model.player.stat.UnitStat;
import de.sf.util.PreRequest;
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
    
    private SwgohComlinkClient() {
        this("http://localhost:8080", "my-access-key", "my-secret-key", "");
    }

    public SwgohComlinkClient(String baseUrl, String accessKey, String secretKey, String apiKey) {
        this.BASE_URL = baseUrl;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.client = new OkHttpClient();
        this.gson = new GsonBuilder()
                .registerTypeAdapter(RelicTier.class, new RelicTier.Adapter())
                .registerTypeAdapter(UnitTier.class, new UnitTier.Adapter())
                .registerTypeAdapter(UnitStat.class, new UnitStat.Adapter())
                .registerTypeAdapter(StatModTier.class, new StatModTier.Adapter())
                .registerTypeAdapter(CurrencyType.class, new CurrencyType.Adapter())
                .registerTypeAdapter(Rarity.class, new Rarity.Adapter())
                .registerTypeAdapter(PlayerProfileTab.class, new PlayerProfileTab.Adapter())
                .registerTypeAdapter(BattleTargetingTactic.class, new BattleTargetingTactic.Adapter())
                .registerTypeAdapter(SquadType.class, new SquadType.Adapter())
                .registerTypeAdapter(ThreatLevel.class, new ThreatLevel.Adapter())
                .registerTypeAdapter(SquadUnitType.class, new SquadUnitType.Adapter())
                .create();
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
