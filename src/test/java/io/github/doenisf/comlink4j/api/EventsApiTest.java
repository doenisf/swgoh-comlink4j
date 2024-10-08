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
import io.github.doenisf.comlink4j.model.GetEvents2XXResponse;
import io.github.doenisf.comlink4j.model.GetEventsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    /**
     * Get the game events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        GetEventsRequest getEventsRequest = null;
        GetEvents2XXResponse response = api.getEvents(getEventsRequest);
        // TODO: test validations
    }

}
