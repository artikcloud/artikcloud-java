package io.samsungsami.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "Registration Message")
public class RegisterMessage  {
  
  private String sdid = null;
  private String type = "register";
  private String cid = null;
  private String authorization = null;
  
  /**
   * Type.
   **/
  @ApiModelProperty(required = false, value = "Authorization.")
  @JsonProperty("authorization")
  public String getAuthorization() {
    return authorization;
  }
  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  } 
  
  
  /**
   * Type.
   **/
  @ApiModelProperty(required = false, value = "Type.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }  
  
  /**
   * Confirmation ID.
   **/
  @ApiModelProperty(required = false, value = "Confirmation ID.")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }
  
  /**
   * Source Device ID.
   **/
  @ApiModelProperty(required = false, value = "Source Device ID.")
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterMessage {\n");

    sb.append("  type:             ").append(type).append("\n");
    sb.append("  ddid:             ").append(cid).append("\n");
    sb.append("  sdid:             ").append(sdid).append("\n");
    sb.append("  authorization:    ").append(authorization).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
