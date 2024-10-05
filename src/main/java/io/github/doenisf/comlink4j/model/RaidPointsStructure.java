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
import io.github.doenisf.comlink4j.RaidBlackboardPointSource;
import io.github.doenisf.comlink4j.RaidModifier;
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
 * RaidPointsStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class RaidPointsStructure {
  public static final String SERIALIZED_NAME_BLACKBOARD_POINT_SOURCE = "blackboardPointSource";
  @SerializedName(SERIALIZED_NAME_BLACKBOARD_POINT_SOURCE)
  private List<RaidBlackboardPointSource> blackboardPointSource = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIER = "modifier";
  @SerializedName(SERIALIZED_NAME_MODIFIER)
  private List<RaidModifier> modifier = new ArrayList<>();

  public RaidPointsStructure() {
  }

  public RaidPointsStructure blackboardPointSource(List<RaidBlackboardPointSource> blackboardPointSource) {
    this.blackboardPointSource = blackboardPointSource;
    return this;
  }

  public RaidPointsStructure addBlackboardPointSourceItem(RaidBlackboardPointSource blackboardPointSourceItem) {
    if (this.blackboardPointSource == null) {
      this.blackboardPointSource = new ArrayList<>();
    }
    this.blackboardPointSource.add(blackboardPointSourceItem);
    return this;
  }

  /**
   * Get blackboardPointSource
   * @return blackboardPointSource
   */
  @javax.annotation.Nullable
  public List<RaidBlackboardPointSource> getBlackboardPointSource() {
    return blackboardPointSource;
  }

  public void setBlackboardPointSource(List<RaidBlackboardPointSource> blackboardPointSource) {
    this.blackboardPointSource = blackboardPointSource;
  }


  public RaidPointsStructure modifier(List<RaidModifier> modifier) {
    this.modifier = modifier;
    return this;
  }

  public RaidPointsStructure addModifierItem(RaidModifier modifierItem) {
    if (this.modifier == null) {
      this.modifier = new ArrayList<>();
    }
    this.modifier.add(modifierItem);
    return this;
  }

  /**
   * Get modifier
   * @return modifier
   */
  @javax.annotation.Nullable
  public List<RaidModifier> getModifier() {
    return modifier;
  }

  public void setModifier(List<RaidModifier> modifier) {
    this.modifier = modifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaidPointsStructure raidPointsStructure = (RaidPointsStructure) o;
    return Objects.equals(this.blackboardPointSource, raidPointsStructure.blackboardPointSource) &&
        Objects.equals(this.modifier, raidPointsStructure.modifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackboardPointSource, modifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaidPointsStructure {\n");
    sb.append("    blackboardPointSource: ").append(toIndentedString(blackboardPointSource)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
    openapiFields.add("blackboardPointSource");
    openapiFields.add("modifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RaidPointsStructure
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RaidPointsStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RaidPointsStructure is not found in the empty JSON string", RaidPointsStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RaidPointsStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RaidPointsStructure` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("blackboardPointSource") != null && !jsonObj.get("blackboardPointSource").isJsonNull()) {
        JsonArray jsonArrayblackboardPointSource = jsonObj.getAsJsonArray("blackboardPointSource");
        if (jsonArrayblackboardPointSource != null) {
          // ensure the json data is an array
          if (!jsonObj.get("blackboardPointSource").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `blackboardPointSource` to be an array in the JSON string but got `%s`", jsonObj.get("blackboardPointSource").toString()));
          }

          // validate the optional field `blackboardPointSource` (array)
          for (int i = 0; i < jsonArrayblackboardPointSource.size(); i++) {
            RaidBlackboardPointSource.validateJsonElement(jsonArrayblackboardPointSource.get(i));
          };
        }
      }
      if (jsonObj.get("modifier") != null && !jsonObj.get("modifier").isJsonNull()) {
        JsonArray jsonArraymodifier = jsonObj.getAsJsonArray("modifier");
        if (jsonArraymodifier != null) {
          // ensure the json data is an array
          if (!jsonObj.get("modifier").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `modifier` to be an array in the JSON string but got `%s`", jsonObj.get("modifier").toString()));
          }

          // validate the optional field `modifier` (array)
          for (int i = 0; i < jsonArraymodifier.size(); i++) {
            RaidModifier.validateJsonElement(jsonArraymodifier.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RaidPointsStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RaidPointsStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RaidPointsStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RaidPointsStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<RaidPointsStructure>() {
           @Override
           public void write(JsonWriter out, RaidPointsStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RaidPointsStructure read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RaidPointsStructure given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RaidPointsStructure
   * @throws IOException if the JSON string is invalid with respect to RaidPointsStructure
   */
  public static RaidPointsStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RaidPointsStructure.class);
  }

  /**
   * Convert an instance of RaidPointsStructure to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
