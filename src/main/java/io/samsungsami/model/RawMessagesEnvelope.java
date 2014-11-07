package io.samsungsami.model;

import io.samsungsami.model.RawMessage;
import java.math.BigDecimal;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class RawMessagesEnvelope  { 
  private String sdid = null;
  private String mid = null;
  private BigDecimal startDate = null;
  
  //public enum startDateEnum {  }; 
  
  private BigDecimal endDate = null;
  
  //public enum endDateEnum {  }; 
  
  private Long count = null;
  
  //public enum countEnum {  }; 
  
  private String order = null;
  private BigDecimal size = null;
  
  //public enum sizeEnum {  }; 
  
  private List<RawMessage> data = new ArrayList<RawMessage>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getStartDate() {
    return startDate;
  }
  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getEndDate() {
    return endDate;
  }
  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
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
  public List<RawMessage> getData() {
    return data;
  }
  public void setData(List<RawMessage> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawMessagesEnvelope {\n");
    
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  mid: ").append(mid).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
