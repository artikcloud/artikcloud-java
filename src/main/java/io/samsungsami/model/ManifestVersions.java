package io.samsungsami.model;

import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class ManifestVersions  { 
  private List<String> versions = new ArrayList<String>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getVersions() {
    return versions;
  }
  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestVersions {\n");
    
    sb.append("  versions: ").append(versions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
