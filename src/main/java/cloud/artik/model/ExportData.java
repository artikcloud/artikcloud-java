package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ExportRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export Data.
 **/
@ApiModel(description = "Export Data.")
public class ExportData   {
  
  @SerializedName("expirationDate")
  private Long expirationDate = null;
  
  @SerializedName("exportId")
  private String exportId = null;
  
  @SerializedName("fileSize")
  private Long fileSize = null;
  
  @SerializedName("md5")
  private String md5 = null;
  
  @SerializedName("request")
  private ExportRequest request = null;
  
  @SerializedName("status")
  private String status = null;
  
  @SerializedName("totalMessages")
  private Long totalMessages = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public ExportRequest getRequest() {
    return request;
  }
  public void setRequest(ExportRequest request) {
    this.request = request;
  }

  
  /**
   * Export status
   **/
  @ApiModelProperty(value = "Export status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalMessages() {
    return totalMessages;
  }
  public void setTotalMessages(Long totalMessages) {
    this.totalMessages = totalMessages;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportData exportData = (ExportData) o;
    return Objects.equals(this.expirationDate, exportData.expirationDate) &&
        Objects.equals(this.exportId, exportData.exportId) &&
        Objects.equals(this.fileSize, exportData.fileSize) &&
        Objects.equals(this.md5, exportData.md5) &&
        Objects.equals(this.request, exportData.request) &&
        Objects.equals(this.status, exportData.status) &&
        Objects.equals(this.totalMessages, exportData.totalMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, exportId, fileSize, md5, request, status, totalMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportData {\n");
    
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalMessages: ").append(toIndentedString(totalMessages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
