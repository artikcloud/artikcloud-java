package io.samsungsami.model;

import io.samsungsami.model.DeviceType;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceTypeArray  { 
  private List<DeviceType> deviceTypes = new ArrayList<DeviceType>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<DeviceType> getDeviceTypes() {
    return deviceTypes;
  }
  public void setDeviceTypes(List<DeviceType> deviceTypes) {
    this.deviceTypes = deviceTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeArray {\n");
    
    sb.append("  deviceTypes: ").append(deviceTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
