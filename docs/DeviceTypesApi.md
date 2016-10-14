# DevicetypesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceTypesByApplication**](DevicetypesApi.md#getDeviceTypesByApplication) | **GET** /applications/{appId}/devicetypes | Get Device Types by Application


<a name="getDeviceTypesByApplication"></a>
# **getDeviceTypesByApplication**
> DeviceTypesEnvelope getDeviceTypesByApplication(appId, productInfo, count, offset)

Get Device Types by Application

Get Device Types by Application

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicetypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicetypesApi apiInstance = new DevicetypesApi();
String appId = "appId_example"; // String | Application ID.
Boolean productInfo = true; // Boolean | Flag to include the associated ProductInfo if present
Integer count = 56; // Integer | Desired count of items in the result set.
Integer offset = 56; // Integer | Offset for pagination.
try {
    DeviceTypesEnvelope result = apiInstance.getDeviceTypesByApplication(appId, productInfo, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicetypesApi#getDeviceTypesByApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application ID. |
 **productInfo** | **Boolean**| Flag to include the associated ProductInfo if present | [optional]
 **count** | **Integer**| Desired count of items in the result set. | [optional]
 **offset** | **Integer**| Offset for pagination. | [optional]

### Return type

[**DeviceTypesEnvelope**](DeviceTypesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

