package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.WebSocketError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * WebSocket Error Envelope
 **/
@ApiModel(description = "WebSocket Error Envelope")
public class ErrorEnvelope   {
  
  @SerializedName("error")
  private WebSocketError error = null;
  

  
  /**
   * Error Data
   **/
  @ApiModelProperty(value = "Error Data")
  public WebSocketError getError() {
    return error;
  }
  public void setError(WebSocketError error) {
    this.error = error;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorEnvelope errorEnvelope = (ErrorEnvelope) o;
    return Objects.equals(this.error, errorEnvelope.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorEnvelope {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
