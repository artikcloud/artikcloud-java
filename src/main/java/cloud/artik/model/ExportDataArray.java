/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ExportData;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Export Data Array.
 */
@ApiModel(description = "Export Data Array.")

public class ExportDataArray {
  @SerializedName("exports")
  private List<ExportData> exports = new ArrayList<ExportData>();

  public ExportDataArray exports(List<ExportData> exports) {
    this.exports = exports;
    return this;
  }

  public ExportDataArray addExportsItem(ExportData exportsItem) {
    this.exports.add(exportsItem);
    return this;
  }

   /**
   * Get exports
   * @return exports
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ExportData> getExports() {
    return exports;
  }

  public void setExports(List<ExportData> exports) {
    this.exports = exports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportDataArray exportDataArray = (ExportDataArray) o;
    return Objects.equals(this.exports, exportDataArray.exports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportDataArray {\n");
    
    sb.append("    exports: ").append(toIndentedString(exports)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

