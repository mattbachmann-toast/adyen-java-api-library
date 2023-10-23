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
 * Standalone
 */
@JsonPropertyOrder({
  Standalone.JSON_PROPERTY_CURRENCY_CODE,
  Standalone.JSON_PROPERTY_ENABLE_STANDALONE
})

public class Standalone {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_ENABLE_STANDALONE = "enableStandalone";
  private Boolean enableStandalone;

  public Standalone() { 
  }

  public Standalone currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The default currency of the standalone payment terminal as an [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The default currency of the standalone payment terminal as an [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Standalone enableStandalone(Boolean enableStandalone) {
    this.enableStandalone = enableStandalone;
    return this;
  }

   /**
   * Enable standalone mode.
   * @return enableStandalone
  **/
  @ApiModelProperty(value = "Enable standalone mode.")
  @JsonProperty(JSON_PROPERTY_ENABLE_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableStandalone() {
    return enableStandalone;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableStandalone(Boolean enableStandalone) {
    this.enableStandalone = enableStandalone;
  }


  /**
   * Return true if this Standalone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Standalone standalone = (Standalone) o;
    return Objects.equals(this.currencyCode, standalone.currencyCode) &&
        Objects.equals(this.enableStandalone, standalone.enableStandalone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, enableStandalone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Standalone {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    enableStandalone: ").append(toIndentedString(enableStandalone)).append("\n");
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
   * Create an instance of Standalone given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Standalone
   * @throws JsonProcessingException if the JSON string is invalid with respect to Standalone
   */
  public static Standalone fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Standalone.class);
  }
/**
  * Convert an instance of Standalone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

