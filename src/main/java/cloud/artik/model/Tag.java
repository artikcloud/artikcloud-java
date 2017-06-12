/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tag information.
 */
@ApiModel(description = "Tag information.")

public class Tag {
  @SerializedName("name")
  private String name = null;

  @SerializedName("isCategory")
  private Boolean isCategory = null;

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tag Name.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Tag Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag isCategory(Boolean isCategory) {
    this.isCategory = isCategory;
    return this;
  }

   /**
   * Is Category.
   * @return isCategory
  **/
  @ApiModelProperty(example = "null", value = "Is Category.")
  public Boolean getIsCategory() {
    return isCategory;
  }

  public void setIsCategory(Boolean isCategory) {
    this.isCategory = isCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.name, tag.name) &&
        Objects.equals(this.isCategory, tag.isCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCategory: ").append(toIndentedString(isCategory)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

