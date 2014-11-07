package io.samsungsami.model;

import java.math.BigDecimal;
import java.util.*;
import io.samsungsami.model.Aggregates;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class AggregatesEnvelope  { 
  private String sdid = null;
  private String field = null;
  private Long startDate = null;
  
  //public enum startDateEnum {  }; 
  
  private Long endDate = null;
  
  //public enum endDateEnum {  }; 
  
  private BigDecimal size = null;
  
  //public enum sizeEnum {  }; 
  
  private List<Aggregates> data = new ArrayList<Aggregates>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Aggregates> getData() {
    return data;
  }
  public void setData(List<Aggregates> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatesEnvelope {\n");
    
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  field: ").append(field).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
