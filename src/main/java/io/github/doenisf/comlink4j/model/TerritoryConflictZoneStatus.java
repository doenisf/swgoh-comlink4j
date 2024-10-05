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
import io.github.doenisf.comlink4j.TerritoryZoneStatus;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import io.github.doenisf.JSON;

/**
 * TerritoryConflictZoneStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class TerritoryConflictZoneStatus {
  public static final String SERIALIZED_NAME_ZONE_STATUS = "zoneStatus";
  @SerializedName(SERIALIZED_NAME_ZONE_STATUS)
  private TerritoryZoneStatus zoneStatus;

  public TerritoryConflictZoneStatus() {
  }

  public TerritoryConflictZoneStatus zoneStatus(TerritoryZoneStatus zoneStatus) {
    this.zoneStatus = zoneStatus;
    return this;
  }

  /**
   * Get zoneStatus
   * @return zoneStatus
   */
  @javax.annotation.Nullable
  public TerritoryZoneStatus getZoneStatus() {
    return zoneStatus;
  }

  public void setZoneStatus(TerritoryZoneStatus zoneStatus) {
    this.zoneStatus = zoneStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerritoryConflictZoneStatus territoryConflictZoneStatus = (TerritoryConflictZoneStatus) o;
    return Objects.equals(this.zoneStatus, territoryConflictZoneStatus.zoneStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerritoryConflictZoneStatus {\n");
    sb.append("    zoneStatus: ").append(toIndentedString(zoneStatus)).append("\n");
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
    openapiFields.add("zoneStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerritoryConflictZoneStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerritoryConflictZoneStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerritoryConflictZoneStatus is not found in the empty JSON string", TerritoryConflictZoneStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerritoryConflictZoneStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerritoryConflictZoneStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `zoneStatus`
      if (jsonObj.get("zoneStatus") != null && !jsonObj.get("zoneStatus").isJsonNull()) {
        TerritoryZoneStatus.validateJsonElement(jsonObj.get("zoneStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerritoryConflictZoneStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerritoryConflictZoneStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerritoryConflictZoneStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerritoryConflictZoneStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TerritoryConflictZoneStatus>() {
           @Override
           public void write(JsonWriter out, TerritoryConflictZoneStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerritoryConflictZoneStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerritoryConflictZoneStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerritoryConflictZoneStatus
   * @throws IOException if the JSON string is invalid with respect to TerritoryConflictZoneStatus
   */
  public static TerritoryConflictZoneStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerritoryConflictZoneStatus.class);
  }

  /**
   * Convert an instance of TerritoryConflictZoneStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
