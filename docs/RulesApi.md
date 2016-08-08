# RulesApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRule**](RulesApi.md#createRule) | **POST** /rules | Create Rule
[**deleteRule**](RulesApi.md#deleteRule) | **DELETE** /rules/{ruleId} | Delete Rule
[**getRule**](RulesApi.md#getRule) | **GET** /rules/{ruleId} | Get Rule
[**updateRule**](RulesApi.md#updateRule) | **PUT** /rules/{ruleId} | Update Rule


<a name="createRule"></a>
# **createRule**
> RuleEnvelope createRule(ruleInfo, userId)

Create Rule

Create a new Rule

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RulesApi apiInstance = new RulesApi();
RuleCreationInfo ruleInfo = new RuleCreationInfo(); // RuleCreationInfo | Rule object that needs to be added
String userId = "userId_example"; // String | User ID
try {
    RuleEnvelope result = apiInstance.createRule(ruleInfo, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#createRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleInfo** | [**RuleCreationInfo**](RuleCreationInfo.md)| Rule object that needs to be added |
 **userId** | **String**| User ID |

### Return type

[**RuleEnvelope**](RuleEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRule"></a>
# **deleteRule**
> RuleEnvelope deleteRule(ruleId)

Delete Rule

Delete a Rule

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RulesApi apiInstance = new RulesApi();
String ruleId = "ruleId_example"; // String | Rule ID.
try {
    RuleEnvelope result = apiInstance.deleteRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#deleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID. |

### Return type

[**RuleEnvelope**](RuleEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRule"></a>
# **getRule**
> RuleEnvelope getRule(ruleId)

Get Rule

Get a rule using the Rule ID

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RulesApi apiInstance = new RulesApi();
String ruleId = "ruleId_example"; // String | Rule ID.
try {
    RuleEnvelope result = apiInstance.getRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#getRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID. |

### Return type

[**RuleEnvelope**](RuleEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRule"></a>
# **updateRule**
> RuleEnvelope updateRule(ruleId, ruleInfo)

Update Rule

Update an existing Rule

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

RulesApi apiInstance = new RulesApi();
String ruleId = "ruleId_example"; // String | Rule ID.
RuleUpdateInfo ruleInfo = new RuleUpdateInfo(); // RuleUpdateInfo | Rule object that needs to be updated
try {
    RuleEnvelope result = apiInstance.updateRule(ruleId, ruleInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID. |
 **ruleInfo** | [**RuleUpdateInfo**](RuleUpdateInfo.md)| Rule object that needs to be updated |

### Return type

[**RuleEnvelope**](RuleEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

