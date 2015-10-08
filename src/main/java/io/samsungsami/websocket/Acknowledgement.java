package io.samsungsami.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * 
 **/
@ApiModel(description = "SAMI Ack")
public class Acknowledgement  {

  private String mid = null;
  private String cid = null; 
  private String message = null;
  private String code = null;


  /**
   * Message ID.
   **/
  @ApiModelProperty(required = false, value = "Message ID.")
  @JsonProperty("mid")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
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
   * Message.
   **/
  @ApiModelProperty(required = false, value = "Message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  
  /**
   * Code.
   **/
  @ApiModelProperty(required = false, value = "Code.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }  
  
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ack {\n");
    
    sb.append("  mid:     ").append(mid).append("\n");
    sb.append("  cid:     ").append(cid).append("\n");
    sb.append("  code:    ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
