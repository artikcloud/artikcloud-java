ARTIK Cloud Java/Android SDK
================

[![Build Status](https://travis-ci.org/artikcloud/artikcloud-java.svg?branch=master)](https://travis-ci.org/artikcloud/artikcloud-java)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cloud.artik/artikcloud-java/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/cloud.artik/artikcloud-java)

This SDK helps you connect your Java or Android apps to ARTIK Cloud. The SDK exposes a number of methods to easily execute REST and WebSockets API calls to ARTIK Cloud.

Prerequisites
-------------

 * [Maven](http://maven.apache.org/) or [Maven Integration for Eclipse](https://www.eclipse.org/m2e/)
 * JavaSE 1.7 or above

The SDK was developed with Maven and tested with Android 4.4.2. Building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>cloud.artik</groupId>
    <artifactId>artikcloud-java</artifactId>
    <version>2.0.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cloud.artik:artikcloud-java:2.0.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/artikcloud-java-2.0.5.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cloud.artik.client.*;
import cloud.artik.client.auth.*;
import cloud.artik.client.model.*;
import cloud.artik.api.DeviceTypesApi;

import java.io.File;
import java.util.*;

public class DeviceTypesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: artikcloud_oauth
        OAuth artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
        artikcloud_oauth.setAccessToken("YOUR ACCESS TOKEN");

        DeviceTypesApi apiInstance = new DeviceTypesApi();
        String deviceTypeId = "deviceTypeId_example"; // String | deviceTypeId
        try {
            ManifestVersionsEnvelope result = apiInstance.getAvailableManifestVersions(deviceTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceTypesApi#getAvailableManifestVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.artik.cloud/v1.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeviceTypesApi* | [**getAvailableManifestVersions**](docs/DeviceTypesApi.md#getAvailableManifestVersions) | **GET** /devicetypes/{deviceTypeId}/availablemanifestversions | Get Available Manifest Versions
*DeviceTypesApi* | [**getDeviceType**](docs/DeviceTypesApi.md#getDeviceType) | **GET** /devicetypes/{deviceTypeId} | Get Device Type
*DeviceTypesApi* | [**getDeviceTypes**](docs/DeviceTypesApi.md#getDeviceTypes) | **GET** /devicetypes | Get Device Types
*DeviceTypesApi* | [**getLatestManifestProperties**](docs/DeviceTypesApi.md#getLatestManifestProperties) | **GET** /devicetypes/{deviceTypeId}/manifests/latest/properties | Get Latest Manifest Properties
*DeviceTypesApi* | [**getManifestProperties**](docs/DeviceTypesApi.md#getManifestProperties) | **GET** /devicetypes/{deviceTypeId}/manifests/{version}/properties | Get manifest properties
*DevicesApi* | [**addDevice**](docs/DevicesApi.md#addDevice) | **POST** /devices | Add Device
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /devices/{deviceId} | Delete Device
*DevicesApi* | [**deleteDeviceToken**](docs/DevicesApi.md#deleteDeviceToken) | **DELETE** /devices/{deviceId}/tokens | Delete Device Token
*DevicesApi* | [**getDevice**](docs/DevicesApi.md#getDevice) | **GET** /devices/{deviceId} | Get Device
*DevicesApi* | [**getDevicePresence**](docs/DevicesApi.md#getDevicePresence) | **GET** /devices/{deviceId}/presence | Get device presence information
*DevicesApi* | [**getDeviceToken**](docs/DevicesApi.md#getDeviceToken) | **GET** /devices/{deviceId}/tokens | Get Device Token
*DevicesApi* | [**updateDevice**](docs/DevicesApi.md#updateDevice) | **PUT** /devices/{deviceId} | Update Device
*DevicesApi* | [**updateDeviceToken**](docs/DevicesApi.md#updateDeviceToken) | **PUT** /devices/{deviceId}/tokens | Update Device Token
*ExportApi* | [**exportRequest**](docs/ExportApi.md#exportRequest) | **POST** /messages/export | Create Export Request
*ExportApi* | [**getExportHistory**](docs/ExportApi.md#getExportHistory) | **GET** /messages/export/history | Get Export History
*ExportApi* | [**getExportResult**](docs/ExportApi.md#getExportResult) | **GET** /messages/export/{exportId}/result | Get Export Result
*ExportApi* | [**getExportStatus**](docs/ExportApi.md#getExportStatus) | **GET** /messages/export/{exportId}/status | Check Export Status
*MessagesApi* | [**getAggregatesHistogram**](docs/MessagesApi.md#getAggregatesHistogram) | **GET** /messages/analytics/histogram | Get Normalized Message Histogram
*MessagesApi* | [**getFieldPresence**](docs/MessagesApi.md#getFieldPresence) | **GET** /messages/presence | Get normalized message presence
*MessagesApi* | [**getLastNormalizedMessages**](docs/MessagesApi.md#getLastNormalizedMessages) | **GET** /messages/last | Get Last Normalized Message
*MessagesApi* | [**getMessageAggregates**](docs/MessagesApi.md#getMessageAggregates) | **GET** /messages/analytics/aggregates | Get Normalized Message Aggregates
*MessagesApi* | [**getMessageSnapshots**](docs/MessagesApi.md#getMessageSnapshots) | **GET** /messages/snapshots | Get Message Snapshots
*MessagesApi* | [**getNormalizedActions**](docs/MessagesApi.md#getNormalizedActions) | **GET** /actions | Get Normalized Actions
*MessagesApi* | [**getNormalizedMessages**](docs/MessagesApi.md#getNormalizedMessages) | **GET** /messages | Get Normalized Messages
*MessagesApi* | [**sendActions**](docs/MessagesApi.md#sendActions) | **POST** /actions | Send Actions
*MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendMessage) | **POST** /messages | Send Message
*RegistrationsApi* | [**confirmUser**](docs/RegistrationsApi.md#confirmUser) | **PUT** /devices/registrations/pin | Confirm User
*RegistrationsApi* | [**getRequestStatusForUser**](docs/RegistrationsApi.md#getRequestStatusForUser) | **GET** /devices/registrations/{requestId}/status | Get Request Status For User
*RegistrationsApi* | [**unregisterDevice**](docs/RegistrationsApi.md#unregisterDevice) | **DELETE** /devices/{deviceId}/registrations | Unregister Device
*RulesApi* | [**createRule**](docs/RulesApi.md#createRule) | **POST** /rules | Create Rule
*RulesApi* | [**deleteRule**](docs/RulesApi.md#deleteRule) | **DELETE** /rules/{ruleId} | Delete Rule
*RulesApi* | [**getRule**](docs/RulesApi.md#getRule) | **GET** /rules/{ruleId} | Get Rule
*RulesApi* | [**updateRule**](docs/RulesApi.md#updateRule) | **PUT** /rules/{ruleId} | Update Rule
*TagsApi* | [**getTagCategories**](docs/TagsApi.md#getTagCategories) | **GET** /tags/categories | Get all categories
*TagsApi* | [**getTagSuggestions**](docs/TagsApi.md#getTagSuggestions) | **GET** /tags/suggestions | Get tag suggestions
*TagsApi* | [**getTagsByCategories**](docs/TagsApi.md#getTagsByCategories) | **GET** /tags | Get all tags of categories
*TokensApi* | [**checkToken**](docs/TokensApi.md#checkToken) | **POST** /accounts/checkToken | Check Token
*TokensApi* | [**refreshToken**](docs/TokensApi.md#refreshToken) | **POST** /accounts/token | Refresh Token
*TokensApi* | [**tokenInfo**](docs/TokensApi.md#tokenInfo) | **GET** /accounts/tokenInfo | Token Info
*UsersApi* | [**createUserProperties**](docs/UsersApi.md#createUserProperties) | **POST** /users/{userId}/properties | Create User Application Properties
*UsersApi* | [**deleteUserProperties**](docs/UsersApi.md#deleteUserProperties) | **DELETE** /users/{userId}/properties | Delete User Application Properties
*UsersApi* | [**getSelf**](docs/UsersApi.md#getSelf) | **GET** /users/self | Get Current User Profile
*UsersApi* | [**getUserDeviceTypes**](docs/UsersApi.md#getUserDeviceTypes) | **GET** /users/{userId}/devicetypes | Get User Device Types
*UsersApi* | [**getUserDevices**](docs/UsersApi.md#getUserDevices) | **GET** /users/{userId}/devices | Get User Devices
*UsersApi* | [**getUserProperties**](docs/UsersApi.md#getUserProperties) | **GET** /users/{userId}/properties | Get User application properties
*UsersApi* | [**getUserRules**](docs/UsersApi.md#getUserRules) | **GET** /users/{userId}/rules | Get User Rules
*UsersApi* | [**updateUserProperties**](docs/UsersApi.md#updateUserProperties) | **PUT** /users/{userId}/properties | Update User Application Properties


## Documentation for Models

 - [AckEnvelope](docs/AckEnvelope.md)
 - [Acknowledgement](docs/Acknowledgement.md)
 - [Action](docs/Action.md)
 - [ActionArray](docs/ActionArray.md)
 - [ActionDetails](docs/ActionDetails.md)
 - [ActionDetailsArray](docs/ActionDetailsArray.md)
 - [ActionIn](docs/ActionIn.md)
 - [ActionOut](docs/ActionOut.md)
 - [Actions](docs/Actions.md)
 - [AggregateData](docs/AggregateData.md)
 - [AggregatesHistogramData](docs/AggregatesHistogramData.md)
 - [AggregatesHistogramResponse](docs/AggregatesHistogramResponse.md)
 - [AggregatesResponse](docs/AggregatesResponse.md)
 - [AppProperties](docs/AppProperties.md)
 - [CheckTokenMessage](docs/CheckTokenMessage.md)
 - [CheckTokenResponse](docs/CheckTokenResponse.md)
 - [Device](docs/Device.md)
 - [DeviceArray](docs/DeviceArray.md)
 - [DeviceEnvelope](docs/DeviceEnvelope.md)
 - [DeviceRegCompleteRequest](docs/DeviceRegCompleteRequest.md)
 - [DeviceRegConfirmUserRequest](docs/DeviceRegConfirmUserRequest.md)
 - [DeviceRegConfirmUserResponse](docs/DeviceRegConfirmUserResponse.md)
 - [DeviceRegConfirmUserResponseEnvelope](docs/DeviceRegConfirmUserResponseEnvelope.md)
 - [DeviceRegStatusResponse](docs/DeviceRegStatusResponse.md)
 - [DeviceRegStatusResponseEnvelope](docs/DeviceRegStatusResponseEnvelope.md)
 - [DeviceToken](docs/DeviceToken.md)
 - [DeviceTokenEnvelope](docs/DeviceTokenEnvelope.md)
 - [DeviceType](docs/DeviceType.md)
 - [DeviceTypeArray](docs/DeviceTypeArray.md)
 - [DeviceTypeEnvelope](docs/DeviceTypeEnvelope.md)
 - [DeviceTypesEnvelope](docs/DeviceTypesEnvelope.md)
 - [DevicesEnvelope](docs/DevicesEnvelope.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [ExportData](docs/ExportData.md)
 - [ExportDataArray](docs/ExportDataArray.md)
 - [ExportHistoryResponse](docs/ExportHistoryResponse.md)
 - [ExportNormalizedMessagesResponse](docs/ExportNormalizedMessagesResponse.md)
 - [ExportRequest](docs/ExportRequest.md)
 - [ExportRequestData](docs/ExportRequestData.md)
 - [ExportRequestInfo](docs/ExportRequestInfo.md)
 - [ExportRequestResponse](docs/ExportRequestResponse.md)
 - [ExportResponse](docs/ExportResponse.md)
 - [ExportStatusResponse](docs/ExportStatusResponse.md)
 - [FieldPath](docs/FieldPath.md)
 - [FieldPresence](docs/FieldPresence.md)
 - [FieldPresenceEnvelope](docs/FieldPresenceEnvelope.md)
 - [FieldsActions](docs/FieldsActions.md)
 - [ManifestProperties](docs/ManifestProperties.md)
 - [ManifestPropertiesEnvelope](docs/ManifestPropertiesEnvelope.md)
 - [ManifestVersions](docs/ManifestVersions.md)
 - [ManifestVersionsEnvelope](docs/ManifestVersionsEnvelope.md)
 - [Message](docs/Message.md)
 - [MessageAction](docs/MessageAction.md)
 - [MessageID](docs/MessageID.md)
 - [MessageIDEnvelope](docs/MessageIDEnvelope.md)
 - [MessageIn](docs/MessageIn.md)
 - [MessageOut](docs/MessageOut.md)
 - [NonEmptyString](docs/NonEmptyString.md)
 - [NormalizedAction](docs/NormalizedAction.md)
 - [NormalizedActionsEnvelope](docs/NormalizedActionsEnvelope.md)
 - [NormalizedMessage](docs/NormalizedMessage.md)
 - [NormalizedMessagesEnvelope](docs/NormalizedMessagesEnvelope.md)
 - [OutputRule](docs/OutputRule.md)
 - [PresenceEnvelope](docs/PresenceEnvelope.md)
 - [PresenceModel](docs/PresenceModel.md)
 - [PropertiesEnvelope](docs/PropertiesEnvelope.md)
 - [RefreshTokenResponse](docs/RefreshTokenResponse.md)
 - [RegisterMessage](docs/RegisterMessage.md)
 - [RuleArray](docs/RuleArray.md)
 - [RuleCreationInfo](docs/RuleCreationInfo.md)
 - [RuleEnvelope](docs/RuleEnvelope.md)
 - [RuleError](docs/RuleError.md)
 - [RuleUpdateInfo](docs/RuleUpdateInfo.md)
 - [RuleWarningOutput](docs/RuleWarningOutput.md)
 - [RulesEnvelope](docs/RulesEnvelope.md)
 - [SnapshotResponse](docs/SnapshotResponse.md)
 - [SnapshotResponses](docs/SnapshotResponses.md)
 - [SnapshotsResponseEnvelope](docs/SnapshotsResponseEnvelope.md)
 - [Tag](docs/Tag.md)
 - [TagArray](docs/TagArray.md)
 - [TagsEnvelope](docs/TagsEnvelope.md)
 - [Token](docs/Token.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [TokenInfoSuccessResponse](docs/TokenInfoSuccessResponse.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UnregisterDeviceResponse](docs/UnregisterDeviceResponse.md)
 - [UnregisterDeviceResponseEnvelope](docs/UnregisterDeviceResponseEnvelope.md)
 - [User](docs/User.md)
 - [UserEnvelope](docs/UserEnvelope.md)
 - [WebSocketError](docs/WebSocketError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### artikcloud_oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: https://accounts.artik.cloud/authorize
- **Scopes**:
  - read:artikcloud: Read from ARTIK Cloud
  - write:artikcloud: Write from ARTIK Cloud

Coding Recommendation
------

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

Usage
------

Peek into [tests](https://github.com/artikcloud/artikcloud-java/tree/master/src/test/java/cloud/artik) for examples about how to use the SDK.

In addition, you can look at our tutorial and sample applications. These will give you a good overview of what you can do and how to do it. Read more about it at

- https://developer.artik.cloud/documentation/tutorials/your-first-android-app.html
- https://developer.artik.cloud/documentation/tutorials/an-iot-remote-control.html

More about ARTIK Cloud
----------------------

If you are not familiar with ARTIK Cloud, we have extensive documentation at https://developer.artik.cloud/documentation

The full ARTIK Cloud API specification can be found at https://developer.artik.cloud/documentation/api-reference/

Check out advanced sample applications at https://developer.artik.cloud/documentation/samples/

To create and manage your services and devices on ARTIK Cloud, create an account at https://developer.artik.cloud

Also see the ARTIK Cloud blog for tutorials, updates, and more: http://artik.io/blog/cloud

License and Copyright
---------------------

Licensed under the Apache License. See [LICENSE](https://github.com/artikcloud/artikcloud-java/blob/master/LICENSE).

Copyright (c) 2016 Samsung Electronics Co., Ltd.
