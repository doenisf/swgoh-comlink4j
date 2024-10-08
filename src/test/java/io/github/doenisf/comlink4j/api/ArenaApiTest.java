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
import io.github.doenisf.comlink4j.model.GetPlayerArenaProfile2XXResponse;
import io.github.doenisf.comlink4j.model.GetPlayerArenaProfileRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArenaApi
 */
@Disabled
public class ArenaApiTest {

    private final ArenaApi api = new ArenaApi();

    /**
     * Get a player&#39;s arena profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayerArenaProfileTest() throws ApiException {
        GetPlayerArenaProfileRequest getPlayerArenaProfileRequest = null;
        GetPlayerArenaProfile2XXResponse response = api.getPlayerArenaProfile(getPlayerArenaProfileRequest);
        // TODO: test validations
    }

}
