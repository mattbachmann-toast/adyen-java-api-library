/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

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
 * TransactionRuleSource
 */
@JsonPropertyOrder({
  TransactionRuleSource.JSON_PROPERTY_ID,
  TransactionRuleSource.JSON_PROPERTY_TYPE
})

public class TransactionRuleSource {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TransactionRuleSource() { 
  }

  public TransactionRuleSource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the resource, when applicable.
   * @return id
  **/
  @ApiModelProperty(value = "ID of the resource, when applicable.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TransactionRuleSource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of resource for which the transaction rule is defined.  Possible values:   * **PaymentInstrumentGroup**  * **PaymentInstrument**  * **BalancePlatform**  * **EntityUsageConfiguration**  * **PlatformRule**: The transaction rule is a platform-wide rule imposed by Adyen.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of resource for which the transaction rule is defined.  Possible values:   * **PaymentInstrumentGroup**  * **PaymentInstrument**  * **BalancePlatform**  * **EntityUsageConfiguration**  * **PlatformRule**: The transaction rule is a platform-wide rule imposed by Adyen.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this TransactionRuleSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleSource transactionRuleSource = (TransactionRuleSource) o;
    return Objects.equals(this.id, transactionRuleSource.id) &&
        Objects.equals(this.type, transactionRuleSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleSource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of TransactionRuleSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRuleSource
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionRuleSource
   */
  public static TransactionRuleSource fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionRuleSource.class);
  }
/**
  * Convert an instance of TransactionRuleSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

