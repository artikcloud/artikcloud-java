# ScenesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScene**](ScenesApi.md#createScene) | **POST** /scenes | Create a new scene
[**getScene**](ScenesApi.md#getScene) | **GET** /scenes/{sceneId} | Get a scene
[**getScenes**](ScenesApi.md#getScenes) | **GET** /scenes | Get all user scenes
[**scenesSceneIdDelete**](ScenesApi.md#scenesSceneIdDelete) | **DELETE** /scenes/{sceneId} | Delete a scene
[**triggerScene**](ScenesApi.md#triggerScene) | **POST** /scenes/{sceneId} | Trigger a scene
[**updateScene**](ScenesApi.md#updateScene) | **PUT** /scenes/{sceneId} | Update a scene


<a name="createScene"></a>
# **createScene**
> SceneEnvelope createScene(body)

Create a new scene

Create a new scene

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
SceneCreationInfo body = new SceneCreationInfo(); // SceneCreationInfo | Body
try {
    SceneEnvelope result = apiInstance.createScene(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#createScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SceneCreationInfo**](SceneCreationInfo.md)| Body |

### Return type

[**SceneEnvelope**](SceneEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScene"></a>
# **getScene**
> SceneEnvelope getScene(sceneId)

Get a scene

Get a scene

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
String sceneId = "sceneId_example"; // String | Scene id
try {
    SceneEnvelope result = apiInstance.getScene(sceneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#getScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **String**| Scene id |

### Return type

[**SceneEnvelope**](SceneEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScenes"></a>
# **getScenes**
> ScenesEnvelope getScenes(count, offset)

Get all user scenes

Get all user scenes

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
String count = "count_example"; // String | count
String offset = "offset_example"; // String | offset
try {
    ScenesEnvelope result = apiInstance.getScenes(count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#getScenes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **String**| count | [optional]
 **offset** | **String**| offset | [optional]

### Return type

[**ScenesEnvelope**](ScenesEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scenesSceneIdDelete"></a>
# **scenesSceneIdDelete**
> SceneEnvelope scenesSceneIdDelete(sceneId)

Delete a scene

Delete a scene

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
String sceneId = "sceneId_example"; // String | Scene id
try {
    SceneEnvelope result = apiInstance.scenesSceneIdDelete(sceneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#scenesSceneIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **String**| Scene id |

### Return type

[**SceneEnvelope**](SceneEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="triggerScene"></a>
# **triggerScene**
> SceneEnvelope triggerScene(sceneId, body)

Trigger a scene

Trigger a scene

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
String sceneId = "sceneId_example"; // String | Scene id
Object body = null; // Object | Body
try {
    SceneEnvelope result = apiInstance.triggerScene(sceneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#triggerScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **String**| Scene id |
 **body** | **Object**| Body |

### Return type

[**SceneEnvelope**](SceneEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScene"></a>
# **updateScene**
> SceneEnvelope updateScene(sceneId, body)

Update a scene

Update a scene

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.ScenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

ScenesApi apiInstance = new ScenesApi();
String sceneId = "sceneId_example"; // String | Scene id
SceneCreationInfo body = new SceneCreationInfo(); // SceneCreationInfo | Body
try {
    SceneEnvelope result = apiInstance.updateScene(sceneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenesApi#updateScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **String**| Scene id |
 **body** | [**SceneCreationInfo**](SceneCreationInfo.md)| Body |

### Return type

[**SceneEnvelope**](SceneEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

