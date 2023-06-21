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
import com.adyen.model.balanceplatform.Balance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * BalanceAccount
 */

public class BalanceAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_ID = "accountHolderId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_ID)
  private String accountHolderId;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<Balance> balances = null;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY_CODE)
  private String defaultCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The status of the balance account, set to **active** by default.  
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public BalanceAccount() { 
  }

  public BalanceAccount accountHolderId(String accountHolderId) {
    
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.")

  public String getAccountHolderId() {
    return accountHolderId;
  }


  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccount balances(List<Balance> balances) {
    
    this.balances = balances;
    return this;
  }

  public BalanceAccount addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * List of balances with the amount and currency.
   * @return balances
  **/
  @ApiModelProperty(value = "List of balances with the amount and currency.")

  public List<Balance> getBalances() {
    return balances;
  }


  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  public BalanceAccount defaultCurrencyCode(String defaultCurrencyCode) {
    
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**.
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**.")

  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }


  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }


  public BalanceAccount description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
  **/
  @ApiModelProperty(value = "A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the balance account.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the balance account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BalanceAccount metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public BalanceAccount putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of key and value pairs for general use by the merchant. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
   * @return metadata
  **/
  @ApiModelProperty(value = "A set of key and value pairs for general use by the merchant. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BalanceAccount reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the balance account, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the balance account, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccount status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the balance account, set to **active** by default.  
   * @return status
  **/
  @ApiModelProperty(value = "The status of the balance account, set to **active** by default.  ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BalanceAccount timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccount balanceAccount = (BalanceAccount) o;
    return Objects.equals(this.accountHolderId, balanceAccount.accountHolderId) &&
        Objects.equals(this.balances, balanceAccount.balances) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccount.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccount.description) &&
        Objects.equals(this.id, balanceAccount.id) &&
        Objects.equals(this.metadata, balanceAccount.metadata) &&
        Objects.equals(this.reference, balanceAccount.reference) &&
        Objects.equals(this.status, balanceAccount.status) &&
        Objects.equals(this.timeZone, balanceAccount.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, balances, defaultCurrencyCode, description, id, metadata, reference, status, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccount {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("accountHolderId");
    openapiFields.add("balances");
    openapiFields.add("defaultCurrencyCode");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("metadata");
    openapiFields.add("reference");
    openapiFields.add("status");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountHolderId");
    openapiRequiredFields.add("id");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to BalanceAccount
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (BalanceAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceAccount is not found in the empty JSON string", BalanceAccount.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!BalanceAccount.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceAccount` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BalanceAccount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field accountHolderId
      if (jsonObj.get("accountHolderId") != null && !jsonObj.get("accountHolderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountHolderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountHolderId").toString()));
      }
      JsonArray jsonArraybalances = jsonObj.getAsJsonArray("balances");
      if (jsonArraybalances != null) {
        // ensure the json data is an array
        if (!jsonObj.get("balances").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `balances` to be an array in the JSON string but got `%s`", jsonObj.get("balances").toString()));
        }

        // validate the optional field `balances` (array)
        for (int i = 0; i < jsonArraybalances.size(); i++) {
          Balance.validateJsonObject(jsonArraybalances.get(i).getAsJsonObject());
        }
      }
      // validate the optional field defaultCurrencyCode
      if (jsonObj.get("defaultCurrencyCode") != null && !jsonObj.get("defaultCurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultCurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultCurrencyCode").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field timeZone
      if (jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceAccount>() {
           @Override
           public void write(JsonWriter out, BalanceAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceAccount
  * @throws IOException if the JSON string is invalid with respect to BalanceAccount
  */
  public static BalanceAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceAccount.class);
  }

 /**
  * Convert an instance of BalanceAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

