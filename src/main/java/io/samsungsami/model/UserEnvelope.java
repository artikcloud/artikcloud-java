package io.samsungsami.model;

import io.samsungsami.model.User;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class UserEnvelope  {
  
  private User data = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public User getData() {
    return data;
  }
  public void setData(User data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
