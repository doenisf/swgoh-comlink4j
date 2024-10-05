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
import io.github.doenisf.comlink4j.CombatType;
import io.github.doenisf.comlink4j.MissionGrantedAbility;
import io.github.doenisf.comlink4j.Rarity;
import io.github.doenisf.comlink4j.RelicTier;
import io.github.doenisf.comlink4j.TerritoryBattleZoneUnitType;
import io.github.doenisf.comlink4j.TerritoryReconPlatoonDefinition;
import io.github.doenisf.comlink4j.TerritoryZoneDefinition;
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
 * TerritoryReconZoneDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class TerritoryReconZoneDefinition {
  public static final String SERIALIZED_NAME_ZONE_DEFINITION = "zoneDefinition";
  @SerializedName(SERIALIZED_NAME_ZONE_DEFINITION)
  private TerritoryZoneDefinition zoneDefinition;

  public static final String SERIALIZED_NAME_PLATOON_DEFINITION = "platoonDefinition";
  @SerializedName(SERIALIZED_NAME_PLATOON_DEFINITION)
  private List<TerritoryReconPlatoonDefinition> platoonDefinition = new ArrayList<>();

  public static final String SERIALIZED_NAME_ABILITY_IMAGE = "abilityImage";
  @SerializedName(SERIALIZED_NAME_ABILITY_IMAGE)
  private String abilityImage;

  public static final String SERIALIZED_NAME_ABILITY_SHORT_DESC_KEY = "abilityShortDescKey";
  @SerializedName(SERIALIZED_NAME_ABILITY_SHORT_DESC_KEY)
  private String abilityShortDescKey;

  public static final String SERIALIZED_NAME_ABILITY_LONG_DESC_KEY = "abilityLongDescKey";
  @SerializedName(SERIALIZED_NAME_ABILITY_LONG_DESC_KEY)
  private String abilityLongDescKey;

  public static final String SERIALIZED_NAME_GOAL_DESC_KEY = "goalDescKey";
  @SerializedName(SERIALIZED_NAME_GOAL_DESC_KEY)
  private String goalDescKey;

  public static final String SERIALIZED_NAME_GOAL_IMAGE = "goalImage";
  @SerializedName(SERIALIZED_NAME_GOAL_IMAGE)
  private String goalImage;

  public static final String SERIALIZED_NAME_UNIT_RARITY = "unitRarity";
  @SerializedName(SERIALIZED_NAME_UNIT_RARITY)
  private Rarity unitRarity;

  public static final String SERIALIZED_NAME_REWARD_DESC_KEY = "rewardDescKey";
  @SerializedName(SERIALIZED_NAME_REWARD_DESC_KEY)
  private String rewardDescKey;

  public static final String SERIALIZED_NAME_SUB_TITLE_KEY = "subTitleKey";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE_KEY)
  private String subTitleKey;

  public static final String SERIALIZED_NAME_GRANTED_ABILITIES = "grantedAbilities";
  @SerializedName(SERIALIZED_NAME_GRANTED_ABILITIES)
  private List<MissionGrantedAbility> grantedAbilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRATEGIC_ABILITIES = "strategicAbilities";
  @SerializedName(SERIALIZED_NAME_STRATEGIC_ABILITIES)
  private List<MissionGrantedAbility> strategicAbilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMBAT_TYPE = "combatType";
  @SerializedName(SERIALIZED_NAME_COMBAT_TYPE)
  private CombatType combatType;

  public static final String SERIALIZED_NAME_TERRITORY_BATTLE_ZONE_UNIT_TYPE = "territoryBattleZoneUnitType";
  @SerializedName(SERIALIZED_NAME_TERRITORY_BATTLE_ZONE_UNIT_TYPE)
  private TerritoryBattleZoneUnitType territoryBattleZoneUnitType;

  public static final String SERIALIZED_NAME_UNIT_RELIC_TIER = "unitRelicTier";
  @SerializedName(SERIALIZED_NAME_UNIT_RELIC_TIER)
  private RelicTier unitRelicTier;

  public TerritoryReconZoneDefinition() {
  }

  public TerritoryReconZoneDefinition zoneDefinition(TerritoryZoneDefinition zoneDefinition) {
    this.zoneDefinition = zoneDefinition;
    return this;
  }

  /**
   * Get zoneDefinition
   * @return zoneDefinition
   */
  @javax.annotation.Nullable
  public TerritoryZoneDefinition getZoneDefinition() {
    return zoneDefinition;
  }

  public void setZoneDefinition(TerritoryZoneDefinition zoneDefinition) {
    this.zoneDefinition = zoneDefinition;
  }


  public TerritoryReconZoneDefinition platoonDefinition(List<TerritoryReconPlatoonDefinition> platoonDefinition) {
    this.platoonDefinition = platoonDefinition;
    return this;
  }

  public TerritoryReconZoneDefinition addPlatoonDefinitionItem(TerritoryReconPlatoonDefinition platoonDefinitionItem) {
    if (this.platoonDefinition == null) {
      this.platoonDefinition = new ArrayList<>();
    }
    this.platoonDefinition.add(platoonDefinitionItem);
    return this;
  }

  /**
   * Get platoonDefinition
   * @return platoonDefinition
   */
  @javax.annotation.Nullable
  public List<TerritoryReconPlatoonDefinition> getPlatoonDefinition() {
    return platoonDefinition;
  }

  public void setPlatoonDefinition(List<TerritoryReconPlatoonDefinition> platoonDefinition) {
    this.platoonDefinition = platoonDefinition;
  }


  public TerritoryReconZoneDefinition abilityImage(String abilityImage) {
    this.abilityImage = abilityImage;
    return this;
  }

  /**
   * Get abilityImage
   * @return abilityImage
   */
  @javax.annotation.Nullable
  public String getAbilityImage() {
    return abilityImage;
  }

  public void setAbilityImage(String abilityImage) {
    this.abilityImage = abilityImage;
  }


  public TerritoryReconZoneDefinition abilityShortDescKey(String abilityShortDescKey) {
    this.abilityShortDescKey = abilityShortDescKey;
    return this;
  }

  /**
   * Get abilityShortDescKey
   * @return abilityShortDescKey
   */
  @javax.annotation.Nullable
  public String getAbilityShortDescKey() {
    return abilityShortDescKey;
  }

  public void setAbilityShortDescKey(String abilityShortDescKey) {
    this.abilityShortDescKey = abilityShortDescKey;
  }


  public TerritoryReconZoneDefinition abilityLongDescKey(String abilityLongDescKey) {
    this.abilityLongDescKey = abilityLongDescKey;
    return this;
  }

  /**
   * Get abilityLongDescKey
   * @return abilityLongDescKey
   */
  @javax.annotation.Nullable
  public String getAbilityLongDescKey() {
    return abilityLongDescKey;
  }

  public void setAbilityLongDescKey(String abilityLongDescKey) {
    this.abilityLongDescKey = abilityLongDescKey;
  }


  public TerritoryReconZoneDefinition goalDescKey(String goalDescKey) {
    this.goalDescKey = goalDescKey;
    return this;
  }

  /**
   * Get goalDescKey
   * @return goalDescKey
   */
  @javax.annotation.Nullable
  public String getGoalDescKey() {
    return goalDescKey;
  }

  public void setGoalDescKey(String goalDescKey) {
    this.goalDescKey = goalDescKey;
  }


  public TerritoryReconZoneDefinition goalImage(String goalImage) {
    this.goalImage = goalImage;
    return this;
  }

  /**
   * Get goalImage
   * @return goalImage
   */
  @javax.annotation.Nullable
  public String getGoalImage() {
    return goalImage;
  }

  public void setGoalImage(String goalImage) {
    this.goalImage = goalImage;
  }


  public TerritoryReconZoneDefinition unitRarity(Rarity unitRarity) {
    this.unitRarity = unitRarity;
    return this;
  }

  /**
   * Get unitRarity
   * @return unitRarity
   */
  @javax.annotation.Nullable
  public Rarity getUnitRarity() {
    return unitRarity;
  }

  public void setUnitRarity(Rarity unitRarity) {
    this.unitRarity = unitRarity;
  }


  public TerritoryReconZoneDefinition rewardDescKey(String rewardDescKey) {
    this.rewardDescKey = rewardDescKey;
    return this;
  }

  /**
   * Get rewardDescKey
   * @return rewardDescKey
   */
  @javax.annotation.Nullable
  public String getRewardDescKey() {
    return rewardDescKey;
  }

  public void setRewardDescKey(String rewardDescKey) {
    this.rewardDescKey = rewardDescKey;
  }


  public TerritoryReconZoneDefinition subTitleKey(String subTitleKey) {
    this.subTitleKey = subTitleKey;
    return this;
  }

  /**
   * Get subTitleKey
   * @return subTitleKey
   */
  @javax.annotation.Nullable
  public String getSubTitleKey() {
    return subTitleKey;
  }

  public void setSubTitleKey(String subTitleKey) {
    this.subTitleKey = subTitleKey;
  }


  public TerritoryReconZoneDefinition grantedAbilities(List<MissionGrantedAbility> grantedAbilities) {
    this.grantedAbilities = grantedAbilities;
    return this;
  }

  public TerritoryReconZoneDefinition addGrantedAbilitiesItem(MissionGrantedAbility grantedAbilitiesItem) {
    if (this.grantedAbilities == null) {
      this.grantedAbilities = new ArrayList<>();
    }
    this.grantedAbilities.add(grantedAbilitiesItem);
    return this;
  }

  /**
   * Get grantedAbilities
   * @return grantedAbilities
   */
  @javax.annotation.Nullable
  public List<MissionGrantedAbility> getGrantedAbilities() {
    return grantedAbilities;
  }

  public void setGrantedAbilities(List<MissionGrantedAbility> grantedAbilities) {
    this.grantedAbilities = grantedAbilities;
  }


  public TerritoryReconZoneDefinition strategicAbilities(List<MissionGrantedAbility> strategicAbilities) {
    this.strategicAbilities = strategicAbilities;
    return this;
  }

  public TerritoryReconZoneDefinition addStrategicAbilitiesItem(MissionGrantedAbility strategicAbilitiesItem) {
    if (this.strategicAbilities == null) {
      this.strategicAbilities = new ArrayList<>();
    }
    this.strategicAbilities.add(strategicAbilitiesItem);
    return this;
  }

  /**
   * Get strategicAbilities
   * @return strategicAbilities
   */
  @javax.annotation.Nullable
  public List<MissionGrantedAbility> getStrategicAbilities() {
    return strategicAbilities;
  }

  public void setStrategicAbilities(List<MissionGrantedAbility> strategicAbilities) {
    this.strategicAbilities = strategicAbilities;
  }


  public TerritoryReconZoneDefinition combatType(CombatType combatType) {
    this.combatType = combatType;
    return this;
  }

  /**
   * Get combatType
   * @return combatType
   */
  @javax.annotation.Nullable
  public CombatType getCombatType() {
    return combatType;
  }

  public void setCombatType(CombatType combatType) {
    this.combatType = combatType;
  }


  public TerritoryReconZoneDefinition territoryBattleZoneUnitType(TerritoryBattleZoneUnitType territoryBattleZoneUnitType) {
    this.territoryBattleZoneUnitType = territoryBattleZoneUnitType;
    return this;
  }

  /**
   * Get territoryBattleZoneUnitType
   * @return territoryBattleZoneUnitType
   */
  @javax.annotation.Nullable
  public TerritoryBattleZoneUnitType getTerritoryBattleZoneUnitType() {
    return territoryBattleZoneUnitType;
  }

  public void setTerritoryBattleZoneUnitType(TerritoryBattleZoneUnitType territoryBattleZoneUnitType) {
    this.territoryBattleZoneUnitType = territoryBattleZoneUnitType;
  }


  public TerritoryReconZoneDefinition unitRelicTier(RelicTier unitRelicTier) {
    this.unitRelicTier = unitRelicTier;
    return this;
  }

  /**
   * Get unitRelicTier
   * @return unitRelicTier
   */
  @javax.annotation.Nullable
  public RelicTier getUnitRelicTier() {
    return unitRelicTier;
  }

  public void setUnitRelicTier(RelicTier unitRelicTier) {
    this.unitRelicTier = unitRelicTier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerritoryReconZoneDefinition territoryReconZoneDefinition = (TerritoryReconZoneDefinition) o;
    return Objects.equals(this.zoneDefinition, territoryReconZoneDefinition.zoneDefinition) &&
        Objects.equals(this.platoonDefinition, territoryReconZoneDefinition.platoonDefinition) &&
        Objects.equals(this.abilityImage, territoryReconZoneDefinition.abilityImage) &&
        Objects.equals(this.abilityShortDescKey, territoryReconZoneDefinition.abilityShortDescKey) &&
        Objects.equals(this.abilityLongDescKey, territoryReconZoneDefinition.abilityLongDescKey) &&
        Objects.equals(this.goalDescKey, territoryReconZoneDefinition.goalDescKey) &&
        Objects.equals(this.goalImage, territoryReconZoneDefinition.goalImage) &&
        Objects.equals(this.unitRarity, territoryReconZoneDefinition.unitRarity) &&
        Objects.equals(this.rewardDescKey, territoryReconZoneDefinition.rewardDescKey) &&
        Objects.equals(this.subTitleKey, territoryReconZoneDefinition.subTitleKey) &&
        Objects.equals(this.grantedAbilities, territoryReconZoneDefinition.grantedAbilities) &&
        Objects.equals(this.strategicAbilities, territoryReconZoneDefinition.strategicAbilities) &&
        Objects.equals(this.combatType, territoryReconZoneDefinition.combatType) &&
        Objects.equals(this.territoryBattleZoneUnitType, territoryReconZoneDefinition.territoryBattleZoneUnitType) &&
        Objects.equals(this.unitRelicTier, territoryReconZoneDefinition.unitRelicTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneDefinition, platoonDefinition, abilityImage, abilityShortDescKey, abilityLongDescKey, goalDescKey, goalImage, unitRarity, rewardDescKey, subTitleKey, grantedAbilities, strategicAbilities, combatType, territoryBattleZoneUnitType, unitRelicTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerritoryReconZoneDefinition {\n");
    sb.append("    zoneDefinition: ").append(toIndentedString(zoneDefinition)).append("\n");
    sb.append("    platoonDefinition: ").append(toIndentedString(platoonDefinition)).append("\n");
    sb.append("    abilityImage: ").append(toIndentedString(abilityImage)).append("\n");
    sb.append("    abilityShortDescKey: ").append(toIndentedString(abilityShortDescKey)).append("\n");
    sb.append("    abilityLongDescKey: ").append(toIndentedString(abilityLongDescKey)).append("\n");
    sb.append("    goalDescKey: ").append(toIndentedString(goalDescKey)).append("\n");
    sb.append("    goalImage: ").append(toIndentedString(goalImage)).append("\n");
    sb.append("    unitRarity: ").append(toIndentedString(unitRarity)).append("\n");
    sb.append("    rewardDescKey: ").append(toIndentedString(rewardDescKey)).append("\n");
    sb.append("    subTitleKey: ").append(toIndentedString(subTitleKey)).append("\n");
    sb.append("    grantedAbilities: ").append(toIndentedString(grantedAbilities)).append("\n");
    sb.append("    strategicAbilities: ").append(toIndentedString(strategicAbilities)).append("\n");
    sb.append("    combatType: ").append(toIndentedString(combatType)).append("\n");
    sb.append("    territoryBattleZoneUnitType: ").append(toIndentedString(territoryBattleZoneUnitType)).append("\n");
    sb.append("    unitRelicTier: ").append(toIndentedString(unitRelicTier)).append("\n");
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
    openapiFields.add("zoneDefinition");
    openapiFields.add("platoonDefinition");
    openapiFields.add("abilityImage");
    openapiFields.add("abilityShortDescKey");
    openapiFields.add("abilityLongDescKey");
    openapiFields.add("goalDescKey");
    openapiFields.add("goalImage");
    openapiFields.add("unitRarity");
    openapiFields.add("rewardDescKey");
    openapiFields.add("subTitleKey");
    openapiFields.add("grantedAbilities");
    openapiFields.add("strategicAbilities");
    openapiFields.add("combatType");
    openapiFields.add("territoryBattleZoneUnitType");
    openapiFields.add("unitRelicTier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerritoryReconZoneDefinition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerritoryReconZoneDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerritoryReconZoneDefinition is not found in the empty JSON string", TerritoryReconZoneDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerritoryReconZoneDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerritoryReconZoneDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `zoneDefinition`
      if (jsonObj.get("zoneDefinition") != null && !jsonObj.get("zoneDefinition").isJsonNull()) {
        TerritoryZoneDefinition.validateJsonElement(jsonObj.get("zoneDefinition"));
      }
      if (jsonObj.get("platoonDefinition") != null && !jsonObj.get("platoonDefinition").isJsonNull()) {
        JsonArray jsonArrayplatoonDefinition = jsonObj.getAsJsonArray("platoonDefinition");
        if (jsonArrayplatoonDefinition != null) {
          // ensure the json data is an array
          if (!jsonObj.get("platoonDefinition").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `platoonDefinition` to be an array in the JSON string but got `%s`", jsonObj.get("platoonDefinition").toString()));
          }

          // validate the optional field `platoonDefinition` (array)
          for (int i = 0; i < jsonArrayplatoonDefinition.size(); i++) {
            TerritoryReconPlatoonDefinition.validateJsonElement(jsonArrayplatoonDefinition.get(i));
          };
        }
      }
      if ((jsonObj.get("abilityImage") != null && !jsonObj.get("abilityImage").isJsonNull()) && !jsonObj.get("abilityImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abilityImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abilityImage").toString()));
      }
      if ((jsonObj.get("abilityShortDescKey") != null && !jsonObj.get("abilityShortDescKey").isJsonNull()) && !jsonObj.get("abilityShortDescKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abilityShortDescKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abilityShortDescKey").toString()));
      }
      if ((jsonObj.get("abilityLongDescKey") != null && !jsonObj.get("abilityLongDescKey").isJsonNull()) && !jsonObj.get("abilityLongDescKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abilityLongDescKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abilityLongDescKey").toString()));
      }
      if ((jsonObj.get("goalDescKey") != null && !jsonObj.get("goalDescKey").isJsonNull()) && !jsonObj.get("goalDescKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goalDescKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goalDescKey").toString()));
      }
      if ((jsonObj.get("goalImage") != null && !jsonObj.get("goalImage").isJsonNull()) && !jsonObj.get("goalImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goalImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goalImage").toString()));
      }
      // validate the optional field `unitRarity`
      if (jsonObj.get("unitRarity") != null && !jsonObj.get("unitRarity").isJsonNull()) {
        Rarity.validateJsonElement(jsonObj.get("unitRarity"));
      }
      if ((jsonObj.get("rewardDescKey") != null && !jsonObj.get("rewardDescKey").isJsonNull()) && !jsonObj.get("rewardDescKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rewardDescKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rewardDescKey").toString()));
      }
      if ((jsonObj.get("subTitleKey") != null && !jsonObj.get("subTitleKey").isJsonNull()) && !jsonObj.get("subTitleKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subTitleKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subTitleKey").toString()));
      }
      if (jsonObj.get("grantedAbilities") != null && !jsonObj.get("grantedAbilities").isJsonNull()) {
        JsonArray jsonArraygrantedAbilities = jsonObj.getAsJsonArray("grantedAbilities");
        if (jsonArraygrantedAbilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grantedAbilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grantedAbilities` to be an array in the JSON string but got `%s`", jsonObj.get("grantedAbilities").toString()));
          }

          // validate the optional field `grantedAbilities` (array)
          for (int i = 0; i < jsonArraygrantedAbilities.size(); i++) {
            MissionGrantedAbility.validateJsonElement(jsonArraygrantedAbilities.get(i));
          };
        }
      }
      if (jsonObj.get("strategicAbilities") != null && !jsonObj.get("strategicAbilities").isJsonNull()) {
        JsonArray jsonArraystrategicAbilities = jsonObj.getAsJsonArray("strategicAbilities");
        if (jsonArraystrategicAbilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("strategicAbilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `strategicAbilities` to be an array in the JSON string but got `%s`", jsonObj.get("strategicAbilities").toString()));
          }

          // validate the optional field `strategicAbilities` (array)
          for (int i = 0; i < jsonArraystrategicAbilities.size(); i++) {
            MissionGrantedAbility.validateJsonElement(jsonArraystrategicAbilities.get(i));
          };
        }
      }
      // validate the optional field `combatType`
      if (jsonObj.get("combatType") != null && !jsonObj.get("combatType").isJsonNull()) {
        CombatType.validateJsonElement(jsonObj.get("combatType"));
      }
      // validate the optional field `territoryBattleZoneUnitType`
      if (jsonObj.get("territoryBattleZoneUnitType") != null && !jsonObj.get("territoryBattleZoneUnitType").isJsonNull()) {
        TerritoryBattleZoneUnitType.validateJsonElement(jsonObj.get("territoryBattleZoneUnitType"));
      }
      // validate the optional field `unitRelicTier`
      if (jsonObj.get("unitRelicTier") != null && !jsonObj.get("unitRelicTier").isJsonNull()) {
        RelicTier.validateJsonElement(jsonObj.get("unitRelicTier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerritoryReconZoneDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerritoryReconZoneDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerritoryReconZoneDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerritoryReconZoneDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TerritoryReconZoneDefinition>() {
           @Override
           public void write(JsonWriter out, TerritoryReconZoneDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerritoryReconZoneDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerritoryReconZoneDefinition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerritoryReconZoneDefinition
   * @throws IOException if the JSON string is invalid with respect to TerritoryReconZoneDefinition
   */
  public static TerritoryReconZoneDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerritoryReconZoneDefinition.class);
  }

  /**
   * Convert an instance of TerritoryReconZoneDefinition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
