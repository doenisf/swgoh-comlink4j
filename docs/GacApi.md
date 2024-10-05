# GacApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLeaderboard**](GacApi.md#getLeaderboard) | **POST** /getLeaderboard | View GAC leaderboards.  Supports both the global leaderboards, as well as the leaderboards for the GAC groupings of 8. |


<a id="getLeaderboard"></a>
# **getLeaderboard**
> GetLeaderboard2XXResponse getLeaderboard(getLeaderboardRequest)

View GAC leaderboards.  Supports both the global leaderboards, as well as the leaderboards for the GAC groupings of 8.

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GacApi apiInstance = new GacApi(defaultClient);
    GetLeaderboardRequest getLeaderboardRequest = new GetLeaderboardRequest(); // GetLeaderboardRequest | 
    try {
      GetLeaderboard2XXResponse result = apiInstance.getLeaderboard(getLeaderboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GacApi#getLeaderboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getLeaderboardRequest** | [**GetLeaderboardRequest**](GetLeaderboardRequest.md)|  | |

### Return type

[**GetLeaderboard2XXResponse**](GetLeaderboard2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getLeaderboard successful response |  -  |
| **4XX** |  |  -  |

