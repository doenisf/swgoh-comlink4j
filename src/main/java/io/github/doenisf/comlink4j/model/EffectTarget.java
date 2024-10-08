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
import io.github.doenisf.comlink4j.model.BattleDeploymentState;
import io.github.doenisf.comlink4j.model.EffectTagCriteria;
import io.github.doenisf.comlink4j.model.EffectTargetBattleSide;
import io.github.doenisf.comlink4j.model.EffectTargetCategoryCriteria;
import io.github.doenisf.comlink4j.model.EffectTargetUnitSelect;
import io.github.doenisf.comlink4j.model.ForceAlignment;
import io.github.doenisf.comlink4j.model.StatValueRange;
import io.github.doenisf.comlink4j.model.UnitClass;
import io.github.doenisf.comlink4j.model.UnitHealthState;
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
 * EffectTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class EffectTarget {
  public static final String SERIALIZED_NAME_UNIT_SELECT = "unitSelect";
  @SerializedName(SERIALIZED_NAME_UNIT_SELECT)
  private EffectTargetUnitSelect unitSelect;

  public static final String SERIALIZED_NAME_BATTLE_SIDE = "battleSide";
  @SerializedName(SERIALIZED_NAME_BATTLE_SIDE)
  private EffectTargetBattleSide battleSide;

  public static final String SERIALIZED_NAME_UNIT_CLASS = "unitClass";
  @SerializedName(SERIALIZED_NAME_UNIT_CLASS)
  private List<UnitClass> unitClass = new ArrayList<>();

  public static final String SERIALIZED_NAME_FORCE_ALIGNMENT = "forceAlignment";
  @SerializedName(SERIALIZED_NAME_FORCE_ALIGNMENT)
  private List<ForceAlignment> forceAlignment = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private EffectTargetCategoryCriteria category;

  public static final String SERIALIZED_NAME_HEALTH_STATE = "healthState";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATE)
  private UnitHealthState healthState;

  public static final String SERIALIZED_NAME_STAT_VALUE = "statValue";
  @SerializedName(SERIALIZED_NAME_STAT_VALUE)
  private List<StatValueRange> statValue = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVE_EFFECT_TAG_CRITERIA = "activeEffectTagCriteria";
  @SerializedName(SERIALIZED_NAME_ACTIVE_EFFECT_TAG_CRITERIA)
  private List<EffectTagCriteria> activeEffectTagCriteria = new ArrayList<>();

  public static final String SERIALIZED_NAME_BATTLE_DEPLOYMENT_STATE = "battleDeploymentState";
  @SerializedName(SERIALIZED_NAME_BATTLE_DEPLOYMENT_STATE)
  private BattleDeploymentState battleDeploymentState;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXCLUDE_SELF = "excludeSelf";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SELF)
  private Boolean excludeSelf;

  public static final String SERIALIZED_NAME_EXCLUDE_SELECTED_TARGET = "excludeSelectedTarget";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SELECTED_TARGET)
  private Boolean excludeSelectedTarget;

  public static final String SERIALIZED_NAME_REQUIRED_CATEGORY = "requiredCategory";
  @SerializedName(SERIALIZED_NAME_REQUIRED_CATEGORY)
  private EffectTargetCategoryCriteria requiredCategory;

  public static final String SERIALIZED_NAME_REQUIRED_ACTIVE_EFFECT_TAG_CRITERIA = "requiredActiveEffectTagCriteria";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACTIVE_EFFECT_TAG_CRITERIA)
  private List<EffectTagCriteria> requiredActiveEffectTagCriteria = new ArrayList<>();

  public EffectTarget() {
  }

  public EffectTarget unitSelect(EffectTargetUnitSelect unitSelect) {
    this.unitSelect = unitSelect;
    return this;
  }

  /**
   * Get unitSelect
   * @return unitSelect
   */
  @javax.annotation.Nullable
  public EffectTargetUnitSelect getUnitSelect() {
    return unitSelect;
  }

  public void setUnitSelect(EffectTargetUnitSelect unitSelect) {
    this.unitSelect = unitSelect;
  }


  public EffectTarget battleSide(EffectTargetBattleSide battleSide) {
    this.battleSide = battleSide;
    return this;
  }

  /**
   * Get battleSide
   * @return battleSide
   */
  @javax.annotation.Nullable
  public EffectTargetBattleSide getBattleSide() {
    return battleSide;
  }

  public void setBattleSide(EffectTargetBattleSide battleSide) {
    this.battleSide = battleSide;
  }


  public EffectTarget unitClass(List<UnitClass> unitClass) {
    this.unitClass = unitClass;
    return this;
  }

  public EffectTarget addUnitClassItem(UnitClass unitClassItem) {
    if (this.unitClass == null) {
      this.unitClass = new ArrayList<>();
    }
    this.unitClass.add(unitClassItem);
    return this;
  }

  /**
   * Get unitClass
   * @return unitClass
   */
  @javax.annotation.Nullable
  public List<UnitClass> getUnitClass() {
    return unitClass;
  }

  public void setUnitClass(List<UnitClass> unitClass) {
    this.unitClass = unitClass;
  }


  public EffectTarget forceAlignment(List<ForceAlignment> forceAlignment) {
    this.forceAlignment = forceAlignment;
    return this;
  }

  public EffectTarget addForceAlignmentItem(ForceAlignment forceAlignmentItem) {
    if (this.forceAlignment == null) {
      this.forceAlignment = new ArrayList<>();
    }
    this.forceAlignment.add(forceAlignmentItem);
    return this;
  }

  /**
   * Get forceAlignment
   * @return forceAlignment
   */
  @javax.annotation.Nullable
  public List<ForceAlignment> getForceAlignment() {
    return forceAlignment;
  }

  public void setForceAlignment(List<ForceAlignment> forceAlignment) {
    this.forceAlignment = forceAlignment;
  }


  public EffectTarget category(EffectTargetCategoryCriteria category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  public EffectTargetCategoryCriteria getCategory() {
    return category;
  }

  public void setCategory(EffectTargetCategoryCriteria category) {
    this.category = category;
  }


  public EffectTarget healthState(UnitHealthState healthState) {
    this.healthState = healthState;
    return this;
  }

  /**
   * Get healthState
   * @return healthState
   */
  @javax.annotation.Nullable
  public UnitHealthState getHealthState() {
    return healthState;
  }

  public void setHealthState(UnitHealthState healthState) {
    this.healthState = healthState;
  }


  public EffectTarget statValue(List<StatValueRange> statValue) {
    this.statValue = statValue;
    return this;
  }

  public EffectTarget addStatValueItem(StatValueRange statValueItem) {
    if (this.statValue == null) {
      this.statValue = new ArrayList<>();
    }
    this.statValue.add(statValueItem);
    return this;
  }

  /**
   * Get statValue
   * @return statValue
   */
  @javax.annotation.Nullable
  public List<StatValueRange> getStatValue() {
    return statValue;
  }

  public void setStatValue(List<StatValueRange> statValue) {
    this.statValue = statValue;
  }


  public EffectTarget activeEffectTagCriteria(List<EffectTagCriteria> activeEffectTagCriteria) {
    this.activeEffectTagCriteria = activeEffectTagCriteria;
    return this;
  }

  public EffectTarget addActiveEffectTagCriteriaItem(EffectTagCriteria activeEffectTagCriteriaItem) {
    if (this.activeEffectTagCriteria == null) {
      this.activeEffectTagCriteria = new ArrayList<>();
    }
    this.activeEffectTagCriteria.add(activeEffectTagCriteriaItem);
    return this;
  }

  /**
   * Get activeEffectTagCriteria
   * @return activeEffectTagCriteria
   */
  @javax.annotation.Nullable
  public List<EffectTagCriteria> getActiveEffectTagCriteria() {
    return activeEffectTagCriteria;
  }

  public void setActiveEffectTagCriteria(List<EffectTagCriteria> activeEffectTagCriteria) {
    this.activeEffectTagCriteria = activeEffectTagCriteria;
  }


  public EffectTarget battleDeploymentState(BattleDeploymentState battleDeploymentState) {
    this.battleDeploymentState = battleDeploymentState;
    return this;
  }

  /**
   * Get battleDeploymentState
   * @return battleDeploymentState
   */
  @javax.annotation.Nullable
  public BattleDeploymentState getBattleDeploymentState() {
    return battleDeploymentState;
  }

  public void setBattleDeploymentState(BattleDeploymentState battleDeploymentState) {
    this.battleDeploymentState = battleDeploymentState;
  }


  public EffectTarget id(String id) {
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


  public EffectTarget excludeSelf(Boolean excludeSelf) {
    this.excludeSelf = excludeSelf;
    return this;
  }

  /**
   * Get excludeSelf
   * @return excludeSelf
   */
  @javax.annotation.Nullable
  public Boolean getExcludeSelf() {
    return excludeSelf;
  }

  public void setExcludeSelf(Boolean excludeSelf) {
    this.excludeSelf = excludeSelf;
  }


  public EffectTarget excludeSelectedTarget(Boolean excludeSelectedTarget) {
    this.excludeSelectedTarget = excludeSelectedTarget;
    return this;
  }

  /**
   * Get excludeSelectedTarget
   * @return excludeSelectedTarget
   */
  @javax.annotation.Nullable
  public Boolean getExcludeSelectedTarget() {
    return excludeSelectedTarget;
  }

  public void setExcludeSelectedTarget(Boolean excludeSelectedTarget) {
    this.excludeSelectedTarget = excludeSelectedTarget;
  }


  public EffectTarget requiredCategory(EffectTargetCategoryCriteria requiredCategory) {
    this.requiredCategory = requiredCategory;
    return this;
  }

  /**
   * Get requiredCategory
   * @return requiredCategory
   */
  @javax.annotation.Nullable
  public EffectTargetCategoryCriteria getRequiredCategory() {
    return requiredCategory;
  }

  public void setRequiredCategory(EffectTargetCategoryCriteria requiredCategory) {
    this.requiredCategory = requiredCategory;
  }


  public EffectTarget requiredActiveEffectTagCriteria(List<EffectTagCriteria> requiredActiveEffectTagCriteria) {
    this.requiredActiveEffectTagCriteria = requiredActiveEffectTagCriteria;
    return this;
  }

  public EffectTarget addRequiredActiveEffectTagCriteriaItem(EffectTagCriteria requiredActiveEffectTagCriteriaItem) {
    if (this.requiredActiveEffectTagCriteria == null) {
      this.requiredActiveEffectTagCriteria = new ArrayList<>();
    }
    this.requiredActiveEffectTagCriteria.add(requiredActiveEffectTagCriteriaItem);
    return this;
  }

  /**
   * Get requiredActiveEffectTagCriteria
   * @return requiredActiveEffectTagCriteria
   */
  @javax.annotation.Nullable
  public List<EffectTagCriteria> getRequiredActiveEffectTagCriteria() {
    return requiredActiveEffectTagCriteria;
  }

  public void setRequiredActiveEffectTagCriteria(List<EffectTagCriteria> requiredActiveEffectTagCriteria) {
    this.requiredActiveEffectTagCriteria = requiredActiveEffectTagCriteria;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectTarget effectTarget = (EffectTarget) o;
    return Objects.equals(this.unitSelect, effectTarget.unitSelect) &&
        Objects.equals(this.battleSide, effectTarget.battleSide) &&
        Objects.equals(this.unitClass, effectTarget.unitClass) &&
        Objects.equals(this.forceAlignment, effectTarget.forceAlignment) &&
        Objects.equals(this.category, effectTarget.category) &&
        Objects.equals(this.healthState, effectTarget.healthState) &&
        Objects.equals(this.statValue, effectTarget.statValue) &&
        Objects.equals(this.activeEffectTagCriteria, effectTarget.activeEffectTagCriteria) &&
        Objects.equals(this.battleDeploymentState, effectTarget.battleDeploymentState) &&
        Objects.equals(this.id, effectTarget.id) &&
        Objects.equals(this.excludeSelf, effectTarget.excludeSelf) &&
        Objects.equals(this.excludeSelectedTarget, effectTarget.excludeSelectedTarget) &&
        Objects.equals(this.requiredCategory, effectTarget.requiredCategory) &&
        Objects.equals(this.requiredActiveEffectTagCriteria, effectTarget.requiredActiveEffectTagCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitSelect, battleSide, unitClass, forceAlignment, category, healthState, statValue, activeEffectTagCriteria, battleDeploymentState, id, excludeSelf, excludeSelectedTarget, requiredCategory, requiredActiveEffectTagCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectTarget {\n");
    sb.append("    unitSelect: ").append(toIndentedString(unitSelect)).append("\n");
    sb.append("    battleSide: ").append(toIndentedString(battleSide)).append("\n");
    sb.append("    unitClass: ").append(toIndentedString(unitClass)).append("\n");
    sb.append("    forceAlignment: ").append(toIndentedString(forceAlignment)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
    sb.append("    statValue: ").append(toIndentedString(statValue)).append("\n");
    sb.append("    activeEffectTagCriteria: ").append(toIndentedString(activeEffectTagCriteria)).append("\n");
    sb.append("    battleDeploymentState: ").append(toIndentedString(battleDeploymentState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    excludeSelf: ").append(toIndentedString(excludeSelf)).append("\n");
    sb.append("    excludeSelectedTarget: ").append(toIndentedString(excludeSelectedTarget)).append("\n");
    sb.append("    requiredCategory: ").append(toIndentedString(requiredCategory)).append("\n");
    sb.append("    requiredActiveEffectTagCriteria: ").append(toIndentedString(requiredActiveEffectTagCriteria)).append("\n");
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
    openapiFields.add("unitSelect");
    openapiFields.add("battleSide");
    openapiFields.add("unitClass");
    openapiFields.add("forceAlignment");
    openapiFields.add("category");
    openapiFields.add("healthState");
    openapiFields.add("statValue");
    openapiFields.add("activeEffectTagCriteria");
    openapiFields.add("battleDeploymentState");
    openapiFields.add("id");
    openapiFields.add("excludeSelf");
    openapiFields.add("excludeSelectedTarget");
    openapiFields.add("requiredCategory");
    openapiFields.add("requiredActiveEffectTagCriteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EffectTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EffectTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EffectTarget is not found in the empty JSON string", EffectTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EffectTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EffectTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `unitSelect`
      if (jsonObj.get("unitSelect") != null && !jsonObj.get("unitSelect").isJsonNull()) {
        EffectTargetUnitSelect.validateJsonElement(jsonObj.get("unitSelect"));
      }
      // validate the optional field `battleSide`
      if (jsonObj.get("battleSide") != null && !jsonObj.get("battleSide").isJsonNull()) {
        EffectTargetBattleSide.validateJsonElement(jsonObj.get("battleSide"));
      }
      if (jsonObj.get("unitClass") != null && !jsonObj.get("unitClass").isJsonNull()) {
        JsonArray jsonArrayunitClass = jsonObj.getAsJsonArray("unitClass");
        if (jsonArrayunitClass != null) {
          // ensure the json data is an array
          if (!jsonObj.get("unitClass").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `unitClass` to be an array in the JSON string but got `%s`", jsonObj.get("unitClass").toString()));
          }

          // validate the optional field `unitClass` (array)
          for (int i = 0; i < jsonArrayunitClass.size(); i++) {
            UnitClass.validateJsonElement(jsonArrayunitClass.get(i));
          };
        }
      }
      if (jsonObj.get("forceAlignment") != null && !jsonObj.get("forceAlignment").isJsonNull()) {
        JsonArray jsonArrayforceAlignment = jsonObj.getAsJsonArray("forceAlignment");
        if (jsonArrayforceAlignment != null) {
          // ensure the json data is an array
          if (!jsonObj.get("forceAlignment").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `forceAlignment` to be an array in the JSON string but got `%s`", jsonObj.get("forceAlignment").toString()));
          }

          // validate the optional field `forceAlignment` (array)
          for (int i = 0; i < jsonArrayforceAlignment.size(); i++) {
            ForceAlignment.validateJsonElement(jsonArrayforceAlignment.get(i));
          };
        }
      }
      // validate the optional field `category`
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        EffectTargetCategoryCriteria.validateJsonElement(jsonObj.get("category"));
      }
      // validate the optional field `healthState`
      if (jsonObj.get("healthState") != null && !jsonObj.get("healthState").isJsonNull()) {
        UnitHealthState.validateJsonElement(jsonObj.get("healthState"));
      }
      if (jsonObj.get("statValue") != null && !jsonObj.get("statValue").isJsonNull()) {
        JsonArray jsonArraystatValue = jsonObj.getAsJsonArray("statValue");
        if (jsonArraystatValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statValue` to be an array in the JSON string but got `%s`", jsonObj.get("statValue").toString()));
          }

          // validate the optional field `statValue` (array)
          for (int i = 0; i < jsonArraystatValue.size(); i++) {
            StatValueRange.validateJsonElement(jsonArraystatValue.get(i));
          };
        }
      }
      if (jsonObj.get("activeEffectTagCriteria") != null && !jsonObj.get("activeEffectTagCriteria").isJsonNull()) {
        JsonArray jsonArrayactiveEffectTagCriteria = jsonObj.getAsJsonArray("activeEffectTagCriteria");
        if (jsonArrayactiveEffectTagCriteria != null) {
          // ensure the json data is an array
          if (!jsonObj.get("activeEffectTagCriteria").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `activeEffectTagCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("activeEffectTagCriteria").toString()));
          }

          // validate the optional field `activeEffectTagCriteria` (array)
          for (int i = 0; i < jsonArrayactiveEffectTagCriteria.size(); i++) {
            EffectTagCriteria.validateJsonElement(jsonArrayactiveEffectTagCriteria.get(i));
          };
        }
      }
      // validate the optional field `battleDeploymentState`
      if (jsonObj.get("battleDeploymentState") != null && !jsonObj.get("battleDeploymentState").isJsonNull()) {
        BattleDeploymentState.validateJsonElement(jsonObj.get("battleDeploymentState"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `requiredCategory`
      if (jsonObj.get("requiredCategory") != null && !jsonObj.get("requiredCategory").isJsonNull()) {
        EffectTargetCategoryCriteria.validateJsonElement(jsonObj.get("requiredCategory"));
      }
      if (jsonObj.get("requiredActiveEffectTagCriteria") != null && !jsonObj.get("requiredActiveEffectTagCriteria").isJsonNull()) {
        JsonArray jsonArrayrequiredActiveEffectTagCriteria = jsonObj.getAsJsonArray("requiredActiveEffectTagCriteria");
        if (jsonArrayrequiredActiveEffectTagCriteria != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requiredActiveEffectTagCriteria").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requiredActiveEffectTagCriteria` to be an array in the JSON string but got `%s`", jsonObj.get("requiredActiveEffectTagCriteria").toString()));
          }

          // validate the optional field `requiredActiveEffectTagCriteria` (array)
          for (int i = 0; i < jsonArrayrequiredActiveEffectTagCriteria.size(); i++) {
            EffectTagCriteria.validateJsonElement(jsonArrayrequiredActiveEffectTagCriteria.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EffectTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EffectTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EffectTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EffectTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<EffectTarget>() {
           @Override
           public void write(JsonWriter out, EffectTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EffectTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EffectTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EffectTarget
   * @throws IOException if the JSON string is invalid with respect to EffectTarget
   */
  public static EffectTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EffectTarget.class);
  }

  /**
   * Convert an instance of EffectTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

