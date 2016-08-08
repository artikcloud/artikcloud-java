# RegistrationsApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmUser**](RegistrationsApi.md#confirmUser) | **PUT** /devices/registrations/pin | Confirm User
[**getRequestStatusForUser**](RegistrationsApi.md#getRequestStatusForUser) | **GET** /devices/registrations/{requestId}/status | Get Request Status For User
[**unregisterDevice**](RegistrationsApi.md#unregisterDevice) | **DELETE** /devices/{deviceId}/registrations | Unregister Device


<a name="confirmUser"></a>
# **confirmUser**
> DeviceRegConfirmUserResponseEnvelope confirmUser(registrationInfo)

Confirm User

This call updates the registration request issued earlier by associating it with an authenticated user and captures all additional information required to add a new device.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RegistrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RegistrationsApi apiInstance = new RegistrationsApi();
DeviceRegConfirmUserRequest registrationInfo = new DeviceRegConfirmUserRequest(); // DeviceRegConfirmUserRequest | Device Registration information.
try {
    DeviceRegConfirmUserResponseEnvelope result = apiInstance.confirmUser(registrationInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#confirmUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationInfo** | [**DeviceRegConfirmUserRequest**](DeviceRegConfirmUserRequest.md)| Device Registration information. |

### Return type

[**DeviceRegConfirmUserResponseEnvelope**](DeviceRegConfirmUserResponseEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRequestStatusForUser"></a>
# **getRequestStatusForUser**
> DeviceRegStatusResponseEnvelope getRequestStatusForUser(requestId)

Get Request Status For User

This call checks the status of the request so users can poll and know when registration is complete.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RegistrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RegistrationsApi apiInstance = new RegistrationsApi();
String requestId = "requestId_example"; // String | Request ID.
try {
    DeviceRegStatusResponseEnvelope result = apiInstance.getRequestStatusForUser(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#getRequestStatusForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Request ID. |

### Return type

[**DeviceRegStatusResponseEnvelope**](DeviceRegStatusResponseEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unregisterDevice"></a>
# **unregisterDevice**
> UnregisterDeviceResponseEnvelope unregisterDevice(deviceId)

Unregister Device

This call clears any associations from the secure device registration.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RegistrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RegistrationsApi apiInstance = new RegistrationsApi();
String deviceId = "deviceId_example"; // String | Device ID.
try {
    UnregisterDeviceResponseEnvelope result = apiInstance.unregisterDevice(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#unregisterDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Device ID. |

### Return type

[**UnregisterDeviceResponseEnvelope**](UnregisterDeviceResponseEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

