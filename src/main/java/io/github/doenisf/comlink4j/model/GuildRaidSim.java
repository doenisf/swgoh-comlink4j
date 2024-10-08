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
import io.github.doenisf.comlink4j.model.BucketItem;
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
 * GuildRaidSim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildRaidSim {
  public static final String SERIALIZED_NAME_SIM_REWARD = "simReward";
  @SerializedName(SERIALIZED_NAME_SIM_REWARD)
  private List<BucketItem> simReward = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAMPAIGN_ELEMENT_IDENTIFIER = "campaignElementIdentifier";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ELEMENT_IDENTIFIER)
  private CampaignElementIdentifier campaignElementIdentifier;

  public static final String SERIALIZED_NAME_REQUIREMENT_ID = "requirementId";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT_ID)
  private String requirementId;

  public GuildRaidSim() {
  }

  public GuildRaidSim simReward(List<BucketItem> simReward) {
    this.simReward = simReward;
    return this;
  }

  public GuildRaidSim addSimRewardItem(BucketItem simRewardItem) {
    if (this.simReward == null) {
      this.simReward = new ArrayList<>();
    }
    this.simReward.add(simRewardItem);
    return this;
  }

  /**
   * Get simReward
   * @return simReward
   */
  @javax.annotation.Nullable
  public List<BucketItem> getSimReward() {
    return simReward;
  }

  public void setSimReward(List<BucketItem> simReward) {
    this.simReward = simReward;
  }


  public GuildRaidSim campaignElementIdentifier(CampaignElementIdentifier campaignElementIdentifier) {
    this.campaignElementIdentifier = campaignElementIdentifier;
    return this;
  }

  /**
   * Get campaignElementIdentifier
   * @return campaignElementIdentifier
   */
  @javax.annotation.Nullable
  public CampaignElementIdentifier getCampaignElementIdentifier() {
    return campaignElementIdentifier;
  }

  public void setCampaignElementIdentifier(CampaignElementIdentifier campaignElementIdentifier) {
    this.campaignElementIdentifier = campaignElementIdentifier;
  }


  public GuildRaidSim requirementId(String requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  /**
   * Get requirementId
   * @return requirementId
   */
  @javax.annotation.Nullable
  public String getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(String requirementId) {
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
    GuildRaidSim guildRaidSim = (GuildRaidSim) o;
    return Objects.equals(this.simReward, guildRaidSim.simReward) &&
        Objects.equals(this.campaignElementIdentifier, guildRaidSim.campaignElementIdentifier) &&
        Objects.equals(this.requirementId, guildRaidSim.requirementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simReward, campaignElementIdentifier, requirementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildRaidSim {\n");
    sb.append("    simReward: ").append(toIndentedString(simReward)).append("\n");
    sb.append("    campaignElementIdentifier: ").append(toIndentedString(campaignElementIdentifier)).append("\n");
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
    openapiFields.add("simReward");
    openapiFields.add("campaignElementIdentifier");
    openapiFields.add("requirementId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildRaidSim
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildRaidSim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildRaidSim is not found in the empty JSON string", GuildRaidSim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildRaidSim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildRaidSim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("simReward") != null && !jsonObj.get("simReward").isJsonNull()) {
        JsonArray jsonArraysimReward = jsonObj.getAsJsonArray("simReward");
        if (jsonArraysimReward != null) {
          // ensure the json data is an array
          if (!jsonObj.get("simReward").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `simReward` to be an array in the JSON string but got `%s`", jsonObj.get("simReward").toString()));
          }

          // validate the optional field `simReward` (array)
          for (int i = 0; i < jsonArraysimReward.size(); i++) {
            BucketItem.validateJsonElement(jsonArraysimReward.get(i));
          };
        }
      }
      // validate the optional field `campaignElementIdentifier`
      if (jsonObj.get("campaignElementIdentifier") != null && !jsonObj.get("campaignElementIdentifier").isJsonNull()) {
        CampaignElementIdentifier.validateJsonElement(jsonObj.get("campaignElementIdentifier"));
      }
      if ((jsonObj.get("requirementId") != null && !jsonObj.get("requirementId").isJsonNull()) && !jsonObj.get("requirementId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requirementId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requirementId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildRaidSim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildRaidSim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildRaidSim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildRaidSim.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildRaidSim>() {
           @Override
           public void write(JsonWriter out, GuildRaidSim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildRaidSim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildRaidSim given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildRaidSim
   * @throws IOException if the JSON string is invalid with respect to GuildRaidSim
   */
  public static GuildRaidSim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildRaidSim.class);
  }

  /**
   * Convert an instance of GuildRaidSim to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

