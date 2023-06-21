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
import com.adyen.model.balanceplatform.Authentication;
import com.adyen.model.balanceplatform.CardConfiguration;
import com.adyen.model.balanceplatform.DeliveryContact;
import com.adyen.model.balanceplatform.Expiry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.balanceplatform.JSON;

/**
 * Card
 */

public class Card {
  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private Authentication authentication;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BRAND_VARIANT = "brandVariant";
  @SerializedName(SERIALIZED_NAME_BRAND_VARIANT)
  private String brandVariant;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private CardConfiguration configuration;

  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public static final String SERIALIZED_NAME_DELIVERY_CONTACT = "deliveryContact";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTACT)
  private DeliveryContact deliveryContact;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Expiry expiration;

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   */
  @JsonAdapter(FormFactorEnum.Adapter.class)
  public enum FormFactorEnum {
    PHYSICAL("physical"),
    
    UNKNOWN("unknown"),
    
    VIRTUAL("virtual");

    private String value;

    FormFactorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormFactorEnum fromValue(String value) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormFactorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormFactorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormFactorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormFactorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORM_FACTOR = "formFactor";
  @SerializedName(SERIALIZED_NAME_FORM_FACTOR)
  private FormFactorEnum formFactor;

  public static final String SERIALIZED_NAME_LAST_FOUR = "lastFour";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public Card() { 
  }

  
  public Card(
     String number
  ) {
    this();
    this.number = number;
  }

  public Card authentication(Authentication authentication) {
    
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(value = "")

  public Authentication getAuthentication() {
    return authentication;
  }


  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }


  public Card bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The bank identification number (BIN) of the card number.
   * @return bin
  **/
  @ApiModelProperty(value = "The bank identification number (BIN) of the card number.")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public Card brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the physical or the virtual card. Possible values: **visa**, **mc**.
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "The brand of the physical or the virtual card. Possible values: **visa**, **mc**.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public Card brandVariant(String brandVariant) {
    
    this.brandVariant = brandVariant;
    return this;
  }

   /**
   * The brand variant of the physical or the virtual card. &gt;Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.
   * @return brandVariant
  **/
  @ApiModelProperty(required = true, value = "The brand variant of the physical or the virtual card. >Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.")

  public String getBrandVariant() {
    return brandVariant;
  }


  public void setBrandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
  }


  public Card cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The name of the cardholder.  Maximum length: 26 characters.
   * @return cardholderName
  **/
  @ApiModelProperty(required = true, value = "The name of the cardholder.  Maximum length: 26 characters.")

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public Card configuration(CardConfiguration configuration) {
    
    this.configuration = configuration;
    return this;
  }

   /**
   * Get configuration
   * @return configuration
  **/
  @ApiModelProperty(value = "")

  public CardConfiguration getConfiguration() {
    return configuration;
  }


  public void setConfiguration(CardConfiguration configuration) {
    this.configuration = configuration;
  }


  public Card cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * The CVC2 value of the card. &gt; The CVC2 is not sent by default. This is only returned in the &#x60;POST&#x60; response for single-use virtual cards.
   * @return cvc
  **/
  @ApiModelProperty(value = "The CVC2 value of the card. > The CVC2 is not sent by default. This is only returned in the `POST` response for single-use virtual cards.")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public Card deliveryContact(DeliveryContact deliveryContact) {
    
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @ApiModelProperty(value = "")

  public DeliveryContact getDeliveryContact() {
    return deliveryContact;
  }


  public void setDeliveryContact(DeliveryContact deliveryContact) {
    this.deliveryContact = deliveryContact;
  }


  public Card expiration(Expiry expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")

  public Expiry getExpiration() {
    return expiration;
  }


  public void setExpiration(Expiry expiration) {
    this.expiration = expiration;
  }


  public Card formFactor(FormFactorEnum formFactor) {
    
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   * @return formFactor
  **/
  @ApiModelProperty(required = true, value = "The form factor of the card. Possible values: **virtual**, **physical**.")

  public FormFactorEnum getFormFactor() {
    return formFactor;
  }


  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }


  public Card lastFour(String lastFour) {
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Last last four digits of the card number.
   * @return lastFour
  **/
  @ApiModelProperty(value = "Last last four digits of the card number.")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


   /**
   * The primary account number (PAN) of the card. &gt; The PAN is masked by default and returned only for single-use virtual cards.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The primary account number (PAN) of the card. > The PAN is masked by default and returned only for single-use virtual cards.")

  public String getNumber() {
    return number;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.authentication, card.authentication) &&
        Objects.equals(this.bin, card.bin) &&
        Objects.equals(this.brand, card.brand) &&
        Objects.equals(this.brandVariant, card.brandVariant) &&
        Objects.equals(this.cardholderName, card.cardholderName) &&
        Objects.equals(this.configuration, card.configuration) &&
        Objects.equals(this.cvc, card.cvc) &&
        Objects.equals(this.deliveryContact, card.deliveryContact) &&
        Objects.equals(this.expiration, card.expiration) &&
        Objects.equals(this.formFactor, card.formFactor) &&
        Objects.equals(this.lastFour, card.lastFour) &&
        Objects.equals(this.number, card.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, bin, brand, brandVariant, cardholderName, configuration, cvc, deliveryContact, expiration, formFactor, lastFour, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandVariant: ").append(toIndentedString(brandVariant)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("authentication");
    openapiFields.add("bin");
    openapiFields.add("brand");
    openapiFields.add("brandVariant");
    openapiFields.add("cardholderName");
    openapiFields.add("configuration");
    openapiFields.add("cvc");
    openapiFields.add("deliveryContact");
    openapiFields.add("expiration");
    openapiFields.add("formFactor");
    openapiFields.add("lastFour");
    openapiFields.add("number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand");
    openapiRequiredFields.add("brandVariant");
    openapiRequiredFields.add("cardholderName");
    openapiRequiredFields.add("formFactor");
    openapiRequiredFields.add("number");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to Card
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (Card.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Card is not found in the empty JSON string", Card.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!Card.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Card` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Card.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `authentication`
      if (jsonObj.getAsJsonObject("authentication") != null) {
        Authentication.validateJsonObject(jsonObj.getAsJsonObject("authentication"));
      }
      // validate the optional field bin
      if (jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // validate the optional field brandVariant
      if (jsonObj.get("brandVariant") != null && !jsonObj.get("brandVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandVariant").toString()));
      }
      // validate the optional field cardholderName
      if (jsonObj.get("cardholderName") != null && !jsonObj.get("cardholderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholderName").toString()));
      }
      // validate the optional field `configuration`
      if (jsonObj.getAsJsonObject("configuration") != null) {
        CardConfiguration.validateJsonObject(jsonObj.getAsJsonObject("configuration"));
      }
      // validate the optional field cvc
      if (jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
      // validate the optional field `deliveryContact`
      if (jsonObj.getAsJsonObject("deliveryContact") != null) {
        DeliveryContact.validateJsonObject(jsonObj.getAsJsonObject("deliveryContact"));
      }
      // validate the optional field `expiration`
      if (jsonObj.getAsJsonObject("expiration") != null) {
        Expiry.validateJsonObject(jsonObj.getAsJsonObject("expiration"));
      }
      // ensure the field formFactor can be parsed to an enum value
      if (jsonObj.get("formFactor") != null) {
        if(!jsonObj.get("formFactor").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `formFactor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formFactor").toString()));
        }
        FormFactorEnum.fromValue(jsonObj.get("formFactor").getAsString());
      }
      // validate the optional field lastFour
      if (jsonObj.get("lastFour") != null && !jsonObj.get("lastFour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastFour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastFour").toString()));
      }
      // validate the optional field number
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Card.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Card' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Card> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Card.class));

       return (TypeAdapter<T>) new TypeAdapter<Card>() {
           @Override
           public void write(JsonWriter out, Card value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Card read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Card given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Card
  * @throws IOException if the JSON string is invalid with respect to Card
  */
  public static Card fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Card.class);
  }

 /**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

