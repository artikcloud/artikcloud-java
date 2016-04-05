package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Acknowledgement received by a WebSocket in response to a RegisterMessage, MessageIn or ActionIn.
 **/
@ApiModel(description = "Acknowledgement received by a WebSocket in response to a RegisterMessage, MessageIn or ActionIn.")
public class Acknowledgement   {
  
  @SerializedName("mid")
  private String mid = null;
  
  @SerializedName("cid")
  private String cid = null;
  
  @SerializedName("message")
  private String message = null;
  
  @SerializedName("code")
  private String code = null;
  

  
  /**
   * Message ID.
   **/
  @ApiModelProperty(value = "Message ID.")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  
  /**
   * Confirmation ID.
   **/
  @ApiModelProperty(value = "Confirmation ID.")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  
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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acknowledgement acknowledgement = (Acknowledgement) o;
    return Objects.equals(this.mid, acknowledgement.mid) &&
        Objects.equals(this.cid, acknowledgement.cid) &&
        Objects.equals(this.message, acknowledgement.message) &&
        Objects.equals(this.code, acknowledgement.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid, cid, message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acknowledgement {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
