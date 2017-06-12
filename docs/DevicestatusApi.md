# DevicestatusApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceStatus**](DevicestatusApi.md#getDeviceStatus) | **GET** /devices/{deviceId}/status | Get Device Status
[**getDevicesStatus**](DevicestatusApi.md#getDevicesStatus) | **GET** /devices/status | Get Devices Status
[**putDeviceStatus**](DevicestatusApi.md#putDeviceStatus) | **PUT** /devices/{deviceId}/status | Update Device Status


<a name="getDeviceStatus"></a>
# **getDeviceStatus**
> DeviceStatus getDeviceStatus(deviceId, includeSnapshot, includeSnapshotTimestamp)

Get Device Status

Get Device Status

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicestatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicestatusApi apiInstance = new DevicestatusApi();
String deviceId = "deviceId_example"; // String | Device ID.
Boolean includeSnapshot = true; // Boolean | Include device snapshot into the response
Boolean includeSnapshotTimestamp = true; // Boolean | Include device snapshot timestamp into the response
try {
    DeviceStatus result = apiInstance.getDeviceStatus(deviceId, includeSnapshot, includeSnapshotTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicestatusApi#getDeviceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **includeSnapshot** | **Boolean**| Include device snapshot into the response | [optional]
 **includeSnapshotTimestamp** | **Boolean**| Include device snapshot timestamp into the response | [optional]

### Return type

[**DeviceStatus**](DeviceStatus.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDevicesStatus"></a>
# **getDevicesStatus**
> DeviceStatusBatch getDevicesStatus(dids, includeSnapshot, includeSnapshotTimestamp)

Get Devices Status

Get Devices Status

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicestatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicestatusApi apiInstance = new DevicestatusApi();
String dids = "dids_example"; // String | List of device ids (comma-separated) for which the statuses are requested.
Boolean includeSnapshot = true; // Boolean | Include device snapshot into the response
Boolean includeSnapshotTimestamp = true; // Boolean | Include device snapshot timestamp into the response
try {
    DeviceStatusBatch result = apiInstance.getDevicesStatus(dids, includeSnapshot, includeSnapshotTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicestatusApi#getDevicesStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dids** | **String**| List of device ids (comma-separated) for which the statuses are requested. |
 **includeSnapshot** | **Boolean**| Include device snapshot into the response | [optional]
 **includeSnapshotTimestamp** | **Boolean**| Include device snapshot timestamp into the response | [optional]

### Return type

[**DeviceStatusBatch**](DeviceStatusBatch.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putDeviceStatus"></a>
# **putDeviceStatus**
> DeviceStatus putDeviceStatus(deviceId, body)

Update Device Status

Update Device Status

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicestatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicestatusApi apiInstance = new DevicestatusApi();
String deviceId = "deviceId_example"; // String | Device ID.
DeviceStatusPut body = new DeviceStatusPut(); // DeviceStatusPut | Body
try {
    DeviceStatus result = apiInstance.putDeviceStatus(deviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicestatusApi#putDeviceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |
 **body** | [**DeviceStatusPut**](DeviceStatusPut.md)| Body | [optional]

### Return type

[**DeviceStatus**](DeviceStatus.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

