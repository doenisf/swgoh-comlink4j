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
import io.github.doenisf.comlink4j.model.TerritoryBattlePlayerStatus;
import io.github.doenisf.comlink4j.model.TerritoryConflictZoneStatus;
import io.github.doenisf.comlink4j.model.TerritoryCovertZoneStatus;
import io.github.doenisf.comlink4j.model.TerritoryMapStat;
import io.github.doenisf.comlink4j.model.TerritoryReconZoneStatus;
import io.github.doenisf.comlink4j.model.TerritoryStrikeZoneStatus;
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
 * TerritoryBattleStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class TerritoryBattleStatus {
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_DEFINITION_ID = "definitionId";
  @SerializedName(SERIALIZED_NAME_DEFINITION_ID)
  private String definitionId;

  public static final String SERIALIZED_NAME_CONFLICT_ZONE_STATUS = "conflictZoneStatus";
  @SerializedName(SERIALIZED_NAME_CONFLICT_ZONE_STATUS)
  private List<TerritoryConflictZoneStatus> conflictZoneStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRIKE_ZONE_STATUS = "strikeZoneStatus";
  @SerializedName(SERIALIZED_NAME_STRIKE_ZONE_STATUS)
  private List<TerritoryStrikeZoneStatus> strikeZoneStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECON_ZONE_STATUS = "reconZoneStatus";
  @SerializedName(SERIALIZED_NAME_RECON_ZONE_STATUS)
  private List<TerritoryReconZoneStatus> reconZoneStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLAYER_STATUS = "playerStatus";
  @SerializedName(SERIALIZED_NAME_PLAYER_STATUS)
  private TerritoryBattlePlayerStatus playerStatus;

  public static final String SERIALIZED_NAME_CURRENT_ROUND = "currentRound";
  @SerializedName(SERIALIZED_NAME_CURRENT_ROUND)
  private Integer currentRound;

  public static final String SERIALIZED_NAME_CURRENT_ROUND_END_TIME = "currentRoundEndTime";
  @SerializedName(SERIALIZED_NAME_CURRENT_ROUND_END_TIME)
  private Long currentRoundEndTime;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public static final String SERIALIZED_NAME_COVERT_ZONE_STATUS = "covertZoneStatus";
  @SerializedName(SERIALIZED_NAME_COVERT_ZONE_STATUS)
  private List<TerritoryCovertZoneStatus> covertZoneStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_STAT = "currentStat";
  @SerializedName(SERIALIZED_NAME_CURRENT_STAT)
  private List<TerritoryMapStat> currentStat = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_COMMAND_NOTIFICATION_TIME = "lastCommandNotificationTime";
  @SerializedName(SERIALIZED_NAME_LAST_COMMAND_NOTIFICATION_TIME)
  private Long lastCommandNotificationTime;

  public static final String SERIALIZED_NAME_MAP_COMPLETED_EARLY = "mapCompletedEarly";
  @SerializedName(SERIALIZED_NAME_MAP_COMPLETED_EARLY)
  private Boolean mapCompletedEarly;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;

  public TerritoryBattleStatus() {
  }

  public TerritoryBattleStatus instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
   */
  @javax.annotation.Nullable
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public TerritoryBattleStatus definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

  /**
   * Get definitionId
   * @return definitionId
   */
  @javax.annotation.Nullable
  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }


  public TerritoryBattleStatus conflictZoneStatus(List<TerritoryConflictZoneStatus> conflictZoneStatus) {
    this.conflictZoneStatus = conflictZoneStatus;
    return this;
  }

  public TerritoryBattleStatus addConflictZoneStatusItem(TerritoryConflictZoneStatus conflictZoneStatusItem) {
    if (this.conflictZoneStatus == null) {
      this.conflictZoneStatus = new ArrayList<>();
    }
    this.conflictZoneStatus.add(conflictZoneStatusItem);
    return this;
  }

  /**
   * Get conflictZoneStatus
   * @return conflictZoneStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryConflictZoneStatus> getConflictZoneStatus() {
    return conflictZoneStatus;
  }

  public void setConflictZoneStatus(List<TerritoryConflictZoneStatus> conflictZoneStatus) {
    this.conflictZoneStatus = conflictZoneStatus;
  }


  public TerritoryBattleStatus strikeZoneStatus(List<TerritoryStrikeZoneStatus> strikeZoneStatus) {
    this.strikeZoneStatus = strikeZoneStatus;
    return this;
  }

  public TerritoryBattleStatus addStrikeZoneStatusItem(TerritoryStrikeZoneStatus strikeZoneStatusItem) {
    if (this.strikeZoneStatus == null) {
      this.strikeZoneStatus = new ArrayList<>();
    }
    this.strikeZoneStatus.add(strikeZoneStatusItem);
    return this;
  }

  /**
   * Get strikeZoneStatus
   * @return strikeZoneStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryStrikeZoneStatus> getStrikeZoneStatus() {
    return strikeZoneStatus;
  }

  public void setStrikeZoneStatus(List<TerritoryStrikeZoneStatus> strikeZoneStatus) {
    this.strikeZoneStatus = strikeZoneStatus;
  }


  public TerritoryBattleStatus reconZoneStatus(List<TerritoryReconZoneStatus> reconZoneStatus) {
    this.reconZoneStatus = reconZoneStatus;
    return this;
  }

  public TerritoryBattleStatus addReconZoneStatusItem(TerritoryReconZoneStatus reconZoneStatusItem) {
    if (this.reconZoneStatus == null) {
      this.reconZoneStatus = new ArrayList<>();
    }
    this.reconZoneStatus.add(reconZoneStatusItem);
    return this;
  }

  /**
   * Get reconZoneStatus
   * @return reconZoneStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryReconZoneStatus> getReconZoneStatus() {
    return reconZoneStatus;
  }

  public void setReconZoneStatus(List<TerritoryReconZoneStatus> reconZoneStatus) {
    this.reconZoneStatus = reconZoneStatus;
  }


  public TerritoryBattleStatus playerStatus(TerritoryBattlePlayerStatus playerStatus) {
    this.playerStatus = playerStatus;
    return this;
  }

  /**
   * Get playerStatus
   * @return playerStatus
   */
  @javax.annotation.Nullable
  public TerritoryBattlePlayerStatus getPlayerStatus() {
    return playerStatus;
  }

  public void setPlayerStatus(TerritoryBattlePlayerStatus playerStatus) {
    this.playerStatus = playerStatus;
  }


  public TerritoryBattleStatus currentRound(Integer currentRound) {
    this.currentRound = currentRound;
    return this;
  }

  /**
   * Get currentRound
   * @return currentRound
   */
  @javax.annotation.Nullable
  public Integer getCurrentRound() {
    return currentRound;
  }

  public void setCurrentRound(Integer currentRound) {
    this.currentRound = currentRound;
  }


  public TerritoryBattleStatus currentRoundEndTime(Long currentRoundEndTime) {
    this.currentRoundEndTime = currentRoundEndTime;
    return this;
  }

  /**
   * Get currentRoundEndTime
   * @return currentRoundEndTime
   */
  @javax.annotation.Nullable
  public Long getCurrentRoundEndTime() {
    return currentRoundEndTime;
  }

  public void setCurrentRoundEndTime(Long currentRoundEndTime) {
    this.currentRoundEndTime = currentRoundEndTime;
  }


  public TerritoryBattleStatus channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
   */
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public TerritoryBattleStatus covertZoneStatus(List<TerritoryCovertZoneStatus> covertZoneStatus) {
    this.covertZoneStatus = covertZoneStatus;
    return this;
  }

  public TerritoryBattleStatus addCovertZoneStatusItem(TerritoryCovertZoneStatus covertZoneStatusItem) {
    if (this.covertZoneStatus == null) {
      this.covertZoneStatus = new ArrayList<>();
    }
    this.covertZoneStatus.add(covertZoneStatusItem);
    return this;
  }

  /**
   * Get covertZoneStatus
   * @return covertZoneStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryCovertZoneStatus> getCovertZoneStatus() {
    return covertZoneStatus;
  }

  public void setCovertZoneStatus(List<TerritoryCovertZoneStatus> covertZoneStatus) {
    this.covertZoneStatus = covertZoneStatus;
  }


  public TerritoryBattleStatus currentStat(List<TerritoryMapStat> currentStat) {
    this.currentStat = currentStat;
    return this;
  }

  public TerritoryBattleStatus addCurrentStatItem(TerritoryMapStat currentStatItem) {
    if (this.currentStat == null) {
      this.currentStat = new ArrayList<>();
    }
    this.currentStat.add(currentStatItem);
    return this;
  }

  /**
   * Get currentStat
   * @return currentStat
   */
  @javax.annotation.Nullable
  public List<TerritoryMapStat> getCurrentStat() {
    return currentStat;
  }

  public void setCurrentStat(List<TerritoryMapStat> currentStat) {
    this.currentStat = currentStat;
  }


  public TerritoryBattleStatus lastCommandNotificationTime(Long lastCommandNotificationTime) {
    this.lastCommandNotificationTime = lastCommandNotificationTime;
    return this;
  }

  /**
   * Get lastCommandNotificationTime
   * @return lastCommandNotificationTime
   */
  @javax.annotation.Nullable
  public Long getLastCommandNotificationTime() {
    return lastCommandNotificationTime;
  }

  public void setLastCommandNotificationTime(Long lastCommandNotificationTime) {
    this.lastCommandNotificationTime = lastCommandNotificationTime;
  }


  public TerritoryBattleStatus mapCompletedEarly(Boolean mapCompletedEarly) {
    this.mapCompletedEarly = mapCompletedEarly;
    return this;
  }

  /**
   * Get mapCompletedEarly
   * @return mapCompletedEarly
   */
  @javax.annotation.Nullable
  public Boolean getMapCompletedEarly() {
    return mapCompletedEarly;
  }

  public void setMapCompletedEarly(Boolean mapCompletedEarly) {
    this.mapCompletedEarly = mapCompletedEarly;
  }


  public TerritoryBattleStatus selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Get selected
   * @return selected
   */
  @javax.annotation.Nullable
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerritoryBattleStatus territoryBattleStatus = (TerritoryBattleStatus) o;
    return Objects.equals(this.instanceId, territoryBattleStatus.instanceId) &&
        Objects.equals(this.definitionId, territoryBattleStatus.definitionId) &&
        Objects.equals(this.conflictZoneStatus, territoryBattleStatus.conflictZoneStatus) &&
        Objects.equals(this.strikeZoneStatus, territoryBattleStatus.strikeZoneStatus) &&
        Objects.equals(this.reconZoneStatus, territoryBattleStatus.reconZoneStatus) &&
        Objects.equals(this.playerStatus, territoryBattleStatus.playerStatus) &&
        Objects.equals(this.currentRound, territoryBattleStatus.currentRound) &&
        Objects.equals(this.currentRoundEndTime, territoryBattleStatus.currentRoundEndTime) &&
        Objects.equals(this.channelId, territoryBattleStatus.channelId) &&
        Objects.equals(this.covertZoneStatus, territoryBattleStatus.covertZoneStatus) &&
        Objects.equals(this.currentStat, territoryBattleStatus.currentStat) &&
        Objects.equals(this.lastCommandNotificationTime, territoryBattleStatus.lastCommandNotificationTime) &&
        Objects.equals(this.mapCompletedEarly, territoryBattleStatus.mapCompletedEarly) &&
        Objects.equals(this.selected, territoryBattleStatus.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, definitionId, conflictZoneStatus, strikeZoneStatus, reconZoneStatus, playerStatus, currentRound, currentRoundEndTime, channelId, covertZoneStatus, currentStat, lastCommandNotificationTime, mapCompletedEarly, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerritoryBattleStatus {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    conflictZoneStatus: ").append(toIndentedString(conflictZoneStatus)).append("\n");
    sb.append("    strikeZoneStatus: ").append(toIndentedString(strikeZoneStatus)).append("\n");
    sb.append("    reconZoneStatus: ").append(toIndentedString(reconZoneStatus)).append("\n");
    sb.append("    playerStatus: ").append(toIndentedString(playerStatus)).append("\n");
    sb.append("    currentRound: ").append(toIndentedString(currentRound)).append("\n");
    sb.append("    currentRoundEndTime: ").append(toIndentedString(currentRoundEndTime)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    covertZoneStatus: ").append(toIndentedString(covertZoneStatus)).append("\n");
    sb.append("    currentStat: ").append(toIndentedString(currentStat)).append("\n");
    sb.append("    lastCommandNotificationTime: ").append(toIndentedString(lastCommandNotificationTime)).append("\n");
    sb.append("    mapCompletedEarly: ").append(toIndentedString(mapCompletedEarly)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
    openapiFields.add("instanceId");
    openapiFields.add("definitionId");
    openapiFields.add("conflictZoneStatus");
    openapiFields.add("strikeZoneStatus");
    openapiFields.add("reconZoneStatus");
    openapiFields.add("playerStatus");
    openapiFields.add("currentRound");
    openapiFields.add("currentRoundEndTime");
    openapiFields.add("channelId");
    openapiFields.add("covertZoneStatus");
    openapiFields.add("currentStat");
    openapiFields.add("lastCommandNotificationTime");
    openapiFields.add("mapCompletedEarly");
    openapiFields.add("selected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerritoryBattleStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerritoryBattleStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerritoryBattleStatus is not found in the empty JSON string", TerritoryBattleStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerritoryBattleStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerritoryBattleStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("instanceId") != null && !jsonObj.get("instanceId").isJsonNull()) && !jsonObj.get("instanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceId").toString()));
      }
      if ((jsonObj.get("definitionId") != null && !jsonObj.get("definitionId").isJsonNull()) && !jsonObj.get("definitionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `definitionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("definitionId").toString()));
      }
      if (jsonObj.get("conflictZoneStatus") != null && !jsonObj.get("conflictZoneStatus").isJsonNull()) {
        JsonArray jsonArrayconflictZoneStatus = jsonObj.getAsJsonArray("conflictZoneStatus");
        if (jsonArrayconflictZoneStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conflictZoneStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conflictZoneStatus` to be an array in the JSON string but got `%s`", jsonObj.get("conflictZoneStatus").toString()));
          }

          // validate the optional field `conflictZoneStatus` (array)
          for (int i = 0; i < jsonArrayconflictZoneStatus.size(); i++) {
            TerritoryConflictZoneStatus.validateJsonElement(jsonArrayconflictZoneStatus.get(i));
          };
        }
      }
      if (jsonObj.get("strikeZoneStatus") != null && !jsonObj.get("strikeZoneStatus").isJsonNull()) {
        JsonArray jsonArraystrikeZoneStatus = jsonObj.getAsJsonArray("strikeZoneStatus");
        if (jsonArraystrikeZoneStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("strikeZoneStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `strikeZoneStatus` to be an array in the JSON string but got `%s`", jsonObj.get("strikeZoneStatus").toString()));
          }

          // validate the optional field `strikeZoneStatus` (array)
          for (int i = 0; i < jsonArraystrikeZoneStatus.size(); i++) {
            TerritoryStrikeZoneStatus.validateJsonElement(jsonArraystrikeZoneStatus.get(i));
          };
        }
      }
      if (jsonObj.get("reconZoneStatus") != null && !jsonObj.get("reconZoneStatus").isJsonNull()) {
        JsonArray jsonArrayreconZoneStatus = jsonObj.getAsJsonArray("reconZoneStatus");
        if (jsonArrayreconZoneStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reconZoneStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reconZoneStatus` to be an array in the JSON string but got `%s`", jsonObj.get("reconZoneStatus").toString()));
          }

          // validate the optional field `reconZoneStatus` (array)
          for (int i = 0; i < jsonArrayreconZoneStatus.size(); i++) {
            TerritoryReconZoneStatus.validateJsonElement(jsonArrayreconZoneStatus.get(i));
          };
        }
      }
      // validate the optional field `playerStatus`
      if (jsonObj.get("playerStatus") != null && !jsonObj.get("playerStatus").isJsonNull()) {
        TerritoryBattlePlayerStatus.validateJsonElement(jsonObj.get("playerStatus"));
      }
      if ((jsonObj.get("channelId") != null && !jsonObj.get("channelId").isJsonNull()) && !jsonObj.get("channelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelId").toString()));
      }
      if (jsonObj.get("covertZoneStatus") != null && !jsonObj.get("covertZoneStatus").isJsonNull()) {
        JsonArray jsonArraycovertZoneStatus = jsonObj.getAsJsonArray("covertZoneStatus");
        if (jsonArraycovertZoneStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("covertZoneStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `covertZoneStatus` to be an array in the JSON string but got `%s`", jsonObj.get("covertZoneStatus").toString()));
          }

          // validate the optional field `covertZoneStatus` (array)
          for (int i = 0; i < jsonArraycovertZoneStatus.size(); i++) {
            TerritoryCovertZoneStatus.validateJsonElement(jsonArraycovertZoneStatus.get(i));
          };
        }
      }
      if (jsonObj.get("currentStat") != null && !jsonObj.get("currentStat").isJsonNull()) {
        JsonArray jsonArraycurrentStat = jsonObj.getAsJsonArray("currentStat");
        if (jsonArraycurrentStat != null) {
          // ensure the json data is an array
          if (!jsonObj.get("currentStat").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `currentStat` to be an array in the JSON string but got `%s`", jsonObj.get("currentStat").toString()));
          }

          // validate the optional field `currentStat` (array)
          for (int i = 0; i < jsonArraycurrentStat.size(); i++) {
            TerritoryMapStat.validateJsonElement(jsonArraycurrentStat.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerritoryBattleStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerritoryBattleStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerritoryBattleStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerritoryBattleStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TerritoryBattleStatus>() {
           @Override
           public void write(JsonWriter out, TerritoryBattleStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerritoryBattleStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerritoryBattleStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerritoryBattleStatus
   * @throws IOException if the JSON string is invalid with respect to TerritoryBattleStatus
   */
  public static TerritoryBattleStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerritoryBattleStatus.class);
  }

  /**
   * Convert an instance of TerritoryBattleStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

