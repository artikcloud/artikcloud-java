package io.samsungsami.model;

import java.math.BigDecimal;
import java.util.*;
import io.samsungsami.model.FieldPresence;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class FieldPresenceEnvelope  { 
  private String sdid = null;
  private String fieldPresence = null;
  private Long startDate = null;
  
  //public enum startDateEnum {  }; 
  
  private Long endDate = null;
  
  //public enum endDateEnum {  }; 
  
  private String interval = null;
  private BigDecimal size = null;
  
  //public enum sizeEnum {  }; 
  
  private List<FieldPresence> data = new ArrayList<FieldPresence>() ;
  
  
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
  public String getFieldPresence() {
    return fieldPresence;
  }
  public void setFieldPresence(String fieldPresence) {
    this.fieldPresence = fieldPresence;
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
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
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
  public List<FieldPresence> getData() {
    return data;
  }
  public void setData(List<FieldPresence> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPresenceEnvelope {\n");
    
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  fieldPresence: ").append(fieldPresence).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  interval: ").append(interval).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
