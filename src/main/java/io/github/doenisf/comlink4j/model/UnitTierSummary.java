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
import io.github.doenisf.comlink4j.RelicTier;
import io.github.doenisf.comlink4j.UnitTier;
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
 * UnitTierSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class UnitTierSummary {
  public static final String SERIALIZED_NAME_BASE_ID = "baseId";
  @SerializedName(SERIALIZED_NAME_BASE_ID)
  private String baseId;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private UnitTier tier;

  public static final String SERIALIZED_NAME_UNIT_RELIC_TIER = "unitRelicTier";
  @SerializedName(SERIALIZED_NAME_UNIT_RELIC_TIER)
  private RelicTier unitRelicTier;

  public UnitTierSummary() {
  }

  public UnitTierSummary baseId(String baseId) {
    this.baseId = baseId;
    return this;
  }

  /**
   * Get baseId
   * @return baseId
   */
  @javax.annotation.Nullable
  public String getBaseId() {
    return baseId;
  }

  public void setBaseId(String baseId) {
    this.baseId = baseId;
  }


  public UnitTierSummary tier(UnitTier tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Get tier
   * @return tier
   */
  @javax.annotation.Nullable
  public UnitTier getTier() {
    return tier;
  }

  public void setTier(UnitTier tier) {
    this.tier = tier;
  }


  public UnitTierSummary unitRelicTier(RelicTier unitRelicTier) {
    this.unitRelicTier = unitRelicTier;
    return this;
  }

  /**
   * Get unitRelicTier
   * @return unitRelicTier
   */
  @javax.annotation.Nullable
  public RelicTier getUnitRelicTier() {
    return unitRelicTier;
  }

  public void setUnitRelicTier(RelicTier unitRelicTier) {
    this.unitRelicTier = unitRelicTier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitTierSummary unitTierSummary = (UnitTierSummary) o;
    return Objects.equals(this.baseId, unitTierSummary.baseId) &&
        Objects.equals(this.tier, unitTierSummary.tier) &&
        Objects.equals(this.unitRelicTier, unitTierSummary.unitRelicTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseId, tier, unitRelicTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitTierSummary {\n");
    sb.append("    baseId: ").append(toIndentedString(baseId)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    unitRelicTier: ").append(toIndentedString(unitRelicTier)).append("\n");
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
    openapiFields.add("baseId");
    openapiFields.add("tier");
    openapiFields.add("unitRelicTier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UnitTierSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnitTierSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnitTierSummary is not found in the empty JSON string", UnitTierSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnitTierSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnitTierSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("baseId") != null && !jsonObj.get("baseId").isJsonNull()) && !jsonObj.get("baseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseId").toString()));
      }
      // validate the optional field `tier`
      if (jsonObj.get("tier") != null && !jsonObj.get("tier").isJsonNull()) {
        UnitTier.validateJsonElement(jsonObj.get("tier"));
      }
      // validate the optional field `unitRelicTier`
      if (jsonObj.get("unitRelicTier") != null && !jsonObj.get("unitRelicTier").isJsonNull()) {
        RelicTier.validateJsonElement(jsonObj.get("unitRelicTier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnitTierSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnitTierSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnitTierSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnitTierSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<UnitTierSummary>() {
           @Override
           public void write(JsonWriter out, UnitTierSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnitTierSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UnitTierSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnitTierSummary
   * @throws IOException if the JSON string is invalid with respect to UnitTierSummary
   */
  public static UnitTierSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnitTierSummary.class);
  }

  /**
   * Convert an instance of UnitTierSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
