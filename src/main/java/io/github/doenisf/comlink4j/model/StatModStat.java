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
import io.github.doenisf.comlink4j.Stat;
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
 * StatModStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class StatModStat {
  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private Stat stat;

  public static final String SERIALIZED_NAME_ROLL = "roll";
  @SerializedName(SERIALIZED_NAME_ROLL)
  private List<String> roll = new ArrayList<>();

  public static final String SERIALIZED_NAME_STAT_ROLLS = "statRolls";
  @SerializedName(SERIALIZED_NAME_STAT_ROLLS)
  private Integer statRolls;

  public static final String SERIALIZED_NAME_STAT_ROLLER_BOUNDS_MIN = "statRollerBoundsMin";
  @SerializedName(SERIALIZED_NAME_STAT_ROLLER_BOUNDS_MIN)
  private Long statRollerBoundsMin;

  public static final String SERIALIZED_NAME_STAT_ROLLER_BOUNDS_MAX = "statRollerBoundsMax";
  @SerializedName(SERIALIZED_NAME_STAT_ROLLER_BOUNDS_MAX)
  private Long statRollerBoundsMax;

  public static final String SERIALIZED_NAME_UNSCALED_ROLL_VALUE = "unscaledRollValue";
  @SerializedName(SERIALIZED_NAME_UNSCALED_ROLL_VALUE)
  private List<Long> unscaledRollValue = new ArrayList<>();

  public StatModStat() {
  }

  public StatModStat stat(Stat stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @javax.annotation.Nullable
  public Stat getStat() {
    return stat;
  }

  public void setStat(Stat stat) {
    this.stat = stat;
  }


  public StatModStat roll(List<String> roll) {
    this.roll = roll;
    return this;
  }

  public StatModStat addRollItem(String rollItem) {
    if (this.roll == null) {
      this.roll = new ArrayList<>();
    }
    this.roll.add(rollItem);
    return this;
  }

  /**
   * Get roll
   * @return roll
   */
  @javax.annotation.Nullable
  public List<String> getRoll() {
    return roll;
  }

  public void setRoll(List<String> roll) {
    this.roll = roll;
  }


  public StatModStat statRolls(Integer statRolls) {
    this.statRolls = statRolls;
    return this;
  }

  /**
   * Get statRolls
   * @return statRolls
   */
  @javax.annotation.Nullable
  public Integer getStatRolls() {
    return statRolls;
  }

  public void setStatRolls(Integer statRolls) {
    this.statRolls = statRolls;
  }


  public StatModStat statRollerBoundsMin(Long statRollerBoundsMin) {
    this.statRollerBoundsMin = statRollerBoundsMin;
    return this;
  }

  /**
   * Get statRollerBoundsMin
   * @return statRollerBoundsMin
   */
  @javax.annotation.Nullable
  public Long getStatRollerBoundsMin() {
    return statRollerBoundsMin;
  }

  public void setStatRollerBoundsMin(Long statRollerBoundsMin) {
    this.statRollerBoundsMin = statRollerBoundsMin;
  }


  public StatModStat statRollerBoundsMax(Long statRollerBoundsMax) {
    this.statRollerBoundsMax = statRollerBoundsMax;
    return this;
  }

  /**
   * Get statRollerBoundsMax
   * @return statRollerBoundsMax
   */
  @javax.annotation.Nullable
  public Long getStatRollerBoundsMax() {
    return statRollerBoundsMax;
  }

  public void setStatRollerBoundsMax(Long statRollerBoundsMax) {
    this.statRollerBoundsMax = statRollerBoundsMax;
  }


  public StatModStat unscaledRollValue(List<Long> unscaledRollValue) {
    this.unscaledRollValue = unscaledRollValue;
    return this;
  }

  public StatModStat addUnscaledRollValueItem(Long unscaledRollValueItem) {
    if (this.unscaledRollValue == null) {
      this.unscaledRollValue = new ArrayList<>();
    }
    this.unscaledRollValue.add(unscaledRollValueItem);
    return this;
  }

  /**
   * Get unscaledRollValue
   * @return unscaledRollValue
   */
  @javax.annotation.Nullable
  public List<Long> getUnscaledRollValue() {
    return unscaledRollValue;
  }

  public void setUnscaledRollValue(List<Long> unscaledRollValue) {
    this.unscaledRollValue = unscaledRollValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatModStat statModStat = (StatModStat) o;
    return Objects.equals(this.stat, statModStat.stat) &&
        Objects.equals(this.roll, statModStat.roll) &&
        Objects.equals(this.statRolls, statModStat.statRolls) &&
        Objects.equals(this.statRollerBoundsMin, statModStat.statRollerBoundsMin) &&
        Objects.equals(this.statRollerBoundsMax, statModStat.statRollerBoundsMax) &&
        Objects.equals(this.unscaledRollValue, statModStat.unscaledRollValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stat, roll, statRolls, statRollerBoundsMin, statRollerBoundsMax, unscaledRollValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatModStat {\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    roll: ").append(toIndentedString(roll)).append("\n");
    sb.append("    statRolls: ").append(toIndentedString(statRolls)).append("\n");
    sb.append("    statRollerBoundsMin: ").append(toIndentedString(statRollerBoundsMin)).append("\n");
    sb.append("    statRollerBoundsMax: ").append(toIndentedString(statRollerBoundsMax)).append("\n");
    sb.append("    unscaledRollValue: ").append(toIndentedString(unscaledRollValue)).append("\n");
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
    openapiFields.add("stat");
    openapiFields.add("roll");
    openapiFields.add("statRolls");
    openapiFields.add("statRollerBoundsMin");
    openapiFields.add("statRollerBoundsMax");
    openapiFields.add("unscaledRollValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StatModStat
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatModStat.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatModStat is not found in the empty JSON string", StatModStat.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatModStat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatModStat` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `stat`
      if (jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) {
        Stat.validateJsonElement(jsonObj.get("stat"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roll") != null && !jsonObj.get("roll").isJsonNull() && !jsonObj.get("roll").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roll` to be an array in the JSON string but got `%s`", jsonObj.get("roll").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unscaledRollValue") != null && !jsonObj.get("unscaledRollValue").isJsonNull() && !jsonObj.get("unscaledRollValue").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unscaledRollValue` to be an array in the JSON string but got `%s`", jsonObj.get("unscaledRollValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatModStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatModStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatModStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatModStat.class));

       return (TypeAdapter<T>) new TypeAdapter<StatModStat>() {
           @Override
           public void write(JsonWriter out, StatModStat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatModStat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StatModStat given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StatModStat
   * @throws IOException if the JSON string is invalid with respect to StatModStat
   */
  public static StatModStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatModStat.class);
  }

  /**
   * Convert an instance of StatModStat to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
