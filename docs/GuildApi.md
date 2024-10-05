# GuildApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGuild**](GuildApi.md#getGuild) | **POST** /guild | Get information about a guild |
| [**getGuildLeaderboard**](GuildApi.md#getGuildLeaderboard) | **POST** /getGuildLeaderboard | Get the guild leaderboards |
| [**getGuilds**](GuildApi.md#getGuilds) | **POST** /getGuilds | Search guilds |


<a id="getGuild"></a>
# **getGuild**
> GetGuild2XXResponse getGuild(getGuildRequest)

Get information about a guild

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GuildApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GuildApi apiInstance = new GuildApi(defaultClient);
    GetGuildRequest getGuildRequest = new GetGuildRequest(); // GetGuildRequest | 
    try {
      GetGuild2XXResponse result = apiInstance.getGuild(getGuildRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuildApi#getGuild");
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
| **getGuildRequest** | [**GetGuildRequest**](GetGuildRequest.md)|  | |

### Return type

[**GetGuild2XXResponse**](GetGuild2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getGuild successful response |  -  |
| **4XX** |  |  -  |

<a id="getGuildLeaderboard"></a>
# **getGuildLeaderboard**
> GetGuildLeaderboard2XXResponse getGuildLeaderboard(getGuildLeaderboardRequest)

Get the guild leaderboards

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GuildApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GuildApi apiInstance = new GuildApi(defaultClient);
    GetGuildLeaderboardRequest getGuildLeaderboardRequest = new GetGuildLeaderboardRequest(); // GetGuildLeaderboardRequest | 
    try {
      GetGuildLeaderboard2XXResponse result = apiInstance.getGuildLeaderboard(getGuildLeaderboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuildApi#getGuildLeaderboard");
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
| **getGuildLeaderboardRequest** | [**GetGuildLeaderboardRequest**](GetGuildLeaderboardRequest.md)|  | |

### Return type

[**GetGuildLeaderboard2XXResponse**](GetGuildLeaderboard2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getGuildLeaderboard successful response |  -  |
| **4XX** |  |  -  |

<a id="getGuilds"></a>
# **getGuilds**
> GetGuilds2XXResponse getGuilds(getGuildsRequest)

Search guilds

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GuildApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GuildApi apiInstance = new GuildApi(defaultClient);
    GetGuildsRequest getGuildsRequest = new GetGuildsRequest(); // GetGuildsRequest | 
    try {
      GetGuilds2XXResponse result = apiInstance.getGuilds(getGuildsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuildApi#getGuilds");
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
| **getGuildsRequest** | [**GetGuildsRequest**](GetGuildsRequest.md)|  | |

### Return type

[**GetGuilds2XXResponse**](GetGuilds2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getGuilds successful response |  -  |
| **4XX** |  |  -  |

