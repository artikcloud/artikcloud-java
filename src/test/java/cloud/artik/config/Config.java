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

package cloud.artik.config;

/** 
 * This class is only used by **tests (cases)**.
 * 
 * 1. Fill in place holders in this file. For each pair of device ID/token,
 *    1.1) Connect a device of specified type at my.artik.cloud per https://developer.artik.cloud/documentation/tools/web-tools.html#connecting-a-device
 *         If you already have such a device in your account, skip this step.
 *         For example, to connect a device of "Example Simple Smart Light", click
 *         https://my.artik.cloud/new_device/cloud.artik.example.simple_smartlight
 *    
 *    1.2) Get the device ID and device token of the above device per instruction
 *    https://developer.artik.cloud/documentation/tools/web-tools.html#managing-a-device-token
 *    
 *    1.3) Copy the device ID and token obtained above to fill in the corresponding device ID and device token variables.
 * 
 * 2. Disable "<skipTests>true</skipTests>" in the pom.xml
 * 
 * 3. In the terminal, at the root directory of this SDK (cloned from github), run the following command to run all test cases
 *    $mvn test
 *    
 *    or run the specific test case as following example 
 *    $mvn -Dtest=MqttTest test
 * 
 *    
 */

public final class Config {
    // Device of device type: "Example Simple Smart Light" (unique name cloud.artik.example.simple_smartlight)
    static public String smartLightDeviceId     = "";
    static public String smartLightdeviceToken  = "";

}
