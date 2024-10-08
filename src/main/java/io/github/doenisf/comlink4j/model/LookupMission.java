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
 * LookupMission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class LookupMission {
  public static final String SERIALIZED_NAME_MISSION_IDENTIFIER = "missionIdentifier";
  @SerializedName(SERIALIZED_NAME_MISSION_IDENTIFIER)
  private CampaignElementIdentifier missionIdentifier;

  public static final String SERIALIZED_NAME_REQUIREMENT_ID = "requirementId";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT_ID)
  private List<String> requirementId = new ArrayList<>();

  public LookupMission() {
  }

  public LookupMission missionIdentifier(CampaignElementIdentifier missionIdentifier) {
    this.missionIdentifier = missionIdentifier;
    return this;
  }

  /**
   * Get missionIdentifier
   * @return missionIdentifier
   */
  @javax.annotation.Nullable
  public CampaignElementIdentifier getMissionIdentifier() {
    return missionIdentifier;
  }

  public void setMissionIdentifier(CampaignElementIdentifier missionIdentifier) {
    this.missionIdentifier = missionIdentifier;
  }


  public LookupMission requirementId(List<String> requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  public LookupMission addRequirementIdItem(String requirementIdItem) {
    if (this.requirementId == null) {
      this.requirementId = new ArrayList<>();
    }
    this.requirementId.add(requirementIdItem);
    return this;
  }

  /**
   * Get requirementId
   * @return requirementId
   */
  @javax.annotation.Nullable
  public List<String> getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(List<String> requirementId) {
    this.requirementId = requirementId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupMission lookupMission = (LookupMission) o;
    return Objects.equals(this.missionIdentifier, lookupMission.missionIdentifier) &&
        Objects.equals(this.requirementId, lookupMission.requirementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missionIdentifier, requirementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupMission {\n");
    sb.append("    missionIdentifier: ").append(toIndentedString(missionIdentifier)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
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
    openapiFields.add("missionIdentifier");
    openapiFields.add("requirementId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LookupMission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LookupMission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupMission is not found in the empty JSON string", LookupMission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LookupMission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupMission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `missionIdentifier`
      if (jsonObj.get("missionIdentifier") != null && !jsonObj.get("missionIdentifier").isJsonNull()) {
        CampaignElementIdentifier.validateJsonElement(jsonObj.get("missionIdentifier"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requirementId") != null && !jsonObj.get("requirementId").isJsonNull() && !jsonObj.get("requirementId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requirementId` to be an array in the JSON string but got `%s`", jsonObj.get("requirementId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupMission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupMission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupMission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupMission.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupMission>() {
           @Override
           public void write(JsonWriter out, LookupMission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupMission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LookupMission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LookupMission
   * @throws IOException if the JSON string is invalid with respect to LookupMission
   */
  public static LookupMission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupMission.class);
  }

  /**
   * Convert an instance of LookupMission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

