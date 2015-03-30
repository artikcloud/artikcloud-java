package io.samsungsami.model;

import io.samsungsami.model.Device;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceEnvelope  { 
  private Device data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Device getData() {
    return data;
  }
  public void setData(Device data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
