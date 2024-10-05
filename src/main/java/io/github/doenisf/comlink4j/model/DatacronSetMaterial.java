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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * DatacronSetMaterial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class DatacronSetMaterial {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "materialId";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId;

  public static final String SERIALIZED_NAME_QUANTITY_PER_DUST_GRANT = "quantityPerDustGrant";
  @SerializedName(SERIALIZED_NAME_QUANTITY_PER_DUST_GRANT)
  private Integer quantityPerDustGrant;

  public static final String SERIALIZED_NAME_DUST_GRANT_RECIPE_ID = "dustGrantRecipeId";
  @SerializedName(SERIALIZED_NAME_DUST_GRANT_RECIPE_ID)
  private String dustGrantRecipeId;

  public DatacronSetMaterial() {
  }

  public DatacronSetMaterial materialId(String materialId) {
    this.materialId = materialId;
    return this;
  }

  /**
   * Get materialId
   * @return materialId
   */
  @javax.annotation.Nullable
  public String getMaterialId() {
    return materialId;
  }

  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public DatacronSetMaterial quantityPerDustGrant(Integer quantityPerDustGrant) {
    this.quantityPerDustGrant = quantityPerDustGrant;
    return this;
  }

  /**
   * Get quantityPerDustGrant
   * @return quantityPerDustGrant
   */
  @javax.annotation.Nullable
  public Integer getQuantityPerDustGrant() {
    return quantityPerDustGrant;
  }

  public void setQuantityPerDustGrant(Integer quantityPerDustGrant) {
    this.quantityPerDustGrant = quantityPerDustGrant;
  }


  public DatacronSetMaterial dustGrantRecipeId(String dustGrantRecipeId) {
    this.dustGrantRecipeId = dustGrantRecipeId;
    return this;
  }

  /**
   * Get dustGrantRecipeId
   * @return dustGrantRecipeId
   */
  @javax.annotation.Nullable
  public String getDustGrantRecipeId() {
    return dustGrantRecipeId;
  }

  public void setDustGrantRecipeId(String dustGrantRecipeId) {
    this.dustGrantRecipeId = dustGrantRecipeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacronSetMaterial datacronSetMaterial = (DatacronSetMaterial) o;
    return Objects.equals(this.materialId, datacronSetMaterial.materialId) &&
        Objects.equals(this.quantityPerDustGrant, datacronSetMaterial.quantityPerDustGrant) &&
        Objects.equals(this.dustGrantRecipeId, datacronSetMaterial.dustGrantRecipeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, quantityPerDustGrant, dustGrantRecipeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacronSetMaterial {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    quantityPerDustGrant: ").append(toIndentedString(quantityPerDustGrant)).append("\n");
    sb.append("    dustGrantRecipeId: ").append(toIndentedString(dustGrantRecipeId)).append("\n");
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
    openapiFields.add("materialId");
    openapiFields.add("quantityPerDustGrant");
    openapiFields.add("dustGrantRecipeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatacronSetMaterial
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatacronSetMaterial.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatacronSetMaterial is not found in the empty JSON string", DatacronSetMaterial.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatacronSetMaterial.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatacronSetMaterial` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("materialId") != null && !jsonObj.get("materialId").isJsonNull()) && !jsonObj.get("materialId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `materialId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("materialId").toString()));
      }
      if ((jsonObj.get("dustGrantRecipeId") != null && !jsonObj.get("dustGrantRecipeId").isJsonNull()) && !jsonObj.get("dustGrantRecipeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dustGrantRecipeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dustGrantRecipeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatacronSetMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatacronSetMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatacronSetMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatacronSetMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<DatacronSetMaterial>() {
           @Override
           public void write(JsonWriter out, DatacronSetMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatacronSetMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatacronSetMaterial given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatacronSetMaterial
   * @throws IOException if the JSON string is invalid with respect to DatacronSetMaterial
   */
  public static DatacronSetMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatacronSetMaterial.class);
  }

  /**
   * Convert an instance of DatacronSetMaterial to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
