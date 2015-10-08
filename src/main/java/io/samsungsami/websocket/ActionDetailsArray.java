package io.samsungsami.websocket;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class ActionDetailsArray  {
  
  private List<ActionDetails> actions = new ArrayList<ActionDetails>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("actions")
  public List<ActionDetails> getActions() {
    return actions;
  }
  public void setActions(List<ActionDetails> actions) {
    this.actions = actions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionArray {\n");
    
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
