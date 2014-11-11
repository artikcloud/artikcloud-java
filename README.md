SAMI Android SDK
================

This SDK helps you connect your Android apps to SAMI. The SDK helps authenticating with SAMI, exposes a number of methods to easily execute REST API calls to SAMI and supports a WebSockets controller. 

Prerequisites
-------------

 * [Eclipse](https://www.eclipse.org/) 
 * [Maven Integration for Eclipse](https://www.eclipse.org/m2e/) or [Maven][http://maven.apache.org/]
 * Wordnik
 * Jackson JSON Processor  2.1.4
 * JUnit 4.8.1
 * Apache HTTP Client 4.0

The SDK was developed with Eclipse and Maven and tested with Android 4.4.2. When building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

Installation
---------------------

In Eclipse, 
- import the SDK library project as "Existing Maven Projects".
- right click the project, and choose "Run As" then "Maven install"

After the installation succeeds, you can use the generated libraries in one of the following ways depending on your scenario:

- To use them in an Android project, copy libraries under `target` and `target/lib` directories of the imported Maven project to `libs` directory in your Android project.
- To use them in your Maven project, modify `pom.xml` file in your project to add dependency to sami-android-xxx.jar under `target` of the imported Maven project as following

~~~
<dependency>
   <groupId>io.samsungsami</groupId>
   <artifactId>sami-android</artifactId>
   <version>the actual version number</version>
</dependency>
~~~

Finally, in your Android project's `AndroidManifest.xml`, add the permissions required by the SDK library. You could accomplish this automatically if you are using manifest merger (`manifestmerger.enabled`, requires SDK tools rev 20 or above).

~~~
<uses-permission android:name="android.permission.INTERNET" />
~~~

You're ready to go.

More about SAMI
---------------

If you are not familiar with SAMI we have extensive documentation at http://developer.samsungsami.io

The full SAMI API specification with examples can be found at http://developer.samsungsami.io/sami/api-spec.html

To create and manage your services and devices on SAMI visit developer portal at http://devportal.samsungsami.io

Licence and Copyright
---------------------

Licensed under the Apache License. See LICENCE.

Copyright (c) 2014 Samsung Electronics Co., Ltd.
