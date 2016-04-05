package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * WebSocket Error Information
 **/
@ApiModel(description = "WebSocket Error Information")
public class WebSocketError   {
  
  @SerializedName("message")
  private String message = null;
  
  @SerializedName("code")
  private Integer code = null;
  
  @SerializedName("cid")
  private String cid = null;
  

  
  /**
   * Message.
   **/
  @ApiModelProperty(value = "Message.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Code
   **/
  @ApiModelProperty(value = "Code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   * Confirmation ID
   **/
  @ApiModelProperty(value = "Confirmation ID")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebSocketError webSocketError = (WebSocketError) o;
    return Objects.equals(this.message, webSocketError.message) &&
        Objects.equals(this.code, webSocketError.code) &&
        Objects.equals(this.cid, webSocketError.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, cid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebSocketError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
