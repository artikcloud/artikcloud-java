package io.samsungsami.model;

import io.samsungsami.model.ExportRequest;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportData  {
  
  private Long expirationDate = null;
  private String exportId = null;
  private Long fileSize = null;
  private String md5 = null;
  private ExportRequest request = null;
  private String status = null;
  private Long totalMessages = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("expirationDate")
  public Long getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("exportId")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fileSize")
  public Long getFileSize() {
    return fileSize;
  }
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("request")
  public ExportRequest getRequest() {
    return request;
  }
  public void setRequest(ExportRequest request) {
    this.request = request;
  }

  
  /**
   * Export status
   **/
  @ApiModelProperty(required = false, value = "Export status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("totalMessages")
  public Long getTotalMessages() {
    return totalMessages;
  }
  public void setTotalMessages(Long totalMessages) {
    this.totalMessages = totalMessages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportData {\n");
    
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  exportId: ").append(exportId).append("\n");
    sb.append("  fileSize: ").append(fileSize).append("\n");
    sb.append("  md5: ").append(md5).append("\n");
    sb.append("  request: ").append(request).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  totalMessages: ").append(totalMessages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
