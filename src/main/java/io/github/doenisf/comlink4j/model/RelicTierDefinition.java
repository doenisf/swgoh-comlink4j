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
import io.github.doenisf.comlink4j.StatDef;
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
 * RelicTierDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class RelicTierDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private StatDef stat;

  public static final String SERIALIZED_NAME_RELIC_STAT_TABLE = "relicStatTable";
  @SerializedName(SERIALIZED_NAME_RELIC_STAT_TABLE)
  private String relicStatTable;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private RelicTier tier;

  public RelicTierDefinition() {
  }

  public RelicTierDefinition id(String id) {
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


  public RelicTierDefinition stat(StatDef stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @javax.annotation.Nullable
  public StatDef getStat() {
    return stat;
  }

  public void setStat(StatDef stat) {
    this.stat = stat;
  }


  public RelicTierDefinition relicStatTable(String relicStatTable) {
    this.relicStatTable = relicStatTable;
    return this;
  }

  /**
   * Get relicStatTable
   * @return relicStatTable
   */
  @javax.annotation.Nullable
  public String getRelicStatTable() {
    return relicStatTable;
  }

  public void setRelicStatTable(String relicStatTable) {
    this.relicStatTable = relicStatTable;
  }


  public RelicTierDefinition tier(RelicTier tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Get tier
   * @return tier
   */
  @javax.annotation.Nullable
  public RelicTier getTier() {
    return tier;
  }

  public void setTier(RelicTier tier) {
    this.tier = tier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelicTierDefinition relicTierDefinition = (RelicTierDefinition) o;
    return Objects.equals(this.id, relicTierDefinition.id) &&
        Objects.equals(this.stat, relicTierDefinition.stat) &&
        Objects.equals(this.relicStatTable, relicTierDefinition.relicStatTable) &&
        Objects.equals(this.tier, relicTierDefinition.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stat, relicStatTable, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelicTierDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    relicStatTable: ").append(toIndentedString(relicStatTable)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
    openapiFields.add("stat");
    openapiFields.add("relicStatTable");
    openapiFields.add("tier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelicTierDefinition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelicTierDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelicTierDefinition is not found in the empty JSON string", RelicTierDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelicTierDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelicTierDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `stat`
      if (jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) {
        StatDef.validateJsonElement(jsonObj.get("stat"));
      }
      if ((jsonObj.get("relicStatTable") != null && !jsonObj.get("relicStatTable").isJsonNull()) && !jsonObj.get("relicStatTable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relicStatTable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relicStatTable").toString()));
      }
      // validate the optional field `tier`
      if (jsonObj.get("tier") != null && !jsonObj.get("tier").isJsonNull()) {
        RelicTier.validateJsonElement(jsonObj.get("tier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelicTierDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelicTierDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelicTierDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelicTierDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<RelicTierDefinition>() {
           @Override
           public void write(JsonWriter out, RelicTierDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelicTierDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelicTierDefinition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelicTierDefinition
   * @throws IOException if the JSON string is invalid with respect to RelicTierDefinition
   */
  public static RelicTierDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelicTierDefinition.class);
  }

  /**
   * Convert an instance of RelicTierDefinition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
