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
 * LeaderboardGuild
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class LeaderboardGuild {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BANNER_COLOR_ID = "bannerColorId";
  @SerializedName(SERIALIZED_NAME_BANNER_COLOR_ID)
  private String bannerColorId;

  public static final String SERIALIZED_NAME_BANNER_LOGO_ID = "bannerLogoId";
  @SerializedName(SERIALIZED_NAME_BANNER_LOGO_ID)
  private String bannerLogoId;

  public static final String SERIALIZED_NAME_GUILD_TYPE_ID = "guildTypeId";
  @SerializedName(SERIALIZED_NAME_GUILD_TYPE_ID)
  private String guildTypeId;

  public LeaderboardGuild() {
  }

  public LeaderboardGuild id(String id) {
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


  public LeaderboardGuild name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LeaderboardGuild bannerColorId(String bannerColorId) {
    this.bannerColorId = bannerColorId;
    return this;
  }

  /**
   * Get bannerColorId
   * @return bannerColorId
   */
  @javax.annotation.Nullable
  public String getBannerColorId() {
    return bannerColorId;
  }

  public void setBannerColorId(String bannerColorId) {
    this.bannerColorId = bannerColorId;
  }


  public LeaderboardGuild bannerLogoId(String bannerLogoId) {
    this.bannerLogoId = bannerLogoId;
    return this;
  }

  /**
   * Get bannerLogoId
   * @return bannerLogoId
   */
  @javax.annotation.Nullable
  public String getBannerLogoId() {
    return bannerLogoId;
  }

  public void setBannerLogoId(String bannerLogoId) {
    this.bannerLogoId = bannerLogoId;
  }


  public LeaderboardGuild guildTypeId(String guildTypeId) {
    this.guildTypeId = guildTypeId;
    return this;
  }

  /**
   * Get guildTypeId
   * @return guildTypeId
   */
  @javax.annotation.Nullable
  public String getGuildTypeId() {
    return guildTypeId;
  }

  public void setGuildTypeId(String guildTypeId) {
    this.guildTypeId = guildTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardGuild leaderboardGuild = (LeaderboardGuild) o;
    return Objects.equals(this.id, leaderboardGuild.id) &&
        Objects.equals(this.name, leaderboardGuild.name) &&
        Objects.equals(this.bannerColorId, leaderboardGuild.bannerColorId) &&
        Objects.equals(this.bannerLogoId, leaderboardGuild.bannerLogoId) &&
        Objects.equals(this.guildTypeId, leaderboardGuild.guildTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bannerColorId, bannerLogoId, guildTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardGuild {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bannerColorId: ").append(toIndentedString(bannerColorId)).append("\n");
    sb.append("    bannerLogoId: ").append(toIndentedString(bannerLogoId)).append("\n");
    sb.append("    guildTypeId: ").append(toIndentedString(guildTypeId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("bannerColorId");
    openapiFields.add("bannerLogoId");
    openapiFields.add("guildTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LeaderboardGuild
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LeaderboardGuild.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaderboardGuild is not found in the empty JSON string", LeaderboardGuild.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LeaderboardGuild.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LeaderboardGuild` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("bannerColorId") != null && !jsonObj.get("bannerColorId").isJsonNull()) && !jsonObj.get("bannerColorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerColorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerColorId").toString()));
      }
      if ((jsonObj.get("bannerLogoId") != null && !jsonObj.get("bannerLogoId").isJsonNull()) && !jsonObj.get("bannerLogoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerLogoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerLogoId").toString()));
      }
      if ((jsonObj.get("guildTypeId") != null && !jsonObj.get("guildTypeId").isJsonNull()) && !jsonObj.get("guildTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guildTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guildTypeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaderboardGuild.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaderboardGuild' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaderboardGuild> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaderboardGuild.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaderboardGuild>() {
           @Override
           public void write(JsonWriter out, LeaderboardGuild value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LeaderboardGuild read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LeaderboardGuild given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LeaderboardGuild
   * @throws IOException if the JSON string is invalid with respect to LeaderboardGuild
   */
  public static LeaderboardGuild fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaderboardGuild.class);
  }

  /**
   * Convert an instance of LeaderboardGuild to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
