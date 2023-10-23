/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * BankIdentification
 */
@JsonPropertyOrder({
  BankIdentification.JSON_PROPERTY_COUNTRY,
  BankIdentification.JSON_PROPERTY_IDENTIFICATION,
  BankIdentification.JSON_PROPERTY_IDENTIFICATION_TYPE
})

public class BankIdentification {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_IDENTIFICATION = "identification";
  private String identification;

  /**
   * Gets or Sets identificationType
   */
  public enum IdentificationTypeEnum {
    IBAN("iban"),
    
    ROUTINGNUMBER("routingNumber");

    private String value;

    IdentificationTypeEnum(String value) {
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
    public static IdentificationTypeEnum fromValue(String value) {
      for (IdentificationTypeEnum b : IdentificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IDENTIFICATION_TYPE = "identificationType";
  private IdentificationTypeEnum identificationType;

  public BankIdentification() { 
  }

  public BankIdentification country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public BankIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentification() {
    return identification;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentification(String identification) {
    this.identification = identification;
  }


  public BankIdentification identificationType(IdentificationTypeEnum identificationType) {
    this.identificationType = identificationType;
    return this;
  }

   /**
   * Get identificationType
   * @return identificationType
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentificationTypeEnum getIdentificationType() {
    return identificationType;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentificationType(IdentificationTypeEnum identificationType) {
    this.identificationType = identificationType;
  }


  /**
   * Return true if this BankIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankIdentification bankIdentification = (BankIdentification) o;
    return Objects.equals(this.country, bankIdentification.country) &&
        Objects.equals(this.identification, bankIdentification.identification) &&
        Objects.equals(this.identificationType, bankIdentification.identificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, identification, identificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankIdentification {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
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
   * Create an instance of BankIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BankIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to BankIdentification
   */
  public static BankIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BankIdentification.class);
  }
/**
  * Convert an instance of BankIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

