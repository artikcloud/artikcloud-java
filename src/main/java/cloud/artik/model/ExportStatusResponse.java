package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export Status Response.
 **/
@ApiModel(description = "Export Status Response.")
public class ExportStatusResponse   {
  
  @SerializedName("expirationDate")
  private Long expirationDate = null;
  
  @SerializedName("exportId")
  private String exportId = null;
  
  @SerializedName("md5")
  private String md5 = null;
  
  @SerializedName("status")
  private String status = null;
  
  @SerializedName("ttl")
  private String ttl = null;
  

  
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
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
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
  public String getTtl() {
    return ttl;
  }
  public void setTtl(String ttl) {
    this.ttl = ttl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportStatusResponse exportStatusResponse = (ExportStatusResponse) o;
    return Objects.equals(this.expirationDate, exportStatusResponse.expirationDate) &&
        Objects.equals(this.exportId, exportStatusResponse.exportId) &&
        Objects.equals(this.md5, exportStatusResponse.md5) &&
        Objects.equals(this.status, exportStatusResponse.status) &&
        Objects.equals(this.ttl, exportStatusResponse.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, exportId, md5, status, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportStatusResponse {\n");
    
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
