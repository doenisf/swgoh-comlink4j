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
import io.github.doenisf.comlink4j.GuildBannerColorDef;
import io.github.doenisf.comlink4j.GuildBannerLogoDef;
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
 * GuildBannerDef
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildBannerDef {
  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private List<String> logo = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private List<GuildBannerColorDef> color = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGO_DEFINITION = "logoDefinition";
  @SerializedName(SERIALIZED_NAME_LOGO_DEFINITION)
  private List<GuildBannerLogoDef> logoDefinition = new ArrayList<>();

  public GuildBannerDef() {
  }

  public GuildBannerDef logo(List<String> logo) {
    this.logo = logo;
    return this;
  }

  public GuildBannerDef addLogoItem(String logoItem) {
    if (this.logo == null) {
      this.logo = new ArrayList<>();
    }
    this.logo.add(logoItem);
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public List<String> getLogo() {
    return logo;
  }

  public void setLogo(List<String> logo) {
    this.logo = logo;
  }


  public GuildBannerDef color(List<GuildBannerColorDef> color) {
    this.color = color;
    return this;
  }

  public GuildBannerDef addColorItem(GuildBannerColorDef colorItem) {
    if (this.color == null) {
      this.color = new ArrayList<>();
    }
    this.color.add(colorItem);
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @javax.annotation.Nullable
  public List<GuildBannerColorDef> getColor() {
    return color;
  }

  public void setColor(List<GuildBannerColorDef> color) {
    this.color = color;
  }


  public GuildBannerDef logoDefinition(List<GuildBannerLogoDef> logoDefinition) {
    this.logoDefinition = logoDefinition;
    return this;
  }

  public GuildBannerDef addLogoDefinitionItem(GuildBannerLogoDef logoDefinitionItem) {
    if (this.logoDefinition == null) {
      this.logoDefinition = new ArrayList<>();
    }
    this.logoDefinition.add(logoDefinitionItem);
    return this;
  }

  /**
   * Get logoDefinition
   * @return logoDefinition
   */
  @javax.annotation.Nullable
  public List<GuildBannerLogoDef> getLogoDefinition() {
    return logoDefinition;
  }

  public void setLogoDefinition(List<GuildBannerLogoDef> logoDefinition) {
    this.logoDefinition = logoDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildBannerDef guildBannerDef = (GuildBannerDef) o;
    return Objects.equals(this.logo, guildBannerDef.logo) &&
        Objects.equals(this.color, guildBannerDef.color) &&
        Objects.equals(this.logoDefinition, guildBannerDef.logoDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, color, logoDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildBannerDef {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    logoDefinition: ").append(toIndentedString(logoDefinition)).append("\n");
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
    openapiFields.add("logo");
    openapiFields.add("color");
    openapiFields.add("logoDefinition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildBannerDef
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildBannerDef.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildBannerDef is not found in the empty JSON string", GuildBannerDef.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildBannerDef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildBannerDef` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull() && !jsonObj.get("logo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be an array in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) {
        JsonArray jsonArraycolor = jsonObj.getAsJsonArray("color");
        if (jsonArraycolor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("color").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `color` to be an array in the JSON string but got `%s`", jsonObj.get("color").toString()));
          }

          // validate the optional field `color` (array)
          for (int i = 0; i < jsonArraycolor.size(); i++) {
            GuildBannerColorDef.validateJsonElement(jsonArraycolor.get(i));
          };
        }
      }
      if (jsonObj.get("logoDefinition") != null && !jsonObj.get("logoDefinition").isJsonNull()) {
        JsonArray jsonArraylogoDefinition = jsonObj.getAsJsonArray("logoDefinition");
        if (jsonArraylogoDefinition != null) {
          // ensure the json data is an array
          if (!jsonObj.get("logoDefinition").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `logoDefinition` to be an array in the JSON string but got `%s`", jsonObj.get("logoDefinition").toString()));
          }

          // validate the optional field `logoDefinition` (array)
          for (int i = 0; i < jsonArraylogoDefinition.size(); i++) {
            GuildBannerLogoDef.validateJsonElement(jsonArraylogoDefinition.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildBannerDef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildBannerDef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildBannerDef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildBannerDef.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildBannerDef>() {
           @Override
           public void write(JsonWriter out, GuildBannerDef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildBannerDef read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildBannerDef given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildBannerDef
   * @throws IOException if the JSON string is invalid with respect to GuildBannerDef
   */
  public static GuildBannerDef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildBannerDef.class);
  }

  /**
   * Convert an instance of GuildBannerDef to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
