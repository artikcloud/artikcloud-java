# ExportApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportRequest**](ExportApi.md#exportRequest) | **POST** /messages/export | Create Export Request
[**getExportHistory**](ExportApi.md#getExportHistory) | **GET** /messages/export/history | Get Export History
[**getExportResult**](ExportApi.md#getExportResult) | **GET** /messages/export/{exportId}/result | Get Export Result
[**getExportStatus**](ExportApi.md#getExportStatus) | **GET** /messages/export/{exportId}/status | Check Export Status


<a name="exportRequest"></a>
# **exportRequest**
> ExportRequestResponse exportRequest(exportRequestInfo)

Create Export Request

Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ExportApi apiInstance = new ExportApi();
ExportRequestInfo exportRequestInfo = new ExportRequestInfo(); // ExportRequestInfo | ExportRequest object that is passed in the body
try {
    ExportRequestResponse result = apiInstance.exportRequest(exportRequestInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#exportRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportRequestInfo** | [**ExportRequestInfo**](ExportRequestInfo.md)| ExportRequest object that is passed in the body |

### Return type

[**ExportRequestResponse**](ExportRequestResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExportHistory"></a>
# **getExportHistory**
> ExportHistoryResponse getExportHistory(trialId, count, offset)

Get Export History

Get the history of export requests.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ExportApi apiInstance = new ExportApi();
String trialId = "trialId_example"; // String | Filter by trialId.
Integer count = 56; // Integer | Pagination count.
Integer offset = 56; // Integer | Pagination offset.
try {
    ExportHistoryResponse result = apiInstance.getExportHistory(trialId, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#getExportHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trialId** | **String**| Filter by trialId. | [optional]
 **count** | **Integer**| Pagination count. | [optional]
 **offset** | **Integer**| Pagination offset. | [optional]

### Return type

[**ExportHistoryResponse**](ExportHistoryResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExportResult"></a>
# **getExportResult**
> String getExportResult(exportId)

Get Export Result

Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ExportApi apiInstance = new ExportApi();
String exportId = "exportId_example"; // String | Export ID of the export query.
try {
    String result = apiInstance.getExportResult(exportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#getExportResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportId** | **String**| Export ID of the export query. |

### Return type

**String**

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExportStatus"></a>
# **getExportStatus**
> ExportStatusResponse getExportStatus(exportId)

Check Export Status

Check status of the export query.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ExportApi apiInstance = new ExportApi();
String exportId = "exportId_example"; // String | Export ID of the export query.
try {
    ExportStatusResponse result = apiInstance.getExportStatus(exportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#getExportStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportId** | **String**| Export ID of the export query. |

### Return type

[**ExportStatusResponse**](ExportStatusResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

