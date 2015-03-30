package io.samsungsami.model;

import io.samsungsami.model.DeviceType;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceTypeEnvelope  { 
  private DeviceType data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DeviceType getData() {
    return data;
  }
  public void setData(DeviceType data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
