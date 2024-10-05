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
 * SocialStatusGuildBannerLogo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class SocialStatusGuildBannerLogo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_GUILD_BANNER_LOGO_ID = "guildBannerLogoId";
  @SerializedName(SERIALIZED_NAME_GUILD_BANNER_LOGO_ID)
  private String guildBannerLogoId;

  public SocialStatusGuildBannerLogo() {
  }

  public SocialStatusGuildBannerLogo id(Integer id) {
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


  public SocialStatusGuildBannerLogo guildBannerLogoId(String guildBannerLogoId) {
    this.guildBannerLogoId = guildBannerLogoId;
    return this;
  }

  /**
   * Get guildBannerLogoId
   * @return guildBannerLogoId
   */
  @javax.annotation.Nullable
  public String getGuildBannerLogoId() {
    return guildBannerLogoId;
  }

  public void setGuildBannerLogoId(String guildBannerLogoId) {
    this.guildBannerLogoId = guildBannerLogoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialStatusGuildBannerLogo socialStatusGuildBannerLogo = (SocialStatusGuildBannerLogo) o;
    return Objects.equals(this.id, socialStatusGuildBannerLogo.id) &&
        Objects.equals(this.guildBannerLogoId, socialStatusGuildBannerLogo.guildBannerLogoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, guildBannerLogoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialStatusGuildBannerLogo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guildBannerLogoId: ").append(toIndentedString(guildBannerLogoId)).append("\n");
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
    openapiFields.add("guildBannerLogoId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SocialStatusGuildBannerLogo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SocialStatusGuildBannerLogo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SocialStatusGuildBannerLogo is not found in the empty JSON string", SocialStatusGuildBannerLogo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SocialStatusGuildBannerLogo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SocialStatusGuildBannerLogo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("guildBannerLogoId") != null && !jsonObj.get("guildBannerLogoId").isJsonNull()) && !jsonObj.get("guildBannerLogoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guildBannerLogoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guildBannerLogoId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SocialStatusGuildBannerLogo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SocialStatusGuildBannerLogo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SocialStatusGuildBannerLogo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SocialStatusGuildBannerLogo.class));

       return (TypeAdapter<T>) new TypeAdapter<SocialStatusGuildBannerLogo>() {
           @Override
           public void write(JsonWriter out, SocialStatusGuildBannerLogo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SocialStatusGuildBannerLogo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SocialStatusGuildBannerLogo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SocialStatusGuildBannerLogo
   * @throws IOException if the JSON string is invalid with respect to SocialStatusGuildBannerLogo
   */
  public static SocialStatusGuildBannerLogo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SocialStatusGuildBannerLogo.class);
  }

  /**
   * Convert an instance of SocialStatusGuildBannerLogo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
