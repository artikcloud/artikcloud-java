# SubscriptionsApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /subscriptions | Create Subscription
[**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /subscriptions/{subId} | Delete Subscription
[**getAllSubscriptions**](SubscriptionsApi.md#getAllSubscriptions) | **GET** /subscriptions | Get All Subscriptions
[**getMessages**](SubscriptionsApi.md#getMessages) | **GET** /notifications/{notifId}/messages | Get Messages
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{subId} | Get Subscription
[**validateSubscription**](SubscriptionsApi.md#validateSubscription) | **POST** /subscriptions/{subId}/validate | Validate Subscription


<a name="createSubscription"></a>
# **createSubscription**
> SubscriptionEnvelope createSubscription(subscriptionInfo)

Create Subscription

Create Subscription

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionInfo subscriptionInfo = new SubscriptionInfo(); // SubscriptionInfo | Subscription details
try {
    SubscriptionEnvelope result = apiInstance.createSubscription(subscriptionInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionInfo** | [**SubscriptionInfo**](SubscriptionInfo.md)| Subscription details |

### Return type

[**SubscriptionEnvelope**](SubscriptionEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSubscription"></a>
# **deleteSubscription**
> SubscriptionEnvelope deleteSubscription(subId)

Delete Subscription

Delete Subscription

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String subId = "subId_example"; // String | Subscription ID.
try {
    SubscriptionEnvelope result = apiInstance.deleteSubscription(subId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#deleteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subId** | **String**| Subscription ID. |

### Return type

[**SubscriptionEnvelope**](SubscriptionEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllSubscriptions"></a>
# **getAllSubscriptions**
> SubscriptionsEnvelope getAllSubscriptions(uid, offset, count)

Get All Subscriptions

Get All Subscriptions

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String uid = "uid_example"; // String | User ID
Integer offset = 56; // Integer | Offset for pagination.
Integer count = 56; // Integer | Desired count of items in the result set.
try {
    SubscriptionsEnvelope result = apiInstance.getAllSubscriptions(uid, offset, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getAllSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| User ID | [optional]
 **offset** | **Integer**| Offset for pagination. | [optional]
 **count** | **Integer**| Desired count of items in the result set. | [optional]

### Return type

[**SubscriptionsEnvelope**](SubscriptionsEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> NotifMessagesResponse getMessages(notifId, offset, count, order)

Get Messages

Get Messages

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String notifId = "notifId_example"; // String | Notification ID.
Integer offset = 56; // Integer | Offset for pagination.
Integer count = 56; // Integer | Desired count of items in the result set.
String order = "order_example"; // String | Sort order of results by ts. Either 'asc' or 'desc'.
try {
    NotifMessagesResponse result = apiInstance.getMessages(notifId, offset, count, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notifId** | **String**| Notification ID. |
 **offset** | **Integer**| Offset for pagination. | [optional]
 **count** | **Integer**| Desired count of items in the result set. | [optional]
 **order** | **String**| Sort order of results by ts. Either &#39;asc&#39; or &#39;desc&#39;. | [optional]

### Return type

[**NotifMessagesResponse**](NotifMessagesResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionEnvelope getSubscription(subId)

Get Subscription

Get Subscription

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String subId = "subId_example"; // String | Subscription ID.
try {
    SubscriptionEnvelope result = apiInstance.getSubscription(subId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subId** | **String**| Subscription ID. |

### Return type

[**SubscriptionEnvelope**](SubscriptionEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateSubscription"></a>
# **validateSubscription**
> SubscriptionEnvelope validateSubscription(subId, validationCallbackRequest)

Validate Subscription

Validate Subscription

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String subId = "subId_example"; // String | Subscription ID.
ValidationCallbackInfo validationCallbackRequest = new ValidationCallbackInfo(); // ValidationCallbackInfo | Subscription validation callback request
try {
    SubscriptionEnvelope result = apiInstance.validateSubscription(subId, validationCallbackRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#validateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subId** | **String**| Subscription ID. |
 **validationCallbackRequest** | [**ValidationCallbackInfo**](ValidationCallbackInfo.md)| Subscription validation callback request |

### Return type

[**SubscriptionEnvelope**](SubscriptionEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

