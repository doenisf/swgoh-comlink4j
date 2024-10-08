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
import io.github.doenisf.comlink4j.model.PlayerPvpProfile;
import io.github.doenisf.comlink4j.model.PlayerRating;
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
 * GetPlayerArenaProfile2XXResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GetPlayerArenaProfile2XXResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_ALLY_CODE = "allyCode";
  @SerializedName(SERIALIZED_NAME_ALLY_CODE)
  private Long allyCode;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_PVP_PROFILE = "pvpProfile";
  @SerializedName(SERIALIZED_NAME_PVP_PROFILE)
  private List<PlayerPvpProfile> pvpProfile = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCAL_TIME_ZONE_OFFSET_MINUTES = "localTimeZoneOffsetMinutes";
  @SerializedName(SERIALIZED_NAME_LOCAL_TIME_ZONE_OFFSET_MINUTES)
  private Integer localTimeZoneOffsetMinutes;

  public static final String SERIALIZED_NAME_LIFETIME_SEASON_SCORE = "lifetimeSeasonScore";
  @SerializedName(SERIALIZED_NAME_LIFETIME_SEASON_SCORE)
  private Long lifetimeSeasonScore;

  public static final String SERIALIZED_NAME_PLAYER_RATING = "playerRating";
  @SerializedName(SERIALIZED_NAME_PLAYER_RATING)
  private PlayerRating playerRating;

  public static final String SERIALIZED_NAME_NUCLEUS_ID = "nucleusId";
  @SerializedName(SERIALIZED_NAME_NUCLEUS_ID)
  private String nucleusId;

  public GetPlayerArenaProfile2XXResponse() {
  }

  public GetPlayerArenaProfile2XXResponse name(String name) {
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


  public GetPlayerArenaProfile2XXResponse level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public GetPlayerArenaProfile2XXResponse allyCode(Long allyCode) {
    this.allyCode = allyCode;
    return this;
  }

  /**
   * Get allyCode
   * @return allyCode
   */
  @javax.annotation.Nullable
  public Long getAllyCode() {
    return allyCode;
  }

  public void setAllyCode(Long allyCode) {
    this.allyCode = allyCode;
  }


  public GetPlayerArenaProfile2XXResponse playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Get playerId
   * @return playerId
   */
  @javax.annotation.Nullable
  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  public GetPlayerArenaProfile2XXResponse pvpProfile(List<PlayerPvpProfile> pvpProfile) {
    this.pvpProfile = pvpProfile;
    return this;
  }

  public GetPlayerArenaProfile2XXResponse addPvpProfileItem(PlayerPvpProfile pvpProfileItem) {
    if (this.pvpProfile == null) {
      this.pvpProfile = new ArrayList<>();
    }
    this.pvpProfile.add(pvpProfileItem);
    return this;
  }

  /**
   * Get pvpProfile
   * @return pvpProfile
   */
  @javax.annotation.Nullable
  public List<PlayerPvpProfile> getPvpProfile() {
    return pvpProfile;
  }

  public void setPvpProfile(List<PlayerPvpProfile> pvpProfile) {
    this.pvpProfile = pvpProfile;
  }


  public GetPlayerArenaProfile2XXResponse localTimeZoneOffsetMinutes(Integer localTimeZoneOffsetMinutes) {
    this.localTimeZoneOffsetMinutes = localTimeZoneOffsetMinutes;
    return this;
  }

  /**
   * Get localTimeZoneOffsetMinutes
   * @return localTimeZoneOffsetMinutes
   */
  @javax.annotation.Nullable
  public Integer getLocalTimeZoneOffsetMinutes() {
    return localTimeZoneOffsetMinutes;
  }

  public void setLocalTimeZoneOffsetMinutes(Integer localTimeZoneOffsetMinutes) {
    this.localTimeZoneOffsetMinutes = localTimeZoneOffsetMinutes;
  }


  public GetPlayerArenaProfile2XXResponse lifetimeSeasonScore(Long lifetimeSeasonScore) {
    this.lifetimeSeasonScore = lifetimeSeasonScore;
    return this;
  }

  /**
   * Get lifetimeSeasonScore
   * @return lifetimeSeasonScore
   */
  @javax.annotation.Nullable
  public Long getLifetimeSeasonScore() {
    return lifetimeSeasonScore;
  }

  public void setLifetimeSeasonScore(Long lifetimeSeasonScore) {
    this.lifetimeSeasonScore = lifetimeSeasonScore;
  }


  public GetPlayerArenaProfile2XXResponse playerRating(PlayerRating playerRating) {
    this.playerRating = playerRating;
    return this;
  }

  /**
   * Get playerRating
   * @return playerRating
   */
  @javax.annotation.Nullable
  public PlayerRating getPlayerRating() {
    return playerRating;
  }

  public void setPlayerRating(PlayerRating playerRating) {
    this.playerRating = playerRating;
  }


  public GetPlayerArenaProfile2XXResponse nucleusId(String nucleusId) {
    this.nucleusId = nucleusId;
    return this;
  }

  /**
   * Get nucleusId
   * @return nucleusId
   */
  @javax.annotation.Nullable
  public String getNucleusId() {
    return nucleusId;
  }

  public void setNucleusId(String nucleusId) {
    this.nucleusId = nucleusId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlayerArenaProfile2XXResponse getPlayerArenaProfile2XXResponse = (GetPlayerArenaProfile2XXResponse) o;
    return Objects.equals(this.name, getPlayerArenaProfile2XXResponse.name) &&
        Objects.equals(this.level, getPlayerArenaProfile2XXResponse.level) &&
        Objects.equals(this.allyCode, getPlayerArenaProfile2XXResponse.allyCode) &&
        Objects.equals(this.playerId, getPlayerArenaProfile2XXResponse.playerId) &&
        Objects.equals(this.pvpProfile, getPlayerArenaProfile2XXResponse.pvpProfile) &&
        Objects.equals(this.localTimeZoneOffsetMinutes, getPlayerArenaProfile2XXResponse.localTimeZoneOffsetMinutes) &&
        Objects.equals(this.lifetimeSeasonScore, getPlayerArenaProfile2XXResponse.lifetimeSeasonScore) &&
        Objects.equals(this.playerRating, getPlayerArenaProfile2XXResponse.playerRating) &&
        Objects.equals(this.nucleusId, getPlayerArenaProfile2XXResponse.nucleusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, level, allyCode, playerId, pvpProfile, localTimeZoneOffsetMinutes, lifetimeSeasonScore, playerRating, nucleusId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPlayerArenaProfile2XXResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    allyCode: ").append(toIndentedString(allyCode)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    pvpProfile: ").append(toIndentedString(pvpProfile)).append("\n");
    sb.append("    localTimeZoneOffsetMinutes: ").append(toIndentedString(localTimeZoneOffsetMinutes)).append("\n");
    sb.append("    lifetimeSeasonScore: ").append(toIndentedString(lifetimeSeasonScore)).append("\n");
    sb.append("    playerRating: ").append(toIndentedString(playerRating)).append("\n");
    sb.append("    nucleusId: ").append(toIndentedString(nucleusId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("level");
    openapiFields.add("allyCode");
    openapiFields.add("playerId");
    openapiFields.add("pvpProfile");
    openapiFields.add("localTimeZoneOffsetMinutes");
    openapiFields.add("lifetimeSeasonScore");
    openapiFields.add("playerRating");
    openapiFields.add("nucleusId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPlayerArenaProfile2XXResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPlayerArenaProfile2XXResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPlayerArenaProfile2XXResponse is not found in the empty JSON string", GetPlayerArenaProfile2XXResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPlayerArenaProfile2XXResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPlayerArenaProfile2XXResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
      if (jsonObj.get("pvpProfile") != null && !jsonObj.get("pvpProfile").isJsonNull()) {
        JsonArray jsonArraypvpProfile = jsonObj.getAsJsonArray("pvpProfile");
        if (jsonArraypvpProfile != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pvpProfile").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pvpProfile` to be an array in the JSON string but got `%s`", jsonObj.get("pvpProfile").toString()));
          }

          // validate the optional field `pvpProfile` (array)
          for (int i = 0; i < jsonArraypvpProfile.size(); i++) {
            PlayerPvpProfile.validateJsonElement(jsonArraypvpProfile.get(i));
          };
        }
      }
      // validate the optional field `playerRating`
      if (jsonObj.get("playerRating") != null && !jsonObj.get("playerRating").isJsonNull()) {
        PlayerRating.validateJsonElement(jsonObj.get("playerRating"));
      }
      if ((jsonObj.get("nucleusId") != null && !jsonObj.get("nucleusId").isJsonNull()) && !jsonObj.get("nucleusId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nucleusId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nucleusId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPlayerArenaProfile2XXResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPlayerArenaProfile2XXResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPlayerArenaProfile2XXResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPlayerArenaProfile2XXResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPlayerArenaProfile2XXResponse>() {
           @Override
           public void write(JsonWriter out, GetPlayerArenaProfile2XXResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPlayerArenaProfile2XXResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPlayerArenaProfile2XXResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPlayerArenaProfile2XXResponse
   * @throws IOException if the JSON string is invalid with respect to GetPlayerArenaProfile2XXResponse
   */
  public static GetPlayerArenaProfile2XXResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPlayerArenaProfile2XXResponse.class);
  }

  /**
   * Convert an instance of GetPlayerArenaProfile2XXResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

