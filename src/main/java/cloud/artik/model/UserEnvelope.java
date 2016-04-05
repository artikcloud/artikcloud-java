package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * User Envelope
 **/
@ApiModel(description = "User Envelope")
public class UserEnvelope   {
  
  @SerializedName("data")
  private User data = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public User getData() {
    return data;
  }
  public void setData(User data) {
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
    UserEnvelope userEnvelope = (UserEnvelope) o;
    return Objects.equals(this.data, userEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEnvelope {\n");
    
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
