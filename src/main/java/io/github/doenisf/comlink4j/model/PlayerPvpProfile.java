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
import io.github.doenisf.comlink4j.PlayerProfileTab;
import io.github.doenisf.comlink4j.Squad;
import java.io.IOException;

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
 * PlayerPvpProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class PlayerPvpProfile {
  public static final String SERIALIZED_NAME_TAB = "tab";
  @SerializedName(SERIALIZED_NAME_TAB)
  private PlayerProfileTab tab;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_SQUAD = "squad";
  @SerializedName(SERIALIZED_NAME_SQUAD)
  private Squad squad;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public PlayerPvpProfile() {
  }

  public PlayerPvpProfile tab(PlayerProfileTab tab) {
    this.tab = tab;
    return this;
  }

  /**
   * Get tab
   * @return tab
   */
  @javax.annotation.Nullable
  public PlayerProfileTab getTab() {
    return tab;
  }

  public void setTab(PlayerProfileTab tab) {
    this.tab = tab;
  }


  public PlayerPvpProfile rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
   */
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public PlayerPvpProfile squad(Squad squad) {
    this.squad = squad;
    return this;
  }

  /**
   * Get squad
   * @return squad
   */
  @javax.annotation.Nullable
  public Squad getSquad() {
    return squad;
  }

  public void setSquad(Squad squad) {
    this.squad = squad;
  }


  public PlayerPvpProfile eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
   */
  @javax.annotation.Nullable
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerPvpProfile playerPvpProfile = (PlayerPvpProfile) o;
    return Objects.equals(this.tab, playerPvpProfile.tab) &&
        Objects.equals(this.rank, playerPvpProfile.rank) &&
        Objects.equals(this.squad, playerPvpProfile.squad) &&
        Objects.equals(this.eventId, playerPvpProfile.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tab, rank, squad, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerPvpProfile {\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    squad: ").append(toIndentedString(squad)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
    openapiFields.add("tab");
    openapiFields.add("rank");
    openapiFields.add("squad");
    openapiFields.add("eventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PlayerPvpProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayerPvpProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerPvpProfile is not found in the empty JSON string", PlayerPvpProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayerPvpProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerPvpProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `tab`
      if (jsonObj.get("tab") != null && !jsonObj.get("tab").isJsonNull()) {
        PlayerProfileTab.validateJsonElement(jsonObj.get("tab"));
      }
      // validate the optional field `squad`
      if (jsonObj.get("squad") != null && !jsonObj.get("squad").isJsonNull()) {
        Squad.validateJsonElement(jsonObj.get("squad"));
      }
      if ((jsonObj.get("eventId") != null && !jsonObj.get("eventId").isJsonNull()) && !jsonObj.get("eventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerPvpProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerPvpProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerPvpProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerPvpProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerPvpProfile>() {
           @Override
           public void write(JsonWriter out, PlayerPvpProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerPvpProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PlayerPvpProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlayerPvpProfile
   * @throws IOException if the JSON string is invalid with respect to PlayerPvpProfile
   */
  public static PlayerPvpProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerPvpProfile.class);
  }

  /**
   * Convert an instance of PlayerPvpProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
