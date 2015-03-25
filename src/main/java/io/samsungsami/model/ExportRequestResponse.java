package io.samsungsami.model;

import io.samsungsami.model.ExportRequestData;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportRequestResponse  {
  
  private ExportRequestData data = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public ExportRequestData getData() {
    return data;
  }
  public void setData(ExportRequestData data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRequestResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
