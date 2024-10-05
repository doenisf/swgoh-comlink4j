# PlayerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayer**](PlayerApi.md#getPlayer) | **POST** /player | Get a player profile |
| [**getPlayerArenaProfile**](PlayerApi.md#getPlayerArenaProfile) | **POST** /playerArena | Get a player&#39;s arena profile |


<a id="getPlayer"></a>
# **getPlayer**
> GetPlayer2XXResponse getPlayer(getPlayerRequest)

Get a player profile

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    GetPlayerRequest getPlayerRequest = new GetPlayerRequest(); // GetPlayerRequest | 
    try {
      GetPlayer2XXResponse result = apiInstance.getPlayer(getPlayerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getPlayer");
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
| **getPlayerRequest** | [**GetPlayerRequest**](GetPlayerRequest.md)|  | |

### Return type

[**GetPlayer2XXResponse**](GetPlayer2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getPlayer successful response |  -  |
| **4XX** |  |  -  |

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
import io.github.doenisf.comlink4j.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    GetPlayerArenaProfileRequest getPlayerArenaProfileRequest = new GetPlayerArenaProfileRequest(); // GetPlayerArenaProfileRequest | 
    try {
      GetPlayerArenaProfile2XXResponse result = apiInstance.getPlayerArenaProfile(getPlayerArenaProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getPlayerArenaProfile");
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

