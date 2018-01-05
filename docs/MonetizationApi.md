# MonetizationApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPricingTiers**](MonetizationApi.md#createPricingTiers) | **POST** /pricing/devicetypes/{dtid}/pricingtiers | Define devicetype&#39;s pricing tiers.
[**getPricingTiers**](MonetizationApi.md#getPricingTiers) | **GET** /pricing/devices/{did}/pricingtiers | Get a device&#39;s pricing tiers
[**getThePricingTiers**](MonetizationApi.md#getThePricingTiers) | **GET** /pricing/devicetypes/{dtid}/pricingtiers | Get devicetype&#39;s pricing tiers.
[**getUpgradePath**](MonetizationApi.md#getUpgradePath) | **GET** /pricing/devices/{did}/revenueshare/upgradepath | Get upgrade path
[**setPricingTier**](MonetizationApi.md#setPricingTier) | **PUT** /pricing/devices/{did}/pricingtiers | Set a device&#39;s pricing tier


<a name="createPricingTiers"></a>
# **createPricingTiers**
> DeviceTypePricingTier createPricingTiers(dtid, pricingTierInfo)

Define devicetype&#39;s pricing tiers.

Define devicetype&#39;s pricing tiers.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MonetizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MonetizationApi apiInstance = new MonetizationApi();
String dtid = "dtid_example"; // String | DeviceType ID
DeviceTypePricingTier pricingTierInfo = new DeviceTypePricingTier(); // DeviceTypePricingTier | Pricing tier info
try {
    DeviceTypePricingTier result = apiInstance.createPricingTiers(dtid, pricingTierInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonetizationApi#createPricingTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| DeviceType ID |
 **pricingTierInfo** | [**DeviceTypePricingTier**](DeviceTypePricingTier.md)| Pricing tier info |

### Return type

[**DeviceTypePricingTier**](DeviceTypePricingTier.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPricingTiers"></a>
# **getPricingTiers**
> DevicePricingTiersEnvelope getPricingTiers(did, active)

Get a device&#39;s pricing tiers

Get a device&#39;s pricing tiers

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MonetizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MonetizationApi apiInstance = new MonetizationApi();
String did = "did_example"; // String | Device ID
Boolean active = true; // Boolean | Filter by active
try {
    DevicePricingTiersEnvelope result = apiInstance.getPricingTiers(did, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonetizationApi#getPricingTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID |
 **active** | **Boolean**| Filter by active | [optional]

### Return type

[**DevicePricingTiersEnvelope**](DevicePricingTiersEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThePricingTiers"></a>
# **getThePricingTiers**
> DeviceTypePricingTiersEnvelope getThePricingTiers(dtid, version)

Get devicetype&#39;s pricing tiers.

Get devicetype&#39;s pricing tiers.

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MonetizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MonetizationApi apiInstance = new MonetizationApi();
String dtid = "dtid_example"; // String | DeviceType ID
Integer version = 56; // Integer | Version
try {
    DeviceTypePricingTiersEnvelope result = apiInstance.getThePricingTiers(dtid, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonetizationApi#getThePricingTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dtid** | **String**| DeviceType ID |
 **version** | **Integer**| Version |

### Return type

[**DeviceTypePricingTiersEnvelope**](DeviceTypePricingTiersEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpgradePath"></a>
# **getUpgradePath**
> UpgradePathEnvelope getUpgradePath(did, action)

Get upgrade path

Get upgrade path

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MonetizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MonetizationApi apiInstance = new MonetizationApi();
String did = "did_example"; // String | Device ID
String action = "action_example"; // String | Action to perform
try {
    UpgradePathEnvelope result = apiInstance.getUpgradePath(did, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonetizationApi#getUpgradePath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID |
 **action** | **String**| Action to perform |

### Return type

[**UpgradePathEnvelope**](UpgradePathEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setPricingTier"></a>
# **setPricingTier**
> DevicePricingTierEnvelope setPricingTier(did, pricingTier)

Set a device&#39;s pricing tier

Set a device&#39;s pricing tier

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.MonetizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

MonetizationApi apiInstance = new MonetizationApi();
String did = "did_example"; // String | Device ID
DevicePricingTierRequest pricingTier = new DevicePricingTierRequest(); // DevicePricingTierRequest | Pricing tier
try {
    DevicePricingTierEnvelope result = apiInstance.setPricingTier(did, pricingTier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonetizationApi#setPricingTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **did** | **String**| Device ID |
 **pricingTier** | [**DevicePricingTierRequest**](DevicePricingTierRequest.md)| Pricing tier |

### Return type

[**DevicePricingTierEnvelope**](DevicePricingTierEnvelope.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

