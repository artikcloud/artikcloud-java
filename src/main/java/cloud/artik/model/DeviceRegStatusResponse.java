package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class DeviceRegStatusResponse   {
  
  @SerializedName("did")
  private String did = null;
  
  @SerializedName("status")
  private String status = null;
  

  
  /**
   * The created or existing device id.
   **/
  @ApiModelProperty(value = "The created or existing device id.")
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  
  /**
   * Status of the ongoing device registration request.
   **/
  @ApiModelProperty(value = "Status of the ongoing device registration request.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegStatusResponse deviceRegStatusResponse = (DeviceRegStatusResponse) o;
    return Objects.equals(this.did, deviceRegStatusResponse.did) &&
        Objects.equals(this.status, deviceRegStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(did, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegStatusResponse {\n");
    
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
