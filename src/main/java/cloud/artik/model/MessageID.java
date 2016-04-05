package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Mesage ID.
 **/
@ApiModel(description = "Mesage ID.")
public class MessageID   {
  
  @SerializedName("mid")
  private String mid = null;
  

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageID messageID = (MessageID) o;
    return Objects.equals(this.mid, messageID.mid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageID {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
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
