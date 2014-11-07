SAMI Android SDK
================

This SDK helps you connect your Android apps to SAMI. The SDK helps authenticating with SAMI, exposes a number of methods to easily execute REST API calls to SAMI and supports a WebSockets controller. 

Prerequisites
-------------

 * Eclipse 
 * Maven
 * Maven plugin 1.0.0
 * Wordnik
 * Jackson JSON Processor  2.1.4
 * JUnit 4.8.1
 * Apache HTTP Client 4.0

The SDK was developed with Eclipse and Maven and tested with Android 4.4.2. When building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

Installation
---------------------

Import the library in Eclipse and build. We included a `pom.xml` file to make it easier.

In your project's AndroidManifest.xml, add the following activity to the `<application>` node, and the permissions required by the library. You could accomplish this automatically if you are using manifest merger (`manifestmerger.enabled`, requires SDK tools rev 20 or above).

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<activity
        android:name="io.samsungsami.android.AccountsActivity"
        android:label="@string/title_activity_accounts"
        android:configChanges="keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize">
</activity>
```

You're ready to go.

Licence and Copyright
---------------------

Licensed under the Apache License. See LICENCE.

Copyright (c) 2014 Samsung Electronics Co., Ltd.
