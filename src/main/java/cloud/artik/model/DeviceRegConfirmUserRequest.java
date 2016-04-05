package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class DeviceRegConfirmUserRequest   {
  
  @SerializedName("deviceId")
  private String deviceId = null;
  
  @SerializedName("deviceName")
  private String deviceName = null;
  
  @SerializedName("pin")
  private String pin = null;
  

  
  /**
   * Device ID. Optional if deviceName is present
   **/
  @ApiModelProperty(value = "Device ID. Optional if deviceName is present")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   * Device Name. Optional if deviceId is present
   **/
  @ApiModelProperty(value = "Device Name. Optional if deviceId is present")
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * Pin obtained in the registrations call.
   **/
  @ApiModelProperty(value = "Pin obtained in the registrations call.")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegConfirmUserRequest deviceRegConfirmUserRequest = (DeviceRegConfirmUserRequest) o;
    return Objects.equals(this.deviceId, deviceRegConfirmUserRequest.deviceId) &&
        Objects.equals(this.deviceName, deviceRegConfirmUserRequest.deviceName) &&
        Objects.equals(this.pin, deviceRegConfirmUserRequest.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, deviceName, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegConfirmUserRequest {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
