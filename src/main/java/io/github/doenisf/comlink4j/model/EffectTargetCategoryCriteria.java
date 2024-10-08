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
import io.github.doenisf.comlink4j.model.EffectTargetCategory;
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
 * EffectTargetCategoryCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class EffectTargetCategoryCriteria {
  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private Boolean exclude;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private List<String> categoryId = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<EffectTargetCategory> category = new ArrayList<>();

  public EffectTargetCategoryCriteria() {
  }

  public EffectTargetCategoryCriteria exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Get exclude
   * @return exclude
   */
  @javax.annotation.Nullable
  public Boolean getExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }


  public EffectTargetCategoryCriteria categoryId(List<String> categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public EffectTargetCategoryCriteria addCategoryIdItem(String categoryIdItem) {
    if (this.categoryId == null) {
      this.categoryId = new ArrayList<>();
    }
    this.categoryId.add(categoryIdItem);
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
   */
  @javax.annotation.Nullable
  public List<String> getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(List<String> categoryId) {
    this.categoryId = categoryId;
  }


  public EffectTargetCategoryCriteria category(List<EffectTargetCategory> category) {
    this.category = category;
    return this;
  }

  public EffectTargetCategoryCriteria addCategoryItem(EffectTargetCategory categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  public List<EffectTargetCategory> getCategory() {
    return category;
  }

  public void setCategory(List<EffectTargetCategory> category) {
    this.category = category;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectTargetCategoryCriteria effectTargetCategoryCriteria = (EffectTargetCategoryCriteria) o;
    return Objects.equals(this.exclude, effectTargetCategoryCriteria.exclude) &&
        Objects.equals(this.categoryId, effectTargetCategoryCriteria.categoryId) &&
        Objects.equals(this.category, effectTargetCategoryCriteria.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, categoryId, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectTargetCategoryCriteria {\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("exclude");
    openapiFields.add("categoryId");
    openapiFields.add("category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EffectTargetCategoryCriteria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EffectTargetCategoryCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EffectTargetCategoryCriteria is not found in the empty JSON string", EffectTargetCategoryCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EffectTargetCategoryCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EffectTargetCategoryCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("categoryId") != null && !jsonObj.get("categoryId").isJsonNull() && !jsonObj.get("categoryId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryId` to be an array in the JSON string but got `%s`", jsonObj.get("categoryId").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        JsonArray jsonArraycategory = jsonObj.getAsJsonArray("category");
        if (jsonArraycategory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("category").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
          }

          // validate the optional field `category` (array)
          for (int i = 0; i < jsonArraycategory.size(); i++) {
            EffectTargetCategory.validateJsonElement(jsonArraycategory.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EffectTargetCategoryCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EffectTargetCategoryCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EffectTargetCategoryCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EffectTargetCategoryCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<EffectTargetCategoryCriteria>() {
           @Override
           public void write(JsonWriter out, EffectTargetCategoryCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EffectTargetCategoryCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EffectTargetCategoryCriteria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EffectTargetCategoryCriteria
   * @throws IOException if the JSON string is invalid with respect to EffectTargetCategoryCriteria
   */
  public static EffectTargetCategoryCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EffectTargetCategoryCriteria.class);
  }

  /**
   * Convert an instance of EffectTargetCategoryCriteria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

