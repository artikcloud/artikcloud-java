package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class SendMessageActionData  {
  
  private String mid = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageActionData {\n");
    
    sb.append("  mid: ").append(mid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
