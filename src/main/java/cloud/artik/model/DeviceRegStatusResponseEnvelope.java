package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.DeviceRegStatusResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class DeviceRegStatusResponseEnvelope   {
  
  @SerializedName("data")
  private DeviceRegStatusResponse data = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public DeviceRegStatusResponse getData() {
    return data;
  }
  public void setData(DeviceRegStatusResponse data) {
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
    DeviceRegStatusResponseEnvelope deviceRegStatusResponseEnvelope = (DeviceRegStatusResponseEnvelope) o;
    return Objects.equals(this.data, deviceRegStatusResponseEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegStatusResponseEnvelope {\n");
    
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
