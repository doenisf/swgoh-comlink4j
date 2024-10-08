/*
 * swgoh-comlink
 * An API for sending requests to Star Wars Galaxy of Heroes' game services
 *
 * The version of the OpenAPI document: 0.34.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.doenisf.comlink4j.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.doenisf.comlink4j.JSON;

/**
 * GetMetaDataRequestPayloadClientSpecs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GetMetaDataRequestPayloadClientSpecs {
  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_EXTERNAL_VERSION = "externalVersion";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_VERSION)
  private String externalVersion;

  public static final String SERIALIZED_NAME_INTERNAL_VERSION = "internalVersion";
  @SerializedName(SERIALIZED_NAME_INTERNAL_VERSION)
  private String internalVersion;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public GetMetaDataRequestPayloadClientSpecs() {
  }

  public GetMetaDataRequestPayloadClientSpecs platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public GetMetaDataRequestPayloadClientSpecs bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
   */
  @javax.annotation.Nullable
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public GetMetaDataRequestPayloadClientSpecs externalVersion(String externalVersion) {
    this.externalVersion = externalVersion;
    return this;
  }

  /**
   * Get externalVersion
   * @return externalVersion
   */
  @javax.annotation.Nullable
  public String getExternalVersion() {
    return externalVersion;
  }

  public void setExternalVersion(String externalVersion) {
    this.externalVersion = externalVersion;
  }


  public GetMetaDataRequestPayloadClientSpecs internalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
    return this;
  }

  /**
   * Get internalVersion
   * @return internalVersion
   */
  @javax.annotation.Nullable
  public String getInternalVersion() {
    return internalVersion;
  }

  public void setInternalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
  }


  public GetMetaDataRequestPayloadClientSpecs region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GetMetaDataRequestPayloadClientSpecs instance itself
   */
  public GetMetaDataRequestPayloadClientSpecs putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMetaDataRequestPayloadClientSpecs getMetaDataRequestPayloadClientSpecs = (GetMetaDataRequestPayloadClientSpecs) o;
    return Objects.equals(this.platform, getMetaDataRequestPayloadClientSpecs.platform) &&
        Objects.equals(this.bundleId, getMetaDataRequestPayloadClientSpecs.bundleId) &&
        Objects.equals(this.externalVersion, getMetaDataRequestPayloadClientSpecs.externalVersion) &&
        Objects.equals(this.internalVersion, getMetaDataRequestPayloadClientSpecs.internalVersion) &&
        Objects.equals(this.region, getMetaDataRequestPayloadClientSpecs.region)&&
        Objects.equals(this.additionalProperties, getMetaDataRequestPayloadClientSpecs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, bundleId, externalVersion, internalVersion, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMetaDataRequestPayloadClientSpecs {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    externalVersion: ").append(toIndentedString(externalVersion)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("platform");
    openapiFields.add("bundleId");
    openapiFields.add("externalVersion");
    openapiFields.add("internalVersion");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMetaDataRequestPayloadClientSpecs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMetaDataRequestPayloadClientSpecs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMetaDataRequestPayloadClientSpecs is not found in the empty JSON string", GetMetaDataRequestPayloadClientSpecs.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("bundleId") != null && !jsonObj.get("bundleId").isJsonNull()) && !jsonObj.get("bundleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundleId").toString()));
      }
      if ((jsonObj.get("externalVersion") != null && !jsonObj.get("externalVersion").isJsonNull()) && !jsonObj.get("externalVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalVersion").toString()));
      }
      if ((jsonObj.get("internalVersion") != null && !jsonObj.get("internalVersion").isJsonNull()) && !jsonObj.get("internalVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalVersion").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMetaDataRequestPayloadClientSpecs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMetaDataRequestPayloadClientSpecs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMetaDataRequestPayloadClientSpecs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMetaDataRequestPayloadClientSpecs.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMetaDataRequestPayloadClientSpecs>() {
           @Override
           public void write(JsonWriter out, GetMetaDataRequestPayloadClientSpecs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMetaDataRequestPayloadClientSpecs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetMetaDataRequestPayloadClientSpecs instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetMetaDataRequestPayloadClientSpecs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMetaDataRequestPayloadClientSpecs
   * @throws IOException if the JSON string is invalid with respect to GetMetaDataRequestPayloadClientSpecs
   */
  public static GetMetaDataRequestPayloadClientSpecs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMetaDataRequestPayloadClientSpecs.class);
  }

  /**
   * Convert an instance of GetMetaDataRequestPayloadClientSpecs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

