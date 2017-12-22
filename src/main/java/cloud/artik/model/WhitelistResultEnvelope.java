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
import cloud.artik.model.Whitelist;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class WhitelistResultEnvelope {
  @SerializedName("dtid")
  private String dtid = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("data")
  private List<Whitelist> data = new ArrayList<Whitelist>();

  public WhitelistResultEnvelope dtid(String dtid) {
    this.dtid = dtid;
    return this;
  }

   /**
   * Device type id
   * @return dtid
  **/
  @ApiModelProperty(example = "null", value = "Device type id")
  public String getDtid() {
    return dtid;
  }

  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  public WhitelistResultEnvelope offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Page starting position
   * @return offset
  **/
  @ApiModelProperty(example = "null", value = "Page starting position")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public WhitelistResultEnvelope count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Page size
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Page size")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public WhitelistResultEnvelope total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number or whitelist vdids
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "Total number or whitelist vdids")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public WhitelistResultEnvelope data(List<Whitelist> data) {
    this.data = data;
    return this;
  }

  public WhitelistResultEnvelope addDataItem(Whitelist dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of whitelisted vdids
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "Array of whitelisted vdids")
  public List<Whitelist> getData() {
    return data;
  }

  public void setData(List<Whitelist> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhitelistResultEnvelope whitelistResultEnvelope = (WhitelistResultEnvelope) o;
    return Objects.equals(this.dtid, whitelistResultEnvelope.dtid) &&
        Objects.equals(this.offset, whitelistResultEnvelope.offset) &&
        Objects.equals(this.count, whitelistResultEnvelope.count) &&
        Objects.equals(this.total, whitelistResultEnvelope.total) &&
        Objects.equals(this.data, whitelistResultEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtid, offset, count, total, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhitelistResultEnvelope {\n");
    
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

