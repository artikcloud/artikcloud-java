package io.samsungsami.model;

import io.samsungsami.model.SendMessageActionData;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class SendMessageActionResponse  {
  
  private SendMessageActionData data = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public SendMessageActionData getData() {
    return data;
  }
  public void setData(SendMessageActionData data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageActionResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
