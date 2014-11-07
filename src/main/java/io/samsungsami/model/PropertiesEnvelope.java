package io.samsungsami.model;

import io.samsungsami.model.AppProperties;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class PropertiesEnvelope  { 
  private AppProperties data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AppProperties getData() {
    return data;
  }
  public void setData(AppProperties data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
