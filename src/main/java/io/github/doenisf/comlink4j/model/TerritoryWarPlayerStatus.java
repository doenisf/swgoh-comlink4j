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
import io.github.doenisf.comlink4j.model.DatacronBattleStat;
import io.github.doenisf.comlink4j.model.TerritoryPlayerDatacronStatus;
import io.github.doenisf.comlink4j.model.TerritoryPlayerUnitStatus;
import io.github.doenisf.comlink4j.model.UnitBattleStat;
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
 * TerritoryWarPlayerStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-05T21:53:04.897531600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class TerritoryWarPlayerStatus {
  public static final String SERIALIZED_NAME_UNIT_STATUS = "unitStatus";
  @SerializedName(SERIALIZED_NAME_UNIT_STATUS)
  private List<TerritoryPlayerUnitStatus> unitStatus = new ArrayList<>();

  public static final String SERIALIZED_NAME_WAR_ROSTER = "warRoster";
  @SerializedName(SERIALIZED_NAME_WAR_ROSTER)
  private List<UnitBattleStat> warRoster = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATACRON_ROSTER = "datacronRoster";
  @SerializedName(SERIALIZED_NAME_DATACRON_ROSTER)
  private List<DatacronBattleStat> datacronRoster = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATACRON_STATUS = "datacronStatus";
  @SerializedName(SERIALIZED_NAME_DATACRON_STATUS)
  private List<TerritoryPlayerDatacronStatus> datacronStatus = new ArrayList<>();

  public TerritoryWarPlayerStatus() {
  }

  public TerritoryWarPlayerStatus unitStatus(List<TerritoryPlayerUnitStatus> unitStatus) {
    this.unitStatus = unitStatus;
    return this;
  }

  public TerritoryWarPlayerStatus addUnitStatusItem(TerritoryPlayerUnitStatus unitStatusItem) {
    if (this.unitStatus == null) {
      this.unitStatus = new ArrayList<>();
    }
    this.unitStatus.add(unitStatusItem);
    return this;
  }

  /**
   * Get unitStatus
   * @return unitStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryPlayerUnitStatus> getUnitStatus() {
    return unitStatus;
  }

  public void setUnitStatus(List<TerritoryPlayerUnitStatus> unitStatus) {
    this.unitStatus = unitStatus;
  }


  public TerritoryWarPlayerStatus warRoster(List<UnitBattleStat> warRoster) {
    this.warRoster = warRoster;
    return this;
  }

  public TerritoryWarPlayerStatus addWarRosterItem(UnitBattleStat warRosterItem) {
    if (this.warRoster == null) {
      this.warRoster = new ArrayList<>();
    }
    this.warRoster.add(warRosterItem);
    return this;
  }

  /**
   * Get warRoster
   * @return warRoster
   */
  @javax.annotation.Nullable
  public List<UnitBattleStat> getWarRoster() {
    return warRoster;
  }

  public void setWarRoster(List<UnitBattleStat> warRoster) {
    this.warRoster = warRoster;
  }


  public TerritoryWarPlayerStatus datacronRoster(List<DatacronBattleStat> datacronRoster) {
    this.datacronRoster = datacronRoster;
    return this;
  }

  public TerritoryWarPlayerStatus addDatacronRosterItem(DatacronBattleStat datacronRosterItem) {
    if (this.datacronRoster == null) {
      this.datacronRoster = new ArrayList<>();
    }
    this.datacronRoster.add(datacronRosterItem);
    return this;
  }

  /**
   * Get datacronRoster
   * @return datacronRoster
   */
  @javax.annotation.Nullable
  public List<DatacronBattleStat> getDatacronRoster() {
    return datacronRoster;
  }

  public void setDatacronRoster(List<DatacronBattleStat> datacronRoster) {
    this.datacronRoster = datacronRoster;
  }


  public TerritoryWarPlayerStatus datacronStatus(List<TerritoryPlayerDatacronStatus> datacronStatus) {
    this.datacronStatus = datacronStatus;
    return this;
  }

  public TerritoryWarPlayerStatus addDatacronStatusItem(TerritoryPlayerDatacronStatus datacronStatusItem) {
    if (this.datacronStatus == null) {
      this.datacronStatus = new ArrayList<>();
    }
    this.datacronStatus.add(datacronStatusItem);
    return this;
  }

  /**
   * Get datacronStatus
   * @return datacronStatus
   */
  @javax.annotation.Nullable
  public List<TerritoryPlayerDatacronStatus> getDatacronStatus() {
    return datacronStatus;
  }

  public void setDatacronStatus(List<TerritoryPlayerDatacronStatus> datacronStatus) {
    this.datacronStatus = datacronStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerritoryWarPlayerStatus territoryWarPlayerStatus = (TerritoryWarPlayerStatus) o;
    return Objects.equals(this.unitStatus, territoryWarPlayerStatus.unitStatus) &&
        Objects.equals(this.warRoster, territoryWarPlayerStatus.warRoster) &&
        Objects.equals(this.datacronRoster, territoryWarPlayerStatus.datacronRoster) &&
        Objects.equals(this.datacronStatus, territoryWarPlayerStatus.datacronStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitStatus, warRoster, datacronRoster, datacronStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerritoryWarPlayerStatus {\n");
    sb.append("    unitStatus: ").append(toIndentedString(unitStatus)).append("\n");
    sb.append("    warRoster: ").append(toIndentedString(warRoster)).append("\n");
    sb.append("    datacronRoster: ").append(toIndentedString(datacronRoster)).append("\n");
    sb.append("    datacronStatus: ").append(toIndentedString(datacronStatus)).append("\n");
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
    openapiFields.add("unitStatus");
    openapiFields.add("warRoster");
    openapiFields.add("datacronRoster");
    openapiFields.add("datacronStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerritoryWarPlayerStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerritoryWarPlayerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerritoryWarPlayerStatus is not found in the empty JSON string", TerritoryWarPlayerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerritoryWarPlayerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerritoryWarPlayerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("unitStatus") != null && !jsonObj.get("unitStatus").isJsonNull()) {
        JsonArray jsonArrayunitStatus = jsonObj.getAsJsonArray("unitStatus");
        if (jsonArrayunitStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("unitStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `unitStatus` to be an array in the JSON string but got `%s`", jsonObj.get("unitStatus").toString()));
          }

          // validate the optional field `unitStatus` (array)
          for (int i = 0; i < jsonArrayunitStatus.size(); i++) {
            TerritoryPlayerUnitStatus.validateJsonElement(jsonArrayunitStatus.get(i));
          };
        }
      }
      if (jsonObj.get("warRoster") != null && !jsonObj.get("warRoster").isJsonNull()) {
        JsonArray jsonArraywarRoster = jsonObj.getAsJsonArray("warRoster");
        if (jsonArraywarRoster != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warRoster").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warRoster` to be an array in the JSON string but got `%s`", jsonObj.get("warRoster").toString()));
          }

          // validate the optional field `warRoster` (array)
          for (int i = 0; i < jsonArraywarRoster.size(); i++) {
            UnitBattleStat.validateJsonElement(jsonArraywarRoster.get(i));
          };
        }
      }
      if (jsonObj.get("datacronRoster") != null && !jsonObj.get("datacronRoster").isJsonNull()) {
        JsonArray jsonArraydatacronRoster = jsonObj.getAsJsonArray("datacronRoster");
        if (jsonArraydatacronRoster != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datacronRoster").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datacronRoster` to be an array in the JSON string but got `%s`", jsonObj.get("datacronRoster").toString()));
          }

          // validate the optional field `datacronRoster` (array)
          for (int i = 0; i < jsonArraydatacronRoster.size(); i++) {
            DatacronBattleStat.validateJsonElement(jsonArraydatacronRoster.get(i));
          };
        }
      }
      if (jsonObj.get("datacronStatus") != null && !jsonObj.get("datacronStatus").isJsonNull()) {
        JsonArray jsonArraydatacronStatus = jsonObj.getAsJsonArray("datacronStatus");
        if (jsonArraydatacronStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datacronStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datacronStatus` to be an array in the JSON string but got `%s`", jsonObj.get("datacronStatus").toString()));
          }

          // validate the optional field `datacronStatus` (array)
          for (int i = 0; i < jsonArraydatacronStatus.size(); i++) {
            TerritoryPlayerDatacronStatus.validateJsonElement(jsonArraydatacronStatus.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerritoryWarPlayerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerritoryWarPlayerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerritoryWarPlayerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerritoryWarPlayerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TerritoryWarPlayerStatus>() {
           @Override
           public void write(JsonWriter out, TerritoryWarPlayerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerritoryWarPlayerStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerritoryWarPlayerStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerritoryWarPlayerStatus
   * @throws IOException if the JSON string is invalid with respect to TerritoryWarPlayerStatus
   */
  public static TerritoryWarPlayerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerritoryWarPlayerStatus.class);
  }

  /**
   * Convert an instance of TerritoryWarPlayerStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

