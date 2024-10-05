/*
 * swgoh-comlink
 * An API for sending requests to Star Wars Galaxy of Heroes' game services
 *
 * The version of the OpenAPI document: 0.34.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.doenisf.comlink4j.api;

import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.model.GetGuild2XXResponse;
import io.github.doenisf.comlink4j.model.GetGuildLeaderboard2XXResponse;
import io.github.doenisf.comlink4j.model.GetGuildLeaderboardRequest;
import io.github.doenisf.comlink4j.model.GetGuildRequest;
import io.github.doenisf.comlink4j.model.GetGuilds2XXResponse;
import io.github.doenisf.comlink4j.model.GetGuildsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GuildApi
 */
@Disabled
public class GuildApiTest {

    private final GuildApi api = new GuildApi();

    /**
     * Get information about a guild
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGuildTest() throws ApiException {
        GetGuildRequest getGuildRequest = null;
        GetGuild2XXResponse response = api.getGuild(getGuildRequest);
        // TODO: test validations
    }

    /**
     * Get the guild leaderboards
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGuildLeaderboardTest() throws ApiException {
        GetGuildLeaderboardRequest getGuildLeaderboardRequest = null;
        GetGuildLeaderboard2XXResponse response = api.getGuildLeaderboard(getGuildLeaderboardRequest);
        // TODO: test validations
    }

    /**
     * Search guilds
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGuildsTest() throws ApiException {
        GetGuildsRequest getGuildsRequest = null;
        GetGuilds2XXResponse response = api.getGuilds(getGuildsRequest);
        // TODO: test validations
    }

}