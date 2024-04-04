/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.Amount;
import com.adyen.model.payment.PlatformChargebackLogic;
import com.adyen.model.payment.Split;
import com.adyen.model.payment.ThreeDSecureData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TechnicalCancelRequest
 */
@JsonPropertyOrder({
  TechnicalCancelRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  TechnicalCancelRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  TechnicalCancelRequest.JSON_PROPERTY_MODIFICATION_AMOUNT,
  TechnicalCancelRequest.JSON_PROPERTY_MPI_DATA,
  TechnicalCancelRequest.JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE,
  TechnicalCancelRequest.JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC,
  TechnicalCancelRequest.JSON_PROPERTY_REFERENCE,
  TechnicalCancelRequest.JSON_PROPERTY_SPLITS,
  TechnicalCancelRequest.JSON_PROPERTY_TENDER_REFERENCE,
  TechnicalCancelRequest.JSON_PROPERTY_UNIQUE_TERMINAL_ID
})

public class TechnicalCancelRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_MODIFICATION_AMOUNT = "modificationAmount";
  private Amount modificationAmount;

  public static final String JSON_PROPERTY_MPI_DATA = "mpiData";
  private ThreeDSecureData mpiData;

  public static final String JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE = "originalMerchantReference";
  private String originalMerchantReference;

  public static final String JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC = "platformChargebackLogic";
  private PlatformChargebackLogic platformChargebackLogic;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SPLITS = "splits";
  private List<Split> splits = null;

  public static final String JSON_PROPERTY_TENDER_REFERENCE = "tenderReference";
  private String tenderReference;

  public static final String JSON_PROPERTY_UNIQUE_TERMINAL_ID = "uniqueTerminalId";
  private String uniqueTerminalId;

  public TechnicalCancelRequest() { 
  }

  public TechnicalCancelRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public TechnicalCancelRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


 /**
  * This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.
  *
  * @param additionalData
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public TechnicalCancelRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


 /**
  * The merchant account that is used to process the payment.
  *
  * @param merchantAccount
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public TechnicalCancelRequest modificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
    return this;
  }

   /**
   * Get modificationAmount
   * @return modificationAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getModificationAmount() {
    return modificationAmount;
  }


 /**
  * modificationAmount
  *
  * @param modificationAmount
  */ 
  @JsonProperty(JSON_PROPERTY_MODIFICATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationAmount(Amount modificationAmount) {
    this.modificationAmount = modificationAmount;
  }


  public TechnicalCancelRequest mpiData(ThreeDSecureData mpiData) {
    this.mpiData = mpiData;
    return this;
  }

   /**
   * Get mpiData
   * @return mpiData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MPI_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSecureData getMpiData() {
    return mpiData;
  }


 /**
  * mpiData
  *
  * @param mpiData
  */ 
  @JsonProperty(JSON_PROPERTY_MPI_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMpiData(ThreeDSecureData mpiData) {
    this.mpiData = mpiData;
  }


  public TechnicalCancelRequest originalMerchantReference(String originalMerchantReference) {
    this.originalMerchantReference = originalMerchantReference;
    return this;
  }

   /**
   * The original merchant reference to cancel.
   * @return originalMerchantReference
  **/
  @ApiModelProperty(required = true, value = "The original merchant reference to cancel.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalMerchantReference() {
    return originalMerchantReference;
  }


 /**
  * The original merchant reference to cancel.
  *
  * @param originalMerchantReference
  */ 
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalMerchantReference(String originalMerchantReference) {
    this.originalMerchantReference = originalMerchantReference;
  }


  public TechnicalCancelRequest platformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    this.platformChargebackLogic = platformChargebackLogic;
    return this;
  }

   /**
   * Get platformChargebackLogic
   * @return platformChargebackLogic
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformChargebackLogic getPlatformChargebackLogic() {
    return platformChargebackLogic;
  }


 /**
  * platformChargebackLogic
  *
  * @param platformChargebackLogic
  */ 
  @JsonProperty(JSON_PROPERTY_PLATFORM_CHARGEBACK_LOGIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformChargebackLogic(PlatformChargebackLogic platformChargebackLogic) {
    this.platformChargebackLogic = platformChargebackLogic;
  }


  public TechnicalCancelRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public TechnicalCancelRequest splits(List<Split> splits) {
    this.splits = splits;
    return this;
  }

  public TechnicalCancelRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to split payments for [platforms](https://docs.adyen.com/platforms/automatic-split-configuration/).
   * @return splits
  **/
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to split payments for [platforms](https://docs.adyen.com/platforms/automatic-split-configuration/).")
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Split> getSplits() {
    return splits;
  }


 /**
  * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For more information, see how to split payments for [platforms](https://docs.adyen.com/platforms/automatic-split-configuration/).
  *
  * @param splits
  */ 
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }


  public TechnicalCancelRequest tenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
    return this;
  }

   /**
   * The transaction reference provided by the PED. For point-of-sale integrations only.
   * @return tenderReference
  **/
  @ApiModelProperty(value = "The transaction reference provided by the PED. For point-of-sale integrations only.")
  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenderReference() {
    return tenderReference;
  }


 /**
  * The transaction reference provided by the PED. For point-of-sale integrations only.
  *
  * @param tenderReference
  */ 
  @JsonProperty(JSON_PROPERTY_TENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
  }


  public TechnicalCancelRequest uniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
    return this;
  }

   /**
   * Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.
   * @return uniqueTerminalId
  **/
  @ApiModelProperty(value = "Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.")
  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueTerminalId() {
    return uniqueTerminalId;
  }


 /**
  * Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.
  *
  * @param uniqueTerminalId
  */ 
  @JsonProperty(JSON_PROPERTY_UNIQUE_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
  }


  /**
   * Return true if this TechnicalCancelRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalCancelRequest technicalCancelRequest = (TechnicalCancelRequest) o;
    return Objects.equals(this.additionalData, technicalCancelRequest.additionalData) &&
        Objects.equals(this.merchantAccount, technicalCancelRequest.merchantAccount) &&
        Objects.equals(this.modificationAmount, technicalCancelRequest.modificationAmount) &&
        Objects.equals(this.mpiData, technicalCancelRequest.mpiData) &&
        Objects.equals(this.originalMerchantReference, technicalCancelRequest.originalMerchantReference) &&
        Objects.equals(this.platformChargebackLogic, technicalCancelRequest.platformChargebackLogic) &&
        Objects.equals(this.reference, technicalCancelRequest.reference) &&
        Objects.equals(this.splits, technicalCancelRequest.splits) &&
        Objects.equals(this.tenderReference, technicalCancelRequest.tenderReference) &&
        Objects.equals(this.uniqueTerminalId, technicalCancelRequest.uniqueTerminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, merchantAccount, modificationAmount, mpiData, originalMerchantReference, platformChargebackLogic, reference, splits, tenderReference, uniqueTerminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalCancelRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    modificationAmount: ").append(toIndentedString(modificationAmount)).append("\n");
    sb.append("    mpiData: ").append(toIndentedString(mpiData)).append("\n");
    sb.append("    originalMerchantReference: ").append(toIndentedString(originalMerchantReference)).append("\n");
    sb.append("    platformChargebackLogic: ").append(toIndentedString(platformChargebackLogic)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
    sb.append("    tenderReference: ").append(toIndentedString(tenderReference)).append("\n");
    sb.append("    uniqueTerminalId: ").append(toIndentedString(uniqueTerminalId)).append("\n");
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
   * Create an instance of TechnicalCancelRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TechnicalCancelRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to TechnicalCancelRequest
   */
  public static TechnicalCancelRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TechnicalCancelRequest.class);
  }
/**
  * Convert an instance of TechnicalCancelRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

