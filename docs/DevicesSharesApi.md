# DevicesSharesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShareForDevice**](DevicesSharesApi.md#createShareForDevice) | **POST** /devices/{deviceId}/shares | Share a device 
[**deleteSharingForDevice**](DevicesSharesApi.md#deleteSharingForDevice) | **DELETE** /devices/{deviceId}/shares/{shareId} | Delete specific share of the given device id
[**getAllSharesForDevice**](DevicesSharesApi.md#getAllSharesForDevice) | **GET** /devices/{deviceId}/shares | List all shares for the given device id
[**getSharingForDevice**](DevicesSharesApi.md#getSharingForDevice) | **GET** /devices/{deviceId}/shares/{shareId} | Get specific share of the given device id


<a name="createShareForDevice"></a>
# **createShareForDevice**
> DeviceSharingId createShareForDevice(deviceId, deviceShareInfo)

Share a device 

Share a device 

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesSharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesSharesApi apiInstance = new DevicesSharesApi();
String deviceId = "deviceId_example"; // String | Device ID.
DeviceShareInfo deviceShareInfo = new DeviceShareInfo(); // DeviceShareInfo | Device object that needs to be added
try {
    DeviceSharingId result = apiInstance.createShareForDevice(deviceId, deviceShareInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesSharesApi#createShareForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **deviceShareInfo** | [**DeviceShareInfo**](DeviceShareInfo.md)| Device object that needs to be added |

### Return type

[**DeviceSharingId**](DeviceSharingId.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSharingForDevice"></a>
# **deleteSharingForDevice**
> DeviceSharingId deleteSharingForDevice(deviceId, shareId)

Delete specific share of the given device id

Delete specific share of the given device id

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesSharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesSharesApi apiInstance = new DevicesSharesApi();
String deviceId = "deviceId_example"; // String | Device ID.
String shareId = "shareId_example"; // String | Share ID.
try {
    DeviceSharingId result = apiInstance.deleteSharingForDevice(deviceId, shareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesSharesApi#deleteSharingForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **shareId** | **String**| Share ID. |

### Return type

[**DeviceSharingId**](DeviceSharingId.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllSharesForDevice"></a>
# **getAllSharesForDevice**
> DeviceSharingEnvelope getAllSharesForDevice(deviceId, count, offset)

List all shares for the given device id

List all shares for the given device id

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesSharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesSharesApi apiInstance = new DevicesSharesApi();
String deviceId = "deviceId_example"; // String | Device ID.
Integer count = 56; // Integer | Desired count of items in the result set.
Integer offset = 56; // Integer | Offset for pagination.
try {
    DeviceSharingEnvelope result = apiInstance.getAllSharesForDevice(deviceId, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesSharesApi#getAllSharesForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **count** | **Integer**| Desired count of items in the result set. | [optional]
 **offset** | **Integer**| Offset for pagination. | [optional]

### Return type

[**DeviceSharingEnvelope**](DeviceSharingEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSharingForDevice"></a>
# **getSharingForDevice**
> DeviceSharing getSharingForDevice(deviceId, shareId)

Get specific share of the given device id

Get specific share of the given device id

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesSharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesSharesApi apiInstance = new DevicesSharesApi();
String deviceId = "deviceId_example"; // String | Device ID.
String shareId = "shareId_example"; // String | Share ID.
try {
    DeviceSharing result = apiInstance.getSharingForDevice(deviceId, shareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesSharesApi#getSharingForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **shareId** | **String**| Share ID. |

### Return type

[**DeviceSharing**](DeviceSharing.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

