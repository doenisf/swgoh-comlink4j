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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * EADPParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class EADPParameters {
  public static final String SERIALIZED_NAME_EADP_BASE_URL = "eadpBaseUrl";
  @SerializedName(SERIALIZED_NAME_EADP_BASE_URL)
  private String eadpBaseUrl;

  public static final String SERIALIZED_NAME_EA_MOBILE_CLIENT_ID = "eaMobileClientId";
  @SerializedName(SERIALIZED_NAME_EA_MOBILE_CLIENT_ID)
  private String eaMobileClientId;

  public static final String SERIALIZED_NAME_EADP_BASE_URL_CLIENT = "eadpBaseUrlClient";
  @SerializedName(SERIALIZED_NAME_EADP_BASE_URL_CLIENT)
  private String eadpBaseUrlClient;

  public EADPParameters() {
  }

  public EADPParameters eadpBaseUrl(String eadpBaseUrl) {
    this.eadpBaseUrl = eadpBaseUrl;
    return this;
  }

  /**
   * Get eadpBaseUrl
   * @return eadpBaseUrl
   */
  @javax.annotation.Nullable
  public String getEadpBaseUrl() {
    return eadpBaseUrl;
  }

  public void setEadpBaseUrl(String eadpBaseUrl) {
    this.eadpBaseUrl = eadpBaseUrl;
  }


  public EADPParameters eaMobileClientId(String eaMobileClientId) {
    this.eaMobileClientId = eaMobileClientId;
    return this;
  }

  /**
   * Get eaMobileClientId
   * @return eaMobileClientId
   */
  @javax.annotation.Nullable
  public String getEaMobileClientId() {
    return eaMobileClientId;
  }

  public void setEaMobileClientId(String eaMobileClientId) {
    this.eaMobileClientId = eaMobileClientId;
  }


  public EADPParameters eadpBaseUrlClient(String eadpBaseUrlClient) {
    this.eadpBaseUrlClient = eadpBaseUrlClient;
    return this;
  }

  /**
   * Get eadpBaseUrlClient
   * @return eadpBaseUrlClient
   */
  @javax.annotation.Nullable
  public String getEadpBaseUrlClient() {
    return eadpBaseUrlClient;
  }

  public void setEadpBaseUrlClient(String eadpBaseUrlClient) {
    this.eadpBaseUrlClient = eadpBaseUrlClient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EADPParameters eaDPParameters = (EADPParameters) o;
    return Objects.equals(this.eadpBaseUrl, eaDPParameters.eadpBaseUrl) &&
        Objects.equals(this.eaMobileClientId, eaDPParameters.eaMobileClientId) &&
        Objects.equals(this.eadpBaseUrlClient, eaDPParameters.eadpBaseUrlClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eadpBaseUrl, eaMobileClientId, eadpBaseUrlClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EADPParameters {\n");
    sb.append("    eadpBaseUrl: ").append(toIndentedString(eadpBaseUrl)).append("\n");
    sb.append("    eaMobileClientId: ").append(toIndentedString(eaMobileClientId)).append("\n");
    sb.append("    eadpBaseUrlClient: ").append(toIndentedString(eadpBaseUrlClient)).append("\n");
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
    openapiFields.add("eadpBaseUrl");
    openapiFields.add("eaMobileClientId");
    openapiFields.add("eadpBaseUrlClient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EADPParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EADPParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EADPParameters is not found in the empty JSON string", EADPParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EADPParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EADPParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eadpBaseUrl") != null && !jsonObj.get("eadpBaseUrl").isJsonNull()) && !jsonObj.get("eadpBaseUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eadpBaseUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eadpBaseUrl").toString()));
      }
      if ((jsonObj.get("eaMobileClientId") != null && !jsonObj.get("eaMobileClientId").isJsonNull()) && !jsonObj.get("eaMobileClientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eaMobileClientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eaMobileClientId").toString()));
      }
      if ((jsonObj.get("eadpBaseUrlClient") != null && !jsonObj.get("eadpBaseUrlClient").isJsonNull()) && !jsonObj.get("eadpBaseUrlClient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eadpBaseUrlClient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eadpBaseUrlClient").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EADPParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EADPParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EADPParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EADPParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<EADPParameters>() {
           @Override
           public void write(JsonWriter out, EADPParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EADPParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EADPParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EADPParameters
   * @throws IOException if the JSON string is invalid with respect to EADPParameters
   */
  public static EADPParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EADPParameters.class);
  }

  /**
   * Convert an instance of EADPParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
