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
import cloud.artik.model.ActionArray;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Normalized Action
 */
@ApiModel(description = "Normalized Action")

public class NormalizedAction {
  @SerializedName("cts")
  private Long cts = null;

  @SerializedName("ts")
  private Long ts = null;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("sdid")
  private String sdid = null;

  @SerializedName("ddid")
  private String ddid = null;

  @SerializedName("ddtid")
  private String ddtid = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("mv")
  private Integer mv = null;

  @SerializedName("data")
  private ActionArray data = null;

  public NormalizedAction cts(Long cts) {
    this.cts = cts;
    return this;
  }

   /**
   * Get cts
   * @return cts
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getCts() {
    return cts;
  }

  public void setCts(Long cts) {
    this.cts = cts;
  }

  public NormalizedAction ts(Long ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public NormalizedAction mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public NormalizedAction sdid(String sdid) {
    this.sdid = sdid;
    return this;
  }

   /**
   * Get sdid
   * @return sdid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdid() {
    return sdid;
  }

  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  public NormalizedAction ddid(String ddid) {
    this.ddid = ddid;
    return this;
  }

   /**
   * Get ddid
   * @return ddid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDdid() {
    return ddid;
  }

  public void setDdid(String ddid) {
    this.ddid = ddid;
  }

  public NormalizedAction ddtid(String ddtid) {
    this.ddtid = ddtid;
    return this;
  }

   /**
   * Get ddtid
   * @return ddtid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDdtid() {
    return ddtid;
  }

  public void setDdtid(String ddtid) {
    this.ddtid = ddtid;
  }

  public NormalizedAction uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public NormalizedAction mv(Integer mv) {
    this.mv = mv;
    return this;
  }

   /**
   * Get mv
   * @return mv
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMv() {
    return mv;
  }

  public void setMv(Integer mv) {
    this.mv = mv;
  }

  public NormalizedAction data(ActionArray data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ActionArray getData() {
    return data;
  }

  public void setData(ActionArray data) {
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
    NormalizedAction normalizedAction = (NormalizedAction) o;
    return Objects.equals(this.cts, normalizedAction.cts) &&
        Objects.equals(this.ts, normalizedAction.ts) &&
        Objects.equals(this.mid, normalizedAction.mid) &&
        Objects.equals(this.sdid, normalizedAction.sdid) &&
        Objects.equals(this.ddid, normalizedAction.ddid) &&
        Objects.equals(this.ddtid, normalizedAction.ddtid) &&
        Objects.equals(this.uid, normalizedAction.uid) &&
        Objects.equals(this.mv, normalizedAction.mv) &&
        Objects.equals(this.data, normalizedAction.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cts, ts, mid, sdid, ddid, ddtid, uid, mv, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedAction {\n");
    
    sb.append("    cts: ").append(toIndentedString(cts)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    ddid: ").append(toIndentedString(ddid)).append("\n");
    sb.append("    ddtid: ").append(toIndentedString(ddtid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    mv: ").append(toIndentedString(mv)).append("\n");
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

