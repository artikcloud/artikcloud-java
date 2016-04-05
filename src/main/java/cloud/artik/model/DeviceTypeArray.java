package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.DeviceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Holds an array of DeviceTypes
 **/
@ApiModel(description = "Holds an array of DeviceTypes")
public class DeviceTypeArray   {
  
  @SerializedName("deviceTypes")
  private List<DeviceType> deviceTypes = new ArrayList<DeviceType>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<DeviceType> getDeviceTypes() {
    return deviceTypes;
  }
  public void setDeviceTypes(List<DeviceType> deviceTypes) {
    this.deviceTypes = deviceTypes;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypeArray deviceTypeArray = (DeviceTypeArray) o;
    return Objects.equals(this.deviceTypes, deviceTypeArray.deviceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeArray {\n");
    
    sb.append("    deviceTypes: ").append(toIndentedString(deviceTypes)).append("\n");
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
