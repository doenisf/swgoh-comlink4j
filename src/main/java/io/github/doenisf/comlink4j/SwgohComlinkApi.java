package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.model.endpoints.guild.Guild;
import io.github.doenisf.comlink4j.model.endpoints.guild.GuildResponse;
import io.github.doenisf.comlink4j.model.endpoints.player.Player;
import io.github.doenisf.comlink4j.model.endpoints.player.PlayerArenaProfile;
import io.github.doenisf.comlink4j.model.gamedata.GameData;
import io.github.doenisf.comlink4j.model.misc.GameMetaData;

/**
 * Interface for interacting with the SWGoH Comlink API.
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
     * @param guildId               the ID of the guild
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
     * @param guildId               the ID of the guild
     * @param enums                 whether to include enums in the response
     * @param includeRecentActivity whether to include recent guild activity information
     * @return the Guild object
     * @throws ApiException if the request fails
     */
    default Guild getGuild(String guildId, Boolean enums, Boolean includeRecentActivity) throws ApiException {
        String endpoint = "/guild";
        String json = "{ \"payload\": { \"guildId\": \"" + guildId + "\", \"includeRecentGuildActivityInfo\":" + includeRecentActivity + " }, \"enums\":" + enums + "}";
        return ((GuildResponse) postToApi(GuildResponse.class, endpoint, json)).getGuild();
    }

    // /data endpoint

    /**
     * Fetches game data for the specified version with the option to include PVE units.
     * Defaults to including PVE units.
     *
     * @param version The version of the game data to retrieve.
     * @return The game data for the specified version.
     * @throws ApiException If there is an error during the API request.
     */
    default GameData getGameData(String version) throws ApiException {
        return getGameData(version, true);
    }

    /**
     * Fetches game data for the specified version with the option to include PVE units and request a specific segment.
     * Defaults to including PVE units.
     *
     * @param version        The version of the game data to retrieve.
     * @param requestSegment The specific segment of the data to request.
     * @return The game data for the specified version.
     * @throws ApiException If there is an error during the API request.
     */
    default GameData getGameData(String version, Integer requestSegment) throws ApiException {
        return getGameData(version, true, requestSegment);
    }

    /**
     * Fetches game data for the specified version with the option to include PVE units.
     * Optionally includes PVE units.
     *
     * @param version          The version of the game data to retrieve.
     * @param includePveUnits  Whether to include PVE units in the response.
     * @return The game data for the specified version.
     * @throws ApiException If there is an error during the API request.
     */
    default GameData getGameData(String version, Boolean includePveUnits) throws ApiException {
        return getGameData(version, includePveUnits, 0);
    }

    /**
     * Fetches game data for the specified version with options to include PVE units, request a specific segment, and include enums.
     *
     * @param version          The version of the game data to retrieve.
     * @param includePveUnits  Whether to include PVE units in the response.
     * @param requestSegment   The specific segment of the data to request.
     * @return The game data for the specified version.
     * @throws ApiException If there is an error during the API request.
     */
    default GameData getGameData(String version, Boolean includePveUnits, Integer requestSegment) throws ApiException {
        return getGameDate(version, includePveUnits, requestSegment, false);
    }

    /**
     * Fetches game data for the specified version with options to include PVE units, request a specific segment, include enums, and specify whether to return enums.
     *
     * @param version          The version of the game data to retrieve.
     * @param includePveUnits  Whether to include PVE units in the response.
     * @param requestSegment   The specific segment of the data to request.
     * @param enums            Whether to include enums in the response.
     * @return The game data for the specified version.
     * @throws ApiException If there is an error during the API request.
     */
    default GameData getGameDate(String version, Boolean includePveUnits, Integer requestSegment, Boolean enums) throws ApiException {
        String endpoint = "/data";
        String json = "{\n" +
                "    \"payload\": \n" +
                "    {\n" +
                "        \"version\": \"" + version + "\",\n" +
                "        \"includePveUnits\": " + includePveUnits + ",\n" +
                "        \"requestSegment\": " + requestSegment + "\n" +
                "    },\n" +
                "    \"enums\": " + enums + "\n" +
                "}";
        return (GameData) postToApi(GameData.class, endpoint, json);
    }

    default GameMetaData getGameMetaData() throws ApiException {
        String endpoint = "/metadata";
        return (GameMetaData) postToApi(GameMetaData.class, endpoint);
    }
    /**
     * Sends a POST request to the specified API endpoint with the given JSON body.
     *
     * @param <T>      the type of the response object
     * @param target   the class of the response object
     * @param endpoint the API endpoint to send the request to
     * @return the response object parsed from JSON
     * @throws ApiException if the request fails or if there is a network error
     */
    default <T> Object postToApi(Class<T> target, String endpoint) throws ApiException {
        return postToApi(target, endpoint, "");
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
    <T> Object postToApi(Class<T> target, String endpoint, String jsonBody) throws ApiException;
}
