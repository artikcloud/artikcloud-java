package io.samsungsami.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "SAMI Error")
public class ErrorWrapper  {
  
  private Error error = new Error() ;
  
  /**
   **/
  @ApiModelProperty(required = false, value = "Error Data")
  @JsonProperty("error")
  public Error getError() {
    return error;
  }
  public void setError(Error error) {
    this.error = error;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  error:  ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
