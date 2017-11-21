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

package cloud.artik.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * The interface enables an application to be notified when asynchronous
 * events related to the mqtt client occur. Each callback is called in a thread
 * different from MQTT client's thread. In this way, these callbacks will not stall
 * MQTT client.
 *
 * This class listens to the following events:
 *    - lost the connection with the server
 *    - complete delivering a message to the server
 *    - receive a message from the server
 *    - success or failure of the operations defined in OperationMode, for example 
 *      -- connect
 *      -- disconnect
 *      -- publish
 *      -- subscribe
 *    
 */
public interface ArtikCloudMqttCallback {

	/**
	 * This method is called when the connection to the server is lost.
	 *
	 * @param cause the reason behind the loss of connection.
	 */
	public void connectionLost(Throwable cause);		

	/** 
	 * Called when delivery for a message has been completed, and all
	 * acknowledgments have been received. For QoS 0 messages it is
	 * called once the message has been handed to the network for
	 * delivery. For QoS 1 it is called when PUBACK is received and
	 * for QoS 2 when PUBCOMP is received. The token will be the same
	 * token as that returned when the message was published.
	 * 
	 * @param mqttDeliveryToken the delivery token associated with the arrived message.
	 */
	public void deliveryComplete(IMqttDeliveryToken mqttDeliveryToken);

    /**
     * This method is called when a message arrived. The message could come from
     * any subscribed topics (e.g. error topic, action topic)
     * 
     * @param the name of the topic that the message was published to
	 * @param message the actual message.
	 */
	public void messageArrived(String fromTopic, MqttMessage mqttMessage);

	/**
	 * This method is invoked when an operation defined in the OperationMode 
	 * has completed successfully.
	 * 
	 * @param mqttToken associated with the operation that has completed
	 * @param operationMode the mode of the operation that has completed
	 */
	public void onSuccess(OperationMode operationMode, IMqttToken mqttToken);

	/**
	 * This method is invoked when an operation defined in the OperationMode
	 * fails. If a client is disconnected while an action is in progress 
	 * onFailure will be called. For connections
	 * that use cleanSession set to false, any QoS 1 and 2 messages that 
	 * are in the process of being delivered will be delivered to the requested
	 * quality of service next time the client connects.
	 * 
	 * @param operationMode the mode of the operation that has failed
	 * @param mqttToken associated with the operation that has failed
	 * @param exception thrown by the operation that has failed
	 */
	public void onFailure(OperationMode mode, IMqttToken mqttToken, Throwable exception);

}
