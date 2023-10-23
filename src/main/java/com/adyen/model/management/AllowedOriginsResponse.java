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
import com.adyen.model.management.AllowedOrigin;
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
 * AllowedOriginsResponse
 */
@JsonPropertyOrder({
  AllowedOriginsResponse.JSON_PROPERTY_DATA
})

public class AllowedOriginsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<AllowedOrigin> data = null;

  public AllowedOriginsResponse() { 
  }

  public AllowedOriginsResponse data(List<AllowedOrigin> data) {
    this.data = data;
    return this;
  }

  public AllowedOriginsResponse addDataItem(AllowedOrigin dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of allowed origins.
   * @return data
  **/
  @ApiModelProperty(value = "List of allowed origins.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AllowedOrigin> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<AllowedOrigin> data) {
    this.data = data;
  }


  /**
   * Return true if this AllowedOriginsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedOriginsResponse allowedOriginsResponse = (AllowedOriginsResponse) o;
    return Objects.equals(this.data, allowedOriginsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedOriginsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of AllowedOriginsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AllowedOriginsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to AllowedOriginsResponse
   */
  public static AllowedOriginsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AllowedOriginsResponse.class);
  }
/**
  * Convert an instance of AllowedOriginsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

