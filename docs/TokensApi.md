# TokensApi

All URIs are relative to *https://api.artik.cloud/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkToken**](TokensApi.md#checkToken) | **POST** /accounts/checkToken | Check Token
[**refreshToken**](TokensApi.md#refreshToken) | **POST** /accounts/token | Refresh Token


<a name="checkToken"></a>
# **checkToken**
> CheckTokenResponse checkToken(tokenInfo)

Check Token

Check Token

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

TokensApi apiInstance = new TokensApi();
TokenRequest tokenInfo = new TokenRequest(); // TokenRequest | Token object to be checked
try {
    CheckTokenResponse result = apiInstance.checkToken(tokenInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#checkToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenInfo** | [**TokenRequest**](TokenRequest.md)| Token object to be checked |

### Return type

[**CheckTokenResponse**](CheckTokenResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refreshToken"></a>
# **refreshToken**
> RefreshTokenResponse refreshToken(grantType, refreshToken)

Refresh Token

Refresh Token

### Example
```java
// Import classes:
//import cloud.artik.client.ApiClient;
//import cloud.artik.client.ApiException;
//import cloud.artik.client.Configuration;
//import cloud.artik.client.auth.*;
//import cloud.artik.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: artikcloud_oauth
OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

TokensApi apiInstance = new TokensApi();
String grantType = "grantType_example"; // String | Grant Type.
String refreshToken = "refreshToken_example"; // String | Refresh Token.
try {
    RefreshTokenResponse result = apiInstance.refreshToken(grantType, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#refreshToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| Grant Type. |
 **refreshToken** | **String**| Refresh Token. |

### Return type

[**RefreshTokenResponse**](RefreshTokenResponse.md)

### Authorization

[artikcloud_oauth](../README.md#artikcloud_oauth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

