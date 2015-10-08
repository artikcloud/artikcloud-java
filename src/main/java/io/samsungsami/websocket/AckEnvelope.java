package io.samsungsami.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "SAMI Acknowledgement")
public class AckEnvelope  {
  
  private Acknowledgement data = new Acknowledgement();
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public Acknowledgement getData() {
    return data;
  }
  public void setData(Acknowledgement data) {
    this.data = data;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckEnvelope {\n");
    
    sb.append("  data:  ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
