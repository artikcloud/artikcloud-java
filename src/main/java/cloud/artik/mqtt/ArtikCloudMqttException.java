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

package cloud.artik.mqtt;

//
import org.eclipse.paho.client.mqttv3.MqttException;

/** 
 * This wrapper class wraps MqttException class in Paho library
 *
 * This adds flexibility of reporting ARTIK Cloud specific 
 * MQTT exception down the road.
 */
public class ArtikCloudMqttException extends MqttException{
	private static final long serialVersionUID = 1L;

	public ArtikCloudMqttException(int reasonCode) {
		super(reasonCode);
	}

    /**
     * Instantiates a new exception object.
     *
     * @param cause: the cause. A null value is permitted, and indicates that the
     *            cause is nonexistent or unknown.
     * @return 
     */
    public ArtikCloudMqttException(Throwable cause) {
        super(cause);
    }

}
