package io.samsungsami.model;

import io.samsungsami.model.ManifestVersions;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class ManifestVersionsEnvelope  { 
  private ManifestVersions data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ManifestVersions getData() {
    return data;
  }
  public void setData(ManifestVersions data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestVersionsEnvelope {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
