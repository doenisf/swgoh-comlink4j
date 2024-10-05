# ArenaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayerArenaProfile**](ArenaApi.md#getPlayerArenaProfile) | **POST** /playerArena | Get a player&#39;s arena profile |


<a id="getPlayerArenaProfile"></a>
# **getPlayerArenaProfile**
> GetPlayerArenaProfile2XXResponse getPlayerArenaProfile(getPlayerArenaProfileRequest)

Get a player&#39;s arena profile

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.ArenaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ArenaApi apiInstance = new ArenaApi(defaultClient);
    GetPlayerArenaProfileRequest getPlayerArenaProfileRequest = new GetPlayerArenaProfileRequest(); // GetPlayerArenaProfileRequest | 
    try {
      GetPlayerArenaProfile2XXResponse result = apiInstance.getPlayerArenaProfile(getPlayerArenaProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArenaApi#getPlayerArenaProfile");
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
| **getPlayerArenaProfileRequest** | [**GetPlayerArenaProfileRequest**](GetPlayerArenaProfileRequest.md)|  | |

### Return type

[**GetPlayerArenaProfile2XXResponse**](GetPlayerArenaProfile2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getPlayerArenaProfile successful response |  -  |
| **4XX** |  |  -  |

