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
import io.github.doenisf.comlink4j.AbilityModifierData;
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
 * MissionGrantedAbility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class MissionGrantedAbility {
  public static final String SERIALIZED_NAME_ABILITY_ID = "abilityId";
  @SerializedName(SERIALIZED_NAME_ABILITY_ID)
  private String abilityId;

  public static final String SERIALIZED_NAME_TARGET_RULE_ID = "targetRuleId";
  @SerializedName(SERIALIZED_NAME_TARGET_RULE_ID)
  private String targetRuleId;

  public static final String SERIALIZED_NAME_UNLOCK_REQUIREMENT = "unlockRequirement";
  @SerializedName(SERIALIZED_NAME_UNLOCK_REQUIREMENT)
  private Requirement unlockRequirement;

  public static final String SERIALIZED_NAME_RANK_LABEL_OVERRIDE_KEY = "rankLabelOverrideKey";
  @SerializedName(SERIALIZED_NAME_RANK_LABEL_OVERRIDE_KEY)
  private String rankLabelOverrideKey;

  public static final String SERIALIZED_NAME_USE_OVERLAY_ICON = "useOverlayIcon";
  @SerializedName(SERIALIZED_NAME_USE_OVERLAY_ICON)
  private Boolean useOverlayIcon;

  public static final String SERIALIZED_NAME_OVERLAY_SPRITE_NAME = "overlaySpriteName";
  @SerializedName(SERIALIZED_NAME_OVERLAY_SPRITE_NAME)
  private String overlaySpriteName;

  public static final String SERIALIZED_NAME_ZONES_TO_APPLY_TO = "zonesToApplyTo";
  @SerializedName(SERIALIZED_NAME_ZONES_TO_APPLY_TO)
  private List<String> zonesToApplyTo = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHOW_IN_PLATOON_VIEW = "showInPlatoonView";
  @SerializedName(SERIALIZED_NAME_SHOW_IN_PLATOON_VIEW)
  private Boolean showInPlatoonView;

  public static final String SERIALIZED_NAME_MODIFIER_DATA = "modifierData";
  @SerializedName(SERIALIZED_NAME_MODIFIER_DATA)
  private AbilityModifierData modifierData;

  public static final String SERIALIZED_NAME_CONDITION_DESC_KEY = "conditionDescKey";
  @SerializedName(SERIALIZED_NAME_CONDITION_DESC_KEY)
  private String conditionDescKey;

  public MissionGrantedAbility() {
  }

  public MissionGrantedAbility abilityId(String abilityId) {
    this.abilityId = abilityId;
    return this;
  }

  /**
   * Get abilityId
   * @return abilityId
   */
  @javax.annotation.Nullable
  public String getAbilityId() {
    return abilityId;
  }

  public void setAbilityId(String abilityId) {
    this.abilityId = abilityId;
  }


  public MissionGrantedAbility targetRuleId(String targetRuleId) {
    this.targetRuleId = targetRuleId;
    return this;
  }

  /**
   * Get targetRuleId
   * @return targetRuleId
   */
  @javax.annotation.Nullable
  public String getTargetRuleId() {
    return targetRuleId;
  }

  public void setTargetRuleId(String targetRuleId) {
    this.targetRuleId = targetRuleId;
  }


  public MissionGrantedAbility unlockRequirement(Requirement unlockRequirement) {
    this.unlockRequirement = unlockRequirement;
    return this;
  }

  /**
   * Get unlockRequirement
   * @return unlockRequirement
   */
  @javax.annotation.Nullable
  public Requirement getUnlockRequirement() {
    return unlockRequirement;
  }

  public void setUnlockRequirement(Requirement unlockRequirement) {
    this.unlockRequirement = unlockRequirement;
  }


  public MissionGrantedAbility rankLabelOverrideKey(String rankLabelOverrideKey) {
    this.rankLabelOverrideKey = rankLabelOverrideKey;
    return this;
  }

  /**
   * Get rankLabelOverrideKey
   * @return rankLabelOverrideKey
   */
  @javax.annotation.Nullable
  public String getRankLabelOverrideKey() {
    return rankLabelOverrideKey;
  }

  public void setRankLabelOverrideKey(String rankLabelOverrideKey) {
    this.rankLabelOverrideKey = rankLabelOverrideKey;
  }


  public MissionGrantedAbility useOverlayIcon(Boolean useOverlayIcon) {
    this.useOverlayIcon = useOverlayIcon;
    return this;
  }

  /**
   * Get useOverlayIcon
   * @return useOverlayIcon
   */
  @javax.annotation.Nullable
  public Boolean getUseOverlayIcon() {
    return useOverlayIcon;
  }

  public void setUseOverlayIcon(Boolean useOverlayIcon) {
    this.useOverlayIcon = useOverlayIcon;
  }


  public MissionGrantedAbility overlaySpriteName(String overlaySpriteName) {
    this.overlaySpriteName = overlaySpriteName;
    return this;
  }

  /**
   * Get overlaySpriteName
   * @return overlaySpriteName
   */
  @javax.annotation.Nullable
  public String getOverlaySpriteName() {
    return overlaySpriteName;
  }

  public void setOverlaySpriteName(String overlaySpriteName) {
    this.overlaySpriteName = overlaySpriteName;
  }


  public MissionGrantedAbility zonesToApplyTo(List<String> zonesToApplyTo) {
    this.zonesToApplyTo = zonesToApplyTo;
    return this;
  }

  public MissionGrantedAbility addZonesToApplyToItem(String zonesToApplyToItem) {
    if (this.zonesToApplyTo == null) {
      this.zonesToApplyTo = new ArrayList<>();
    }
    this.zonesToApplyTo.add(zonesToApplyToItem);
    return this;
  }

  /**
   * Get zonesToApplyTo
   * @return zonesToApplyTo
   */
  @javax.annotation.Nullable
  public List<String> getZonesToApplyTo() {
    return zonesToApplyTo;
  }

  public void setZonesToApplyTo(List<String> zonesToApplyTo) {
    this.zonesToApplyTo = zonesToApplyTo;
  }


  public MissionGrantedAbility showInPlatoonView(Boolean showInPlatoonView) {
    this.showInPlatoonView = showInPlatoonView;
    return this;
  }

  /**
   * Get showInPlatoonView
   * @return showInPlatoonView
   */
  @javax.annotation.Nullable
  public Boolean getShowInPlatoonView() {
    return showInPlatoonView;
  }

  public void setShowInPlatoonView(Boolean showInPlatoonView) {
    this.showInPlatoonView = showInPlatoonView;
  }


  public MissionGrantedAbility modifierData(AbilityModifierData modifierData) {
    this.modifierData = modifierData;
    return this;
  }

  /**
   * Get modifierData
   * @return modifierData
   */
  @javax.annotation.Nullable
  public AbilityModifierData getModifierData() {
    return modifierData;
  }

  public void setModifierData(AbilityModifierData modifierData) {
    this.modifierData = modifierData;
  }


  public MissionGrantedAbility conditionDescKey(String conditionDescKey) {
    this.conditionDescKey = conditionDescKey;
    return this;
  }

  /**
   * Get conditionDescKey
   * @return conditionDescKey
   */
  @javax.annotation.Nullable
  public String getConditionDescKey() {
    return conditionDescKey;
  }

  public void setConditionDescKey(String conditionDescKey) {
    this.conditionDescKey = conditionDescKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissionGrantedAbility missionGrantedAbility = (MissionGrantedAbility) o;
    return Objects.equals(this.abilityId, missionGrantedAbility.abilityId) &&
        Objects.equals(this.targetRuleId, missionGrantedAbility.targetRuleId) &&
        Objects.equals(this.unlockRequirement, missionGrantedAbility.unlockRequirement) &&
        Objects.equals(this.rankLabelOverrideKey, missionGrantedAbility.rankLabelOverrideKey) &&
        Objects.equals(this.useOverlayIcon, missionGrantedAbility.useOverlayIcon) &&
        Objects.equals(this.overlaySpriteName, missionGrantedAbility.overlaySpriteName) &&
        Objects.equals(this.zonesToApplyTo, missionGrantedAbility.zonesToApplyTo) &&
        Objects.equals(this.showInPlatoonView, missionGrantedAbility.showInPlatoonView) &&
        Objects.equals(this.modifierData, missionGrantedAbility.modifierData) &&
        Objects.equals(this.conditionDescKey, missionGrantedAbility.conditionDescKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilityId, targetRuleId, unlockRequirement, rankLabelOverrideKey, useOverlayIcon, overlaySpriteName, zonesToApplyTo, showInPlatoonView, modifierData, conditionDescKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissionGrantedAbility {\n");
    sb.append("    abilityId: ").append(toIndentedString(abilityId)).append("\n");
    sb.append("    targetRuleId: ").append(toIndentedString(targetRuleId)).append("\n");
    sb.append("    unlockRequirement: ").append(toIndentedString(unlockRequirement)).append("\n");
    sb.append("    rankLabelOverrideKey: ").append(toIndentedString(rankLabelOverrideKey)).append("\n");
    sb.append("    useOverlayIcon: ").append(toIndentedString(useOverlayIcon)).append("\n");
    sb.append("    overlaySpriteName: ").append(toIndentedString(overlaySpriteName)).append("\n");
    sb.append("    zonesToApplyTo: ").append(toIndentedString(zonesToApplyTo)).append("\n");
    sb.append("    showInPlatoonView: ").append(toIndentedString(showInPlatoonView)).append("\n");
    sb.append("    modifierData: ").append(toIndentedString(modifierData)).append("\n");
    sb.append("    conditionDescKey: ").append(toIndentedString(conditionDescKey)).append("\n");
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
    openapiFields.add("abilityId");
    openapiFields.add("targetRuleId");
    openapiFields.add("unlockRequirement");
    openapiFields.add("rankLabelOverrideKey");
    openapiFields.add("useOverlayIcon");
    openapiFields.add("overlaySpriteName");
    openapiFields.add("zonesToApplyTo");
    openapiFields.add("showInPlatoonView");
    openapiFields.add("modifierData");
    openapiFields.add("conditionDescKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MissionGrantedAbility
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MissionGrantedAbility.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MissionGrantedAbility is not found in the empty JSON string", MissionGrantedAbility.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MissionGrantedAbility.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MissionGrantedAbility` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("abilityId") != null && !jsonObj.get("abilityId").isJsonNull()) && !jsonObj.get("abilityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abilityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abilityId").toString()));
      }
      if ((jsonObj.get("targetRuleId") != null && !jsonObj.get("targetRuleId").isJsonNull()) && !jsonObj.get("targetRuleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetRuleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetRuleId").toString()));
      }
      // validate the optional field `unlockRequirement`
      if (jsonObj.get("unlockRequirement") != null && !jsonObj.get("unlockRequirement").isJsonNull()) {
        Requirement.validateJsonElement(jsonObj.get("unlockRequirement"));
      }
      if ((jsonObj.get("rankLabelOverrideKey") != null && !jsonObj.get("rankLabelOverrideKey").isJsonNull()) && !jsonObj.get("rankLabelOverrideKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rankLabelOverrideKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rankLabelOverrideKey").toString()));
      }
      if ((jsonObj.get("overlaySpriteName") != null && !jsonObj.get("overlaySpriteName").isJsonNull()) && !jsonObj.get("overlaySpriteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overlaySpriteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overlaySpriteName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("zonesToApplyTo") != null && !jsonObj.get("zonesToApplyTo").isJsonNull() && !jsonObj.get("zonesToApplyTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `zonesToApplyTo` to be an array in the JSON string but got `%s`", jsonObj.get("zonesToApplyTo").toString()));
      }
      // validate the optional field `modifierData`
      if (jsonObj.get("modifierData") != null && !jsonObj.get("modifierData").isJsonNull()) {
        AbilityModifierData.validateJsonElement(jsonObj.get("modifierData"));
      }
      if ((jsonObj.get("conditionDescKey") != null && !jsonObj.get("conditionDescKey").isJsonNull()) && !jsonObj.get("conditionDescKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditionDescKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conditionDescKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MissionGrantedAbility.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MissionGrantedAbility' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MissionGrantedAbility> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MissionGrantedAbility.class));

       return (TypeAdapter<T>) new TypeAdapter<MissionGrantedAbility>() {
           @Override
           public void write(JsonWriter out, MissionGrantedAbility value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MissionGrantedAbility read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MissionGrantedAbility given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MissionGrantedAbility
   * @throws IOException if the JSON string is invalid with respect to MissionGrantedAbility
   */
  public static MissionGrantedAbility fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MissionGrantedAbility.class);
  }

  /**
   * Convert an instance of MissionGrantedAbility to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
