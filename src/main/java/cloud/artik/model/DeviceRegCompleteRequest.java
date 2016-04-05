package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class DeviceRegCompleteRequest   {
  
  @SerializedName("nonce")
  private String nonce = null;
  

  
  /**
   * Nonce obtained from the initial registration request.
   **/
  @ApiModelProperty(value = "Nonce obtained from the initial registration request.")
  public String getNonce() {
    return nonce;
  }
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegCompleteRequest deviceRegCompleteRequest = (DeviceRegCompleteRequest) o;
    return Objects.equals(this.nonce, deviceRegCompleteRequest.nonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegCompleteRequest {\n");
    
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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
