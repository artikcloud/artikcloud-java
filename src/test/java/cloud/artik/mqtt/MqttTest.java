/*
 * Copyright (C) 2018 Samsung Electronics Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This test case tests the basic mqtt functions using Junit framework. 
 * It is disabled by default. Consult the instruction below to enable and run the tests
 * 
 * How to run the tests of this test case
 * 
 * 1. Connect a device of type "Example Simple Smart Light" at my.artik.cloud
 *    by clicking the following link. If you already have such a device in your account, skip this step. 
 *    https://my.artik.cloud/new_device/cloud.artik.example.simple_smartlight
 *    
 * 2. Get the device ID and device token of the above device per instruction
 *    https://developer.artik.cloud/documentation/tools/web-tools.html#managing-a-device-token
 *    
 * 3. Copy the device ID and token obtained above to fill in deviceId and deviceToken data member.
 * 
 * 4. Remove @ignore from the test you want to run
 * 
 * 5. Disable "<skipTests>true</skipTests>" in the pom.xml
 * 
 * 5. In the terminal, at the root directory of this SDK (cloned from github), run the following command
 *    $ mvn -Dtest=MqttTest test
 *    
 */

package cloud.artik.mqtt;

import static org.junit.Assert.*;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.junit.Ignore;
import org.junit.Test;

public class MqttTest {
    // Device of "Example Simple Smart Light"
    final String deviceId     = "<YOUR DEVICE ID>";
    final String deviceToken  = "<YOUR DEVICE TOKEN>";
    
    // The maximum time to wait for each mqtt operation to finish
    final int waitingTimeInMs = 2000;
    final int qos             = 2;

   
	ArtikCloudMqttCallback callback = new ArtikCloudMqttCallback() {
		@Override
		public void onFailure(OperationMode opMode, IMqttToken mqttToken, Throwable throwable) {
			System.out.println("ArtikCloudMqttCallback::onFailure is called with Mode " + opMode  + "; throwable (" + throwable.toString() + ")");
			fail();
		}

		@Override
		public void onSuccess(OperationMode opMode, IMqttToken mqttToken) {
			System.out.println("ArtikCloudMqttCallback::onSuccess() with Mode " 
					+ opMode);
		}

		@Override
		public void connectionLost(Throwable cause) {
			System.out.println("Connection is lost due to " + cause);
			fail();
		}

		@Override
		public void messageArrived(String topic, MqttMessage message) {
			System.out.println("Received message. Payload: " + new String(message.getPayload()) + ". Qos:" + message.getQos() + "; Topic:" + topic);
		}

		@Override
		public void deliveryComplete(IMqttDeliveryToken token) {
		}
	};

	@Test
	public void connectionTest() {
		System.out.println("\nRunning connectionTest");
		try {
	 		MqttSession mqttSession = new MqttSession(deviceId, deviceToken, callback);
			System.out.println("Connecting to broker: "+ mqttSession.getBrokerUri());
			mqttSession.connect();
			Thread.sleep(waitingTimeInMs);// sleep for a moment to wait for mqtt operation finished
			assertEquals(true, mqttSession.isConnected());

			System.out.println("Disconnecting ... ");
			mqttSession.disconnect();
    		Thread.sleep(waitingTimeInMs); // sleep for a moment to wait for mqtt operation finished
			assertEquals(false, mqttSession.isConnected());
		} catch(ArtikCloudMqttException e) {
			e.printStackTrace();
			fail();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void publishTest() {
		System.out.println("\nRunning publishTest");
		try {
	    	MqttSession mqttSession = new MqttSession(deviceId, deviceToken, callback);
			System.out.println("Connecting to broker: "+ mqttSession.getBrokerUri());
			mqttSession.connect();
			Thread.sleep(waitingTimeInMs);
			assertEquals(true, mqttSession.isConnected());
			
			String payload    =  "{\"state\":true}";
	        System.out.println("Publishing to topic: " + mqttSession.getPublishTopic() + "; message payload: " + payload );
	        mqttSession.publish(qos, payload);
			Thread.sleep(waitingTimeInMs);
	
			System.out.println("Disconnecting ... ");
			mqttSession.disconnect();
			Thread.sleep(waitingTimeInMs);
			assertEquals(false, mqttSession.isConnected());
		} catch(ArtikCloudMqttException e) {
			e.printStackTrace();
			fail();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void subscribeTest() {
		System.out.println("\nRunning subscribeTest");
		try {
		    MqttSession mqttSession = new MqttSession(deviceId, deviceToken, callback);
			System.out.println("Connecting to broker: "+ mqttSession.getBrokerUri());
			mqttSession.connect();
		    Thread.sleep(waitingTimeInMs);
			assertEquals(true, mqttSession.isConnected());
			
	        System.out.println("Subscribing to topic: " + mqttSession.getSubscribeTopic() );
	        mqttSession.subscribe();
		    Thread.sleep(5000);//If sending action to the device within this time period (ms), it will receive it
	
			System.out.println("Disconnecting ... ");
			mqttSession.disconnect();
		    Thread.sleep(waitingTimeInMs);
			assertEquals(false, mqttSession.isConnected());
		} catch(ArtikCloudMqttException e) {
			e.printStackTrace();
			fail();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}
