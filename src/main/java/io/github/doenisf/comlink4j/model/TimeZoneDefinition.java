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

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import io.github.doenisf.JSON;

/**
 * TimeZoneDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class TimeZoneDefinition {
  public static final String SERIALIZED_NAME_TIME_ZONE_OFFSET_MINUTES = "timeZoneOffsetMinutes";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OFFSET_MINUTES)
  private Integer timeZoneOffsetMinutes;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public TimeZoneDefinition() {
  }

  public TimeZoneDefinition timeZoneOffsetMinutes(Integer timeZoneOffsetMinutes) {
    this.timeZoneOffsetMinutes = timeZoneOffsetMinutes;
    return this;
  }

  /**
   * Get timeZoneOffsetMinutes
   * @return timeZoneOffsetMinutes
   */
  @javax.annotation.Nullable
  public Integer getTimeZoneOffsetMinutes() {
    return timeZoneOffsetMinutes;
  }

  public void setTimeZoneOffsetMinutes(Integer timeZoneOffsetMinutes) {
    this.timeZoneOffsetMinutes = timeZoneOffsetMinutes;
  }


  public TimeZoneDefinition primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Get primary
   * @return primary
   */
  @javax.annotation.Nullable
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneDefinition timeZoneDefinition = (TimeZoneDefinition) o;
    return Objects.equals(this.timeZoneOffsetMinutes, timeZoneDefinition.timeZoneOffsetMinutes) &&
        Objects.equals(this.primary, timeZoneDefinition.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZoneOffsetMinutes, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneDefinition {\n");
    sb.append("    timeZoneOffsetMinutes: ").append(toIndentedString(timeZoneOffsetMinutes)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
    openapiFields.add("timeZoneOffsetMinutes");
    openapiFields.add("primary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeZoneDefinition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeZoneDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeZoneDefinition is not found in the empty JSON string", TimeZoneDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeZoneDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeZoneDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeZoneDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeZoneDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeZoneDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeZoneDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeZoneDefinition>() {
           @Override
           public void write(JsonWriter out, TimeZoneDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeZoneDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeZoneDefinition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeZoneDefinition
   * @throws IOException if the JSON string is invalid with respect to TimeZoneDefinition
   */
  public static TimeZoneDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeZoneDefinition.class);
  }

  /**
   * Convert an instance of TimeZoneDefinition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
