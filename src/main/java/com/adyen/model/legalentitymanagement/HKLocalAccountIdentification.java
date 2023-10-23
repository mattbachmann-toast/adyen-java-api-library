/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
 * HKLocalAccountIdentification
 */
@JsonPropertyOrder({
  HKLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  HKLocalAccountIdentification.JSON_PROPERTY_CLEARING_CODE,
  HKLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class HKLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_CLEARING_CODE = "clearingCode";
  private String clearingCode;

  /**
   * **hkLocal**
   */
  public enum TypeEnum {
    HKLOCAL("hkLocal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.HKLOCAL;

  public HKLocalAccountIdentification() { 
  }

  public HKLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 9- to 15-character bank account number (alphanumeric), without separators or whitespace. Starts with the 3-digit branch code.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 9- to 15-character bank account number (alphanumeric), without separators or whitespace. Starts with the 3-digit branch code.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public HKLocalAccountIdentification clearingCode(String clearingCode) {
    this.clearingCode = clearingCode;
    return this;
  }

   /**
   * The 3-digit clearing code, without separators or whitespace.
   * @return clearingCode
  **/
  @ApiModelProperty(required = true, value = "The 3-digit clearing code, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_CLEARING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClearingCode() {
    return clearingCode;
  }


  @JsonProperty(JSON_PROPERTY_CLEARING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearingCode(String clearingCode) {
    this.clearingCode = clearingCode;
  }


  public HKLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **hkLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**hkLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this HKLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HKLocalAccountIdentification hkLocalAccountIdentification = (HKLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, hkLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.clearingCode, hkLocalAccountIdentification.clearingCode) &&
        Objects.equals(this.type, hkLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, clearingCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HKLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    clearingCode: ").append(toIndentedString(clearingCode)).append("\n");
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
   * Create an instance of HKLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HKLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to HKLocalAccountIdentification
   */
  public static HKLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, HKLocalAccountIdentification.class);
  }
/**
  * Convert an instance of HKLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

