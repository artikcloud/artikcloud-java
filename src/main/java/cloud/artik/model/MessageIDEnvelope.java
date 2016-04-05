package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.MessageID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Message ID Envelope
 **/
@ApiModel(description = "Message ID Envelope")
public class MessageIDEnvelope   {
  
  @SerializedName("data")
  private MessageID data = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public MessageID getData() {
    return data;
  }
  public void setData(MessageID data) {
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
    MessageIDEnvelope messageIDEnvelope = (MessageIDEnvelope) o;
    return Objects.equals(this.data, messageIDEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageIDEnvelope {\n");
    
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
