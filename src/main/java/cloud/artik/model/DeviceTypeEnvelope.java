package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.DeviceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Device Type Envelope
 **/
@ApiModel(description = "Device Type Envelope")
public class DeviceTypeEnvelope   {
  
  @SerializedName("data")
  private DeviceType data = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DeviceType getData() {
    return data;
  }
  public void setData(DeviceType data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypeEnvelope deviceTypeEnvelope = (DeviceTypeEnvelope) o;
    return Objects.equals(this.data, deviceTypeEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeEnvelope {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
