# artikcloud-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.
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
    <version>2.1.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cloud.artik:artikcloud-java:2.1.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/artikcloud-java-2.1.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cloud.artik.client.*;
import cloud.artik.client.auth.*;
import cloud.artik.model.*;
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
*DeviceTypesApi* | [**getDeviceTypesByApplication**](docs/DeviceTypesApi.md#getDeviceTypesByApplication) | **GET** /applications/{appId}/devicetypes | Get Device Types by Application
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
*DevicesManagementApi* | [**createTasks**](docs/DevicesManagementApi.md#createTasks) | **POST** /devicemgmt/tasks | Create a new task for one or more devices
*DevicesManagementApi* | [**deleteServerProperties**](docs/DevicesManagementApi.md#deleteServerProperties) | **DELETE** /devicemgmt/devices/{did}/serverproperties | Deletes a device&#39;s properties.
*DevicesManagementApi* | [**getAllByDid**](docs/DevicesManagementApi.md#getAllByDid) | **GET** /devicemgmt/devices/{did}/tasks | Returns the list of tasks for a particular device id with optional status filter.
*DevicesManagementApi* | [**getDeviceTypesInfo**](docs/DevicesManagementApi.md#getDeviceTypesInfo) | **GET** /devicemgmt/devicetypes/{dtid} | Read a device type device management information.
*DevicesManagementApi* | [**getManifestProperties**](docs/DevicesManagementApi.md#getManifestProperties) | **GET** /devicemgmt/devicetypes/{dtid}/manifest/properties | Get a device type&#39;s device management manifest properties
*DevicesManagementApi* | [**getProperties**](docs/DevicesManagementApi.md#getProperties) | **GET** /devicemgmt/devices/{did}/properties | Read a device&#39;s properties.
*DevicesManagementApi* | [**getStatuses**](docs/DevicesManagementApi.md#getStatuses) | **GET** /devicemgmt/tasks/{tid}/statuses | Returns the details and status of a task id and the individual statuses of each device id in the list.
*DevicesManagementApi* | [**getStatusesHistory**](docs/DevicesManagementApi.md#getStatusesHistory) | **GET** /devicemgmt/tasks/{tid}/statuses/history | Returns the history of the status changes for a specific task id, or for a specific device id in that task.
*DevicesManagementApi* | [**getTaskByID**](docs/DevicesManagementApi.md#getTaskByID) | **GET** /devicemgmt/tasks/{tid} | Returns the details and global status of a specific task id.
*DevicesManagementApi* | [**getTasks**](docs/DevicesManagementApi.md#getTasks) | **GET** /devicemgmt/tasks | Returns the all the tasks for a device type.
*DevicesManagementApi* | [**queryProperties**](docs/DevicesManagementApi.md#queryProperties) | **GET** /devicemgmt/devices/properties | Query device properties across devices.
*DevicesManagementApi* | [**updateDeviceTypesInfo**](docs/DevicesManagementApi.md#updateDeviceTypesInfo) | **PUT** /devicemgmt/devicetypes/{dtid} | Updates a device type information
*DevicesManagementApi* | [**updateServerProperties**](docs/DevicesManagementApi.md#updateServerProperties) | **POST** /devicemgmt/devices/{did}/serverproperties | Updates a device&#39;s server properties.
*DevicesManagementApi* | [**updateTask**](docs/DevicesManagementApi.md#updateTask) | **PUT** /devicemgmt/tasks/{tid} | Updates a task for all devices - For now just allows changing the state to cancelled.
*DevicesManagementApi* | [**updateTaskForDevice**](docs/DevicesManagementApi.md#updateTaskForDevice) | **PUT** /devicemgmt/tasks/{tid}/devices/{did} | Updates a task for a specific device - For now just allows changing the state to cancelled.
*DevicesSharesApi* | [**createShareForDevice**](docs/DevicesSharesApi.md#createShareForDevice) | **POST** /devices/{deviceId}/shares | Share a device 
*DevicesSharesApi* | [**deleteSharingForDevice**](docs/DevicesSharesApi.md#deleteSharingForDevice) | **DELETE** /devices/{deviceId}/shares/{shareId} | Delete specific share of the given device id
*DevicesSharesApi* | [**getAllSharesForDevice**](docs/DevicesSharesApi.md#getAllSharesForDevice) | **GET** /devices/{deviceId}/shares | List all shares for the given device id
*DevicesSharesApi* | [**getSharingForDevice**](docs/DevicesSharesApi.md#getSharingForDevice) | **GET** /devices/{deviceId}/shares/{shareId} | Get specific share of the given device id
*DevicesStatusApi* | [**getDeviceStatus**](docs/DevicesStatusApi.md#getDeviceStatus) | **GET** /devices/{deviceId}/status | Get Device Status
*DevicesStatusApi* | [**getDevicesStatus**](docs/DevicesStatusApi.md#getDevicesStatus) | **GET** /devices/status | Get Devices Status
*DevicesStatusApi* | [**putDeviceStatus**](docs/DevicesStatusApi.md#putDeviceStatus) | **PUT** /devices/{deviceId}/status | Update Device Status
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
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createSubscription) | **POST** /subscriptions | Create Subscription
*SubscriptionsApi* | [**deleteSubscription**](docs/SubscriptionsApi.md#deleteSubscription) | **DELETE** /subscriptions/{subId} | Delete Subscription
*SubscriptionsApi* | [**getAllSubscriptions**](docs/SubscriptionsApi.md#getAllSubscriptions) | **GET** /subscriptions | Get All Subscriptions
*SubscriptionsApi* | [**getMessages**](docs/SubscriptionsApi.md#getMessages) | **GET** /notifications/{notifId}/messages | Get Messages
*SubscriptionsApi* | [**getSubscription**](docs/SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{subId} | Get Subscription
*SubscriptionsApi* | [**validateSubscription**](docs/SubscriptionsApi.md#validateSubscription) | **POST** /subscriptions/{subId}/validate | Validate Subscription
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
*UsersApi* | [**listAllSharesForUser**](docs/UsersApi.md#listAllSharesForUser) | **GET** /users/{userId}/shares | Get User shares
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
 - [DeviceShareInfo](docs/DeviceShareInfo.md)
 - [DeviceSharing](docs/DeviceSharing.md)
 - [DeviceSharingArray](docs/DeviceSharingArray.md)
 - [DeviceSharingEnvelope](docs/DeviceSharingEnvelope.md)
 - [DeviceSharingId](docs/DeviceSharingId.md)
 - [DeviceStatus](docs/DeviceStatus.md)
 - [DeviceStatusBatch](docs/DeviceStatusBatch.md)
 - [DeviceStatusData](docs/DeviceStatusData.md)
 - [DeviceStatusPut](docs/DeviceStatusPut.md)
 - [DeviceStatusPutData](docs/DeviceStatusPutData.md)
 - [DeviceTask](docs/DeviceTask.md)
 - [DeviceTaskUpdateRequest](docs/DeviceTaskUpdateRequest.md)
 - [DeviceTaskUpdateResponse](docs/DeviceTaskUpdateResponse.md)
 - [DeviceToken](docs/DeviceToken.md)
 - [DeviceTokenEnvelope](docs/DeviceTokenEnvelope.md)
 - [DeviceType](docs/DeviceType.md)
 - [DeviceTypeArray](docs/DeviceTypeArray.md)
 - [DeviceTypeEnvelope](docs/DeviceTypeEnvelope.md)
 - [DeviceTypeInfo](docs/DeviceTypeInfo.md)
 - [DeviceTypeInfoEnvelope](docs/DeviceTypeInfoEnvelope.md)
 - [DeviceTypesEnvelope](docs/DeviceTypesEnvelope.md)
 - [DeviceTypesInfo](docs/DeviceTypesInfo.md)
 - [DeviceTypesInfoEnvelope](docs/DeviceTypesInfoEnvelope.md)
 - [DevicesEnvelope](docs/DevicesEnvelope.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [EventFeedData](docs/EventFeedData.md)
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
 - [MetadataEnvelope](docs/MetadataEnvelope.md)
 - [MetadataPropertiesEnvelope](docs/MetadataPropertiesEnvelope.md)
 - [MetadataQueryEnvelope](docs/MetadataQueryEnvelope.md)
 - [NonEmptyString](docs/NonEmptyString.md)
 - [NormalizedAction](docs/NormalizedAction.md)
 - [NormalizedActionsEnvelope](docs/NormalizedActionsEnvelope.md)
 - [NormalizedMessage](docs/NormalizedMessage.md)
 - [NormalizedMessagesEnvelope](docs/NormalizedMessagesEnvelope.md)
 - [NotifMessage](docs/NotifMessage.md)
 - [NotifMessageArray](docs/NotifMessageArray.md)
 - [NotifMessagesResponse](docs/NotifMessagesResponse.md)
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
 - [Subscription](docs/Subscription.md)
 - [SubscriptionArray](docs/SubscriptionArray.md)
 - [SubscriptionEnvelope](docs/SubscriptionEnvelope.md)
 - [SubscriptionInfo](docs/SubscriptionInfo.md)
 - [SubscriptionsEnvelope](docs/SubscriptionsEnvelope.md)
 - [Tag](docs/Tag.md)
 - [TagArray](docs/TagArray.md)
 - [TagsEnvelope](docs/TagsEnvelope.md)
 - [Task](docs/Task.md)
 - [TaskByDid](docs/TaskByDid.md)
 - [TaskByDidList](docs/TaskByDidList.md)
 - [TaskByDidListEnvelope](docs/TaskByDidListEnvelope.md)
 - [TaskEnvelope](docs/TaskEnvelope.md)
 - [TaskHistory](docs/TaskHistory.md)
 - [TaskHistoryList](docs/TaskHistoryList.md)
 - [TaskList](docs/TaskList.md)
 - [TaskListEnvelope](docs/TaskListEnvelope.md)
 - [TaskParameters](docs/TaskParameters.md)
 - [TaskRequest](docs/TaskRequest.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [TaskStatusCounts](docs/TaskStatusCounts.md)
 - [TaskStatuses](docs/TaskStatuses.md)
 - [TaskStatusesEnvelope](docs/TaskStatusesEnvelope.md)
 - [TaskStatusesHistoryEnvelope](docs/TaskStatusesHistoryEnvelope.md)
 - [TaskUpdateRequest](docs/TaskUpdateRequest.md)
 - [TaskUpdateResponse](docs/TaskUpdateResponse.md)
 - [TasksStatusCounts](docs/TasksStatusCounts.md)
 - [Token](docs/Token.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [TokenInfoSuccessResponse](docs/TokenInfoSuccessResponse.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UnregisterDeviceResponse](docs/UnregisterDeviceResponse.md)
 - [UnregisterDeviceResponseEnvelope](docs/UnregisterDeviceResponseEnvelope.md)
 - [UpdateParameters](docs/UpdateParameters.md)
 - [User](docs/User.md)
 - [UserEnvelope](docs/UserEnvelope.md)
 - [ValidationCallbackInfo](docs/ValidationCallbackInfo.md)
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

Copyright (c) 2017 Samsung Electronics Co., Ltd.
