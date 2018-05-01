# MlApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModel**](MlApi.md#createModel) | **POST** /ml/models | Create model
[**deleteModel**](MlApi.md#deleteModel) | **DELETE** /ml/models/{modelId} | Delete model
[**getModel**](MlApi.md#getModel) | **GET** /ml/models/{modelId} | Get model
[**getModels**](MlApi.md#getModels) | **GET** /ml/models | Get models
[**predict**](MlApi.md#predict) | **POST** /ml/models/{modelId}/predict | Predict


<a name="createModel"></a>
# **createModel**
> ModelResponseBody createModel(body)

Create model

Create model

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MlApi apiInstance = new MlApi();
CreateModelBody body = new CreateModelBody(); // CreateModelBody | Body
try {
    ModelResponseBody result = apiInstance.createModel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MlApi#createModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateModelBody**](CreateModelBody.md)| Body | [optional]

### Return type

[**ModelResponseBody**](ModelResponseBody.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> ModelResponseBody deleteModel(modelId)

Delete model

Delete model

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MlApi apiInstance = new MlApi();
String modelId = "modelId_example"; // String | modelId
try {
    ModelResponseBody result = apiInstance.deleteModel(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MlApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| modelId |

### Return type

[**ModelResponseBody**](ModelResponseBody.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> ModelResponseBody getModel(modelId)

Get model

Get model

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MlApi apiInstance = new MlApi();
String modelId = "modelId_example"; // String | modelId
try {
    ModelResponseBody result = apiInstance.getModel(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MlApi#getModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| modelId |

### Return type

[**ModelResponseBody**](ModelResponseBody.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModels"></a>
# **getModels**
> GetModelsResponseBody getModels(uid, count, offset)

Get models

Get models

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MlApi apiInstance = new MlApi();
String uid = "uid_example"; // String | uid
String count = "count_example"; // String | count
String offset = "offset_example"; // String | offset
try {
    GetModelsResponseBody result = apiInstance.getModels(uid, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MlApi#getModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| uid | [optional]
 **count** | **String**| count | [optional]
 **offset** | **String**| offset | [optional]

### Return type

[**GetModelsResponseBody**](GetModelsResponseBody.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="predict"></a>
# **predict**
> PredictResponseBody predict(modelId, body)

Predict

Predict

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MlApi apiInstance = new MlApi();
String modelId = "modelId_example"; // String | modelId
PredictBody body = new PredictBody(); // PredictBody | Body
try {
    PredictResponseBody result = apiInstance.predict(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MlApi#predict");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| modelId |
 **body** | [**PredictBody**](PredictBody.md)| Body | [optional]

### Return type

[**PredictResponseBody**](PredictResponseBody.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

