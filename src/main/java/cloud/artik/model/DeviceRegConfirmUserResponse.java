package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class DeviceRegConfirmUserResponse   {
  
  @SerializedName("rid")
  private String rid = null;
  

  
  /**
   * The registration request id.
   **/
  @ApiModelProperty(value = "The registration request id.")
  public String getRid() {
    return rid;
  }
  public void setRid(String rid) {
    this.rid = rid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegConfirmUserResponse deviceRegConfirmUserResponse = (DeviceRegConfirmUserResponse) o;
    return Objects.equals(this.rid, deviceRegConfirmUserResponse.rid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegConfirmUserResponse {\n");
    
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
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
