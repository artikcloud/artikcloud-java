package io.samsungsami.websocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * 
 **/
@ApiModel(description = "SAMI Error Data")
public class Error  {
  private String message = null; 
  private Integer code = null;

  
  /**
   * Message ID.
   **/
  @ApiModelProperty(required = false, value = "Error Message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }  
  
  /**
   * Error Code.
   **/
  @ApiModelProperty(required = false, value = "Error code.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }  
  
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorData {\n");
    
    sb.append("  code:       ").append(code).append("\n");
    sb.append("  message:    ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
