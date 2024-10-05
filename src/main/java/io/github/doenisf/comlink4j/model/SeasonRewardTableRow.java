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
import io.github.doenisf.comlink4j.BucketItem;
import io.github.doenisf.comlink4j.SeasonRewardTableKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import io.github.doenisf.JSON;

/**
 * SeasonRewardTableRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class SeasonRewardTableRow {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private SeasonRewardTableKey key;

  public static final String SERIALIZED_NAME_PRIMARY_REWARD = "primaryReward";
  @SerializedName(SERIALIZED_NAME_PRIMARY_REWARD)
  private List<BucketItem> primaryReward = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETAILED_REWARD = "detailedReward";
  @SerializedName(SERIALIZED_NAME_DETAILED_REWARD)
  private List<BucketItem> detailedReward = new ArrayList<>();

  public SeasonRewardTableRow() {
  }

  public SeasonRewardTableRow key(SeasonRewardTableKey key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public SeasonRewardTableKey getKey() {
    return key;
  }

  public void setKey(SeasonRewardTableKey key) {
    this.key = key;
  }


  public SeasonRewardTableRow primaryReward(List<BucketItem> primaryReward) {
    this.primaryReward = primaryReward;
    return this;
  }

  public SeasonRewardTableRow addPrimaryRewardItem(BucketItem primaryRewardItem) {
    if (this.primaryReward == null) {
      this.primaryReward = new ArrayList<>();
    }
    this.primaryReward.add(primaryRewardItem);
    return this;
  }

  /**
   * Get primaryReward
   * @return primaryReward
   */
  @javax.annotation.Nullable
  public List<BucketItem> getPrimaryReward() {
    return primaryReward;
  }

  public void setPrimaryReward(List<BucketItem> primaryReward) {
    this.primaryReward = primaryReward;
  }


  public SeasonRewardTableRow detailedReward(List<BucketItem> detailedReward) {
    this.detailedReward = detailedReward;
    return this;
  }

  public SeasonRewardTableRow addDetailedRewardItem(BucketItem detailedRewardItem) {
    if (this.detailedReward == null) {
      this.detailedReward = new ArrayList<>();
    }
    this.detailedReward.add(detailedRewardItem);
    return this;
  }

  /**
   * Get detailedReward
   * @return detailedReward
   */
  @javax.annotation.Nullable
  public List<BucketItem> getDetailedReward() {
    return detailedReward;
  }

  public void setDetailedReward(List<BucketItem> detailedReward) {
    this.detailedReward = detailedReward;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeasonRewardTableRow seasonRewardTableRow = (SeasonRewardTableRow) o;
    return Objects.equals(this.key, seasonRewardTableRow.key) &&
        Objects.equals(this.primaryReward, seasonRewardTableRow.primaryReward) &&
        Objects.equals(this.detailedReward, seasonRewardTableRow.detailedReward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, primaryReward, detailedReward);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonRewardTableRow {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    primaryReward: ").append(toIndentedString(primaryReward)).append("\n");
    sb.append("    detailedReward: ").append(toIndentedString(detailedReward)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("primaryReward");
    openapiFields.add("detailedReward");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SeasonRewardTableRow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SeasonRewardTableRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeasonRewardTableRow is not found in the empty JSON string", SeasonRewardTableRow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SeasonRewardTableRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SeasonRewardTableRow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `key`
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) {
        SeasonRewardTableKey.validateJsonElement(jsonObj.get("key"));
      }
      if (jsonObj.get("primaryReward") != null && !jsonObj.get("primaryReward").isJsonNull()) {
        JsonArray jsonArrayprimaryReward = jsonObj.getAsJsonArray("primaryReward");
        if (jsonArrayprimaryReward != null) {
          // ensure the json data is an array
          if (!jsonObj.get("primaryReward").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `primaryReward` to be an array in the JSON string but got `%s`", jsonObj.get("primaryReward").toString()));
          }

          // validate the optional field `primaryReward` (array)
          for (int i = 0; i < jsonArrayprimaryReward.size(); i++) {
            BucketItem.validateJsonElement(jsonArrayprimaryReward.get(i));
          };
        }
      }
      if (jsonObj.get("detailedReward") != null && !jsonObj.get("detailedReward").isJsonNull()) {
        JsonArray jsonArraydetailedReward = jsonObj.getAsJsonArray("detailedReward");
        if (jsonArraydetailedReward != null) {
          // ensure the json data is an array
          if (!jsonObj.get("detailedReward").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `detailedReward` to be an array in the JSON string but got `%s`", jsonObj.get("detailedReward").toString()));
          }

          // validate the optional field `detailedReward` (array)
          for (int i = 0; i < jsonArraydetailedReward.size(); i++) {
            BucketItem.validateJsonElement(jsonArraydetailedReward.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeasonRewardTableRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeasonRewardTableRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeasonRewardTableRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeasonRewardTableRow.class));

       return (TypeAdapter<T>) new TypeAdapter<SeasonRewardTableRow>() {
           @Override
           public void write(JsonWriter out, SeasonRewardTableRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SeasonRewardTableRow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SeasonRewardTableRow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SeasonRewardTableRow
   * @throws IOException if the JSON string is invalid with respect to SeasonRewardTableRow
   */
  public static SeasonRewardTableRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeasonRewardTableRow.class);
  }

  /**
   * Convert an instance of SeasonRewardTableRow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
