/*
 * Copyright (C) 2017 Samsung Electronics Co., Ltd.
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

package cloud.artik.integration;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cloud.artik.client.ApiClient;
import cloud.artik.client.ApiException;
import cloud.artik.client.Configuration;
import cloud.artik.client.auth.*;
import cloud.artik.config.Config;
import cloud.artik.model.Message;
import cloud.artik.model.MessageIDEnvelope;
import cloud.artik.model.NormalizedMessage;
import cloud.artik.model.NormalizedMessagesEnvelope;
import cloud.artik.api.MessagesApi;

/**
 * This test case tests the basic mqtt functions using Junit framework. 
 * It is disabled by default. Consult the instruction below to enable and run the tests
 * 
 * How to run the tests of this test case
 * 
 * Follow the instruction in config/Config.java:
 *  Fill in device id/token for "Demo Fire Sensor"
 *  Run the test case: "mvn clean -Dtest=SendGetMsgTest test"
 *    
 */
public class SendGetMsgTest {
    // Device of "Demo Fire Sensor"
    private String deviceId     = null;
    private String deviceToken  = null;

    private OAuth artikcloud_oauth = null;
    private int tempValueSent = 50;

	@Before
	public void setUp() {
		deviceId = Config.fireSensorDeviceId;
		assertNotNull(deviceId);
		assertFalse(deviceId.isEmpty());
		
		deviceToken = Config.fireSensorDeviceToken;
		assertNotNull(deviceToken);
		assertFalse(deviceToken.isEmpty());

        // Configure OAuth2 access token for authorization: artikcloud_oauth
		ApiClient defaultClient = Configuration.getDefaultApiClient();
        artikcloud_oauth = (OAuth) defaultClient.getAuthentication("artikcloud_oauth");
        assertNotNull(artikcloud_oauth);
        artikcloud_oauth.setAccessToken(deviceToken);
	}
	
	@Test
	public void sendGetMsgSync() {
        // instantiate the MessageAPI to send and receive messages
        MessagesApi messageApiInstance = new MessagesApi();

        // message object that is passed in the body
        Message data = new Message(); 
        data.setSdid(deviceId);
         
        // prepare a random temp value to send to our demo sensor
        Map <String, Object> myData = new HashMap<String, Object>();
        myData.put("temp", tempValueSent);

        data.setData(myData);
       
        // Now lets send our data. You should receive a message id (mid) in a successful response.
        try {
            MessageIDEnvelope result = messageApiInstance.sendMessage(data);
            assertNotNull(result.getData().getMid());
//            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#sendMessage");
            e.printStackTrace();
            fail();
        }
        
        // Now let's retrieve our data. 
        try {
            NormalizedMessagesEnvelope normalizedMessagesEnvelope =
            		messageApiInstance.getLastNormalizedMessages(1, deviceId, null);
            
            //each message is wrapped in NormalizedMessage object.  
            List<NormalizedMessage> messages = normalizedMessagesEnvelope.getData();
            assertFalse(messages.isEmpty());
//            for(NormalizedMessage message: messages) {
//            	System.out.println(message);
//            }
            
            // Get message content
            NormalizedMessage msg = messages.get(0);
            int tempValueGet = ((Double)msg.getData().get("temp")).intValue();
            assertEquals(tempValueSent, tempValueGet);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#getLastNormalizedMessages");
            e.printStackTrace();
            fail();
        }
        
    }

}
