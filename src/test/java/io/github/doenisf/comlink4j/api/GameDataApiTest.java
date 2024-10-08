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
import io.github.doenisf.comlink4j.model.GetGameData2XXResponse;
import io.github.doenisf.comlink4j.model.GetGameDataRequest;
import io.github.doenisf.comlink4j.model.GetLocalizationBundle2XXResponse;
import io.github.doenisf.comlink4j.model.GetLocalizationBundleRequest;
import io.github.doenisf.comlink4j.model.GetMetaData2XXResponse;
import io.github.doenisf.comlink4j.model.GetMetaDataRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameDataApi
 */
@Disabled
public class GameDataApiTest {

    private final GameDataApi api = new GameDataApi();

    /**
     * Get an object containing all of the game data enums
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enumsGetTest() throws ApiException {
        Object response = api.enumsGet();
        // TODO: test validations
    }

    /**
     * Get the game data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGameDataTest() throws ApiException {
        GetGameDataRequest getGameDataRequest = null;
        GetGameData2XXResponse response = api.getGameData(getGameDataRequest);
        // TODO: test validations
    }

    /**
     * Get the localization bundle
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLocalizationBundleTest() throws ApiException {
        GetLocalizationBundleRequest getLocalizationBundleRequest = null;
        GetLocalizationBundle2XXResponse response = api.getLocalizationBundle(getLocalizationBundleRequest);
        // TODO: test validations
    }

    /**
     * Get the game metadata
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaDataTest() throws ApiException {
        GetMetaDataRequest getMetaDataRequest = null;
        GetMetaData2XXResponse response = api.getMetaData(getMetaDataRequest);
        // TODO: test validations
    }

}
