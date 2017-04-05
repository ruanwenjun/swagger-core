/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.models.servers;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServerVariable
 *
 * @link https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc0/versions/3.0.md#serverVariableObject
 */

public class ServerVariable {
  @JsonProperty("enum")
  private String _enum = null;
  @JsonProperty("default")
  private String _default = null;
  @JsonProperty("description")
  private String description = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the _enum property from a ServerVariable instance.
   *
   * @return String _enum
   **/
  @ApiModelProperty(value = "")
  public String getEnum() {
    return _enum;
  }

  public void setEnum(String _enum) {
    this._enum = _enum;
  }

  public ServerVariable _enum(String _enum) {
    this._enum = _enum;
    return this;
  }

  /**
   * returns the _default property from a ServerVariable instance.
   *
   * @return String _default
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public ServerVariable _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * returns the description property from a ServerVariable instance.
   *
   * @return String description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerVariable description(String description) {
    this.description = description;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerVariable serverVariable = (ServerVariable) o;
    return Objects.equals(this._enum, serverVariable._enum) &&
        Objects.equals(this._default, serverVariable._default) &&
        Objects.equals(this.description, serverVariable.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_enum, _default, description);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerVariable {\n");
    
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
