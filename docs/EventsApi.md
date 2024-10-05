# EventsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEvents**](EventsApi.md#getEvents) | **POST** /getEvents | Get the game events |


<a id="getEvents"></a>
# **getEvents**
> GetEvents2XXResponse getEvents(getEventsRequest)

Get the game events

### Example
```java
// Import classes:
import io.github.doenisf.comlink4j.ApiClient;
import io.github.doenisf.comlink4j.ApiException;
import io.github.doenisf.comlink4j.Configuration;
import io.github.doenisf.comlink4j.models.*;
import io.github.doenisf.comlink4j.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EventsApi apiInstance = new EventsApi(defaultClient);
    GetEventsRequest getEventsRequest = new GetEventsRequest(); // GetEventsRequest | 
    try {
      GetEvents2XXResponse result = apiInstance.getEvents(getEventsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvents");
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
| **getEventsRequest** | [**GetEventsRequest**](GetEventsRequest.md)|  | [optional] |

### Return type

[**GetEvents2XXResponse**](GetEvents2XXResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | getEvents successful response |  -  |
| **4XX** |  |  -  |

