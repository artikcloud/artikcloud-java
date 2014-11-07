package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class ExportEnvelope  { 
  private String exportId = null;
  private String uid = null;
  private String sdid = null;
  private Long startDate = null;
  
  //public enum startDateEnum {  }; 
  
  private Long endDate = null;
  
  //public enum endDateEnum {  }; 
  
  private String order = null;
  private String format = null;
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
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
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportEnvelope {\n");
    
    sb.append("  exportId: ").append(exportId).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
