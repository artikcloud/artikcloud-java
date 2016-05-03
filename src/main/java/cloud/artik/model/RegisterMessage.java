package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * WebSocket Registration Message
 **/
@ApiModel(description = "WebSocket Registration Message")
public class RegisterMessage   {

  @SerializedName("cid")
  private String cid = null;

  @SerializedName("authorization")
  private String authorization = null;

  @SerializedName("sdid")
  private String sdid = null;

  @SerializedName("ts")
  private Long ts = null;

  @SerializedName("type")
  private String type = "register";



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
   * Authorization header containing access token (Bearer access_token).
   **/
  @ApiModelProperty(value = "Authorization header containing access token (Bearer access_token).")
  public String getAuthorization() {
    return authorization;
  }
  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }


  /**
   * Source Device ID.
   **/
  @ApiModelProperty(value = "Source Device ID.")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }


  /**
   * Timestamp (past, present or future). Defaults to current time if not provided.
   **/
  @ApiModelProperty(value = "Timestamp (past, present or future). Defaults to current time if not provided.")
  public Long getTs() {
    return ts;
  }
  public void setTs(Long ts) {
    this.ts = ts;
  }


  /**
   * Type.
   **/
  @ApiModelProperty(value = "Type.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterMessage registerMessage = (RegisterMessage) o;
    return Objects.equals(this.cid, registerMessage.cid) &&
        Objects.equals(this.authorization, registerMessage.authorization) &&
        Objects.equals(this.sdid, registerMessage.sdid) &&
        Objects.equals(this.ts, registerMessage.ts) &&
        Objects.equals(this.type, registerMessage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, authorization, sdid, ts, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterMessage {\n");

    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
