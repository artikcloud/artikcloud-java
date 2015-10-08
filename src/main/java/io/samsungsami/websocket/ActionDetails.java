package io.samsungsami.websocket;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ActionDetails  {
  
  private String name = null;
  private Map<String, Object> parameters = new HashMap<String, Object>() ;

  /**
   * Name
   **/
  @ApiModelProperty(required = false, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = false, value = "Parameters")
  @JsonProperty("parameters")
  public Map<String, Object> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("  name:      ").append(name).append("\n");
    sb.append("  parameter: ").append(parameters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
