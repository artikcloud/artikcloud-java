package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * User Information
 **/
@ApiModel(description = "User Information")
public class User   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("email")
  private String email = null;
  
  @SerializedName("fullName")
  private String fullName = null;
  
  @SerializedName("saIdentity")
  private String saIdentity = null;
  
  @SerializedName("createdOn")
  private Long createdOn = null;
  
  @SerializedName("modifiedOn")
  private Long modifiedOn = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSaIdentity() {
    return saIdentity;
  }
  public void setSaIdentity(String saIdentity) {
    this.saIdentity = saIdentity;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getModifiedOn() {
    return modifiedOn;
  }
  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.saIdentity, user.saIdentity) &&
        Objects.equals(this.createdOn, user.createdOn) &&
        Objects.equals(this.modifiedOn, user.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, fullName, saIdentity, createdOn, modifiedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    saIdentity: ").append(toIndentedString(saIdentity)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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
