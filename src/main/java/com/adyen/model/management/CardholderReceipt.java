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
 * CardholderReceipt
 */
@JsonPropertyOrder({
  CardholderReceipt.JSON_PROPERTY_HEADER_FOR_AUTHORIZED_RECEIPT
})

public class CardholderReceipt {
  public static final String JSON_PROPERTY_HEADER_FOR_AUTHORIZED_RECEIPT = "headerForAuthorizedReceipt";
  private String headerForAuthorizedReceipt;

  public CardholderReceipt() { 
  }

  public CardholderReceipt headerForAuthorizedReceipt(String headerForAuthorizedReceipt) {
    this.headerForAuthorizedReceipt = headerForAuthorizedReceipt;
    return this;
  }

   /**
   * A custom header to show on the shopper receipt for an authorised transaction. Allows one or two comma-separated header lines, and blank lines. For example, &#x60;header,header,filler&#x60;
   * @return headerForAuthorizedReceipt
  **/
  @ApiModelProperty(value = "A custom header to show on the shopper receipt for an authorised transaction. Allows one or two comma-separated header lines, and blank lines. For example, `header,header,filler`")
  @JsonProperty(JSON_PROPERTY_HEADER_FOR_AUTHORIZED_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaderForAuthorizedReceipt() {
    return headerForAuthorizedReceipt;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_FOR_AUTHORIZED_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderForAuthorizedReceipt(String headerForAuthorizedReceipt) {
    this.headerForAuthorizedReceipt = headerForAuthorizedReceipt;
  }


  /**
   * Return true if this CardholderReceipt object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardholderReceipt cardholderReceipt = (CardholderReceipt) o;
    return Objects.equals(this.headerForAuthorizedReceipt, cardholderReceipt.headerForAuthorizedReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerForAuthorizedReceipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardholderReceipt {\n");
    sb.append("    headerForAuthorizedReceipt: ").append(toIndentedString(headerForAuthorizedReceipt)).append("\n");
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
   * Create an instance of CardholderReceipt given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardholderReceipt
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardholderReceipt
   */
  public static CardholderReceipt fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardholderReceipt.class);
  }
/**
  * Convert an instance of CardholderReceipt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

