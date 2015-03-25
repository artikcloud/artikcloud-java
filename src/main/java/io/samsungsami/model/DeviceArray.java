package io.samsungsami.model;

import io.samsungsami.model.Device;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DeviceArray  {
  
  private List<Device> devices = new ArrayList<Device>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("devices")
  public List<Device> getDevices() {
    return devices;
  }
  public void setDevices(List<Device> devices) {
    this.devices = devices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceArray {\n");
    
    sb.append("  devices: ").append(devices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
