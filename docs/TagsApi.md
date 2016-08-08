# TagsApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTagCategories**](TagsApi.md#getTagCategories) | **GET** /tags/categories | Get all categories
[**getTagSuggestions**](TagsApi.md#getTagSuggestions) | **GET** /tags/suggestions | Get tag suggestions
[**getTagsByCategories**](TagsApi.md#getTagsByCategories) | **GET** /tags | Get all tags of categories


<a name="getTagCategories"></a>
# **getTagCategories**
> TagsEnvelope getTagCategories()

Get all categories

Get all tags marked as categories

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

TagsApi apiInstance = new TagsApi();
try {
    TagsEnvelope result = apiInstance.getTagCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TagsEnvelope**](TagsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagSuggestions"></a>
# **getTagSuggestions**
> TagsEnvelope getTagSuggestions(entityType, tags, name, count)

Get tag suggestions

Get tag suggestions for applications, device types that have been most used with a group of tags.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

TagsApi apiInstance = new TagsApi();
String entityType = "entityType_example"; // String | Entity type name.
String tags = "tags_example"; // String | Comma separated list of tags.
String name = "name_example"; // String | Name of tags used for type ahead.
Integer count = 56; // Integer | Number of results to return. Max 10.
try {
    TagsEnvelope result = apiInstance.getTagSuggestions(entityType, tags, name, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagSuggestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Entity type name. | [optional] [enum: TAG, APPLICATION, DEVICE_TYPE]
 **tags** | **String**| Comma separated list of tags. | [optional]
 **name** | **String**| Name of tags used for type ahead. | [optional]
 **count** | **Integer**| Number of results to return. Max 10. | [optional]

### Return type

[**TagsEnvelope**](TagsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagsByCategories"></a>
# **getTagsByCategories**
> TagsEnvelope getTagsByCategories(categories)

Get all tags of categories

Get all tags related to the list of categories

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

TagsApi apiInstance = new TagsApi();
String categories = "categories_example"; // String | Comma separated list of categories.
try {
    TagsEnvelope result = apiInstance.getTagsByCategories(categories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagsByCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | **String**| Comma separated list of categories. | [optional]

### Return type

[**TagsEnvelope**](TagsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

