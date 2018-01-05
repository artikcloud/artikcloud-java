# WhitelistingApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVdid**](WhitelistingApi.md#deleteVdid) | **DELETE** /devicetypes/{dtid}/whitelist/{vdid} | Delete a vdid from the devicetype whitelist.
[**deleteWhitelistCertificate**](WhitelistingApi.md#deleteWhitelistCertificate) | **DELETE** /devicetypes/{dtid}/whitelist/certificates/{cid} | Delete a whitelist certificate associated with a devicetype.
[**enableWhitelist**](WhitelistingApi.md#enableWhitelist) | **PUT** /devicetypes/:dtid/whitelist/enable | Enable or disble whitelist feature of a device type
[**getRejectedRowList**](WhitelistingApi.md#getRejectedRowList) | **GET** /devicetypes/{dtid}/whitelist/{uploadId}/rejectedRows | Get the list of rejected rows for an uploaded CSV file.
[**getUploadStatus**](WhitelistingApi.md#getUploadStatus) | **GET** /devicetypes/{dtid}/whitelist/{uploadId}/status | Get the status of a uploaded CSV file.
[**getWhitelist**](WhitelistingApi.md#getWhitelist) | **GET** /devicetypes/{dtid}/whitelist | Get whitelisted vdids of a device type.
[**getWhitelistCertificate**](WhitelistingApi.md#getWhitelistCertificate) | **GET** /devicetypes/{dtid}/whitelist/certificates | Get whitelist certificate of device type.
[**getWhitelistStatus**](WhitelistingApi.md#getWhitelistStatus) | **GET** /devicetypes/{dtid}/whitelist/status | Get the status of whitelist feature (enabled/disabled) of a device type.
[**uploadCSV**](WhitelistingApi.md#uploadCSV) | **POST** /devicetypes/{dtid}/whitelist | Upload a CSV file related to the Device Type.


<a name="deleteVdid"></a>
# **deleteVdid**
> WhitelistEnvelope deleteVdid(dtid, vdid)

Delete a vdid from the devicetype whitelist.

Delete a vdid from the devicetype whitelist.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
String vdid = "vdid_example"; // String | Vendor Device ID.
try {
    WhitelistEnvelope result = apiInstance.deleteVdid(dtid, vdid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#deleteVdid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **vdid** | **String**| Vendor Device ID. |

### Return type

[**WhitelistEnvelope**](WhitelistEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWhitelistCertificate"></a>
# **deleteWhitelistCertificate**
> WhitelistEnvelope deleteWhitelistCertificate(dtid, cid)

Delete a whitelist certificate associated with a devicetype.

Delete a whitelist certificate associated with a devicetype.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
String cid = "cid_example"; // String | Certificate ID.
try {
    WhitelistEnvelope result = apiInstance.deleteWhitelistCertificate(dtid, cid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#deleteWhitelistCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **cid** | **String**| Certificate ID. |

### Return type

[**WhitelistEnvelope**](WhitelistEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableWhitelist"></a>
# **enableWhitelist**
> WhitelistEnvelope enableWhitelist(dtid, deviceTypeUpdateInfo)

Enable or disble whitelist feature of a device type

Enable or disble whitelist feature of a device type

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
DeviceTypeUpdateInput deviceTypeUpdateInfo = new DeviceTypeUpdateInput(); // DeviceTypeUpdateInput | Device type update input.
try {
    WhitelistEnvelope result = apiInstance.enableWhitelist(dtid, deviceTypeUpdateInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#enableWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **deviceTypeUpdateInfo** | [**DeviceTypeUpdateInput**](DeviceTypeUpdateInput.md)| Device type update input. |

### Return type

[**WhitelistEnvelope**](WhitelistEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRejectedRowList"></a>
# **getRejectedRowList**
> RejectedCSVRowsEnvelope getRejectedRowList(dtid, uploadId, count, offset)

Get the list of rejected rows for an uploaded CSV file.

Get the list of rejected rows for an uploaded CSV file.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device type id related to the uploaded CSV file.
String uploadId = "uploadId_example"; // String | Upload id related to the uploaded CSV file.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
try {
    RejectedCSVRowsEnvelope result = apiInstance.getRejectedRowList(dtid, uploadId, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#getRejectedRowList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device type id related to the uploaded CSV file. |
 **uploadId** | **String**| Upload id related to the uploaded CSV file. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]

### Return type

[**RejectedCSVRowsEnvelope**](RejectedCSVRowsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUploadStatus"></a>
# **getUploadStatus**
> UploadStatusEnvelope getUploadStatus(dtid, uploadId)

Get the status of a uploaded CSV file.

Get the status of a uploaded CSV file.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device type id related to the uploaded CSV file.
String uploadId = "uploadId_example"; // String | Upload id related to the uploaded CSV file.
try {
    UploadStatusEnvelope result = apiInstance.getUploadStatus(dtid, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#getUploadStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device type id related to the uploaded CSV file. |
 **uploadId** | **String**| Upload id related to the uploaded CSV file. |

### Return type

[**UploadStatusEnvelope**](UploadStatusEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhitelist"></a>
# **getWhitelist**
> WhitelistResultEnvelope getWhitelist(dtid, count, offset)

Get whitelisted vdids of a device type.

Get whitelisted vdids of a device type.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
try {
    WhitelistResultEnvelope result = apiInstance.getWhitelist(dtid, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#getWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]

### Return type

[**WhitelistResultEnvelope**](WhitelistResultEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhitelistCertificate"></a>
# **getWhitelistCertificate**
> CertificateEnvelope getWhitelistCertificate(dtid)

Get whitelist certificate of device type.

Get whitelist certificate of device type.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
try {
    CertificateEnvelope result = apiInstance.getWhitelistCertificate(dtid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#getWhitelistCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |

### Return type

[**CertificateEnvelope**](CertificateEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhitelistStatus"></a>
# **getWhitelistStatus**
> WhitelistEnvelope getWhitelistStatus(dtid)

Get the status of whitelist feature (enabled/disabled) of a device type.

Get the status of whitelist feature (enabled/disabled) of a device type.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
try {
    WhitelistEnvelope result = apiInstance.getWhitelistStatus(dtid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#getWhitelistStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |

### Return type

[**WhitelistEnvelope**](WhitelistEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadCSV"></a>
# **uploadCSV**
> UploadIdEnvelope uploadCSV(dtid, file)

Upload a CSV file related to the Device Type.

Upload a CSV file related to the Device Type.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.WhitelistingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

WhitelistingApi apiInstance = new WhitelistingApi();
String dtid = "dtid_example"; // String | Device Type ID.
byte[] file = BINARY_DATA_HERE; // byte[] | Device Type ID.
try {
    UploadIdEnvelope result = apiInstance.uploadCSV(dtid, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhitelistingApi#uploadCSV");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **file** | **byte[]**| Device Type ID. |

### Return type

[**UploadIdEnvelope**](UploadIdEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

