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
import io.github.doenisf.comlink4j.MissionGrantedAbility;
import io.github.doenisf.comlink4j.TargetedStat;
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
 * ConsumableDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class ConsumableDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIER_ID = "tierId";
  @SerializedName(SERIALIZED_NAME_TIER_ID)
  private String tierId;

  public static final String SERIALIZED_NAME_ICON_KEY = "iconKey";
  @SerializedName(SERIALIZED_NAME_ICON_KEY)
  private String iconKey;

  public static final String SERIALIZED_NAME_NAME_KEY = "nameKey";
  @SerializedName(SERIALIZED_NAME_NAME_KEY)
  private String nameKey;

  public static final String SERIALIZED_NAME_DESCRIPTION_KEY = "descriptionKey";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_KEY)
  private String descriptionKey;

  public static final String SERIALIZED_NAME_TOTAL_BATTLE_USE = "totalBattleUse";
  @SerializedName(SERIALIZED_NAME_TOTAL_BATTLE_USE)
  private Integer totalBattleUse;

  public static final String SERIALIZED_NAME_GRANTED_ABILITY = "grantedAbility";
  @SerializedName(SERIALIZED_NAME_GRANTED_ABILITY)
  private List<MissionGrantedAbility> grantedAbility = new ArrayList<>();

  public static final String SERIALIZED_NAME_STAMINA_RECOVERY = "staminaRecovery";
  @SerializedName(SERIALIZED_NAME_STAMINA_RECOVERY)
  private Integer staminaRecovery;

  public static final String SERIALIZED_NAME_TARGETED_STAT = "targetedStat";
  @SerializedName(SERIALIZED_NAME_TARGETED_STAT)
  private List<TargetedStat> targetedStat = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONSUMABLE_TYPE_ID = "consumableTypeId";
  @SerializedName(SERIALIZED_NAME_CONSUMABLE_TYPE_ID)
  private String consumableTypeId;

  public static final String SERIALIZED_NAME_EFFECT_ICON_KEY = "effectIconKey";
  @SerializedName(SERIALIZED_NAME_EFFECT_ICON_KEY)
  private String effectIconKey;

  public static final String SERIALIZED_NAME_ACTIVE_TIME_IN_SECONDS = "activeTimeInSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TIME_IN_SECONDS)
  private Long activeTimeInSeconds;

  public static final String SERIALIZED_NAME_STAMINA_REGEN_TIME_REDUCTION = "staminaRegenTimeReduction";
  @SerializedName(SERIALIZED_NAME_STAMINA_REGEN_TIME_REDUCTION)
  private Integer staminaRegenTimeReduction;

  public static final String SERIALIZED_NAME_ENERGY_REGEN_TIME_REDUCTION = "energyRegenTimeReduction";
  @SerializedName(SERIALIZED_NAME_ENERGY_REGEN_TIME_REDUCTION)
  private Integer energyRegenTimeReduction;

  public ConsumableDefinition() {
  }

  public ConsumableDefinition id(String id) {
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


  public ConsumableDefinition tierId(String tierId) {
    this.tierId = tierId;
    return this;
  }

  /**
   * Get tierId
   * @return tierId
   */
  @javax.annotation.Nullable
  public String getTierId() {
    return tierId;
  }

  public void setTierId(String tierId) {
    this.tierId = tierId;
  }


  public ConsumableDefinition iconKey(String iconKey) {
    this.iconKey = iconKey;
    return this;
  }

  /**
   * Get iconKey
   * @return iconKey
   */
  @javax.annotation.Nullable
  public String getIconKey() {
    return iconKey;
  }

  public void setIconKey(String iconKey) {
    this.iconKey = iconKey;
  }


  public ConsumableDefinition nameKey(String nameKey) {
    this.nameKey = nameKey;
    return this;
  }

  /**
   * Get nameKey
   * @return nameKey
   */
  @javax.annotation.Nullable
  public String getNameKey() {
    return nameKey;
  }

  public void setNameKey(String nameKey) {
    this.nameKey = nameKey;
  }


  public ConsumableDefinition descriptionKey(String descriptionKey) {
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


  public ConsumableDefinition totalBattleUse(Integer totalBattleUse) {
    this.totalBattleUse = totalBattleUse;
    return this;
  }

  /**
   * Get totalBattleUse
   * @return totalBattleUse
   */
  @javax.annotation.Nullable
  public Integer getTotalBattleUse() {
    return totalBattleUse;
  }

  public void setTotalBattleUse(Integer totalBattleUse) {
    this.totalBattleUse = totalBattleUse;
  }


  public ConsumableDefinition grantedAbility(List<MissionGrantedAbility> grantedAbility) {
    this.grantedAbility = grantedAbility;
    return this;
  }

  public ConsumableDefinition addGrantedAbilityItem(MissionGrantedAbility grantedAbilityItem) {
    if (this.grantedAbility == null) {
      this.grantedAbility = new ArrayList<>();
    }
    this.grantedAbility.add(grantedAbilityItem);
    return this;
  }

  /**
   * Get grantedAbility
   * @return grantedAbility
   */
  @javax.annotation.Nullable
  public List<MissionGrantedAbility> getGrantedAbility() {
    return grantedAbility;
  }

  public void setGrantedAbility(List<MissionGrantedAbility> grantedAbility) {
    this.grantedAbility = grantedAbility;
  }


  public ConsumableDefinition staminaRecovery(Integer staminaRecovery) {
    this.staminaRecovery = staminaRecovery;
    return this;
  }

  /**
   * Get staminaRecovery
   * @return staminaRecovery
   */
  @javax.annotation.Nullable
  public Integer getStaminaRecovery() {
    return staminaRecovery;
  }

  public void setStaminaRecovery(Integer staminaRecovery) {
    this.staminaRecovery = staminaRecovery;
  }


  public ConsumableDefinition targetedStat(List<TargetedStat> targetedStat) {
    this.targetedStat = targetedStat;
    return this;
  }

  public ConsumableDefinition addTargetedStatItem(TargetedStat targetedStatItem) {
    if (this.targetedStat == null) {
      this.targetedStat = new ArrayList<>();
    }
    this.targetedStat.add(targetedStatItem);
    return this;
  }

  /**
   * Get targetedStat
   * @return targetedStat
   */
  @javax.annotation.Nullable
  public List<TargetedStat> getTargetedStat() {
    return targetedStat;
  }

  public void setTargetedStat(List<TargetedStat> targetedStat) {
    this.targetedStat = targetedStat;
  }


  public ConsumableDefinition consumableTypeId(String consumableTypeId) {
    this.consumableTypeId = consumableTypeId;
    return this;
  }

  /**
   * Get consumableTypeId
   * @return consumableTypeId
   */
  @javax.annotation.Nullable
  public String getConsumableTypeId() {
    return consumableTypeId;
  }

  public void setConsumableTypeId(String consumableTypeId) {
    this.consumableTypeId = consumableTypeId;
  }


  public ConsumableDefinition effectIconKey(String effectIconKey) {
    this.effectIconKey = effectIconKey;
    return this;
  }

  /**
   * Get effectIconKey
   * @return effectIconKey
   */
  @javax.annotation.Nullable
  public String getEffectIconKey() {
    return effectIconKey;
  }

  public void setEffectIconKey(String effectIconKey) {
    this.effectIconKey = effectIconKey;
  }


  public ConsumableDefinition activeTimeInSeconds(Long activeTimeInSeconds) {
    this.activeTimeInSeconds = activeTimeInSeconds;
    return this;
  }

  /**
   * Get activeTimeInSeconds
   * @return activeTimeInSeconds
   */
  @javax.annotation.Nullable
  public Long getActiveTimeInSeconds() {
    return activeTimeInSeconds;
  }

  public void setActiveTimeInSeconds(Long activeTimeInSeconds) {
    this.activeTimeInSeconds = activeTimeInSeconds;
  }


  public ConsumableDefinition staminaRegenTimeReduction(Integer staminaRegenTimeReduction) {
    this.staminaRegenTimeReduction = staminaRegenTimeReduction;
    return this;
  }

  /**
   * Get staminaRegenTimeReduction
   * @return staminaRegenTimeReduction
   */
  @javax.annotation.Nullable
  public Integer getStaminaRegenTimeReduction() {
    return staminaRegenTimeReduction;
  }

  public void setStaminaRegenTimeReduction(Integer staminaRegenTimeReduction) {
    this.staminaRegenTimeReduction = staminaRegenTimeReduction;
  }


  public ConsumableDefinition energyRegenTimeReduction(Integer energyRegenTimeReduction) {
    this.energyRegenTimeReduction = energyRegenTimeReduction;
    return this;
  }

  /**
   * Get energyRegenTimeReduction
   * @return energyRegenTimeReduction
   */
  @javax.annotation.Nullable
  public Integer getEnergyRegenTimeReduction() {
    return energyRegenTimeReduction;
  }

  public void setEnergyRegenTimeReduction(Integer energyRegenTimeReduction) {
    this.energyRegenTimeReduction = energyRegenTimeReduction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumableDefinition consumableDefinition = (ConsumableDefinition) o;
    return Objects.equals(this.id, consumableDefinition.id) &&
        Objects.equals(this.tierId, consumableDefinition.tierId) &&
        Objects.equals(this.iconKey, consumableDefinition.iconKey) &&
        Objects.equals(this.nameKey, consumableDefinition.nameKey) &&
        Objects.equals(this.descriptionKey, consumableDefinition.descriptionKey) &&
        Objects.equals(this.totalBattleUse, consumableDefinition.totalBattleUse) &&
        Objects.equals(this.grantedAbility, consumableDefinition.grantedAbility) &&
        Objects.equals(this.staminaRecovery, consumableDefinition.staminaRecovery) &&
        Objects.equals(this.targetedStat, consumableDefinition.targetedStat) &&
        Objects.equals(this.consumableTypeId, consumableDefinition.consumableTypeId) &&
        Objects.equals(this.effectIconKey, consumableDefinition.effectIconKey) &&
        Objects.equals(this.activeTimeInSeconds, consumableDefinition.activeTimeInSeconds) &&
        Objects.equals(this.staminaRegenTimeReduction, consumableDefinition.staminaRegenTimeReduction) &&
        Objects.equals(this.energyRegenTimeReduction, consumableDefinition.energyRegenTimeReduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tierId, iconKey, nameKey, descriptionKey, totalBattleUse, grantedAbility, staminaRecovery, targetedStat, consumableTypeId, effectIconKey, activeTimeInSeconds, staminaRegenTimeReduction, energyRegenTimeReduction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumableDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tierId: ").append(toIndentedString(tierId)).append("\n");
    sb.append("    iconKey: ").append(toIndentedString(iconKey)).append("\n");
    sb.append("    nameKey: ").append(toIndentedString(nameKey)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    totalBattleUse: ").append(toIndentedString(totalBattleUse)).append("\n");
    sb.append("    grantedAbility: ").append(toIndentedString(grantedAbility)).append("\n");
    sb.append("    staminaRecovery: ").append(toIndentedString(staminaRecovery)).append("\n");
    sb.append("    targetedStat: ").append(toIndentedString(targetedStat)).append("\n");
    sb.append("    consumableTypeId: ").append(toIndentedString(consumableTypeId)).append("\n");
    sb.append("    effectIconKey: ").append(toIndentedString(effectIconKey)).append("\n");
    sb.append("    activeTimeInSeconds: ").append(toIndentedString(activeTimeInSeconds)).append("\n");
    sb.append("    staminaRegenTimeReduction: ").append(toIndentedString(staminaRegenTimeReduction)).append("\n");
    sb.append("    energyRegenTimeReduction: ").append(toIndentedString(energyRegenTimeReduction)).append("\n");
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
    openapiFields.add("tierId");
    openapiFields.add("iconKey");
    openapiFields.add("nameKey");
    openapiFields.add("descriptionKey");
    openapiFields.add("totalBattleUse");
    openapiFields.add("grantedAbility");
    openapiFields.add("staminaRecovery");
    openapiFields.add("targetedStat");
    openapiFields.add("consumableTypeId");
    openapiFields.add("effectIconKey");
    openapiFields.add("activeTimeInSeconds");
    openapiFields.add("staminaRegenTimeReduction");
    openapiFields.add("energyRegenTimeReduction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsumableDefinition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsumableDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsumableDefinition is not found in the empty JSON string", ConsumableDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsumableDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsumableDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("tierId") != null && !jsonObj.get("tierId").isJsonNull()) && !jsonObj.get("tierId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tierId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tierId").toString()));
      }
      if ((jsonObj.get("iconKey") != null && !jsonObj.get("iconKey").isJsonNull()) && !jsonObj.get("iconKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconKey").toString()));
      }
      if ((jsonObj.get("nameKey") != null && !jsonObj.get("nameKey").isJsonNull()) && !jsonObj.get("nameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameKey").toString()));
      }
      if ((jsonObj.get("descriptionKey") != null && !jsonObj.get("descriptionKey").isJsonNull()) && !jsonObj.get("descriptionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionKey").toString()));
      }
      if (jsonObj.get("grantedAbility") != null && !jsonObj.get("grantedAbility").isJsonNull()) {
        JsonArray jsonArraygrantedAbility = jsonObj.getAsJsonArray("grantedAbility");
        if (jsonArraygrantedAbility != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grantedAbility").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grantedAbility` to be an array in the JSON string but got `%s`", jsonObj.get("grantedAbility").toString()));
          }

          // validate the optional field `grantedAbility` (array)
          for (int i = 0; i < jsonArraygrantedAbility.size(); i++) {
            MissionGrantedAbility.validateJsonElement(jsonArraygrantedAbility.get(i));
          };
        }
      }
      if (jsonObj.get("targetedStat") != null && !jsonObj.get("targetedStat").isJsonNull()) {
        JsonArray jsonArraytargetedStat = jsonObj.getAsJsonArray("targetedStat");
        if (jsonArraytargetedStat != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targetedStat").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `targetedStat` to be an array in the JSON string but got `%s`", jsonObj.get("targetedStat").toString()));
          }

          // validate the optional field `targetedStat` (array)
          for (int i = 0; i < jsonArraytargetedStat.size(); i++) {
            TargetedStat.validateJsonElement(jsonArraytargetedStat.get(i));
          };
        }
      }
      if ((jsonObj.get("consumableTypeId") != null && !jsonObj.get("consumableTypeId").isJsonNull()) && !jsonObj.get("consumableTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumableTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumableTypeId").toString()));
      }
      if ((jsonObj.get("effectIconKey") != null && !jsonObj.get("effectIconKey").isJsonNull()) && !jsonObj.get("effectIconKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectIconKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectIconKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsumableDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsumableDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsumableDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsumableDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsumableDefinition>() {
           @Override
           public void write(JsonWriter out, ConsumableDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsumableDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsumableDefinition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsumableDefinition
   * @throws IOException if the JSON string is invalid with respect to ConsumableDefinition
   */
  public static ConsumableDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsumableDefinition.class);
  }

  /**
   * Convert an instance of ConsumableDefinition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
