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
import io.github.doenisf.comlink4j.model.BattleDetails;
import io.github.doenisf.comlink4j.model.BucketItem;
import io.github.doenisf.comlink4j.model.ConditionalBucket;
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
 * ConquestMission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class ConquestMission {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BATTLE_DETAILS = "battleDetails";
  @SerializedName(SERIALIZED_NAME_BATTLE_DETAILS)
  private BattleDetails battleDetails;

  public static final String SERIALIZED_NAME_ENTRY_COST_REQUIREMENT = "entryCostRequirement";
  @SerializedName(SERIALIZED_NAME_ENTRY_COST_REQUIREMENT)
  private List<BucketItem> entryCostRequirement = new ArrayList<>();

  public static final String SERIALIZED_NAME_REWARD_PREVIEW = "rewardPreview";
  @SerializedName(SERIALIZED_NAME_REWARD_PREVIEW)
  private List<BucketItem> rewardPreview = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONDITIONAL_REWARDS_PREVIEW = "conditionalRewardsPreview";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL_REWARDS_PREVIEW)
  private List<ConditionalBucket> conditionalRewardsPreview = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTANCE_FIRST_COMPLETE_REWARD_PREVIEW = "instanceFirstCompleteRewardPreview";
  @SerializedName(SERIALIZED_NAME_INSTANCE_FIRST_COMPLETE_REWARD_PREVIEW)
  private List<BucketItem> instanceFirstCompleteRewardPreview = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECOMMENDATION_KEY = "recommendationKey";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION_KEY)
  private String recommendationKey;

  public ConquestMission() {
  }

  public ConquestMission id(String id) {
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


  public ConquestMission battleDetails(BattleDetails battleDetails) {
    this.battleDetails = battleDetails;
    return this;
  }

  /**
   * Get battleDetails
   * @return battleDetails
   */
  @javax.annotation.Nullable
  public BattleDetails getBattleDetails() {
    return battleDetails;
  }

  public void setBattleDetails(BattleDetails battleDetails) {
    this.battleDetails = battleDetails;
  }


  public ConquestMission entryCostRequirement(List<BucketItem> entryCostRequirement) {
    this.entryCostRequirement = entryCostRequirement;
    return this;
  }

  public ConquestMission addEntryCostRequirementItem(BucketItem entryCostRequirementItem) {
    if (this.entryCostRequirement == null) {
      this.entryCostRequirement = new ArrayList<>();
    }
    this.entryCostRequirement.add(entryCostRequirementItem);
    return this;
  }

  /**
   * Get entryCostRequirement
   * @return entryCostRequirement
   */
  @javax.annotation.Nullable
  public List<BucketItem> getEntryCostRequirement() {
    return entryCostRequirement;
  }

  public void setEntryCostRequirement(List<BucketItem> entryCostRequirement) {
    this.entryCostRequirement = entryCostRequirement;
  }


  public ConquestMission rewardPreview(List<BucketItem> rewardPreview) {
    this.rewardPreview = rewardPreview;
    return this;
  }

  public ConquestMission addRewardPreviewItem(BucketItem rewardPreviewItem) {
    if (this.rewardPreview == null) {
      this.rewardPreview = new ArrayList<>();
    }
    this.rewardPreview.add(rewardPreviewItem);
    return this;
  }

  /**
   * Get rewardPreview
   * @return rewardPreview
   */
  @javax.annotation.Nullable
  public List<BucketItem> getRewardPreview() {
    return rewardPreview;
  }

  public void setRewardPreview(List<BucketItem> rewardPreview) {
    this.rewardPreview = rewardPreview;
  }


  public ConquestMission conditionalRewardsPreview(List<ConditionalBucket> conditionalRewardsPreview) {
    this.conditionalRewardsPreview = conditionalRewardsPreview;
    return this;
  }

  public ConquestMission addConditionalRewardsPreviewItem(ConditionalBucket conditionalRewardsPreviewItem) {
    if (this.conditionalRewardsPreview == null) {
      this.conditionalRewardsPreview = new ArrayList<>();
    }
    this.conditionalRewardsPreview.add(conditionalRewardsPreviewItem);
    return this;
  }

  /**
   * Get conditionalRewardsPreview
   * @return conditionalRewardsPreview
   */
  @javax.annotation.Nullable
  public List<ConditionalBucket> getConditionalRewardsPreview() {
    return conditionalRewardsPreview;
  }

  public void setConditionalRewardsPreview(List<ConditionalBucket> conditionalRewardsPreview) {
    this.conditionalRewardsPreview = conditionalRewardsPreview;
  }


  public ConquestMission instanceFirstCompleteRewardPreview(List<BucketItem> instanceFirstCompleteRewardPreview) {
    this.instanceFirstCompleteRewardPreview = instanceFirstCompleteRewardPreview;
    return this;
  }

  public ConquestMission addInstanceFirstCompleteRewardPreviewItem(BucketItem instanceFirstCompleteRewardPreviewItem) {
    if (this.instanceFirstCompleteRewardPreview == null) {
      this.instanceFirstCompleteRewardPreview = new ArrayList<>();
    }
    this.instanceFirstCompleteRewardPreview.add(instanceFirstCompleteRewardPreviewItem);
    return this;
  }

  /**
   * Get instanceFirstCompleteRewardPreview
   * @return instanceFirstCompleteRewardPreview
   */
  @javax.annotation.Nullable
  public List<BucketItem> getInstanceFirstCompleteRewardPreview() {
    return instanceFirstCompleteRewardPreview;
  }

  public void setInstanceFirstCompleteRewardPreview(List<BucketItem> instanceFirstCompleteRewardPreview) {
    this.instanceFirstCompleteRewardPreview = instanceFirstCompleteRewardPreview;
  }


  public ConquestMission recommendationKey(String recommendationKey) {
    this.recommendationKey = recommendationKey;
    return this;
  }

  /**
   * Get recommendationKey
   * @return recommendationKey
   */
  @javax.annotation.Nullable
  public String getRecommendationKey() {
    return recommendationKey;
  }

  public void setRecommendationKey(String recommendationKey) {
    this.recommendationKey = recommendationKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConquestMission conquestMission = (ConquestMission) o;
    return Objects.equals(this.id, conquestMission.id) &&
        Objects.equals(this.battleDetails, conquestMission.battleDetails) &&
        Objects.equals(this.entryCostRequirement, conquestMission.entryCostRequirement) &&
        Objects.equals(this.rewardPreview, conquestMission.rewardPreview) &&
        Objects.equals(this.conditionalRewardsPreview, conquestMission.conditionalRewardsPreview) &&
        Objects.equals(this.instanceFirstCompleteRewardPreview, conquestMission.instanceFirstCompleteRewardPreview) &&
        Objects.equals(this.recommendationKey, conquestMission.recommendationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, battleDetails, entryCostRequirement, rewardPreview, conditionalRewardsPreview, instanceFirstCompleteRewardPreview, recommendationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConquestMission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    battleDetails: ").append(toIndentedString(battleDetails)).append("\n");
    sb.append("    entryCostRequirement: ").append(toIndentedString(entryCostRequirement)).append("\n");
    sb.append("    rewardPreview: ").append(toIndentedString(rewardPreview)).append("\n");
    sb.append("    conditionalRewardsPreview: ").append(toIndentedString(conditionalRewardsPreview)).append("\n");
    sb.append("    instanceFirstCompleteRewardPreview: ").append(toIndentedString(instanceFirstCompleteRewardPreview)).append("\n");
    sb.append("    recommendationKey: ").append(toIndentedString(recommendationKey)).append("\n");
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
    openapiFields.add("battleDetails");
    openapiFields.add("entryCostRequirement");
    openapiFields.add("rewardPreview");
    openapiFields.add("conditionalRewardsPreview");
    openapiFields.add("instanceFirstCompleteRewardPreview");
    openapiFields.add("recommendationKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConquestMission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConquestMission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConquestMission is not found in the empty JSON string", ConquestMission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConquestMission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConquestMission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `battleDetails`
      if (jsonObj.get("battleDetails") != null && !jsonObj.get("battleDetails").isJsonNull()) {
        BattleDetails.validateJsonElement(jsonObj.get("battleDetails"));
      }
      if (jsonObj.get("entryCostRequirement") != null && !jsonObj.get("entryCostRequirement").isJsonNull()) {
        JsonArray jsonArrayentryCostRequirement = jsonObj.getAsJsonArray("entryCostRequirement");
        if (jsonArrayentryCostRequirement != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entryCostRequirement").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entryCostRequirement` to be an array in the JSON string but got `%s`", jsonObj.get("entryCostRequirement").toString()));
          }

          // validate the optional field `entryCostRequirement` (array)
          for (int i = 0; i < jsonArrayentryCostRequirement.size(); i++) {
            BucketItem.validateJsonElement(jsonArrayentryCostRequirement.get(i));
          };
        }
      }
      if (jsonObj.get("rewardPreview") != null && !jsonObj.get("rewardPreview").isJsonNull()) {
        JsonArray jsonArrayrewardPreview = jsonObj.getAsJsonArray("rewardPreview");
        if (jsonArrayrewardPreview != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rewardPreview").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rewardPreview` to be an array in the JSON string but got `%s`", jsonObj.get("rewardPreview").toString()));
          }

          // validate the optional field `rewardPreview` (array)
          for (int i = 0; i < jsonArrayrewardPreview.size(); i++) {
            BucketItem.validateJsonElement(jsonArrayrewardPreview.get(i));
          };
        }
      }
      if (jsonObj.get("conditionalRewardsPreview") != null && !jsonObj.get("conditionalRewardsPreview").isJsonNull()) {
        JsonArray jsonArrayconditionalRewardsPreview = jsonObj.getAsJsonArray("conditionalRewardsPreview");
        if (jsonArrayconditionalRewardsPreview != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditionalRewardsPreview").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditionalRewardsPreview` to be an array in the JSON string but got `%s`", jsonObj.get("conditionalRewardsPreview").toString()));
          }

          // validate the optional field `conditionalRewardsPreview` (array)
          for (int i = 0; i < jsonArrayconditionalRewardsPreview.size(); i++) {
            ConditionalBucket.validateJsonElement(jsonArrayconditionalRewardsPreview.get(i));
          };
        }
      }
      if (jsonObj.get("instanceFirstCompleteRewardPreview") != null && !jsonObj.get("instanceFirstCompleteRewardPreview").isJsonNull()) {
        JsonArray jsonArrayinstanceFirstCompleteRewardPreview = jsonObj.getAsJsonArray("instanceFirstCompleteRewardPreview");
        if (jsonArrayinstanceFirstCompleteRewardPreview != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instanceFirstCompleteRewardPreview").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instanceFirstCompleteRewardPreview` to be an array in the JSON string but got `%s`", jsonObj.get("instanceFirstCompleteRewardPreview").toString()));
          }

          // validate the optional field `instanceFirstCompleteRewardPreview` (array)
          for (int i = 0; i < jsonArrayinstanceFirstCompleteRewardPreview.size(); i++) {
            BucketItem.validateJsonElement(jsonArrayinstanceFirstCompleteRewardPreview.get(i));
          };
        }
      }
      if ((jsonObj.get("recommendationKey") != null && !jsonObj.get("recommendationKey").isJsonNull()) && !jsonObj.get("recommendationKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommendationKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recommendationKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConquestMission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConquestMission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConquestMission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConquestMission.class));

       return (TypeAdapter<T>) new TypeAdapter<ConquestMission>() {
           @Override
           public void write(JsonWriter out, ConquestMission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConquestMission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConquestMission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConquestMission
   * @throws IOException if the JSON string is invalid with respect to ConquestMission
   */
  public static ConquestMission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConquestMission.class);
  }

  /**
   * Convert an instance of ConquestMission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

