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
import io.github.doenisf.comlink4j.model.BucketItem;
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
 * DailyActionCap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class DailyActionCap {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MAX_ACTIONS = "maxActions";
  @SerializedName(SERIALIZED_NAME_MAX_ACTIONS)
  private Integer maxActions;

  public static final String SERIALIZED_NAME_PURCHASE_COST = "purchaseCost";
  @SerializedName(SERIALIZED_NAME_PURCHASE_COST)
  private List<BucketItem> purchaseCost = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNLIMITED_PURCHASES = "unlimitedPurchases";
  @SerializedName(SERIALIZED_NAME_UNLIMITED_PURCHASES)
  private Boolean unlimitedPurchases;

  public DailyActionCap() {
  }

  public DailyActionCap id(String id) {
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


  public DailyActionCap maxActions(Integer maxActions) {
    this.maxActions = maxActions;
    return this;
  }

  /**
   * Get maxActions
   * @return maxActions
   */
  @javax.annotation.Nullable
  public Integer getMaxActions() {
    return maxActions;
  }

  public void setMaxActions(Integer maxActions) {
    this.maxActions = maxActions;
  }


  public DailyActionCap purchaseCost(List<BucketItem> purchaseCost) {
    this.purchaseCost = purchaseCost;
    return this;
  }

  public DailyActionCap addPurchaseCostItem(BucketItem purchaseCostItem) {
    if (this.purchaseCost == null) {
      this.purchaseCost = new ArrayList<>();
    }
    this.purchaseCost.add(purchaseCostItem);
    return this;
  }

  /**
   * Get purchaseCost
   * @return purchaseCost
   */
  @javax.annotation.Nullable
  public List<BucketItem> getPurchaseCost() {
    return purchaseCost;
  }

  public void setPurchaseCost(List<BucketItem> purchaseCost) {
    this.purchaseCost = purchaseCost;
  }


  public DailyActionCap unlimitedPurchases(Boolean unlimitedPurchases) {
    this.unlimitedPurchases = unlimitedPurchases;
    return this;
  }

  /**
   * Get unlimitedPurchases
   * @return unlimitedPurchases
   */
  @javax.annotation.Nullable
  public Boolean getUnlimitedPurchases() {
    return unlimitedPurchases;
  }

  public void setUnlimitedPurchases(Boolean unlimitedPurchases) {
    this.unlimitedPurchases = unlimitedPurchases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyActionCap dailyActionCap = (DailyActionCap) o;
    return Objects.equals(this.id, dailyActionCap.id) &&
        Objects.equals(this.maxActions, dailyActionCap.maxActions) &&
        Objects.equals(this.purchaseCost, dailyActionCap.purchaseCost) &&
        Objects.equals(this.unlimitedPurchases, dailyActionCap.unlimitedPurchases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxActions, purchaseCost, unlimitedPurchases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyActionCap {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxActions: ").append(toIndentedString(maxActions)).append("\n");
    sb.append("    purchaseCost: ").append(toIndentedString(purchaseCost)).append("\n");
    sb.append("    unlimitedPurchases: ").append(toIndentedString(unlimitedPurchases)).append("\n");
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
    openapiFields.add("maxActions");
    openapiFields.add("purchaseCost");
    openapiFields.add("unlimitedPurchases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DailyActionCap
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DailyActionCap.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DailyActionCap is not found in the empty JSON string", DailyActionCap.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DailyActionCap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DailyActionCap` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("purchaseCost") != null && !jsonObj.get("purchaseCost").isJsonNull()) {
        JsonArray jsonArraypurchaseCost = jsonObj.getAsJsonArray("purchaseCost");
        if (jsonArraypurchaseCost != null) {
          // ensure the json data is an array
          if (!jsonObj.get("purchaseCost").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `purchaseCost` to be an array in the JSON string but got `%s`", jsonObj.get("purchaseCost").toString()));
          }

          // validate the optional field `purchaseCost` (array)
          for (int i = 0; i < jsonArraypurchaseCost.size(); i++) {
            BucketItem.validateJsonElement(jsonArraypurchaseCost.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DailyActionCap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DailyActionCap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DailyActionCap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DailyActionCap.class));

       return (TypeAdapter<T>) new TypeAdapter<DailyActionCap>() {
           @Override
           public void write(JsonWriter out, DailyActionCap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DailyActionCap read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DailyActionCap given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DailyActionCap
   * @throws IOException if the JSON string is invalid with respect to DailyActionCap
   */
  public static DailyActionCap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DailyActionCap.class);
  }

  /**
   * Convert an instance of DailyActionCap to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

