# DevicesManagementApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTasks**](DevicesManagementApi.md#createTasks) | **POST** /devicemgmt/tasks | Create a new task for one or more devices
[**deleteServerProperties**](DevicesManagementApi.md#deleteServerProperties) | **DELETE** /devicemgmt/devices/{did}/serverproperties | Deletes a device&#39;s properties.
[**getAllByDid**](DevicesManagementApi.md#getAllByDid) | **GET** /devicemgmt/devices/{did}/tasks | Returns the list of tasks for a particular device id with optional status filter.
[**getDeviceTypesInfo**](DevicesManagementApi.md#getDeviceTypesInfo) | **GET** /devicemgmt/devicetypes/{dtid} | Read a device type device management information.
[**getManifestProperties**](DevicesManagementApi.md#getManifestProperties) | **GET** /devicemgmt/devicetypes/{dtid}/manifest/properties | Get a device type&#39;s device management manifest properties
[**getProperties**](DevicesManagementApi.md#getProperties) | **GET** /devicemgmt/devices/{did}/properties | Read a device&#39;s properties.
[**getStatuses**](DevicesManagementApi.md#getStatuses) | **GET** /devicemgmt/tasks/{tid}/statuses | Returns the details and status of a task id and the individual statuses of each device id in the list.
[**getStatusesHistory**](DevicesManagementApi.md#getStatusesHistory) | **GET** /devicemgmt/tasks/{tid}/statuses/history | Returns the history of the status changes for a specific task id, or for a specific device id in that task.
[**getTaskByID**](DevicesManagementApi.md#getTaskByID) | **GET** /devicemgmt/tasks/{tid} | Returns the details and global status of a specific task id.
[**getTasks**](DevicesManagementApi.md#getTasks) | **GET** /devicemgmt/tasks | Returns the all the tasks for a device type.
[**queryProperties**](DevicesManagementApi.md#queryProperties) | **GET** /devicemgmt/devices/properties | Query device properties across devices.
[**updateDeviceTypesInfo**](DevicesManagementApi.md#updateDeviceTypesInfo) | **PUT** /devicemgmt/devicetypes/{dtid} | Updates a device type information
[**updateServerProperties**](DevicesManagementApi.md#updateServerProperties) | **POST** /devicemgmt/devices/{did}/serverproperties | Updates a device&#39;s server properties.
[**updateTask**](DevicesManagementApi.md#updateTask) | **PUT** /devicemgmt/tasks/{tid} | Updates a task for all devices - For now just allows changing the state to cancelled.
[**updateTaskForDevice**](DevicesManagementApi.md#updateTaskForDevice) | **PUT** /devicemgmt/tasks/{tid}/devices/{did} | Updates a task for a specific device - For now just allows changing the state to cancelled.


<a name="createTasks"></a>
# **createTasks**
> TaskEnvelope createTasks(taskPayload)

Create a new task for one or more devices

Create a new task for one or more devices

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
TaskRequest taskPayload = new TaskRequest(); // TaskRequest | Task object to be created
try {
    TaskEnvelope result = apiInstance.createTasks(taskPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#createTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskPayload** | [**TaskRequest**](TaskRequest.md)| Task object to be created |

### Return type

[**TaskEnvelope**](TaskEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteServerProperties"></a>
# **deleteServerProperties**
> MetadataEnvelope deleteServerProperties(did)

Deletes a device&#39;s properties.

Deletes a device&#39;s properties.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String did = "did_example"; // String | Device ID.
try {
    MetadataEnvelope result = apiInstance.deleteServerProperties(did);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#deleteServerProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID. |

### Return type

[**MetadataEnvelope**](MetadataEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllByDid"></a>
# **getAllByDid**
> TaskByDidListEnvelope getAllByDid(did, count, offset, status, order, sort)

Returns the list of tasks for a particular device id with optional status filter.

Returns the list of tasks for a particular device id with optional status filter.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String did = "did_example"; // String | Device ID.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
String status = "status_example"; // String | Status filter. Comma-separated statuses.
String order = "order_example"; // String | Sort results by a field. Valid fields: createdOn.
String sort = "sort_example"; // String | Sort order. Valid values: asc or desc.
try {
    TaskByDidListEnvelope result = apiInstance.getAllByDid(did, count, offset, status, order, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getAllByDid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]
 **status** | **String**| Status filter. Comma-separated statuses. | [optional]
 **order** | **String**| Sort results by a field. Valid fields: createdOn. | [optional]
 **sort** | **String**| Sort order. Valid values: asc or desc. | [optional]

### Return type

[**TaskByDidListEnvelope**](TaskByDidListEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceTypesInfo"></a>
# **getDeviceTypesInfo**
> DeviceTypesInfoEnvelope getDeviceTypesInfo(dtid)

Read a device type device management information.

Read a device type device management information.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String dtid = "dtid_example"; // String | Device type ID.
try {
    DeviceTypesInfoEnvelope result = apiInstance.getDeviceTypesInfo(dtid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getDeviceTypesInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device type ID. |

### Return type

[**DeviceTypesInfoEnvelope**](DeviceTypesInfoEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManifestProperties"></a>
# **getManifestProperties**
> MetadataPropertiesEnvelope getManifestProperties(dtid)

Get a device type&#39;s device management manifest properties

Get a device type&#39;s device management manifest properties

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String dtid = "dtid_example"; // String | Device Type ID.
try {
    MetadataPropertiesEnvelope result = apiInstance.getManifestProperties(dtid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getManifestProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |

### Return type

[**MetadataPropertiesEnvelope**](MetadataPropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProperties"></a>
# **getProperties**
> MetadataEnvelope getProperties(did, includeTimestamp)

Read a device&#39;s properties.

Read a device&#39;s properties.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String did = "did_example"; // String | Device ID.
Boolean includeTimestamp = true; // Boolean | Include timestamp.
try {
    MetadataEnvelope result = apiInstance.getProperties(did, includeTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID. |
 **includeTimestamp** | **Boolean**| Include timestamp. | [optional]

### Return type

[**MetadataEnvelope**](MetadataEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatuses"></a>
# **getStatuses**
> TaskStatusesEnvelope getStatuses(tid, count, offset, status, dids)

Returns the details and status of a task id and the individual statuses of each device id in the list.

Returns the details and status of a task id and the individual statuses of each device id in the list.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String tid = "tid_example"; // String | Task ID.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
String status = "status_example"; // String | Status filter. Comma-separated statuses.
String dids = "dids_example"; // String | Devices filter. Comma-separated device IDs.
try {
    TaskStatusesEnvelope result = apiInstance.getStatuses(tid, count, offset, status, dids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tid** | **String**| Task ID. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]
 **status** | **String**| Status filter. Comma-separated statuses. | [optional]
 **dids** | **String**| Devices filter. Comma-separated device IDs. | [optional]

### Return type

[**TaskStatusesEnvelope**](TaskStatusesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatusesHistory"></a>
# **getStatusesHistory**
> TaskStatusesHistoryEnvelope getStatusesHistory(tid, did)

Returns the history of the status changes for a specific task id, or for a specific device id in that task.

Returns the history of the status changes for a specific task id, or for a specific device id in that task.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String tid = "tid_example"; // String | Task ID.
String did = "did_example"; // String | Device ID. Optional.
try {
    TaskStatusesHistoryEnvelope result = apiInstance.getStatusesHistory(tid, did);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getStatusesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tid** | **String**| Task ID. |
 **did** | **String**| Device ID. Optional. | [optional]

### Return type

[**TaskStatusesHistoryEnvelope**](TaskStatusesHistoryEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskByID"></a>
# **getTaskByID**
> TaskEnvelope getTaskByID(tid)

Returns the details and global status of a specific task id.

Returns the details and global status of a specific task id.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String tid = "tid_example"; // String | Task ID.
try {
    TaskEnvelope result = apiInstance.getTaskByID(tid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getTaskByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tid** | **String**| Task ID. |

### Return type

[**TaskEnvelope**](TaskEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasks"></a>
# **getTasks**
> TaskListEnvelope getTasks(dtid, count, offset, status, order, sort)

Returns the all the tasks for a device type.

Returns the all the tasks for a device type.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String dtid = "dtid_example"; // String | Device Type ID.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
String status = "status_example"; // String | Status filter. Comma-separated statuses.
String order = "order_example"; // String | Sort results by a field. Valid fields: createdOn.
String sort = "sort_example"; // String | Sort order. Valid values: asc or desc.
try {
    TaskListEnvelope result = apiInstance.getTasks(dtid, count, offset, status, order, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#getTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]
 **status** | **String**| Status filter. Comma-separated statuses. | [optional]
 **order** | **String**| Sort results by a field. Valid fields: createdOn. | [optional]
 **sort** | **String**| Sort order. Valid values: asc or desc. | [optional]

### Return type

[**TaskListEnvelope**](TaskListEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryProperties"></a>
# **queryProperties**
> MetadataQueryEnvelope queryProperties(dtid, count, offset, filter, includeTimestamp)

Query device properties across devices.

Query device properties across devices.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String dtid = "dtid_example"; // String | Device Type ID.
Integer count = 56; // Integer | Max results count.
Integer offset = 56; // Integer | Result starting offset.
String filter = "filter_example"; // String | Query filter. Comma-separated key=value pairs
Boolean includeTimestamp = true; // Boolean | Include timestamp.
try {
    MetadataQueryEnvelope result = apiInstance.queryProperties(dtid, count, offset, filter, includeTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#queryProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device Type ID. |
 **count** | **Integer**| Max results count. | [optional]
 **offset** | **Integer**| Result starting offset. | [optional]
 **filter** | **String**| Query filter. Comma-separated key&#x3D;value pairs | [optional]
 **includeTimestamp** | **Boolean**| Include timestamp. | [optional]

### Return type

[**MetadataQueryEnvelope**](MetadataQueryEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeviceTypesInfo"></a>
# **updateDeviceTypesInfo**
> DeviceTypesInfoEnvelope updateDeviceTypesInfo(dtid, deviceTypeInfo)

Updates a device type information

Updates a device type information

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String dtid = "dtid_example"; // String | Device type ID.
DeviceTypesInfo deviceTypeInfo = new DeviceTypesInfo(); // DeviceTypesInfo | Device type info object to be set
try {
    DeviceTypesInfoEnvelope result = apiInstance.updateDeviceTypesInfo(dtid, deviceTypeInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#updateDeviceTypesInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| Device type ID. |
 **deviceTypeInfo** | [**DeviceTypesInfo**](DeviceTypesInfo.md)| Device type info object to be set |

### Return type

[**DeviceTypesInfoEnvelope**](DeviceTypesInfoEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateServerProperties"></a>
# **updateServerProperties**
> MetadataEnvelope updateServerProperties(did, deviceProperties)

Updates a device&#39;s server properties.

Updates a device&#39;s server properties.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String did = "did_example"; // String | Device ID.
MetadataRequest deviceProperties = new MetadataRequest(); // MetadataRequest | Device properties object to be set
try {
    MetadataEnvelope result = apiInstance.updateServerProperties(did, deviceProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#updateServerProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID. |
 **deviceProperties** | [**MetadataRequest**](MetadataRequest.md)| Device properties object to be set |

### Return type

[**MetadataEnvelope**](MetadataEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTask"></a>
# **updateTask**
> TaskUpdateResponse updateTask(tid, taskUpdateRequest)

Updates a task for all devices - For now just allows changing the state to cancelled.

Updates a task for all devices - For now just allows changing the state to cancelled.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String tid = "tid_example"; // String | Task ID.
TaskUpdateRequest taskUpdateRequest = new TaskUpdateRequest(); // TaskUpdateRequest | Task update request
try {
    TaskUpdateResponse result = apiInstance.updateTask(tid, taskUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tid** | **String**| Task ID. |
 **taskUpdateRequest** | [**TaskUpdateRequest**](TaskUpdateRequest.md)| Task update request |

### Return type

[**TaskUpdateResponse**](TaskUpdateResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTaskForDevice"></a>
# **updateTaskForDevice**
> DeviceTaskUpdateResponse updateTaskForDevice(tid, did, deviceTaskUpdateRequest)

Updates a task for a specific device - For now just allows changing the state to cancelled.

Updates a task for a specific device - For now just allows changing the state to cancelled.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.DevicesManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

DevicesManagementApi apiInstance = new DevicesManagementApi();
String tid = "tid_example"; // String | Task ID.
String did = "did_example"; // String | Device ID.
DeviceTaskUpdateRequest deviceTaskUpdateRequest = new DeviceTaskUpdateRequest(); // DeviceTaskUpdateRequest | Device task update request
try {
    DeviceTaskUpdateResponse result = apiInstance.updateTaskForDevice(tid, did, deviceTaskUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesManagementApi#updateTaskForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tid** | **String**| Task ID. |
 **did** | **String**| Device ID. |
 **deviceTaskUpdateRequest** | [**DeviceTaskUpdateRequest**](DeviceTaskUpdateRequest.md)| Device task update request |

### Return type

[**DeviceTaskUpdateResponse**](DeviceTaskUpdateResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

