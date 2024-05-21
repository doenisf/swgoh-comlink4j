package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.model.guild.Guild;
import io.github.doenisf.comlink4j.model.guild.GuildResponse;
import io.github.doenisf.comlink4j.model.player.Player;
import io.github.doenisf.comlink4j.model.player.PlayerArenaProfile;

public interface SwgohComlinkApi {

    // /player endpoint
    default Player getPlayer(Integer allyCode) throws ApiException {
        return getPlayer(allyCode, false);
    }

    default Player getPlayer(Integer allyCode, Boolean enums) throws ApiException {
        String endpoint = "/player";
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\" }, \"enums\":" + enums + "}";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    default Player getPlayer(String playerId) throws ApiException {
        return getPlayer(playerId, false);
    }

    default Player getPlayer(String playerId, Boolean enums) throws ApiException {
        String endpoint = "/player";
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\" }, \"enums\":" + enums + "}";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    // /playerArena endpoint
    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode) throws ApiException {
        return getPlayerArenaProfile(allyCode, false);
    }

    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode, Boolean playerDetailsOnly) throws ApiException {
        return getPlayerArenaProfile(allyCode, false, playerDetailsOnly);
    }

    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode, Boolean enums, Boolean playerDetailsOnly) throws ApiException {
        String endpoint = "/playerArena";
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\", \"playerDetailsOnly\":" + playerDetailsOnly + "}, \"enums\":" + enums + "}";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    default PlayerArenaProfile getPlayerArenaProfile(String playerId) throws ApiException {
        return getPlayerArenaProfile(playerId, false);
    }

    default PlayerArenaProfile getPlayerArenaProfile(String playerId, Boolean playerDetailsOnly) throws ApiException {
        return getPlayerArenaProfile(playerId, false, playerDetailsOnly);
    }

    default PlayerArenaProfile getPlayerArenaProfile(String playerId, Boolean enums, Boolean playerDetailsOnly) throws ApiException {
        String endpoint = "/playerArena";
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\", \"playerDetailsOnly\":" + playerDetailsOnly + "}, \"enums\":" + enums + "}";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    // /guild endpoint
    default Guild getGuild(String guildId) throws ApiException {
        return getGuild(guildId, false);
    }

    default Guild getGuild(String guildId, Boolean includeRecentActivity) throws ApiException {
        return getGuild(guildId, false, includeRecentActivity);
    }

    default Guild getGuild(String guildId, Boolean enums, Boolean includeRecentActivity) throws ApiException {
        String endpoint = "/guild";
        String json = "{ \"payload\": { \"guildId\": \"" + guildId + "\", \"includeRecentGuildActivityInfo\":" + includeRecentActivity + " }, \"enums\":" + enums + "}";
        return ((GuildResponse) postToApi(GuildResponse.class, endpoint, json)).getGuild();
    }

    <T> Object postToApi(Class<T> target,
                         String endpoint,
                         String jsonBody)
            throws ApiException;
}
