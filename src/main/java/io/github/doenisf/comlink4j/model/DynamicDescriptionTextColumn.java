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
import io.github.doenisf.comlink4j.model.DynamicDescriptionTextAlignmentType;
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
 * DynamicDescriptionTextColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class DynamicDescriptionTextColumn {
  public static final String SERIALIZED_NAME_HEADER_KEY = "headerKey";
  @SerializedName(SERIALIZED_NAME_HEADER_KEY)
  private String headerKey;

  public static final String SERIALIZED_NAME_BODY_KEY = "bodyKey";
  @SerializedName(SERIALIZED_NAME_BODY_KEY)
  private String bodyKey;

  public static final String SERIALIZED_NAME_BODY_ALIGNMENT = "bodyAlignment";
  @SerializedName(SERIALIZED_NAME_BODY_ALIGNMENT)
  private DynamicDescriptionTextAlignmentType bodyAlignment;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DynamicDescriptionTextColumn() {
  }

  public DynamicDescriptionTextColumn headerKey(String headerKey) {
    this.headerKey = headerKey;
    return this;
  }

  /**
   * Get headerKey
   * @return headerKey
   */
  @javax.annotation.Nullable
  public String getHeaderKey() {
    return headerKey;
  }

  public void setHeaderKey(String headerKey) {
    this.headerKey = headerKey;
  }


  public DynamicDescriptionTextColumn bodyKey(String bodyKey) {
    this.bodyKey = bodyKey;
    return this;
  }

  /**
   * Get bodyKey
   * @return bodyKey
   */
  @javax.annotation.Nullable
  public String getBodyKey() {
    return bodyKey;
  }

  public void setBodyKey(String bodyKey) {
    this.bodyKey = bodyKey;
  }


  public DynamicDescriptionTextColumn bodyAlignment(DynamicDescriptionTextAlignmentType bodyAlignment) {
    this.bodyAlignment = bodyAlignment;
    return this;
  }

  /**
   * Get bodyAlignment
   * @return bodyAlignment
   */
  @javax.annotation.Nullable
  public DynamicDescriptionTextAlignmentType getBodyAlignment() {
    return bodyAlignment;
  }

  public void setBodyAlignment(DynamicDescriptionTextAlignmentType bodyAlignment) {
    this.bodyAlignment = bodyAlignment;
  }


  public DynamicDescriptionTextColumn tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicDescriptionTextColumn dynamicDescriptionTextColumn = (DynamicDescriptionTextColumn) o;
    return Objects.equals(this.headerKey, dynamicDescriptionTextColumn.headerKey) &&
        Objects.equals(this.bodyKey, dynamicDescriptionTextColumn.bodyKey) &&
        Objects.equals(this.bodyAlignment, dynamicDescriptionTextColumn.bodyAlignment) &&
        Objects.equals(this.tag, dynamicDescriptionTextColumn.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerKey, bodyKey, bodyAlignment, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicDescriptionTextColumn {\n");
    sb.append("    headerKey: ").append(toIndentedString(headerKey)).append("\n");
    sb.append("    bodyKey: ").append(toIndentedString(bodyKey)).append("\n");
    sb.append("    bodyAlignment: ").append(toIndentedString(bodyAlignment)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("headerKey");
    openapiFields.add("bodyKey");
    openapiFields.add("bodyAlignment");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicDescriptionTextColumn
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicDescriptionTextColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicDescriptionTextColumn is not found in the empty JSON string", DynamicDescriptionTextColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicDescriptionTextColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicDescriptionTextColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("headerKey") != null && !jsonObj.get("headerKey").isJsonNull()) && !jsonObj.get("headerKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headerKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headerKey").toString()));
      }
      if ((jsonObj.get("bodyKey") != null && !jsonObj.get("bodyKey").isJsonNull()) && !jsonObj.get("bodyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bodyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bodyKey").toString()));
      }
      // validate the optional field `bodyAlignment`
      if (jsonObj.get("bodyAlignment") != null && !jsonObj.get("bodyAlignment").isJsonNull()) {
        DynamicDescriptionTextAlignmentType.validateJsonElement(jsonObj.get("bodyAlignment"));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicDescriptionTextColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicDescriptionTextColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicDescriptionTextColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicDescriptionTextColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicDescriptionTextColumn>() {
           @Override
           public void write(JsonWriter out, DynamicDescriptionTextColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicDescriptionTextColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicDescriptionTextColumn given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicDescriptionTextColumn
   * @throws IOException if the JSON string is invalid with respect to DynamicDescriptionTextColumn
   */
  public static DynamicDescriptionTextColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicDescriptionTextColumn.class);
  }

  /**
   * Convert an instance of DynamicDescriptionTextColumn to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

