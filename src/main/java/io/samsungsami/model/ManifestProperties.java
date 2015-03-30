package io.samsungsami.model;

import java.util.Map;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class ManifestProperties  { 
  private Map<String, Object> properties = new HashMap<String, Object>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestProperties {\n");
    
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
