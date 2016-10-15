# DeviceTypesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableManifestVersions**](DeviceTypesApi.md#getAvailableManifestVersions) | **GET** /devicetypes/{deviceTypeId}/availablemanifestversions | Get Available Manifest Versions
[**getDeviceType**](DeviceTypesApi.md#getDeviceType) | **GET** /devicetypes/{deviceTypeId} | Get Device Type
[**getDeviceTypes**](DeviceTypesApi.md#getDeviceTypes) | **GET** /devicetypes | Get Device Types
[**getDeviceTypesByApplication**](DeviceTypesApi.md#getDeviceTypesByApplication) | **GET** /applications/{appId}/devicetypes | Get Device Types by Application
[**getLatestManifestProperties**](DeviceTypesApi.md#getLatestManifestProperties) | **GET** /devicetypes/{deviceTypeId}/manifests/latest/properties | Get Latest Manifest Properties
[**getManifestProperties**](DeviceTypesApi.md#getManifestProperties) | **GET** /devicetypes/{deviceTypeId}/manifests/{version}/properties | Get manifest properties


<a name="getAvailableManifestVersions"></a>
# **getAvailableManifestVersions**
> ManifestVersionsEnvelope getAvailableManifestVersions(deviceTypeId)

Get Available Manifest Versions

Get a Device Type&#39;s available manifest versions

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String deviceTypeId = "deviceTypeId_example"; // String | deviceTypeId
try {
    ManifestVersionsEnvelope result = apiInstance.getAvailableManifestVersions(deviceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getAvailableManifestVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypeId** | **String**| deviceTypeId |

### Return type

[**ManifestVersionsEnvelope**](ManifestVersionsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceType"></a>
# **getDeviceType**
> DeviceTypeEnvelope getDeviceType(deviceTypeId)

Get Device Type

Retrieves a Device Type

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String deviceTypeId = "deviceTypeId_example"; // String | deviceTypeId
try {
    DeviceTypeEnvelope result = apiInstance.getDeviceType(deviceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getDeviceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypeId** | **String**| deviceTypeId |

### Return type

[**DeviceTypeEnvelope**](DeviceTypeEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceTypes"></a>
# **getDeviceTypes**
> DeviceTypesEnvelope getDeviceTypes(name, offset, count, tags)

Get Device Types

Retrieves Device Types

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String name = "name_example"; // String | Device Type name
Integer offset = 56; // Integer | Offset for pagination.
Integer count = 56; // Integer | Desired count of items in the result set
String tags = "tags_example"; // String | Elements tagged with the list of tags. (comma separated)
try {
    DeviceTypesEnvelope result = apiInstance.getDeviceTypes(name, offset, count, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getDeviceTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Device Type name |
 **offset** | **Integer**| Offset for pagination. | [optional]
 **count** | **Integer**| Desired count of items in the result set | [optional]
 **tags** | **String**| Elements tagged with the list of tags. (comma separated) | [optional]

### Return type

[**DeviceTypesEnvelope**](DeviceTypesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String appId = "appId_example"; // String | Application ID.
Boolean productInfo = true; // Boolean | Flag to include the associated ProductInfo if present
Integer count = 56; // Integer | Desired count of items in the result set.
Integer offset = 56; // Integer | Offset for pagination.
try {
    DeviceTypesEnvelope result = apiInstance.getDeviceTypesByApplication(appId, productInfo, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getDeviceTypesByApplication");
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

<a name="getLatestManifestProperties"></a>
# **getLatestManifestProperties**
> ManifestPropertiesEnvelope getLatestManifestProperties(deviceTypeId)

Get Latest Manifest Properties

Get a Device Type&#39;s manifest properties for the latest version.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String deviceTypeId = "deviceTypeId_example"; // String | Device Type ID.
try {
    ManifestPropertiesEnvelope result = apiInstance.getLatestManifestProperties(deviceTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getLatestManifestProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypeId** | **String**| Device Type ID. |

### Return type

[**ManifestPropertiesEnvelope**](ManifestPropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManifestProperties"></a>
# **getManifestProperties**
> ManifestPropertiesEnvelope getManifestProperties(deviceTypeId, version)

Get manifest properties

Get a Device Type&#39;s manifest properties for a specific version.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DeviceTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DeviceTypesApi apiInstance = new DeviceTypesApi();
String deviceTypeId = "deviceTypeId_example"; // String | Device Type ID.
String version = "version_example"; // String | Manifest Version.
try {
    ManifestPropertiesEnvelope result = apiInstance.getManifestProperties(deviceTypeId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceTypesApi#getManifestProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypeId** | **String**| Device Type ID. |
 **version** | **String**| Manifest Version. |

### Return type

[**ManifestPropertiesEnvelope**](ManifestPropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

