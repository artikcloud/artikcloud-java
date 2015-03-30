package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class ExportStatusEnvelope  { 
  private String exportId = null;
  private String status = null;
  
  
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
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportStatusEnvelope {\n");
    
    sb.append("  exportId: ").append(exportId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
