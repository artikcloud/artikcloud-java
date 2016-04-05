package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Tag information.
 **/
@ApiModel(description = "Tag information.")
public class Tag   {
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("isCategory")
  private Boolean isCategory = null;
  

  
  /**
   * Tag Name.
   **/
  @ApiModelProperty(value = "Tag Name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Is Category.
   **/
  @ApiModelProperty(value = "Is Category.")
  public Boolean getIsCategory() {
    return isCategory;
  }
  public void setIsCategory(Boolean isCategory) {
    this.isCategory = isCategory;
  }

  

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
