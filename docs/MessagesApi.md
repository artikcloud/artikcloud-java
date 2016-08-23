# MessagesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAggregatesHistogram**](MessagesApi.md#getAggregatesHistogram) | **GET** /messages/analytics/histogram | Get Normalized Message Histogram
[**getFieldPresence**](MessagesApi.md#getFieldPresence) | **GET** /messages/presence | Get normalized message presence
[**getLastNormalizedMessages**](MessagesApi.md#getLastNormalizedMessages) | **GET** /messages/last | Get Last Normalized Message
[**getMessageAggregates**](MessagesApi.md#getMessageAggregates) | **GET** /messages/analytics/aggregates | Get Normalized Message Aggregates
[**getMessageSnapshots**](MessagesApi.md#getMessageSnapshots) | **GET** /messages/snapshots | Get Message Snapshots
[**getNormalizedActions**](MessagesApi.md#getNormalizedActions) | **GET** /actions | Get Normalized Actions
[**getNormalizedMessages**](MessagesApi.md#getNormalizedMessages) | **GET** /messages | Get Normalized Messages
[**sendActions**](MessagesApi.md#sendActions) | **POST** /actions | Send Actions
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | Send Message


<a name="getAggregatesHistogram"></a>
# **getAggregatesHistogram**
> AggregatesHistogramResponse getAggregatesHistogram(startDate, endDate, sdid, field, interval)

Get Normalized Message Histogram

Get Histogram on normalized messages.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
Long startDate = 789L; // Long | Timestamp of earliest message (in milliseconds since epoch).
Long endDate = 789L; // Long | Timestamp of latest message (in milliseconds since epoch).
String sdid = "sdid_example"; // String | Source device ID of the messages being searched.
String field = "field_example"; // String | Message field being queried for building histogram.
String interval = "interval_example"; // String | Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year)
try {
    AggregatesHistogramResponse result = apiInstance.getAggregatesHistogram(startDate, endDate, sdid, field, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getAggregatesHistogram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| Timestamp of earliest message (in milliseconds since epoch). |
 **endDate** | **Long**| Timestamp of latest message (in milliseconds since epoch). |
 **sdid** | **String**| Source device ID of the messages being searched. | [optional]
 **field** | **String**| Message field being queried for building histogram. | [optional]
 **interval** | **String**| Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year) | [optional]

### Return type

[**AggregatesHistogramResponse**](AggregatesHistogramResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldPresence"></a>
# **getFieldPresence**
> FieldPresenceEnvelope getFieldPresence(startDate, endDate, interval, sdid, fieldPresence)

Get normalized message presence

Get normalized message presence.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
Long startDate = 789L; // Long | startDate
Long endDate = 789L; // Long | endDate
String interval = "interval_example"; // String | String representing grouping interval. One of: 'minute' (1 hour limit), 'hour' (1 day limit), 'day' (31 days limit), 'month' (1 year limit), or 'year' (10 years limit).
String sdid = "sdid_example"; // String | Source device ID of the messages being searched.
String fieldPresence = "fieldPresence_example"; // String | String representing a field from the specified device ID.
try {
    FieldPresenceEnvelope result = apiInstance.getFieldPresence(startDate, endDate, interval, sdid, fieldPresence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getFieldPresence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| startDate |
 **endDate** | **Long**| endDate |
 **interval** | **String**| String representing grouping interval. One of: &#39;minute&#39; (1 hour limit), &#39;hour&#39; (1 day limit), &#39;day&#39; (31 days limit), &#39;month&#39; (1 year limit), or &#39;year&#39; (10 years limit). |
 **sdid** | **String**| Source device ID of the messages being searched. | [optional]
 **fieldPresence** | **String**| String representing a field from the specified device ID. | [optional]

### Return type

[**FieldPresenceEnvelope**](FieldPresenceEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastNormalizedMessages"></a>
# **getLastNormalizedMessages**
> NormalizedMessagesEnvelope getLastNormalizedMessages(count, sdids, fieldPresence)

Get Last Normalized Message

Get last messages normalized.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
Integer count = 56; // Integer | Number of items to return per query.
String sdids = "sdids_example"; // String | Comma separated list of source device IDs (minimum: 1).
String fieldPresence = "fieldPresence_example"; // String | String representing a field from the specified device ID.
try {
    NormalizedMessagesEnvelope result = apiInstance.getLastNormalizedMessages(count, sdids, fieldPresence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getLastNormalizedMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to return per query. | [optional]
 **sdids** | **String**| Comma separated list of source device IDs (minimum: 1). | [optional]
 **fieldPresence** | **String**| String representing a field from the specified device ID. | [optional]

### Return type

[**NormalizedMessagesEnvelope**](NormalizedMessagesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessageAggregates"></a>
# **getMessageAggregates**
> AggregatesResponse getMessageAggregates(sdid, field, startDate, endDate)

Get Normalized Message Aggregates

Get Aggregates on normalized messages.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
String sdid = "sdid_example"; // String | Source device ID of the messages being searched.
String field = "field_example"; // String | Message field being queried for aggregates.
Long startDate = 789L; // Long | Timestamp of earliest message (in milliseconds since epoch).
Long endDate = 789L; // Long | Timestamp of latest message (in milliseconds since epoch).
try {
    AggregatesResponse result = apiInstance.getMessageAggregates(sdid, field, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getMessageAggregates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdid** | **String**| Source device ID of the messages being searched. |
 **field** | **String**| Message field being queried for aggregates. |
 **startDate** | **Long**| Timestamp of earliest message (in milliseconds since epoch). |
 **endDate** | **Long**| Timestamp of latest message (in milliseconds since epoch). |

### Return type

[**AggregatesResponse**](AggregatesResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessageSnapshots"></a>
# **getMessageSnapshots**
> SnapshotResponses getMessageSnapshots(sdids, includeTimestamp)

Get Message Snapshots

Get message snapshots.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
String sdids = "sdids_example"; // String | Device IDs for which the snapshots are requested. Max 100 device ids per call.
Boolean includeTimestamp = true; // Boolean | Indicates whether to return timestamps of the last update for each field.
try {
    SnapshotResponses result = apiInstance.getMessageSnapshots(sdids, includeTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getMessageSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdids** | **String**| Device IDs for which the snapshots are requested. Max 100 device ids per call. |
 **includeTimestamp** | **Boolean**| Indicates whether to return timestamps of the last update for each field. | [optional]

### Return type

[**SnapshotResponses**](SnapshotResponses.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNormalizedActions"></a>
# **getNormalizedActions**
> NormalizedActionsEnvelope getNormalizedActions(uid, ddid, mid, offset, count, startDate, endDate, order)

Get Normalized Actions

Get the actions normalized

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
String uid = "uid_example"; // String | User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to.
String ddid = "ddid_example"; // String | Destination device ID of the actions being searched.
String mid = "mid_example"; // String | The message ID being searched.
String offset = "offset_example"; // String | A string that represents the starting item, should be the value of 'next' field received in the last response. (required for pagination)
Integer count = 56; // Integer | count
Long startDate = 789L; // Long | startDate
Long endDate = 789L; // Long | endDate
String order = "order_example"; // String | Desired sort order: 'asc' or 'desc'
try {
    NormalizedActionsEnvelope result = apiInstance.getNormalizedActions(uid, ddid, mid, offset, count, startDate, endDate, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getNormalizedActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. | [optional]
 **ddid** | **String**| Destination device ID of the actions being searched. | [optional]
 **mid** | **String**| The message ID being searched. | [optional]
 **offset** | **String**| A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination) | [optional]
 **count** | **Integer**| count | [optional]
 **startDate** | **Long**| startDate | [optional]
 **endDate** | **Long**| endDate | [optional]
 **order** | **String**| Desired sort order: &#39;asc&#39; or &#39;desc&#39; | [optional]

### Return type

[**NormalizedActionsEnvelope**](NormalizedActionsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNormalizedMessages"></a>
# **getNormalizedMessages**
> NormalizedMessagesEnvelope getNormalizedMessages(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order)

Get Normalized Messages

Get the messages normalized

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
String uid = "uid_example"; // String | User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to.
String sdid = "sdid_example"; // String | Source device ID of the messages being searched.
String mid = "mid_example"; // String | The message ID being searched.
String fieldPresence = "fieldPresence_example"; // String | String representing a field from the specified device ID.
String filter = "filter_example"; // String | Filter.
String offset = "offset_example"; // String | A string that represents the starting item, should be the value of 'next' field received in the last response. (required for pagination)
Integer count = 56; // Integer | count
Long startDate = 789L; // Long | startDate
Long endDate = 789L; // Long | endDate
String order = "order_example"; // String | Desired sort order: 'asc' or 'desc'
try {
    NormalizedMessagesEnvelope result = apiInstance.getNormalizedMessages(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getNormalizedMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. | [optional]
 **sdid** | **String**| Source device ID of the messages being searched. | [optional]
 **mid** | **String**| The message ID being searched. | [optional]
 **fieldPresence** | **String**| String representing a field from the specified device ID. | [optional]
 **filter** | **String**| Filter. | [optional]
 **offset** | **String**| A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination) | [optional]
 **count** | **Integer**| count | [optional]
 **startDate** | **Long**| startDate | [optional]
 **endDate** | **Long**| endDate | [optional]
 **order** | **String**| Desired sort order: &#39;asc&#39; or &#39;desc&#39; | [optional]

### Return type

[**NormalizedMessagesEnvelope**](NormalizedMessagesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendActions"></a>
# **sendActions**
> MessageIDEnvelope sendActions(data)

Send Actions

Send Actions

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
Actions data = new Actions(); // Actions | Actions that are passed in the body
try {
    MessageIDEnvelope result = apiInstance.sendActions(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Actions**](Actions.md)| Actions that are passed in the body |

### Return type

[**MessageIDEnvelope**](MessageIDEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> MessageIDEnvelope sendMessage(data)

Send Message

Send a message

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
Message data = new Message(); // Message | Message object that is passed in the body
try {
    MessageIDEnvelope result = apiInstance.sendMessage(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Message**](Message.md)| Message object that is passed in the body |

### Return type

[**MessageIDEnvelope**](MessageIDEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

