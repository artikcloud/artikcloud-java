package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * User Application Properties
 **/
@ApiModel(description = "User Application Properties")
public class AppProperties   {
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("aid")
  private String aid = null;
  
  @SerializedName("properties")
  private String properties = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAid() {
    return aid;
  }
  public void setAid(String aid) {
    this.aid = aid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProperties() {
    return properties;
  }
  public void setProperties(String properties) {
    this.properties = properties;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppProperties appProperties = (AppProperties) o;
    return Objects.equals(this.uid, appProperties.uid) &&
        Objects.equals(this.aid, appProperties.aid) &&
        Objects.equals(this.properties, appProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, aid, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProperties {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
