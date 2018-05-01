# DefaultApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserScenes**](DefaultApi.md#getUserScenes) | **GET** /users/{uid}/scenes | Get all user scenes


<a name="getUserScenes"></a>
# **getUserScenes**
> ScenesEnvelope getUserScenes(uid, count, offset)

Get all user scenes

Get all user scenes

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String uid = "uid_example"; // String | User id
String count = "count_example"; // String | count
String offset = "offset_example"; // String | offset
try {
    ScenesEnvelope result = apiInstance.getUserScenes(uid, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserScenes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| User id |
 **count** | **String**| count | [optional]
 **offset** | **String**| offset | [optional]

### Return type

[**ScenesEnvelope**](ScenesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

