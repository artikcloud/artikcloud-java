ARTIK Cloud Java/Android SDK
================

**This SDK is ALPHA version. It is based on retrofit2 and okhttp3.**

This SDK helps you connect your Java or Android apps to ARTIK Cloud. The SDK exposes a number of methods to easily execute REST, WebSockets, and MQTT API calls to ARTIK Cloud.

Prerequisites
-------------

 * [Maven](http://maven.apache.org/) or [Maven Integration for Eclipse](https://www.eclipse.org/m2e/)
 * JavaSE 1.8 or above

The SDK was developed with Maven and tested with Android 4.4.2. Building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install -Dgpg.skip
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>cloud.artik</groupId>
    <artifactId>artikcloud-java</artifactId>
    <version>3.0.0-alpha-0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cloud.artik:artikcloud-java:3.0.0-alpha-0"
```

### Enable test

Follow the instructions at [src/test/java/cloud/artik/config/Config.java](./src/test/java/cloud/artik/config/Config.java) to configure and run the tests in this repo.

## Coding Recommendation for REST

For REST API calls, it's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Documentation for WebSocket

Consult the samples for how to use [different types of WebSockets](https://developer.artik.cloud/documentation/data-management/rest-and-websockets.html#live-streaming-data-with-websocket-api):

- [Starter code for Firehose WebSocket](https://github.com/artikcloud/tutorial-java-WebSocketFirehose)
- [Starter code for event feed WebSocket](https://github.com/artikcloud/tutorial-java-WebSocketEventFeed)
- [Starter code for device channel WebSocket](https://github.com/artikcloud/tutorial-java-WebSocketDeviceChannel)

*To use the SDK built from this repository, modify pom.xml of the above samples by following the [instructions for Maven user](#maven-users) above.*

## Documentation for MQTT

- [MQTT feature](https://developer.artik.cloud/documentation/data-management/mqtt.html)
- [MQTT API reference](https://developer.artik.cloud/documentation/api-reference/mqtt-api.html)
- [MQTT SDK APIs](./src/main/java/cloud/artik/mqtt)
- [MQTT SDK API usage examples](./src/test/java/cloud/artik/mqtt)

## Usage

Peek into [tests](./src/test/java/cloud/artik) for examples about how to use the SDK.

License and Copyright
---------------------

Licensed under the Apache License. See [LICENSE](./LICENSE).

Copyright (c) 2017 Samsung Electronics Co., Ltd.
