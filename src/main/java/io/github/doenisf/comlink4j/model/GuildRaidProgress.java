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
import io.github.doenisf.comlink4j.model.CampaignElementIdentifier;
import io.github.doenisf.comlink4j.model.CampaignElementProgress;
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
 * GuildRaidProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildRaidProgress {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private CampaignElementIdentifier identifier;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private CampaignElementProgress progress;

  public static final String SERIALIZED_NAME_WIN_COUNT = "winCount";
  @SerializedName(SERIALIZED_NAME_WIN_COUNT)
  private Integer winCount;

  public GuildRaidProgress() {
  }

  public GuildRaidProgress identifier(CampaignElementIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   */
  @javax.annotation.Nullable
  public CampaignElementIdentifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(CampaignElementIdentifier identifier) {
    this.identifier = identifier;
  }


  public GuildRaidProgress progress(CampaignElementProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  public CampaignElementProgress getProgress() {
    return progress;
  }

  public void setProgress(CampaignElementProgress progress) {
    this.progress = progress;
  }


  public GuildRaidProgress winCount(Integer winCount) {
    this.winCount = winCount;
    return this;
  }

  /**
   * Get winCount
   * @return winCount
   */
  @javax.annotation.Nullable
  public Integer getWinCount() {
    return winCount;
  }

  public void setWinCount(Integer winCount) {
    this.winCount = winCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildRaidProgress guildRaidProgress = (GuildRaidProgress) o;
    return Objects.equals(this.identifier, guildRaidProgress.identifier) &&
        Objects.equals(this.progress, guildRaidProgress.progress) &&
        Objects.equals(this.winCount, guildRaidProgress.winCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, progress, winCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildRaidProgress {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    winCount: ").append(toIndentedString(winCount)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("progress");
    openapiFields.add("winCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildRaidProgress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildRaidProgress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildRaidProgress is not found in the empty JSON string", GuildRaidProgress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildRaidProgress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildRaidProgress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `identifier`
      if (jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) {
        CampaignElementIdentifier.validateJsonElement(jsonObj.get("identifier"));
      }
      // validate the optional field `progress`
      if (jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) {
        CampaignElementProgress.validateJsonElement(jsonObj.get("progress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildRaidProgress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildRaidProgress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildRaidProgress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildRaidProgress.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildRaidProgress>() {
           @Override
           public void write(JsonWriter out, GuildRaidProgress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildRaidProgress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildRaidProgress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildRaidProgress
   * @throws IOException if the JSON string is invalid with respect to GuildRaidProgress
   */
  public static GuildRaidProgress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildRaidProgress.class);
  }

  /**
   * Convert an instance of GuildRaidProgress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

