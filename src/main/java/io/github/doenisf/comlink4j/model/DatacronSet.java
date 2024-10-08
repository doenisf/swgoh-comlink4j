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
import io.github.doenisf.comlink4j.model.DatacronSetMaterial;
import io.github.doenisf.comlink4j.model.DatacronSetTier;
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
 * DatacronSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class DatacronSet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_MS = "expirationTimeMs";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_MS)
  private Long expirationTimeMs;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private List<DatacronSetTier> tier = new ArrayList<>();

  public static final String SERIALIZED_NAME_DETAIL_PREFAB = "detailPrefab";
  @SerializedName(SERIALIZED_NAME_DETAIL_PREFAB)
  private String detailPrefab;

  public static final String SERIALIZED_NAME_SET_MATERIAL = "setMaterial";
  @SerializedName(SERIALIZED_NAME_SET_MATERIAL)
  private List<DatacronSetMaterial> setMaterial = new ArrayList<>();

  public DatacronSet() {
  }

  public DatacronSet id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public DatacronSet displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public DatacronSet expirationTimeMs(Long expirationTimeMs) {
    this.expirationTimeMs = expirationTimeMs;
    return this;
  }

  /**
   * Get expirationTimeMs
   * @return expirationTimeMs
   */
  @javax.annotation.Nullable
  public Long getExpirationTimeMs() {
    return expirationTimeMs;
  }

  public void setExpirationTimeMs(Long expirationTimeMs) {
    this.expirationTimeMs = expirationTimeMs;
  }


  public DatacronSet icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public DatacronSet tier(List<DatacronSetTier> tier) {
    this.tier = tier;
    return this;
  }

  public DatacronSet addTierItem(DatacronSetTier tierItem) {
    if (this.tier == null) {
      this.tier = new ArrayList<>();
    }
    this.tier.add(tierItem);
    return this;
  }

  /**
   * Get tier
   * @return tier
   */
  @javax.annotation.Nullable
  public List<DatacronSetTier> getTier() {
    return tier;
  }

  public void setTier(List<DatacronSetTier> tier) {
    this.tier = tier;
  }


  public DatacronSet detailPrefab(String detailPrefab) {
    this.detailPrefab = detailPrefab;
    return this;
  }

  /**
   * Get detailPrefab
   * @return detailPrefab
   */
  @javax.annotation.Nullable
  public String getDetailPrefab() {
    return detailPrefab;
  }

  public void setDetailPrefab(String detailPrefab) {
    this.detailPrefab = detailPrefab;
  }


  public DatacronSet setMaterial(List<DatacronSetMaterial> setMaterial) {
    this.setMaterial = setMaterial;
    return this;
  }

  public DatacronSet addSetMaterialItem(DatacronSetMaterial setMaterialItem) {
    if (this.setMaterial == null) {
      this.setMaterial = new ArrayList<>();
    }
    this.setMaterial.add(setMaterialItem);
    return this;
  }

  /**
   * Get setMaterial
   * @return setMaterial
   */
  @javax.annotation.Nullable
  public List<DatacronSetMaterial> getSetMaterial() {
    return setMaterial;
  }

  public void setSetMaterial(List<DatacronSetMaterial> setMaterial) {
    this.setMaterial = setMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacronSet datacronSet = (DatacronSet) o;
    return Objects.equals(this.id, datacronSet.id) &&
        Objects.equals(this.displayName, datacronSet.displayName) &&
        Objects.equals(this.expirationTimeMs, datacronSet.expirationTimeMs) &&
        Objects.equals(this.icon, datacronSet.icon) &&
        Objects.equals(this.tier, datacronSet.tier) &&
        Objects.equals(this.detailPrefab, datacronSet.detailPrefab) &&
        Objects.equals(this.setMaterial, datacronSet.setMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, expirationTimeMs, icon, tier, detailPrefab, setMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacronSet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    expirationTimeMs: ").append(toIndentedString(expirationTimeMs)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    detailPrefab: ").append(toIndentedString(detailPrefab)).append("\n");
    sb.append("    setMaterial: ").append(toIndentedString(setMaterial)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("expirationTimeMs");
    openapiFields.add("icon");
    openapiFields.add("tier");
    openapiFields.add("detailPrefab");
    openapiFields.add("setMaterial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatacronSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatacronSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatacronSet is not found in the empty JSON string", DatacronSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatacronSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatacronSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("tier") != null && !jsonObj.get("tier").isJsonNull()) {
        JsonArray jsonArraytier = jsonObj.getAsJsonArray("tier");
        if (jsonArraytier != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tier").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tier` to be an array in the JSON string but got `%s`", jsonObj.get("tier").toString()));
          }

          // validate the optional field `tier` (array)
          for (int i = 0; i < jsonArraytier.size(); i++) {
            DatacronSetTier.validateJsonElement(jsonArraytier.get(i));
          };
        }
      }
      if ((jsonObj.get("detailPrefab") != null && !jsonObj.get("detailPrefab").isJsonNull()) && !jsonObj.get("detailPrefab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detailPrefab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detailPrefab").toString()));
      }
      if (jsonObj.get("setMaterial") != null && !jsonObj.get("setMaterial").isJsonNull()) {
        JsonArray jsonArraysetMaterial = jsonObj.getAsJsonArray("setMaterial");
        if (jsonArraysetMaterial != null) {
          // ensure the json data is an array
          if (!jsonObj.get("setMaterial").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `setMaterial` to be an array in the JSON string but got `%s`", jsonObj.get("setMaterial").toString()));
          }

          // validate the optional field `setMaterial` (array)
          for (int i = 0; i < jsonArraysetMaterial.size(); i++) {
            DatacronSetMaterial.validateJsonElement(jsonArraysetMaterial.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatacronSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatacronSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatacronSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatacronSet.class));

       return (TypeAdapter<T>) new TypeAdapter<DatacronSet>() {
           @Override
           public void write(JsonWriter out, DatacronSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatacronSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatacronSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatacronSet
   * @throws IOException if the JSON string is invalid with respect to DatacronSet
   */
  public static DatacronSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatacronSet.class);
  }

  /**
   * Convert an instance of DatacronSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

