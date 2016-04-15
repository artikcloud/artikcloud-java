ARTIK Cloud Java/Android SDK
================
This SDK helps you connect your Java or Android apps to ARTIK Cloud. The SDK exposes a number of methods to easily execute REST and WebSockets API calls to ARTIK Cloud. 

Prerequisites
-------------

 * [Maven](http://maven.apache.org/) or [Maven Integration for Eclipse](https://www.eclipse.org/m2e/)
 * JavaSE 1.7 or above 

The SDK was developed with Maven and tested with Android 4.4.2. Building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

Installation
---------------------

You can generate the SDK libraries using one of the following ways. 

If using Maven command line,
- run "mvn clean install -DskipTests" in the root directory of the repository to install to your local Maven repository.

If using Eclipse, 
- import the SDK library project as "Existing Maven Projects".
- right click the project, and choose "Run As" then "Maven install"

Use the Libraries
---------------------

After the generation succeeds, you can use the generated libraries in one of the following ways depending on your scenario:

- To use them in an Android Studio project, copy libraries under `target` and `target/lib` directories of the imported Maven project to `app/libs` directory in your Android Studio project. In the `build.gradle` of `app` module, declare the dependency of your Android application on the libraries as following.

~~~
dependencies {
    // Local binary dependency
    compile fileTree(dir: 'libs', include: ['*.jar'])
}
~~~

- To use them in your Maven project, modify `pom.xml` file in your project to add dependency to sami-android-2.x.x.jar under `target` of the imported Maven project as following

~~~
<dependency>
    <groupId>cloud.artik</groupId>
    <artifactId>artikcloud-java</artifactId>
    <version>2.0.0</version>
    <scope>compile</scope>
</dependency>
~~~

Finally, in your Android project's `AndroidManifest.xml`, add the permissions required by the SDK library. You could accomplish this automatically if you are using manifest merger (`manifestmerger.enabled`, requires SDK tools rev 20 or above).

~~~
<uses-permission android:name="android.permission.INTERNET" />
~~~

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
