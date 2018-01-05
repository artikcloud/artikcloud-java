# UsersApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserProperties**](UsersApi.md#createUserProperties) | **POST** /users/{userId}/properties | Create User Application Properties
[**deleteUserProperties**](UsersApi.md#deleteUserProperties) | **DELETE** /users/{userId}/properties | Delete User Application Properties
[**getSelf**](UsersApi.md#getSelf) | **GET** /users/self | Get Current User Profile
[**getUserDeviceTypes**](UsersApi.md#getUserDeviceTypes) | **GET** /users/{userId}/devicetypes | Get User Device Types
[**getUserDevices**](UsersApi.md#getUserDevices) | **GET** /users/{userId}/devices | Get User Devices
[**getUserProperties**](UsersApi.md#getUserProperties) | **GET** /users/{userId}/properties | Get User application properties
[**getUserRules**](UsersApi.md#getUserRules) | **GET** /users/{userId}/rules | Get User Rules
[**listAllSharesForUser**](UsersApi.md#listAllSharesForUser) | **GET** /users/{userId}/shares | Get User shares
[**updateUserProperties**](UsersApi.md#updateUserProperties) | **PUT** /users/{userId}/properties | Update User Application Properties


<a name="createUserProperties"></a>
# **createUserProperties**
> PropertiesEnvelope createUserProperties(userId, properties, aid)

Create User Application Properties

Create application properties for a user

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
AppProperties properties = new AppProperties(); // AppProperties | Properties to be updated
String aid = "aid_example"; // String | Application ID
try {
    PropertiesEnvelope result = apiInstance.createUserProperties(userId, properties, aid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **properties** | [**AppProperties**](AppProperties.md)| Properties to be updated |
 **aid** | **String**| Application ID | [optional]

### Return type

[**PropertiesEnvelope**](PropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserProperties"></a>
# **deleteUserProperties**
> PropertiesEnvelope deleteUserProperties(userId, aid)

Delete User Application Properties

Deletes a user&#39;s application properties

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String aid = "aid_example"; // String | Application ID
try {
    PropertiesEnvelope result = apiInstance.deleteUserProperties(userId, aid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **aid** | **String**| Application ID | [optional]

### Return type

[**PropertiesEnvelope**](PropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSelf"></a>
# **getSelf**
> UserEnvelope getSelf()

Get Current User Profile

Get&#39;s the current user&#39;s profile

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    UserEnvelope result = apiInstance.getSelf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getSelf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserEnvelope**](UserEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserDeviceTypes"></a>
# **getUserDeviceTypes**
> DeviceTypesEnvelope getUserDeviceTypes(userId, offset, count, includeShared)

Get User Device Types

Retrieve User&#39;s Device Types

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID.
Integer offset = 56; // Integer | Offset for pagination.
Integer count = 56; // Integer | Desired count of items in the result set
Boolean includeShared = true; // Boolean | Optional. Boolean (true/false) - If false, only return the user's device types. If true, also return device types shared by other users.
try {
    DeviceTypesEnvelope result = apiInstance.getUserDeviceTypes(userId, offset, count, includeShared);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDeviceTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID. |
 **offset** | **Integer**| Offset for pagination. | [optional]
 **count** | **Integer**| Desired count of items in the result set | [optional]
 **includeShared** | **Boolean**| Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. | [optional]

### Return type

[**DeviceTypesEnvelope**](DeviceTypesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserDevices"></a>
# **getUserDevices**
> DevicesEnvelope getUserDevices(userId, offset, count, includeProperties, owner, includeShareInfo, dtid)

Get User Devices

Retrieve User&#39;s Devices

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer offset = 56; // Integer | Offset for pagination.
Integer count = 56; // Integer | Desired count of items in the result set
Boolean includeProperties = true; // Boolean | Optional. Boolean (true/false) - If false, only return the user's device types. If true, also return device types shared by other users.
String owner = "owner_example"; // String | Return owned and/or shared devices. Default to ALL.
Boolean includeShareInfo = true; // Boolean | Include share info
String dtid = "dtid_example"; // String | Return only devices of this device type. If empty, assumes all device types allowed by the authorization.
try {
    DevicesEnvelope result = apiInstance.getUserDevices(userId, offset, count, includeProperties, owner, includeShareInfo, dtid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **offset** | **Integer**| Offset for pagination. | [optional]
 **count** | **Integer**| Desired count of items in the result set | [optional]
 **includeProperties** | **Boolean**| Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. | [optional]
 **owner** | **String**| Return owned and/or shared devices. Default to ALL. | [optional]
 **includeShareInfo** | **Boolean**| Include share info | [optional]
 **dtid** | **String**| Return only devices of this device type. If empty, assumes all device types allowed by the authorization. | [optional]

### Return type

[**DevicesEnvelope**](DevicesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserProperties"></a>
# **getUserProperties**
> PropertiesEnvelope getUserProperties(userId, aid)

Get User application properties

Get application properties of a user

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String aid = "aid_example"; // String | Application ID
try {
    PropertiesEnvelope result = apiInstance.getUserProperties(userId, aid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **aid** | **String**| Application ID | [optional]

### Return type

[**PropertiesEnvelope**](PropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserRules"></a>
# **getUserRules**
> RulesEnvelope getUserRules(userId, excludeDisabled, count, offset, owner)

Get User Rules

Retrieve User&#39;s Rules

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID.
Boolean excludeDisabled = true; // Boolean | Exclude disabled rules in the result.
Integer count = 56; // Integer | Desired count of items in the result set.
Integer offset = 56; // Integer | Offset for pagination.
String owner = "owner_example"; // String | Rule owner
try {
    RulesEnvelope result = apiInstance.getUserRules(userId, excludeDisabled, count, offset, owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID. |
 **excludeDisabled** | **Boolean**| Exclude disabled rules in the result. | [optional]
 **count** | **Integer**| Desired count of items in the result set. | [optional]
 **offset** | **Integer**| Offset for pagination. | [optional]
 **owner** | **String**| Rule owner | [optional] [enum: user, application, all]

### Return type

[**RulesEnvelope**](RulesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllSharesForUser"></a>
# **listAllSharesForUser**
> DeviceSharingEnvelope listAllSharesForUser(userId, filter, count, offset)

Get User shares

Get User shares

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID.
String filter = "filter_example"; // String | filter
Integer count = 56; // Integer | Desired count of items in the result set.
Integer offset = 56; // Integer | Offset for pagination.
try {
    DeviceSharingEnvelope result = apiInstance.listAllSharesForUser(userId, filter, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listAllSharesForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID. |
 **filter** | **String**| filter |
 **count** | **Integer**| Desired count of items in the result set. | [optional]
 **offset** | **Integer**| Offset for pagination. | [optional]

### Return type

[**DeviceSharingEnvelope**](DeviceSharingEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserProperties"></a>
# **updateUserProperties**
> PropertiesEnvelope updateUserProperties(userId, properties, aid)

Update User Application Properties

Updates application properties of a user

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
AppProperties properties = new AppProperties(); // AppProperties | Properties to be updated
String aid = "aid_example"; // String | Application ID
try {
    PropertiesEnvelope result = apiInstance.updateUserProperties(userId, properties, aid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **properties** | [**AppProperties**](AppProperties.md)| Properties to be updated |
 **aid** | **String**| Application ID | [optional]

### Return type

[**PropertiesEnvelope**](PropertiesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

