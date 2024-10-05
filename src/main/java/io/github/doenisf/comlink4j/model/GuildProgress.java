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
import java.util.*;

/**
 * GuildProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildProgress {
  public static final String SERIALIZED_NAME_RAID_PROGRESS = "raidProgress";
  @SerializedName(SERIALIZED_NAME_RAID_PROGRESS)
  private List<GuildRaidProgress> raidProgress = new ArrayList<>();

  public GuildProgress() {
  }

  public GuildProgress raidProgress(List<GuildRaidProgress> raidProgress) {
    this.raidProgress = raidProgress;
    return this;
  }

  public GuildProgress addRaidProgressItem(GuildRaidProgress raidProgressItem) {
    if (this.raidProgress == null) {
      this.raidProgress = new ArrayList<>();
    }
    this.raidProgress.add(raidProgressItem);
    return this;
  }

  /**
   * Get raidProgress
   * @return raidProgress
   */
  @javax.annotation.Nullable
  public List<GuildRaidProgress> getRaidProgress() {
    return raidProgress;
  }

  public void setRaidProgress(List<GuildRaidProgress> raidProgress) {
    this.raidProgress = raidProgress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildProgress guildProgress = (GuildProgress) o;
    return Objects.equals(this.raidProgress, guildProgress.raidProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raidProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildProgress {\n");
    sb.append("    raidProgress: ").append(toIndentedString(raidProgress)).append("\n");
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
    openapiFields.add("raidProgress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildProgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildProgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildProgress is not found in the empty JSON string", GuildProgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildProgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildProgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("raidProgress") != null && !jsonObj.get("raidProgress").isJsonNull()) {
        JsonArray jsonArrayraidProgress = jsonObj.getAsJsonArray("raidProgress");
        if (jsonArrayraidProgress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("raidProgress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `raidProgress` to be an array in the JSON string but got `%s`", jsonObj.get("raidProgress").toString()));
          }

          // validate the optional field `raidProgress` (array)
          for (int i = 0; i < jsonArrayraidProgress.size(); i++) {
            GuildRaidProgress.validateJsonElement(jsonArrayraidProgress.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildProgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildProgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildProgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildProgress.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildProgress>() {
           @Override
           public void write(JsonWriter out, GuildProgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildProgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildProgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildProgress
   * @throws IOException if the JSON string is invalid with respect to GuildProgress
   */
  public static GuildProgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildProgress.class);
  }

  /**
   * Convert an instance of GuildProgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
