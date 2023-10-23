/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Key
 */
@JsonPropertyOrder({
  Key.JSON_PROPERTY_IDENTIFIER,
  Key.JSON_PROPERTY_PASSPHRASE,
  Key.JSON_PROPERTY_VERSION
})

public class Key {
  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_PASSPHRASE = "passphrase";
  private String passphrase;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public Key() { 
  }

  public Key identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The unique identifier of the shared key.
   * @return identifier
  **/
  @ApiModelProperty(value = "The unique identifier of the shared key.")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public Key passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * The secure passphrase to protect the shared key.
   * @return passphrase
  **/
  @ApiModelProperty(value = "The secure passphrase to protect the shared key.")
  @JsonProperty(JSON_PROPERTY_PASSPHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassphrase() {
    return passphrase;
  }


  @JsonProperty(JSON_PROPERTY_PASSPHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  public Key version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version number of the shared key.
   * @return version
  **/
  @ApiModelProperty(value = "The version number of the shared key.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Return true if this Key object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Key key = (Key) o;
    return Objects.equals(this.identifier, key.identifier) &&
        Objects.equals(this.passphrase, key.passphrase) &&
        Objects.equals(this.version, key.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, passphrase, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Key {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

/**
   * Create an instance of Key given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Key
   * @throws JsonProcessingException if the JSON string is invalid with respect to Key
   */
  public static Key fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Key.class);
  }
/**
  * Convert an instance of Key to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

