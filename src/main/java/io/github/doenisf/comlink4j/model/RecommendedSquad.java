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
import io.github.doenisf.comlink4j.ActionLink;
import io.github.doenisf.comlink4j.Requirement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * RecommendedSquad
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class RecommendedSquad {
  public static final String SERIALIZED_NAME_DESCRIPTION_KEY = "descriptionKey";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_KEY)
  private String descriptionKey;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public static final String SERIALIZED_NAME_UNIT_DEF_ID = "unitDefId";
  @SerializedName(SERIALIZED_NAME_UNIT_DEF_ID)
  private List<String> unitDefId = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHOW_REQUIREMENT = "showRequirement";
  @SerializedName(SERIALIZED_NAME_SHOW_REQUIREMENT)
  private Requirement showRequirement;

  public static final String SERIALIZED_NAME_HIDE_REQUIREMENT = "hideRequirement";
  @SerializedName(SERIALIZED_NAME_HIDE_REQUIREMENT)
  private Requirement hideRequirement;

  public static final String SERIALIZED_NAME_ACTION_LINK = "actionLink";
  @SerializedName(SERIALIZED_NAME_ACTION_LINK)
  private ActionLink actionLink;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public RecommendedSquad() {
  }

  public RecommendedSquad descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

  /**
   * Get descriptionKey
   * @return descriptionKey
   */
  @javax.annotation.Nullable
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }


  public RecommendedSquad thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
   */
  @javax.annotation.Nullable
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public RecommendedSquad unitDefId(List<String> unitDefId) {
    this.unitDefId = unitDefId;
    return this;
  }

  public RecommendedSquad addUnitDefIdItem(String unitDefIdItem) {
    if (this.unitDefId == null) {
      this.unitDefId = new ArrayList<>();
    }
    this.unitDefId.add(unitDefIdItem);
    return this;
  }

  /**
   * Get unitDefId
   * @return unitDefId
   */
  @javax.annotation.Nullable
  public List<String> getUnitDefId() {
    return unitDefId;
  }

  public void setUnitDefId(List<String> unitDefId) {
    this.unitDefId = unitDefId;
  }


  public RecommendedSquad name(String name) {
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


  public RecommendedSquad showRequirement(Requirement showRequirement) {
    this.showRequirement = showRequirement;
    return this;
  }

  /**
   * Get showRequirement
   * @return showRequirement
   */
  @javax.annotation.Nullable
  public Requirement getShowRequirement() {
    return showRequirement;
  }

  public void setShowRequirement(Requirement showRequirement) {
    this.showRequirement = showRequirement;
  }


  public RecommendedSquad hideRequirement(Requirement hideRequirement) {
    this.hideRequirement = hideRequirement;
    return this;
  }

  /**
   * Get hideRequirement
   * @return hideRequirement
   */
  @javax.annotation.Nullable
  public Requirement getHideRequirement() {
    return hideRequirement;
  }

  public void setHideRequirement(Requirement hideRequirement) {
    this.hideRequirement = hideRequirement;
  }


  public RecommendedSquad actionLink(ActionLink actionLink) {
    this.actionLink = actionLink;
    return this;
  }

  /**
   * Get actionLink
   * @return actionLink
   */
  @javax.annotation.Nullable
  public ActionLink getActionLink() {
    return actionLink;
  }

  public void setActionLink(ActionLink actionLink) {
    this.actionLink = actionLink;
  }


  public RecommendedSquad id(String id) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendedSquad recommendedSquad = (RecommendedSquad) o;
    return Objects.equals(this.descriptionKey, recommendedSquad.descriptionKey) &&
        Objects.equals(this.thumbnail, recommendedSquad.thumbnail) &&
        Objects.equals(this.unitDefId, recommendedSquad.unitDefId) &&
        Objects.equals(this.name, recommendedSquad.name) &&
        Objects.equals(this.showRequirement, recommendedSquad.showRequirement) &&
        Objects.equals(this.hideRequirement, recommendedSquad.hideRequirement) &&
        Objects.equals(this.actionLink, recommendedSquad.actionLink) &&
        Objects.equals(this.id, recommendedSquad.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionKey, thumbnail, unitDefId, name, showRequirement, hideRequirement, actionLink, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendedSquad {\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    unitDefId: ").append(toIndentedString(unitDefId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showRequirement: ").append(toIndentedString(showRequirement)).append("\n");
    sb.append("    hideRequirement: ").append(toIndentedString(hideRequirement)).append("\n");
    sb.append("    actionLink: ").append(toIndentedString(actionLink)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("descriptionKey");
    openapiFields.add("thumbnail");
    openapiFields.add("unitDefId");
    openapiFields.add("name");
    openapiFields.add("showRequirement");
    openapiFields.add("hideRequirement");
    openapiFields.add("actionLink");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecommendedSquad
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommendedSquad.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendedSquad is not found in the empty JSON string", RecommendedSquad.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecommendedSquad.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommendedSquad` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("descriptionKey") != null && !jsonObj.get("descriptionKey").isJsonNull()) && !jsonObj.get("descriptionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionKey").toString()));
      }
      if ((jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonNull()) && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unitDefId") != null && !jsonObj.get("unitDefId").isJsonNull() && !jsonObj.get("unitDefId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitDefId` to be an array in the JSON string but got `%s`", jsonObj.get("unitDefId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `showRequirement`
      if (jsonObj.get("showRequirement") != null && !jsonObj.get("showRequirement").isJsonNull()) {
        Requirement.validateJsonElement(jsonObj.get("showRequirement"));
      }
      // validate the optional field `hideRequirement`
      if (jsonObj.get("hideRequirement") != null && !jsonObj.get("hideRequirement").isJsonNull()) {
        Requirement.validateJsonElement(jsonObj.get("hideRequirement"));
      }
      // validate the optional field `actionLink`
      if (jsonObj.get("actionLink") != null && !jsonObj.get("actionLink").isJsonNull()) {
        ActionLink.validateJsonElement(jsonObj.get("actionLink"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendedSquad.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendedSquad' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendedSquad> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendedSquad.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendedSquad>() {
           @Override
           public void write(JsonWriter out, RecommendedSquad value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendedSquad read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecommendedSquad given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecommendedSquad
   * @throws IOException if the JSON string is invalid with respect to RecommendedSquad
   */
  public static RecommendedSquad fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendedSquad.class);
  }

  /**
   * Convert an instance of RecommendedSquad to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
