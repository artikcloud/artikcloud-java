# DevicesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDevice**](DevicesApi.md#addDevice) | **POST** /devices | Add Device
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /devices/{deviceId} | Delete Device
[**deleteDeviceToken**](DevicesApi.md#deleteDeviceToken) | **DELETE** /devices/{deviceId}/tokens | Delete Device Token
[**getDevice**](DevicesApi.md#getDevice) | **GET** /devices/{deviceId} | Get Device
[**getDevicePresence**](DevicesApi.md#getDevicePresence) | **GET** /devices/{deviceId}/presence | Get device presence information
[**getDeviceToken**](DevicesApi.md#getDeviceToken) | **GET** /devices/{deviceId}/tokens | Get Device Token
[**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /devices/{deviceId} | Update Device
[**updateDeviceToken**](DevicesApi.md#updateDeviceToken) | **PUT** /devices/{deviceId}/tokens | Update Device Token


<a name="addDevice"></a>
# **addDevice**
> DeviceEnvelope addDevice(device)

Add Device

Create a device

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
Device device = new Device(); // Device | Device to be added to the user
try {
    DeviceEnvelope result = apiInstance.addDevice(device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#addDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**Device**](Device.md)| Device to be added to the user |

### Return type

[**DeviceEnvelope**](DeviceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDevice"></a>
# **deleteDevice**
> DeviceEnvelope deleteDevice(deviceId)

Delete Device

Deletes a device

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
try {
    DeviceEnvelope result = apiInstance.deleteDevice(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |

### Return type

[**DeviceEnvelope**](DeviceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDeviceToken"></a>
# **deleteDeviceToken**
> DeviceTokenEnvelope deleteDeviceToken(deviceId)

Delete Device Token

Deletes a device&#39;s token

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
try {
    DeviceTokenEnvelope result = apiInstance.deleteDeviceToken(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDeviceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |

### Return type

[**DeviceTokenEnvelope**](DeviceTokenEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDevice"></a>
# **getDevice**
> DeviceEnvelope getDevice(deviceId)

Get Device

Retrieves a device

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
try {
    DeviceEnvelope result = apiInstance.getDevice(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |

### Return type

[**DeviceEnvelope**](DeviceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDevicePresence"></a>
# **getDevicePresence**
> PresenceEnvelope getDevicePresence(deviceId)

Get device presence information

Return the presence status of the given device along with the time it was last seen

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | Device ID.
try {
    PresenceEnvelope result = apiInstance.getDevicePresence(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDevicePresence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |

### Return type

[**PresenceEnvelope**](PresenceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceToken"></a>
# **getDeviceToken**
> DeviceTokenEnvelope getDeviceToken(deviceId)

Get Device Token

Retrieves a device&#39;s token

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
try {
    DeviceTokenEnvelope result = apiInstance.getDeviceToken(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDeviceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |

### Return type

[**DeviceTokenEnvelope**](DeviceTokenEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDevice"></a>
# **updateDevice**
> DeviceEnvelope updateDevice(deviceId, device)

Update Device

Updates a device

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
Device device = new Device(); // Device | Device to be updated
try {
    DeviceEnvelope result = apiInstance.updateDevice(deviceId, device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **device** | [**Device**](Device.md)| Device to be updated |

### Return type

[**DeviceEnvelope**](DeviceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeviceToken"></a>
# **updateDeviceToken**
> DeviceTokenEnvelope updateDeviceToken(deviceId)

Update Device Token

Updates a device&#39;s token

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String deviceId = "deviceId_example"; // String | deviceId
try {
    DeviceTokenEnvelope result = apiInstance.updateDeviceToken(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDeviceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |

### Return type

[**DeviceTokenEnvelope**](DeviceTokenEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

