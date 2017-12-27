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

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cloud.artik.client.ApiClient;
import cloud.artik.config.Config;
import cloud.artik.model.Message;
import cloud.artik.model.MessageIDEnvelope;
import cloud.artik.model.NormalizedMessage;
import cloud.artik.model.NormalizedMessagesEnvelope;
import retrofit2.Response;
import cloud.artik.api.MessagesApi;

/**
 * Follow the instruction in config/Config.java: Fill in device id/token for
 * "Demo Fire Sensor" you added into your account Run the test case:
 * "mvn clean -Dtest=SendGetMsgTest test"
 */
public class SendGetMsgTest {

    // credentials for making api call for this device
    private String deviceId = null;
    private String deviceToken = null;

    // random value sent to device
    private int tempValueSent = 50;

    // client for initializing Apis
    private ApiClient apiClient = null;

    @Before
    public void setUp() {
        deviceId = Config.fireSensorDeviceId;
        deviceToken = Config.fireSensorDeviceToken;
        apiClient = new ApiClient("artikcloud_oauth");
        apiClient.setAccessToken(deviceToken);
    }

    @Test
    public void sendGetMsgSync() {

        // reference messagesApi
        MessagesApi messagesApi = apiClient.createService(MessagesApi.class);

        // prepare message object to send
        Message data = new Message();
        data.setSdid(deviceId);

        // prepare a temp value to send
        Map<String, Object> myData = new HashMap<String, Object>();
        myData.put("temp", tempValueSent);
        data.setData(myData);

        // make a synchronous api call. expect a 'mid' value in response.
        try {
            Response<MessageIDEnvelope> response = messagesApi.sendMessage(data).execute();
            assertTrue(response.isSuccessful());
            assertNotNull(response.body().getData().getMid());
        } catch (IOException e) {
            // IOException thrown for 401/403 Unauthorized/Forbidden error.
            System.err.println("Exception when calling MessagesApi#sendMessage");
            e.printStackTrace();
            fail();
        } catch (Exception e) {
            fail();
        }

        // Now let's retrieve our data.
        try {

            // prepare parameters for request
            int count = 1;
            String sdids = deviceId;
            String fieldPresence = null;
            Response<NormalizedMessagesEnvelope> response = messagesApi
                    .getLastNormalizedMessages(count, sdids, fieldPresence).execute();

            List<NormalizedMessage> messages = response.body().getData();
            assertFalse(messages.isEmpty());

            // Verify last message sent to device located at index 0
            NormalizedMessage msg = messages.get(0);
            int tempValueGet = ((Double) msg.getData().get("temp")).intValue();
            assertEquals(tempValueSent, tempValueGet);
        } catch (IOException e) {
            // IOException thrown for 401/403 Unauthorized/Forbidden error.
            System.err.println("Exception when calling MessagesApi#getLastNormalizedMessages");
            e.printStackTrace();
            fail();
        }

    }

}