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
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import io.github.doenisf.JSON;

/**
 * GetGuildRequestPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GetGuildRequestPayload {
  public static final String SERIALIZED_NAME_GUILD_ID = "guildId";
  @SerializedName(SERIALIZED_NAME_GUILD_ID)
  private String guildId;

  public static final String SERIALIZED_NAME_INCLUDE_RECENT_GUILD_ACTIVITY_INFO = "includeRecentGuildActivityInfo";
  @SerializedName(SERIALIZED_NAME_INCLUDE_RECENT_GUILD_ACTIVITY_INFO)
  private Boolean includeRecentGuildActivityInfo = false;

  public GetGuildRequestPayload() {
  }

  public GetGuildRequestPayload guildId(String guildId) {
    this.guildId = guildId;
    return this;
  }

  /**
   * Get guildId
   * @return guildId
   */
  @javax.annotation.Nonnull
  public String getGuildId() {
    return guildId;
  }

  public void setGuildId(String guildId) {
    this.guildId = guildId;
  }


  public GetGuildRequestPayload includeRecentGuildActivityInfo(Boolean includeRecentGuildActivityInfo) {
    this.includeRecentGuildActivityInfo = includeRecentGuildActivityInfo;
    return this;
  }

  /**
   * Get includeRecentGuildActivityInfo
   * @return includeRecentGuildActivityInfo
   */
  @javax.annotation.Nullable
  public Boolean getIncludeRecentGuildActivityInfo() {
    return includeRecentGuildActivityInfo;
  }

  public void setIncludeRecentGuildActivityInfo(Boolean includeRecentGuildActivityInfo) {
    this.includeRecentGuildActivityInfo = includeRecentGuildActivityInfo;
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
   * @return the GetGuildRequestPayload instance itself
   */
  public GetGuildRequestPayload putAdditionalProperty(String key, Object value) {
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
    GetGuildRequestPayload getGuildRequestPayload = (GetGuildRequestPayload) o;
    return Objects.equals(this.guildId, getGuildRequestPayload.guildId) &&
        Objects.equals(this.includeRecentGuildActivityInfo, getGuildRequestPayload.includeRecentGuildActivityInfo)&&
        Objects.equals(this.additionalProperties, getGuildRequestPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guildId, includeRecentGuildActivityInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGuildRequestPayload {\n");
    sb.append("    guildId: ").append(toIndentedString(guildId)).append("\n");
    sb.append("    includeRecentGuildActivityInfo: ").append(toIndentedString(includeRecentGuildActivityInfo)).append("\n");
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
    openapiFields.add("guildId");
    openapiFields.add("includeRecentGuildActivityInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("guildId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetGuildRequestPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGuildRequestPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGuildRequestPayload is not found in the empty JSON string", GetGuildRequestPayload.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGuildRequestPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("guildId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guildId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guildId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGuildRequestPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGuildRequestPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGuildRequestPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGuildRequestPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGuildRequestPayload>() {
           @Override
           public void write(JsonWriter out, GetGuildRequestPayload value) throws IOException {
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
           public GetGuildRequestPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetGuildRequestPayload instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of GetGuildRequestPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetGuildRequestPayload
   * @throws IOException if the JSON string is invalid with respect to GetGuildRequestPayload
   */
  public static GetGuildRequestPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGuildRequestPayload.class);
  }

  /**
   * Convert an instance of GetGuildRequestPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
