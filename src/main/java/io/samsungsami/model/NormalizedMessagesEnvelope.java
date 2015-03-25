package io.samsungsami.model;

import io.samsungsami.model.NormalizedMessage;
import java.math.BigDecimal;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class NormalizedMessagesEnvelope  {
  
  private String sdids = null;
  private String sdid = null;
  private String uid = null;
  private BigDecimal startDate = null;
  private BigDecimal endDate = null;
  private String order = null;
  private String next = null;
  private Long count = null;
  private Long size = null;
  private List<NormalizedMessage> data = new ArrayList<NormalizedMessage>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sdids")
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("startDate")
  public BigDecimal getStartDate() {
    return startDate;
  }
  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("endDate")
  public BigDecimal getEndDate() {
    return endDate;
  }
  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public List<NormalizedMessage> getData() {
    return data;
  }
  public void setData(List<NormalizedMessage> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedMessagesEnvelope {\n");
    
    sb.append("  sdids: ").append(sdids).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
