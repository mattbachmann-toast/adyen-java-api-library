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
 * AndroidApp
 */
@JsonPropertyOrder({
  AndroidApp.JSON_PROPERTY_DESCRIPTION,
  AndroidApp.JSON_PROPERTY_ERROR_CODE,
  AndroidApp.JSON_PROPERTY_ID,
  AndroidApp.JSON_PROPERTY_LABEL,
  AndroidApp.JSON_PROPERTY_PACKAGE_NAME,
  AndroidApp.JSON_PROPERTY_STATUS,
  AndroidApp.JSON_PROPERTY_VERSION_CODE,
  AndroidApp.JSON_PROPERTY_VERSION_NAME
})

public class AndroidApp {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_VERSION_CODE = "versionCode";
  private Integer versionCode;

  public static final String JSON_PROPERTY_VERSION_NAME = "versionName";
  private String versionName;

  public AndroidApp() { 
  }

  public AndroidApp description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description that was provided when uploading the app. The description is not shown on the terminal.
   * @return description
  **/
  @ApiModelProperty(value = "The description that was provided when uploading the app. The description is not shown on the terminal.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AndroidApp errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code of the app. It exists if the status is error or invalid.
   * @return errorCode
  **/
  @ApiModelProperty(value = "The error code of the app. It exists if the status is error or invalid.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public AndroidApp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the app.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the app.")
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


  public AndroidApp label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The app name that is shown on the terminal.
   * @return label
  **/
  @ApiModelProperty(value = "The app name that is shown on the terminal.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public AndroidApp packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * The package name that uniquely identifies the Android app.
   * @return packageName
  **/
  @ApiModelProperty(value = "The package name that uniquely identifies the Android app.")
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageName() {
    return packageName;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public AndroidApp status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the app. Possible values:  * &#x60;processing&#x60;: the app is being signed and converted to a format that the terminal can handle. * &#x60;error&#x60;: something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * &#x60;invalid&#x60;: there is something wrong with the APK file of the app. * &#x60;ready&#x60;: the app has been signed and converted. * &#x60;archived&#x60;: the app is no longer available.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the app. Possible values:  * `processing`: the app is being signed and converted to a format that the terminal can handle. * `error`: something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * `invalid`: there is something wrong with the APK file of the app. * `ready`: the app has been signed and converted. * `archived`: the app is no longer available.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public AndroidApp versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

   /**
   * The version number of the app.
   * @return versionCode
  **/
  @ApiModelProperty(value = "The version number of the app.")
  @JsonProperty(JSON_PROPERTY_VERSION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionCode() {
    return versionCode;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }


  public AndroidApp versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * The app version number that is shown on the terminal.
   * @return versionName
  **/
  @ApiModelProperty(value = "The app version number that is shown on the terminal.")
  @JsonProperty(JSON_PROPERTY_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionName() {
    return versionName;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }


  /**
   * Return true if this AndroidApp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndroidApp androidApp = (AndroidApp) o;
    return Objects.equals(this.description, androidApp.description) &&
        Objects.equals(this.errorCode, androidApp.errorCode) &&
        Objects.equals(this.id, androidApp.id) &&
        Objects.equals(this.label, androidApp.label) &&
        Objects.equals(this.packageName, androidApp.packageName) &&
        Objects.equals(this.status, androidApp.status) &&
        Objects.equals(this.versionCode, androidApp.versionCode) &&
        Objects.equals(this.versionName, androidApp.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, id, label, packageName, status, versionCode, versionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidApp {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
   * Create an instance of AndroidApp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AndroidApp
   * @throws JsonProcessingException if the JSON string is invalid with respect to AndroidApp
   */
  public static AndroidApp fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AndroidApp.class);
  }
/**
  * Convert an instance of AndroidApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

