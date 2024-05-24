package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.model.guild.Guild;
import io.github.doenisf.comlink4j.model.guild.GuildResponse;
import io.github.doenisf.comlink4j.model.player.Player;
import io.github.doenisf.comlink4j.model.player.PlayerArenaProfile;

/**
 * Interface for interacting with the SWGOH Comlink API.
 */
public interface SwgohComlinkApi {

    // /player endpoint

    /**
     * Retrieves player information by ally code.
     *
     * @param allyCode the ally code of the player
     * @return the Player object
     * @throws ApiException if the request fails
     */
    default Player getPlayer(Integer allyCode) throws ApiException {
        return getPlayer(allyCode, false);
    }

    /**
     * Retrieves player information by ally code with optional enums.
     *
     * @param allyCode the ally code of the player
     * @param enums    whether to include enums in the response
     * @return the Player object
     * @throws ApiException if the request fails
     */
    default Player getPlayer(Integer allyCode, Boolean enums) throws ApiException {
        String endpoint = "/player";
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\" }, \"enums\":" + enums + "}";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    /**
     * Retrieves player information by player ID.
     *
     * @param playerId the ID of the player
     * @return the Player object
     * @throws ApiException if the request fails
     */
    default Player getPlayer(String playerId) throws ApiException {
        return getPlayer(playerId, false);
    }

    /**
     * Retrieves player information by player ID with optional enums.
     *
     * @param playerId the ID of the player
     * @param enums    whether to include enums in the response
     * @return the Player object
     * @throws ApiException if the request fails
     */
    default Player getPlayer(String playerId, Boolean enums) throws ApiException {
        String endpoint = "/player";
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\" }, \"enums\":" + enums + "}";
        return (Player) postToApi(Player.class, endpoint, json);
    }

    // /playerArena endpoint

    /**
     * Retrieves player arena profile by ally code.
     *
     * @param allyCode the ally code of the player
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode) throws ApiException {
        return getPlayerArenaProfile(allyCode, false);
    }

    /**
     * Retrieves player arena profile by ally code with optional player details.
     *
     * @param allyCode          the ally code of the player
     * @param playerDetailsOnly whether to include only player details in the response
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode, Boolean playerDetailsOnly) throws ApiException {
        return getPlayerArenaProfile(allyCode, false, playerDetailsOnly);
    }

    /**
     * Retrieves player arena profile by ally code with optional enums and player details.
     *
     * @param allyCode          the ally code of the player
     * @param enums             whether to include enums in the response
     * @param playerDetailsOnly whether to include only player details in the response
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(Integer allyCode, Boolean enums, Boolean playerDetailsOnly) throws ApiException {
        String endpoint = "/playerArena";
        String json = "{ \"payload\": { \"allyCode\": \"" + allyCode + "\", \"playerDetailsOnly\":" + playerDetailsOnly + "}, \"enums\":" + enums + "}";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    /**
     * Retrieves player arena profile by player ID.
     *
     * @param playerId the ID of the player
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(String playerId) throws ApiException {
        return getPlayerArenaProfile(playerId, false);
    }

    /**
     * Retrieves player arena profile by player ID with optional player details.
     *
     * @param playerId          the ID of the player
     * @param playerDetailsOnly whether to include only player details in the response
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(String playerId, Boolean playerDetailsOnly) throws ApiException {
        return getPlayerArenaProfile(playerId, false, playerDetailsOnly);
    }

    /**
     * Retrieves player arena profile by player ID with optional enums and player details.
     *
     * @param playerId          the ID of the player
     * @param enums             whether to include enums in the response
     * @param playerDetailsOnly whether to include only player details in the response
     * @return the PlayerArenaProfile object
     * @throws ApiException if the request fails
     */
    default PlayerArenaProfile getPlayerArenaProfile(String playerId, Boolean enums, Boolean playerDetailsOnly) throws ApiException {
        String endpoint = "/playerArena";
        String json = "{ \"payload\": { \"playerId\": \"" + playerId + "\", \"playerDetailsOnly\":" + playerDetailsOnly + "}, \"enums\":" + enums + "}";
        return (PlayerArenaProfile) postToApi(PlayerArenaProfile.class, endpoint, json);
    }

    // /guild endpoint

    /**
     * Retrieves guild information by guild ID.
     *
     * @param guildId the ID of the guild
     * @return the Guild object
     * @throws ApiException if the request fails
     */
    default Guild getGuild(String guildId) throws ApiException {
        return getGuild(guildId, false);
    }

    /**
     * Retrieves guild information by guild ID with optional recent activity.
     *
     * @param guildId             the ID of the guild
     * @param includeRecentActivity whether to include recent guild activity information
     * @return the Guild object
     * @throws ApiException if the request fails
     */
    default Guild getGuild(String guildId, Boolean includeRecentActivity) throws ApiException {
        return getGuild(guildId, false, includeRecentActivity);
    }

    /**
     * Retrieves guild information by guild ID with optional enums and recent activity.
     *
     * @param guildId              the ID of the guild
     * @param enums                whether to include enums in the response
     * @param includeRecentActivity whether to include recent guild activity information
     * @return the Guild object
     * @throws ApiException if the request fails
     */
    default Guild getGuild(String guildId, Boolean enums, Boolean includeRecentActivity) throws ApiException {
        String endpoint = "/guild";
        String json = "{ \"payload\": { \"guildId\": \"" + guildId + "\", \"includeRecentGuildActivityInfo\":" + includeRecentActivity + " }, \"enums\":" + enums + "}";
        return ((GuildResponse) postToApi(GuildResponse.class, endpoint, json)).getGuild();
    }

    /**
     * Sends a POST request to the specified API endpoint with the given JSON body.
     *
     * @param <T>       the type of the response object
     * @param target    the class of the response object
     * @param endpoint  the API endpoint to send the request to
     * @param jsonBody  the JSON body to include in the request
     * @return the response object parsed from JSON
     * @throws ApiException if the request fails or if there is a network error
     */
    <T> Object postToApi(Class<T> target, String endpoint, String jsonBody) throws ApiException;
}
