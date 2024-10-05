# GameDataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enumsGet**](GameDataApi.md#enumsGet) | **GET** /enums | Get an object containing all of the game data enums |
| [**getGameData**](GameDataApi.md#getGameData) | **POST** /data | Get the game data |
| [**getLocalizationBundle**](GameDataApi.md#getLocalizationBundle) | **POST** /localization | Get the localization bundle |
| [**getMetaData**](GameDataApi.md#getMetaData) | **POST** /metadata | Get the game metadata |


<a id="enumsGet"></a>
# **enumsGet**
> Object enumsGet()

Get an object containing all of the game data enums

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    try {
      Object result = apiInstance.enumsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#enumsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** |  |  -  |
| **4XX** |  |  -  |

<a id="getGameData"></a>
# **getGameData**
> GetGameData2XXResponse getGameData(getGameDataRequest)

Get the game data

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    GetGameDataRequest getGameDataRequest = new GetGameDataRequest(); // GetGameDataRequest | 
    try {
      GetGameData2XXResponse result = apiInstance.getGameData(getGameDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getGameData");
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
| **getGameDataRequest** | [**GetGameDataRequest**](GetGameDataRequest.md)|  | |

### Return type

[**GetGameData2XXResponse**](GetGameData2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getGameData successful response |  -  |
| **4XX** |  |  -  |

<a id="getLocalizationBundle"></a>
# **getLocalizationBundle**
> GetLocalizationBundle2XXResponse getLocalizationBundle(getLocalizationBundleRequest)

Get the localization bundle

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    GetLocalizationBundleRequest getLocalizationBundleRequest = new GetLocalizationBundleRequest(); // GetLocalizationBundleRequest | 
    try {
      GetLocalizationBundle2XXResponse result = apiInstance.getLocalizationBundle(getLocalizationBundleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getLocalizationBundle");
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
| **getLocalizationBundleRequest** | [**GetLocalizationBundleRequest**](GetLocalizationBundleRequest.md)|  | |

### Return type

[**GetLocalizationBundle2XXResponse**](GetLocalizationBundle2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getLocalizationBundle successful response |  -  |
| **4XX** |  |  -  |

<a id="getMetaData"></a>
# **getMetaData**
> GetMetaData2XXResponse getMetaData(getMetaDataRequest)

Get the game metadata

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    GetMetaDataRequest getMetaDataRequest = new GetMetaDataRequest(); // GetMetaDataRequest | 
    try {
      GetMetaData2XXResponse result = apiInstance.getMetaData(getMetaDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getMetaData");
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
| **getMetaDataRequest** | [**GetMetaDataRequest**](GetMetaDataRequest.md)|  | [optional] |

### Return type

[**GetMetaData2XXResponse**](GetMetaData2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getMetaData successful response |  -  |
| **4XX** |  |  -  |

