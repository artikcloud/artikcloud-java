package io.samsungsami.model;

import java.util.*;
import io.samsungsami.model.ExportData;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportDataArray  {
  
  private List<ExportData> exports = new ArrayList<ExportData>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("exports")
  public List<ExportData> getExports() {
    return exports;
  }
  public void setExports(List<ExportData> exports) {
    this.exports = exports;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportDataArray {\n");
    
    sb.append("  exports: ").append(exports).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
