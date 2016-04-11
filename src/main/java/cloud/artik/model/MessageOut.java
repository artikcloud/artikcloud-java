package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Message received by a WebSocket.
 **/
@ApiModel(description = "Message received by a WebSocket.")
public class MessageOut extends MessageIn   {
  
  @SerializedName("mid")
  private String mid = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("sdtid")
  private String sdtid = null;
  
  @SerializedName("cts")
  private Long cts = null;
  
  @SerializedName("mv")
  private Integer mv = null;
  

  
  /**
   * Message ID.
   **/
  @ApiModelProperty(value = "Message ID.")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  
  /**
   * User ID.
   **/
  @ApiModelProperty(value = "User ID.")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   * Source Device Type ID.
   **/
  @ApiModelProperty(value = "Source Device Type ID.")
  public String getSdtid() {
    return sdtid;
  }
  public void setSdtid(String sdtid) {
    this.sdtid = sdtid;
  }

  
  /**
   * Created Timestamp (past, present or future). Defaults to current time if not provided.
   **/
  @ApiModelProperty(value = "Created Timestamp (past, present or future). Defaults to current time if not provided.")
  public Long getCts() {
    return cts;
  }
  public void setCts(Long cts) {
    this.cts = cts;
  }

  
  /**
   * Manifest Version.
   **/
  @ApiModelProperty(value = "Manifest Version.")
  public Integer getMv() {
    return mv;
  }
  public void setMv(Integer mv) {
    this.mv = mv;
  }

  

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }
    MessageOut messageOut = (MessageOut) o;
    return Objects.equals(this.mid, messageOut.mid) &&
        Objects.equals(this.uid, messageOut.uid) &&
        Objects.equals(this.sdtid, messageOut.sdtid) &&
        Objects.equals(this.cts, messageOut.cts) &&
        Objects.equals(this.mv, messageOut.mv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, cid, ddid, sdid, ts, type, mid, uid, sdtid, cts, mv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOut {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    ddid: ").append(toIndentedString(ddid)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sdtid: ").append(toIndentedString(sdtid)).append("\n");
    sb.append("    cts: ").append(toIndentedString(cts)).append("\n");
    sb.append("    mv: ").append(toIndentedString(mv)).append("\n");
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
