package io.samsungsami.model;

import io.samsungsami.model.DeviceToken;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceTokenEnvelope  { 
  private DeviceToken data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DeviceToken getData() {
    return data;
  }
  public void setData(DeviceToken data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTokenEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
