package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Device Token
 **/
@ApiModel(description = "Device Token")
public class DeviceToken   {
  
  @SerializedName("accessToken")
  private String accessToken = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("did")
  private String did = null;
  
  @SerializedName("cid")
  private String cid = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
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
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceToken deviceToken = (DeviceToken) o;
    return Objects.equals(this.accessToken, deviceToken.accessToken) &&
        Objects.equals(this.uid, deviceToken.uid) &&
        Objects.equals(this.did, deviceToken.did) &&
        Objects.equals(this.cid, deviceToken.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, uid, did, cid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
