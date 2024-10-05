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
import io.github.doenisf.comlink4j.CampaignElementIdentifier;
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
 * GuildRaidLaunchConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildRaidLaunchConfig {
  public static final String SERIALIZED_NAME_RAID_ID = "raidId";
  @SerializedName(SERIALIZED_NAME_RAID_ID)
  private String raidId;

  public static final String SERIALIZED_NAME_CAMPAIGN_MISSION_IDENTIFIER = "campaignMissionIdentifier";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_MISSION_IDENTIFIER)
  private CampaignElementIdentifier campaignMissionIdentifier;

  public static final String SERIALIZED_NAME_AUTO_LAUNCH = "autoLaunch";
  @SerializedName(SERIALIZED_NAME_AUTO_LAUNCH)
  private Boolean autoLaunch;

  public static final String SERIALIZED_NAME_AUTO_LAUNCH_IMMEDIATELY = "autoLaunchImmediately";
  @SerializedName(SERIALIZED_NAME_AUTO_LAUNCH_IMMEDIATELY)
  private Boolean autoLaunchImmediately;

  public static final String SERIALIZED_NAME_AUTO_LAUNCH_TIME = "autoLaunchTime";
  @SerializedName(SERIALIZED_NAME_AUTO_LAUNCH_TIME)
  private Long autoLaunchTime;

  public static final String SERIALIZED_NAME_JOIN_PERIOD_DURATION = "joinPeriodDuration";
  @SerializedName(SERIALIZED_NAME_JOIN_PERIOD_DURATION)
  private Long joinPeriodDuration;

  public static final String SERIALIZED_NAME_AUTO_SIM_ENABLED = "autoSimEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_SIM_ENABLED)
  private Boolean autoSimEnabled;

  public static final String SERIALIZED_NAME_IMMEDIATE = "immediate";
  @SerializedName(SERIALIZED_NAME_IMMEDIATE)
  private Boolean immediate;

  public static final String SERIALIZED_NAME_SCHEDULED_UTC_OFFSET_SECONDS = "scheduledUtcOffsetSeconds";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_UTC_OFFSET_SECONDS)
  private Long scheduledUtcOffsetSeconds;

  public GuildRaidLaunchConfig() {
  }

  public GuildRaidLaunchConfig raidId(String raidId) {
    this.raidId = raidId;
    return this;
  }

  /**
   * Get raidId
   * @return raidId
   */
  @javax.annotation.Nullable
  public String getRaidId() {
    return raidId;
  }

  public void setRaidId(String raidId) {
    this.raidId = raidId;
  }


  public GuildRaidLaunchConfig campaignMissionIdentifier(CampaignElementIdentifier campaignMissionIdentifier) {
    this.campaignMissionIdentifier = campaignMissionIdentifier;
    return this;
  }

  /**
   * Get campaignMissionIdentifier
   * @return campaignMissionIdentifier
   */
  @javax.annotation.Nullable
  public CampaignElementIdentifier getCampaignMissionIdentifier() {
    return campaignMissionIdentifier;
  }

  public void setCampaignMissionIdentifier(CampaignElementIdentifier campaignMissionIdentifier) {
    this.campaignMissionIdentifier = campaignMissionIdentifier;
  }


  public GuildRaidLaunchConfig autoLaunch(Boolean autoLaunch) {
    this.autoLaunch = autoLaunch;
    return this;
  }

  /**
   * Get autoLaunch
   * @return autoLaunch
   */
  @javax.annotation.Nullable
  public Boolean getAutoLaunch() {
    return autoLaunch;
  }

  public void setAutoLaunch(Boolean autoLaunch) {
    this.autoLaunch = autoLaunch;
  }


  public GuildRaidLaunchConfig autoLaunchImmediately(Boolean autoLaunchImmediately) {
    this.autoLaunchImmediately = autoLaunchImmediately;
    return this;
  }

  /**
   * Get autoLaunchImmediately
   * @return autoLaunchImmediately
   */
  @javax.annotation.Nullable
  public Boolean getAutoLaunchImmediately() {
    return autoLaunchImmediately;
  }

  public void setAutoLaunchImmediately(Boolean autoLaunchImmediately) {
    this.autoLaunchImmediately = autoLaunchImmediately;
  }


  public GuildRaidLaunchConfig autoLaunchTime(Long autoLaunchTime) {
    this.autoLaunchTime = autoLaunchTime;
    return this;
  }

  /**
   * Get autoLaunchTime
   * @return autoLaunchTime
   */
  @javax.annotation.Nullable
  public Long getAutoLaunchTime() {
    return autoLaunchTime;
  }

  public void setAutoLaunchTime(Long autoLaunchTime) {
    this.autoLaunchTime = autoLaunchTime;
  }


  public GuildRaidLaunchConfig joinPeriodDuration(Long joinPeriodDuration) {
    this.joinPeriodDuration = joinPeriodDuration;
    return this;
  }

  /**
   * Get joinPeriodDuration
   * @return joinPeriodDuration
   */
  @javax.annotation.Nullable
  public Long getJoinPeriodDuration() {
    return joinPeriodDuration;
  }

  public void setJoinPeriodDuration(Long joinPeriodDuration) {
    this.joinPeriodDuration = joinPeriodDuration;
  }


  public GuildRaidLaunchConfig autoSimEnabled(Boolean autoSimEnabled) {
    this.autoSimEnabled = autoSimEnabled;
    return this;
  }

  /**
   * Get autoSimEnabled
   * @return autoSimEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAutoSimEnabled() {
    return autoSimEnabled;
  }

  public void setAutoSimEnabled(Boolean autoSimEnabled) {
    this.autoSimEnabled = autoSimEnabled;
  }


  public GuildRaidLaunchConfig immediate(Boolean immediate) {
    this.immediate = immediate;
    return this;
  }

  /**
   * Get immediate
   * @return immediate
   */
  @javax.annotation.Nullable
  public Boolean getImmediate() {
    return immediate;
  }

  public void setImmediate(Boolean immediate) {
    this.immediate = immediate;
  }


  public GuildRaidLaunchConfig scheduledUtcOffsetSeconds(Long scheduledUtcOffsetSeconds) {
    this.scheduledUtcOffsetSeconds = scheduledUtcOffsetSeconds;
    return this;
  }

  /**
   * Get scheduledUtcOffsetSeconds
   * @return scheduledUtcOffsetSeconds
   */
  @javax.annotation.Nullable
  public Long getScheduledUtcOffsetSeconds() {
    return scheduledUtcOffsetSeconds;
  }

  public void setScheduledUtcOffsetSeconds(Long scheduledUtcOffsetSeconds) {
    this.scheduledUtcOffsetSeconds = scheduledUtcOffsetSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildRaidLaunchConfig guildRaidLaunchConfig = (GuildRaidLaunchConfig) o;
    return Objects.equals(this.raidId, guildRaidLaunchConfig.raidId) &&
        Objects.equals(this.campaignMissionIdentifier, guildRaidLaunchConfig.campaignMissionIdentifier) &&
        Objects.equals(this.autoLaunch, guildRaidLaunchConfig.autoLaunch) &&
        Objects.equals(this.autoLaunchImmediately, guildRaidLaunchConfig.autoLaunchImmediately) &&
        Objects.equals(this.autoLaunchTime, guildRaidLaunchConfig.autoLaunchTime) &&
        Objects.equals(this.joinPeriodDuration, guildRaidLaunchConfig.joinPeriodDuration) &&
        Objects.equals(this.autoSimEnabled, guildRaidLaunchConfig.autoSimEnabled) &&
        Objects.equals(this.immediate, guildRaidLaunchConfig.immediate) &&
        Objects.equals(this.scheduledUtcOffsetSeconds, guildRaidLaunchConfig.scheduledUtcOffsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raidId, campaignMissionIdentifier, autoLaunch, autoLaunchImmediately, autoLaunchTime, joinPeriodDuration, autoSimEnabled, immediate, scheduledUtcOffsetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildRaidLaunchConfig {\n");
    sb.append("    raidId: ").append(toIndentedString(raidId)).append("\n");
    sb.append("    campaignMissionIdentifier: ").append(toIndentedString(campaignMissionIdentifier)).append("\n");
    sb.append("    autoLaunch: ").append(toIndentedString(autoLaunch)).append("\n");
    sb.append("    autoLaunchImmediately: ").append(toIndentedString(autoLaunchImmediately)).append("\n");
    sb.append("    autoLaunchTime: ").append(toIndentedString(autoLaunchTime)).append("\n");
    sb.append("    joinPeriodDuration: ").append(toIndentedString(joinPeriodDuration)).append("\n");
    sb.append("    autoSimEnabled: ").append(toIndentedString(autoSimEnabled)).append("\n");
    sb.append("    immediate: ").append(toIndentedString(immediate)).append("\n");
    sb.append("    scheduledUtcOffsetSeconds: ").append(toIndentedString(scheduledUtcOffsetSeconds)).append("\n");
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
    openapiFields.add("raidId");
    openapiFields.add("campaignMissionIdentifier");
    openapiFields.add("autoLaunch");
    openapiFields.add("autoLaunchImmediately");
    openapiFields.add("autoLaunchTime");
    openapiFields.add("joinPeriodDuration");
    openapiFields.add("autoSimEnabled");
    openapiFields.add("immediate");
    openapiFields.add("scheduledUtcOffsetSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildRaidLaunchConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildRaidLaunchConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildRaidLaunchConfig is not found in the empty JSON string", GuildRaidLaunchConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildRaidLaunchConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildRaidLaunchConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("raidId") != null && !jsonObj.get("raidId").isJsonNull()) && !jsonObj.get("raidId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raidId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raidId").toString()));
      }
      // validate the optional field `campaignMissionIdentifier`
      if (jsonObj.get("campaignMissionIdentifier") != null && !jsonObj.get("campaignMissionIdentifier").isJsonNull()) {
        CampaignElementIdentifier.validateJsonElement(jsonObj.get("campaignMissionIdentifier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildRaidLaunchConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildRaidLaunchConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildRaidLaunchConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildRaidLaunchConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildRaidLaunchConfig>() {
           @Override
           public void write(JsonWriter out, GuildRaidLaunchConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildRaidLaunchConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildRaidLaunchConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildRaidLaunchConfig
   * @throws IOException if the JSON string is invalid with respect to GuildRaidLaunchConfig
   */
  public static GuildRaidLaunchConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildRaidLaunchConfig.class);
  }

  /**
   * Convert an instance of GuildRaidLaunchConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
