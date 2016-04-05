package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Message or Action Information.
 **/
@ApiModel(description = "Message or Action Information.")
public class MessageAction   {
  
  @SerializedName("data")
  private Map<String, Object> data = new HashMap<String, Object>();
  
  @SerializedName("ddid")
  private String ddid = null;
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("ts")
  private Long ts = null;
  
  @SerializedName("type")
  private String type = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  
  /**
   * Destination Device ID.
   **/
  @ApiModelProperty(value = "Destination Device ID.")
  public String getDdid() {
    return ddid;
  }
  public void setDdid(String ddid) {
    this.ddid = ddid;
  }

  
  /**
   * Source Device ID.
   **/
  @ApiModelProperty(value = "Source Device ID.")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   * Timestamp (past, present or future). Defaults to current time if not provided.
   **/
  @ApiModelProperty(value = "Timestamp (past, present or future). Defaults to current time if not provided.")
  public Long getTs() {
    return ts;
  }
  public void setTs(Long ts) {
    this.ts = ts;
  }

  
  /**
   * Type.
   **/
  @ApiModelProperty(value = "Type.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAction messageAction = (MessageAction) o;
    return Objects.equals(this.data, messageAction.data) &&
        Objects.equals(this.ddid, messageAction.ddid) &&
        Objects.equals(this.sdid, messageAction.sdid) &&
        Objects.equals(this.ts, messageAction.ts) &&
        Objects.equals(this.type, messageAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ddid, sdid, ts, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAction {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ddid: ").append(toIndentedString(ddid)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
