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
import io.github.doenisf.comlink4j.model.ContextualStoreItem;
import io.github.doenisf.comlink4j.model.LinkedStoreItemType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * LinkedStoreItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class LinkedStoreItem {
  public static final String SERIALIZED_NAME_LINK_ID = "linkId";
  @SerializedName(SERIALIZED_NAME_LINK_ID)
  private String linkId;

  public static final String SERIALIZED_NAME_STORE_ITEM = "storeItem";
  @SerializedName(SERIALIZED_NAME_STORE_ITEM)
  private List<String> storeItem = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LinkedStoreItemType type;

  public static final String SERIALIZED_NAME_CONTEXTUAL_STORE_ITEM = "contextualStoreItem";
  @SerializedName(SERIALIZED_NAME_CONTEXTUAL_STORE_ITEM)
  private List<ContextualStoreItem> contextualStoreItem = new ArrayList<>();

  public LinkedStoreItem() {
  }

  public LinkedStoreItem linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * Get linkId
   * @return linkId
   */
  @javax.annotation.Nullable
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  public LinkedStoreItem storeItem(List<String> storeItem) {
    this.storeItem = storeItem;
    return this;
  }

  public LinkedStoreItem addStoreItemItem(String storeItemItem) {
    if (this.storeItem == null) {
      this.storeItem = new ArrayList<>();
    }
    this.storeItem.add(storeItemItem);
    return this;
  }

  /**
   * Get storeItem
   * @return storeItem
   */
  @javax.annotation.Nullable
  public List<String> getStoreItem() {
    return storeItem;
  }

  public void setStoreItem(List<String> storeItem) {
    this.storeItem = storeItem;
  }


  public LinkedStoreItem type(LinkedStoreItemType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public LinkedStoreItemType getType() {
    return type;
  }

  public void setType(LinkedStoreItemType type) {
    this.type = type;
  }


  public LinkedStoreItem contextualStoreItem(List<ContextualStoreItem> contextualStoreItem) {
    this.contextualStoreItem = contextualStoreItem;
    return this;
  }

  public LinkedStoreItem addContextualStoreItemItem(ContextualStoreItem contextualStoreItemItem) {
    if (this.contextualStoreItem == null) {
      this.contextualStoreItem = new ArrayList<>();
    }
    this.contextualStoreItem.add(contextualStoreItemItem);
    return this;
  }

  /**
   * Get contextualStoreItem
   * @return contextualStoreItem
   */
  @javax.annotation.Nullable
  public List<ContextualStoreItem> getContextualStoreItem() {
    return contextualStoreItem;
  }

  public void setContextualStoreItem(List<ContextualStoreItem> contextualStoreItem) {
    this.contextualStoreItem = contextualStoreItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedStoreItem linkedStoreItem = (LinkedStoreItem) o;
    return Objects.equals(this.linkId, linkedStoreItem.linkId) &&
        Objects.equals(this.storeItem, linkedStoreItem.storeItem) &&
        Objects.equals(this.type, linkedStoreItem.type) &&
        Objects.equals(this.contextualStoreItem, linkedStoreItem.contextualStoreItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, storeItem, type, contextualStoreItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedStoreItem {\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    storeItem: ").append(toIndentedString(storeItem)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contextualStoreItem: ").append(toIndentedString(contextualStoreItem)).append("\n");
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
    openapiFields.add("linkId");
    openapiFields.add("storeItem");
    openapiFields.add("type");
    openapiFields.add("contextualStoreItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinkedStoreItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinkedStoreItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkedStoreItem is not found in the empty JSON string", LinkedStoreItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinkedStoreItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkedStoreItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("linkId") != null && !jsonObj.get("linkId").isJsonNull()) && !jsonObj.get("linkId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("storeItem") != null && !jsonObj.get("storeItem").isJsonNull() && !jsonObj.get("storeItem").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeItem` to be an array in the JSON string but got `%s`", jsonObj.get("storeItem").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        LinkedStoreItemType.validateJsonElement(jsonObj.get("type"));
      }
      if (jsonObj.get("contextualStoreItem") != null && !jsonObj.get("contextualStoreItem").isJsonNull()) {
        JsonArray jsonArraycontextualStoreItem = jsonObj.getAsJsonArray("contextualStoreItem");
        if (jsonArraycontextualStoreItem != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contextualStoreItem").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contextualStoreItem` to be an array in the JSON string but got `%s`", jsonObj.get("contextualStoreItem").toString()));
          }

          // validate the optional field `contextualStoreItem` (array)
          for (int i = 0; i < jsonArraycontextualStoreItem.size(); i++) {
            ContextualStoreItem.validateJsonElement(jsonArraycontextualStoreItem.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkedStoreItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkedStoreItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkedStoreItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkedStoreItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkedStoreItem>() {
           @Override
           public void write(JsonWriter out, LinkedStoreItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkedStoreItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinkedStoreItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinkedStoreItem
   * @throws IOException if the JSON string is invalid with respect to LinkedStoreItem
   */
  public static LinkedStoreItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkedStoreItem.class);
  }

  /**
   * Convert an instance of LinkedStoreItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

