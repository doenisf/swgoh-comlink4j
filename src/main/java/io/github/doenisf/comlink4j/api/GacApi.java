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

import io.github.doenisf.comlink4j.ApiCallback;
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.ApiResponse;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.Pair;
import io.github.doenisf.comlink4j.ProgressRequestBody;
import io.github.doenisf.comlink4j.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.doenisf.comlink4j.model.GetLeaderboard2XXResponse;
import io.github.doenisf.comlink4j.model.GetLeaderboardRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GacApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GacApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GacApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getLeaderboard
     * @param getLeaderboardRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 2XX </td><td> getLeaderboard successful response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLeaderboardCall(GetLeaderboardRequest getLeaderboardRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getLeaderboardRequest;

        // create path and map variables
        String localVarPath = "/getLeaderboard";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLeaderboardValidateBeforeCall(GetLeaderboardRequest getLeaderboardRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getLeaderboardRequest' is set
        if (getLeaderboardRequest == null) {
            throw new ApiException("Missing the required parameter 'getLeaderboardRequest' when calling getLeaderboard(Async)");
        }

        return getLeaderboardCall(getLeaderboardRequest, _callback);

    }

    /**
     * View GAC leaderboards.  Supports both the global leaderboards, as well as the leaderboards for the GAC groupings of 8.
     * 
     * @param getLeaderboardRequest  (required)
     * @return GetLeaderboard2XXResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 2XX </td><td> getLeaderboard successful response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetLeaderboard2XXResponse getLeaderboard(GetLeaderboardRequest getLeaderboardRequest) throws ApiException {
        ApiResponse<GetLeaderboard2XXResponse> localVarResp = getLeaderboardWithHttpInfo(getLeaderboardRequest);
        return localVarResp.getData();
    }

    /**
     * View GAC leaderboards.  Supports both the global leaderboards, as well as the leaderboards for the GAC groupings of 8.
     * 
     * @param getLeaderboardRequest  (required)
     * @return ApiResponse&lt;GetLeaderboard2XXResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 2XX </td><td> getLeaderboard successful response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetLeaderboard2XXResponse> getLeaderboardWithHttpInfo(GetLeaderboardRequest getLeaderboardRequest) throws ApiException {
        okhttp3.Call localVarCall = getLeaderboardValidateBeforeCall(getLeaderboardRequest, null);
        Type localVarReturnType = new TypeToken<GetLeaderboard2XXResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * View GAC leaderboards.  Supports both the global leaderboards, as well as the leaderboards for the GAC groupings of 8. (asynchronously)
     * 
     * @param getLeaderboardRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 2XX </td><td> getLeaderboard successful response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLeaderboardAsync(GetLeaderboardRequest getLeaderboardRequest, final ApiCallback<GetLeaderboard2XXResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLeaderboardValidateBeforeCall(getLeaderboardRequest, _callback);
        Type localVarReturnType = new TypeToken<GetLeaderboard2XXResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
