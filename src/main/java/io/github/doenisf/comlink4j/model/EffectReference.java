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
import java.util.ArrayList;
import java.util.List;

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
 * EffectReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class EffectReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTEXT_INDEX = "contextIndex";
  @SerializedName(SERIALIZED_NAME_CONTEXT_INDEX)
  private List<Integer> contextIndex = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_BONUS_MOVE = "maxBonusMove";
  @SerializedName(SERIALIZED_NAME_MAX_BONUS_MOVE)
  private Integer maxBonusMove;

  public EffectReference() {
  }

  public EffectReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public EffectReference contextIndex(List<Integer> contextIndex) {
    this.contextIndex = contextIndex;
    return this;
  }

  public EffectReference addContextIndexItem(Integer contextIndexItem) {
    if (this.contextIndex == null) {
      this.contextIndex = new ArrayList<>();
    }
    this.contextIndex.add(contextIndexItem);
    return this;
  }

  /**
   * Get contextIndex
   * @return contextIndex
   */
  @javax.annotation.Nullable
  public List<Integer> getContextIndex() {
    return contextIndex;
  }

  public void setContextIndex(List<Integer> contextIndex) {
    this.contextIndex = contextIndex;
  }


  public EffectReference maxBonusMove(Integer maxBonusMove) {
    this.maxBonusMove = maxBonusMove;
    return this;
  }

  /**
   * Get maxBonusMove
   * @return maxBonusMove
   */
  @javax.annotation.Nullable
  public Integer getMaxBonusMove() {
    return maxBonusMove;
  }

  public void setMaxBonusMove(Integer maxBonusMove) {
    this.maxBonusMove = maxBonusMove;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectReference effectReference = (EffectReference) o;
    return Objects.equals(this.id, effectReference.id) &&
        Objects.equals(this.contextIndex, effectReference.contextIndex) &&
        Objects.equals(this.maxBonusMove, effectReference.maxBonusMove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contextIndex, maxBonusMove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contextIndex: ").append(toIndentedString(contextIndex)).append("\n");
    sb.append("    maxBonusMove: ").append(toIndentedString(maxBonusMove)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("contextIndex");
    openapiFields.add("maxBonusMove");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EffectReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EffectReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EffectReference is not found in the empty JSON string", EffectReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EffectReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EffectReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("contextIndex") != null && !jsonObj.get("contextIndex").isJsonNull() && !jsonObj.get("contextIndex").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextIndex` to be an array in the JSON string but got `%s`", jsonObj.get("contextIndex").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EffectReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EffectReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EffectReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EffectReference.class));

       return (TypeAdapter<T>) new TypeAdapter<EffectReference>() {
           @Override
           public void write(JsonWriter out, EffectReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EffectReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EffectReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EffectReference
   * @throws IOException if the JSON string is invalid with respect to EffectReference
   */
  public static EffectReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EffectReference.class);
  }

  /**
   * Convert an instance of EffectReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
