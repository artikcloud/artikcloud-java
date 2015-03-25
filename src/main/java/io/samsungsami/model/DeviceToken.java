package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DeviceToken  {
  
  private String accessToken = null;
  private String uid = null;
  private String did = null;
  private String cid = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("did")
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceToken {\n");
    
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  did: ").append(did).append("\n");
    sb.append("  cid: ").append(cid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
