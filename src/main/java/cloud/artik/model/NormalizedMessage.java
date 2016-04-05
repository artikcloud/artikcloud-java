package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Normalized Message
 **/
@ApiModel(description = "Normalized Message")
public class NormalizedMessage   {
  
  @SerializedName("cts")
  private Long cts = null;
  
  @SerializedName("ts")
  private Long ts = null;
  
  @SerializedName("mid")
  private String mid = null;
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("sdtid")
  private String sdtid = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("mv")
  private Integer mv = null;
  
  @SerializedName("data")
  private Map<String, Object> data = new HashMap<String, Object>();
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCts() {
    return cts;
  }
  public void setCts(Long cts) {
    this.cts = cts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTs() {
    return ts;
  }
  public void setTs(Long ts) {
    this.ts = ts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
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
  public String getSdtid() {
    return sdtid;
  }
  public void setSdtid(String sdtid) {
    this.sdtid = sdtid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMv() {
    return mv;
  }
  public void setMv(Integer mv) {
    this.mv = mv;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedMessage normalizedMessage = (NormalizedMessage) o;
    return Objects.equals(this.cts, normalizedMessage.cts) &&
        Objects.equals(this.ts, normalizedMessage.ts) &&
        Objects.equals(this.mid, normalizedMessage.mid) &&
        Objects.equals(this.sdid, normalizedMessage.sdid) &&
        Objects.equals(this.sdtid, normalizedMessage.sdtid) &&
        Objects.equals(this.uid, normalizedMessage.uid) &&
        Objects.equals(this.mv, normalizedMessage.mv) &&
        Objects.equals(this.data, normalizedMessage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cts, ts, mid, sdid, sdtid, uid, mv, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedMessage {\n");
    
    sb.append("    cts: ").append(toIndentedString(cts)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    sdtid: ").append(toIndentedString(sdtid)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
