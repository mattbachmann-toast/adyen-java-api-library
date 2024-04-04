/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.DeliveryMethod;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaypalUpdateOrderRequest
 */
@JsonPropertyOrder({
  PaypalUpdateOrderRequest.JSON_PROPERTY_AMOUNT,
  PaypalUpdateOrderRequest.JSON_PROPERTY_DELIVERY_METHODS,
  PaypalUpdateOrderRequest.JSON_PROPERTY_PAYMENT_DATA,
  PaypalUpdateOrderRequest.JSON_PROPERTY_PSP_REFERENCE,
  PaypalUpdateOrderRequest.JSON_PROPERTY_SESSION_ID
})

public class PaypalUpdateOrderRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_DELIVERY_METHODS = "deliveryMethods";
  private List<DeliveryMethod> deliveryMethods = null;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private String sessionId;

  public PaypalUpdateOrderRequest() { 
  }

  public PaypalUpdateOrderRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


 /**
  * amount
  *
  * @param amount
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PaypalUpdateOrderRequest deliveryMethods(List<DeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public PaypalUpdateOrderRequest addDeliveryMethodsItem(DeliveryMethod deliveryMethodsItem) {
    if (this.deliveryMethods == null) {
      this.deliveryMethods = new ArrayList<>();
    }
    this.deliveryMethods.add(deliveryMethodsItem);
    return this;
  }

   /**
   * The list of new delivery methods and the cost of each.
   * @return deliveryMethods
  **/
  @ApiModelProperty(value = "The list of new delivery methods and the cost of each.")
  @JsonProperty(JSON_PROPERTY_DELIVERY_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeliveryMethod> getDeliveryMethods() {
    return deliveryMethods;
  }


 /**
  * The list of new delivery methods and the cost of each.
  *
  * @param deliveryMethods
  */ 
  @JsonProperty(JSON_PROPERTY_DELIVERY_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryMethods(List<DeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }


  public PaypalUpdateOrderRequest paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * The &#x60;paymentData&#x60; from the client side. This value changes every time you make a &#x60;/paypal/updateOrder&#x60; request.
   * @return paymentData
  **/
  @ApiModelProperty(value = "The `paymentData` from the client side. This value changes every time you make a `/paypal/updateOrder` request.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentData() {
    return paymentData;
  }


 /**
  * The &#x60;paymentData&#x60; from the client side. This value changes every time you make a &#x60;/paypal/updateOrder&#x60; request.
  *
  * @param paymentData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public PaypalUpdateOrderRequest pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The original &#x60;pspReference&#x60; from the &#x60;/payments&#x60; response.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The original `pspReference` from the `/payments` response.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


 /**
  * The original &#x60;pspReference&#x60; from the &#x60;/payments&#x60; response.
  *
  * @param pspReference
  */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaypalUpdateOrderRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The original &#x60;sessionId&#x60; from the &#x60;/sessions&#x60; response.
   * @return sessionId
  **/
  @ApiModelProperty(value = "The original `sessionId` from the `/sessions` response.")
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionId() {
    return sessionId;
  }


 /**
  * The original &#x60;sessionId&#x60; from the &#x60;/sessions&#x60; response.
  *
  * @param sessionId
  */ 
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Return true if this PaypalUpdateOrderRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaypalUpdateOrderRequest paypalUpdateOrderRequest = (PaypalUpdateOrderRequest) o;
    return Objects.equals(this.amount, paypalUpdateOrderRequest.amount) &&
        Objects.equals(this.deliveryMethods, paypalUpdateOrderRequest.deliveryMethods) &&
        Objects.equals(this.paymentData, paypalUpdateOrderRequest.paymentData) &&
        Objects.equals(this.pspReference, paypalUpdateOrderRequest.pspReference) &&
        Objects.equals(this.sessionId, paypalUpdateOrderRequest.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, deliveryMethods, paymentData, pspReference, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaypalUpdateOrderRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deliveryMethods: ").append(toIndentedString(deliveryMethods)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
   * Create an instance of PaypalUpdateOrderRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaypalUpdateOrderRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaypalUpdateOrderRequest
   */
  public static PaypalUpdateOrderRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaypalUpdateOrderRequest.class);
  }
/**
  * Convert an instance of PaypalUpdateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

