package io.samsungsami.model;

import io.samsungsami.model.MessageID;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class MessageIDEnvelope  { 
  private MessageID data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MessageID getData() {
    return data;
  }
  public void setData(MessageID data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageIDEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
