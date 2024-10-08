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
 * StorePromoDialog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class StorePromoDialog {
  public static final String SERIALIZED_NAME_STORE_ITEM_ID = "storeItemId";
  @SerializedName(SERIALIZED_NAME_STORE_ITEM_ID)
  private String storeItemId;

  public static final String SERIALIZED_NAME_DESCRIPTION_TEXTURE = "descriptionTexture";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_TEXTURE)
  private String descriptionTexture;

  public static final String SERIALIZED_NAME_BUTTON_KEY = "buttonKey";
  @SerializedName(SERIALIZED_NAME_BUTTON_KEY)
  private String buttonKey;

  public static final String SERIALIZED_NAME_SHOW_PRICE = "showPrice";
  @SerializedName(SERIALIZED_NAME_SHOW_PRICE)
  private Boolean showPrice;

  public StorePromoDialog() {
  }

  public StorePromoDialog storeItemId(String storeItemId) {
    this.storeItemId = storeItemId;
    return this;
  }

  /**
   * Get storeItemId
   * @return storeItemId
   */
  @javax.annotation.Nullable
  public String getStoreItemId() {
    return storeItemId;
  }

  public void setStoreItemId(String storeItemId) {
    this.storeItemId = storeItemId;
  }


  public StorePromoDialog descriptionTexture(String descriptionTexture) {
    this.descriptionTexture = descriptionTexture;
    return this;
  }

  /**
   * Get descriptionTexture
   * @return descriptionTexture
   */
  @javax.annotation.Nullable
  public String getDescriptionTexture() {
    return descriptionTexture;
  }

  public void setDescriptionTexture(String descriptionTexture) {
    this.descriptionTexture = descriptionTexture;
  }


  public StorePromoDialog buttonKey(String buttonKey) {
    this.buttonKey = buttonKey;
    return this;
  }

  /**
   * Get buttonKey
   * @return buttonKey
   */
  @javax.annotation.Nullable
  public String getButtonKey() {
    return buttonKey;
  }

  public void setButtonKey(String buttonKey) {
    this.buttonKey = buttonKey;
  }


  public StorePromoDialog showPrice(Boolean showPrice) {
    this.showPrice = showPrice;
    return this;
  }

  /**
   * Get showPrice
   * @return showPrice
   */
  @javax.annotation.Nullable
  public Boolean getShowPrice() {
    return showPrice;
  }

  public void setShowPrice(Boolean showPrice) {
    this.showPrice = showPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorePromoDialog storePromoDialog = (StorePromoDialog) o;
    return Objects.equals(this.storeItemId, storePromoDialog.storeItemId) &&
        Objects.equals(this.descriptionTexture, storePromoDialog.descriptionTexture) &&
        Objects.equals(this.buttonKey, storePromoDialog.buttonKey) &&
        Objects.equals(this.showPrice, storePromoDialog.showPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeItemId, descriptionTexture, buttonKey, showPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorePromoDialog {\n");
    sb.append("    storeItemId: ").append(toIndentedString(storeItemId)).append("\n");
    sb.append("    descriptionTexture: ").append(toIndentedString(descriptionTexture)).append("\n");
    sb.append("    buttonKey: ").append(toIndentedString(buttonKey)).append("\n");
    sb.append("    showPrice: ").append(toIndentedString(showPrice)).append("\n");
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
    openapiFields.add("storeItemId");
    openapiFields.add("descriptionTexture");
    openapiFields.add("buttonKey");
    openapiFields.add("showPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StorePromoDialog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StorePromoDialog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StorePromoDialog is not found in the empty JSON string", StorePromoDialog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StorePromoDialog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StorePromoDialog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("storeItemId") != null && !jsonObj.get("storeItemId").isJsonNull()) && !jsonObj.get("storeItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeItemId").toString()));
      }
      if ((jsonObj.get("descriptionTexture") != null && !jsonObj.get("descriptionTexture").isJsonNull()) && !jsonObj.get("descriptionTexture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionTexture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionTexture").toString()));
      }
      if ((jsonObj.get("buttonKey") != null && !jsonObj.get("buttonKey").isJsonNull()) && !jsonObj.get("buttonKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buttonKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buttonKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StorePromoDialog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StorePromoDialog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StorePromoDialog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StorePromoDialog.class));

       return (TypeAdapter<T>) new TypeAdapter<StorePromoDialog>() {
           @Override
           public void write(JsonWriter out, StorePromoDialog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StorePromoDialog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StorePromoDialog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StorePromoDialog
   * @throws IOException if the JSON string is invalid with respect to StorePromoDialog
   */
  public static StorePromoDialog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StorePromoDialog.class);
  }

  /**
   * Convert an instance of StorePromoDialog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

