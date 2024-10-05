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
import io.github.doenisf.comlink4j.GuildRaidLockout;
import io.github.doenisf.comlink4j.GuildRaidSim;
import io.github.doenisf.comlink4j.SquadType;
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
 * GuildRaid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class GuildRaid {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_NAME_KEY = "nameKey";
  @SerializedName(SERIALIZED_NAME_NAME_KEY)
  private String nameKey;

  public static final String SERIALIZED_NAME_SUMMARY_KEY = "summaryKey";
  @SerializedName(SERIALIZED_NAME_SUMMARY_KEY)
  private String summaryKey;

  public static final String SERIALIZED_NAME_DESC_KEY = "descKey";
  @SerializedName(SERIALIZED_NAME_DESC_KEY)
  private String descKey;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_SQUAD_TYPE = "squadType";
  @SerializedName(SERIALIZED_NAME_SQUAD_TYPE)
  private SquadType squadType;

  public static final String SERIALIZED_NAME_CAMPAIGN_ELEMENT_IDENTIFIER = "campaignElementIdentifier";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ELEMENT_IDENTIFIER)
  private CampaignElementIdentifier campaignElementIdentifier;

  public static final String SERIALIZED_NAME_ICON_PREFAB = "iconPrefab";
  @SerializedName(SERIALIZED_NAME_ICON_PREFAB)
  private String iconPrefab;

  public static final String SERIALIZED_NAME_PROMOTION_KEY = "promotionKey";
  @SerializedName(SERIALIZED_NAME_PROMOTION_KEY)
  private String promotionKey;

  public static final String SERIALIZED_NAME_PORTRAIT_ICON = "portraitIcon";
  @SerializedName(SERIALIZED_NAME_PORTRAIT_ICON)
  private String portraitIcon;

  public static final String SERIALIZED_NAME_RAID_SIM = "raidSim";
  @SerializedName(SERIALIZED_NAME_RAID_SIM)
  private GuildRaidSim raidSim;

  public static final String SERIALIZED_NAME_INFO_IMAGE = "infoImage";
  @SerializedName(SERIALIZED_NAME_INFO_IMAGE)
  private String infoImage;

  public static final String SERIALIZED_NAME_LOCKOUT = "lockout";
  @SerializedName(SERIALIZED_NAME_LOCKOUT)
  private GuildRaidLockout lockout;

  public static final String SERIALIZED_NAME_LEGACY_RAID = "legacyRaid";
  @SerializedName(SERIALIZED_NAME_LEGACY_RAID)
  private Boolean legacyRaid;

  public static final String SERIALIZED_NAME_CURRENCY_REWARD = "currencyReward";
  @SerializedName(SERIALIZED_NAME_CURRENCY_REWARD)
  private List<String> currencyReward = new ArrayList<>();

  public static final String SERIALIZED_NAME_GUILD_REWARDS_REQUIRE_ATTEMPT = "guildRewardsRequireAttempt";
  @SerializedName(SERIALIZED_NAME_GUILD_REWARDS_REQUIRE_ATTEMPT)
  private Boolean guildRewardsRequireAttempt;

  public static final String SERIALIZED_NAME_AUDIO_VICTORY_KEY = "audioVictoryKey";
  @SerializedName(SERIALIZED_NAME_AUDIO_VICTORY_KEY)
  private String audioVictoryKey;

  public static final String SERIALIZED_NAME_AUDIO_DEFEAT_KEY = "audioDefeatKey";
  @SerializedName(SERIALIZED_NAME_AUDIO_DEFEAT_KEY)
  private String audioDefeatKey;

  public GuildRaid() {
  }

  public GuildRaid id(String id) {
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


  public GuildRaid priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public GuildRaid nameKey(String nameKey) {
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


  public GuildRaid summaryKey(String summaryKey) {
    this.summaryKey = summaryKey;
    return this;
  }

  /**
   * Get summaryKey
   * @return summaryKey
   */
  @javax.annotation.Nullable
  public String getSummaryKey() {
    return summaryKey;
  }

  public void setSummaryKey(String summaryKey) {
    this.summaryKey = summaryKey;
  }


  public GuildRaid descKey(String descKey) {
    this.descKey = descKey;
    return this;
  }

  /**
   * Get descKey
   * @return descKey
   */
  @javax.annotation.Nullable
  public String getDescKey() {
    return descKey;
  }

  public void setDescKey(String descKey) {
    this.descKey = descKey;
  }


  public GuildRaid image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public GuildRaid squadType(SquadType squadType) {
    this.squadType = squadType;
    return this;
  }

  /**
   * Get squadType
   * @return squadType
   */
  @javax.annotation.Nullable
  public SquadType getSquadType() {
    return squadType;
  }

  public void setSquadType(SquadType squadType) {
    this.squadType = squadType;
  }


  public GuildRaid campaignElementIdentifier(CampaignElementIdentifier campaignElementIdentifier) {
    this.campaignElementIdentifier = campaignElementIdentifier;
    return this;
  }

  /**
   * Get campaignElementIdentifier
   * @return campaignElementIdentifier
   */
  @javax.annotation.Nullable
  public CampaignElementIdentifier getCampaignElementIdentifier() {
    return campaignElementIdentifier;
  }

  public void setCampaignElementIdentifier(CampaignElementIdentifier campaignElementIdentifier) {
    this.campaignElementIdentifier = campaignElementIdentifier;
  }


  public GuildRaid iconPrefab(String iconPrefab) {
    this.iconPrefab = iconPrefab;
    return this;
  }

  /**
   * Get iconPrefab
   * @return iconPrefab
   */
  @javax.annotation.Nullable
  public String getIconPrefab() {
    return iconPrefab;
  }

  public void setIconPrefab(String iconPrefab) {
    this.iconPrefab = iconPrefab;
  }


  public GuildRaid promotionKey(String promotionKey) {
    this.promotionKey = promotionKey;
    return this;
  }

  /**
   * Get promotionKey
   * @return promotionKey
   */
  @javax.annotation.Nullable
  public String getPromotionKey() {
    return promotionKey;
  }

  public void setPromotionKey(String promotionKey) {
    this.promotionKey = promotionKey;
  }


  public GuildRaid portraitIcon(String portraitIcon) {
    this.portraitIcon = portraitIcon;
    return this;
  }

  /**
   * Get portraitIcon
   * @return portraitIcon
   */
  @javax.annotation.Nullable
  public String getPortraitIcon() {
    return portraitIcon;
  }

  public void setPortraitIcon(String portraitIcon) {
    this.portraitIcon = portraitIcon;
  }


  public GuildRaid raidSim(GuildRaidSim raidSim) {
    this.raidSim = raidSim;
    return this;
  }

  /**
   * Get raidSim
   * @return raidSim
   */
  @javax.annotation.Nullable
  public GuildRaidSim getRaidSim() {
    return raidSim;
  }

  public void setRaidSim(GuildRaidSim raidSim) {
    this.raidSim = raidSim;
  }


  public GuildRaid infoImage(String infoImage) {
    this.infoImage = infoImage;
    return this;
  }

  /**
   * Get infoImage
   * @return infoImage
   */
  @javax.annotation.Nullable
  public String getInfoImage() {
    return infoImage;
  }

  public void setInfoImage(String infoImage) {
    this.infoImage = infoImage;
  }


  public GuildRaid lockout(GuildRaidLockout lockout) {
    this.lockout = lockout;
    return this;
  }

  /**
   * Get lockout
   * @return lockout
   */
  @javax.annotation.Nullable
  public GuildRaidLockout getLockout() {
    return lockout;
  }

  public void setLockout(GuildRaidLockout lockout) {
    this.lockout = lockout;
  }


  public GuildRaid legacyRaid(Boolean legacyRaid) {
    this.legacyRaid = legacyRaid;
    return this;
  }

  /**
   * Get legacyRaid
   * @return legacyRaid
   */
  @javax.annotation.Nullable
  public Boolean getLegacyRaid() {
    return legacyRaid;
  }

  public void setLegacyRaid(Boolean legacyRaid) {
    this.legacyRaid = legacyRaid;
  }


  public GuildRaid currencyReward(List<String> currencyReward) {
    this.currencyReward = currencyReward;
    return this;
  }

  public GuildRaid addCurrencyRewardItem(String currencyRewardItem) {
    if (this.currencyReward == null) {
      this.currencyReward = new ArrayList<>();
    }
    this.currencyReward.add(currencyRewardItem);
    return this;
  }

  /**
   * Get currencyReward
   * @return currencyReward
   */
  @javax.annotation.Nullable
  public List<String> getCurrencyReward() {
    return currencyReward;
  }

  public void setCurrencyReward(List<String> currencyReward) {
    this.currencyReward = currencyReward;
  }


  public GuildRaid guildRewardsRequireAttempt(Boolean guildRewardsRequireAttempt) {
    this.guildRewardsRequireAttempt = guildRewardsRequireAttempt;
    return this;
  }

  /**
   * Get guildRewardsRequireAttempt
   * @return guildRewardsRequireAttempt
   */
  @javax.annotation.Nullable
  public Boolean getGuildRewardsRequireAttempt() {
    return guildRewardsRequireAttempt;
  }

  public void setGuildRewardsRequireAttempt(Boolean guildRewardsRequireAttempt) {
    this.guildRewardsRequireAttempt = guildRewardsRequireAttempt;
  }


  public GuildRaid audioVictoryKey(String audioVictoryKey) {
    this.audioVictoryKey = audioVictoryKey;
    return this;
  }

  /**
   * Get audioVictoryKey
   * @return audioVictoryKey
   */
  @javax.annotation.Nullable
  public String getAudioVictoryKey() {
    return audioVictoryKey;
  }

  public void setAudioVictoryKey(String audioVictoryKey) {
    this.audioVictoryKey = audioVictoryKey;
  }


  public GuildRaid audioDefeatKey(String audioDefeatKey) {
    this.audioDefeatKey = audioDefeatKey;
    return this;
  }

  /**
   * Get audioDefeatKey
   * @return audioDefeatKey
   */
  @javax.annotation.Nullable
  public String getAudioDefeatKey() {
    return audioDefeatKey;
  }

  public void setAudioDefeatKey(String audioDefeatKey) {
    this.audioDefeatKey = audioDefeatKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildRaid guildRaid = (GuildRaid) o;
    return Objects.equals(this.id, guildRaid.id) &&
        Objects.equals(this.priority, guildRaid.priority) &&
        Objects.equals(this.nameKey, guildRaid.nameKey) &&
        Objects.equals(this.summaryKey, guildRaid.summaryKey) &&
        Objects.equals(this.descKey, guildRaid.descKey) &&
        Objects.equals(this.image, guildRaid.image) &&
        Objects.equals(this.squadType, guildRaid.squadType) &&
        Objects.equals(this.campaignElementIdentifier, guildRaid.campaignElementIdentifier) &&
        Objects.equals(this.iconPrefab, guildRaid.iconPrefab) &&
        Objects.equals(this.promotionKey, guildRaid.promotionKey) &&
        Objects.equals(this.portraitIcon, guildRaid.portraitIcon) &&
        Objects.equals(this.raidSim, guildRaid.raidSim) &&
        Objects.equals(this.infoImage, guildRaid.infoImage) &&
        Objects.equals(this.lockout, guildRaid.lockout) &&
        Objects.equals(this.legacyRaid, guildRaid.legacyRaid) &&
        Objects.equals(this.currencyReward, guildRaid.currencyReward) &&
        Objects.equals(this.guildRewardsRequireAttempt, guildRaid.guildRewardsRequireAttempt) &&
        Objects.equals(this.audioVictoryKey, guildRaid.audioVictoryKey) &&
        Objects.equals(this.audioDefeatKey, guildRaid.audioDefeatKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, priority, nameKey, summaryKey, descKey, image, squadType, campaignElementIdentifier, iconPrefab, promotionKey, portraitIcon, raidSim, infoImage, lockout, legacyRaid, currencyReward, guildRewardsRequireAttempt, audioVictoryKey, audioDefeatKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildRaid {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    nameKey: ").append(toIndentedString(nameKey)).append("\n");
    sb.append("    summaryKey: ").append(toIndentedString(summaryKey)).append("\n");
    sb.append("    descKey: ").append(toIndentedString(descKey)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    squadType: ").append(toIndentedString(squadType)).append("\n");
    sb.append("    campaignElementIdentifier: ").append(toIndentedString(campaignElementIdentifier)).append("\n");
    sb.append("    iconPrefab: ").append(toIndentedString(iconPrefab)).append("\n");
    sb.append("    promotionKey: ").append(toIndentedString(promotionKey)).append("\n");
    sb.append("    portraitIcon: ").append(toIndentedString(portraitIcon)).append("\n");
    sb.append("    raidSim: ").append(toIndentedString(raidSim)).append("\n");
    sb.append("    infoImage: ").append(toIndentedString(infoImage)).append("\n");
    sb.append("    lockout: ").append(toIndentedString(lockout)).append("\n");
    sb.append("    legacyRaid: ").append(toIndentedString(legacyRaid)).append("\n");
    sb.append("    currencyReward: ").append(toIndentedString(currencyReward)).append("\n");
    sb.append("    guildRewardsRequireAttempt: ").append(toIndentedString(guildRewardsRequireAttempt)).append("\n");
    sb.append("    audioVictoryKey: ").append(toIndentedString(audioVictoryKey)).append("\n");
    sb.append("    audioDefeatKey: ").append(toIndentedString(audioDefeatKey)).append("\n");
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
    openapiFields.add("priority");
    openapiFields.add("nameKey");
    openapiFields.add("summaryKey");
    openapiFields.add("descKey");
    openapiFields.add("image");
    openapiFields.add("squadType");
    openapiFields.add("campaignElementIdentifier");
    openapiFields.add("iconPrefab");
    openapiFields.add("promotionKey");
    openapiFields.add("portraitIcon");
    openapiFields.add("raidSim");
    openapiFields.add("infoImage");
    openapiFields.add("lockout");
    openapiFields.add("legacyRaid");
    openapiFields.add("currencyReward");
    openapiFields.add("guildRewardsRequireAttempt");
    openapiFields.add("audioVictoryKey");
    openapiFields.add("audioDefeatKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuildRaid
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuildRaid.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuildRaid is not found in the empty JSON string", GuildRaid.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuildRaid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuildRaid` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("nameKey") != null && !jsonObj.get("nameKey").isJsonNull()) && !jsonObj.get("nameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameKey").toString()));
      }
      if ((jsonObj.get("summaryKey") != null && !jsonObj.get("summaryKey").isJsonNull()) && !jsonObj.get("summaryKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summaryKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summaryKey").toString()));
      }
      if ((jsonObj.get("descKey") != null && !jsonObj.get("descKey").isJsonNull()) && !jsonObj.get("descKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descKey").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      // validate the optional field `squadType`
      if (jsonObj.get("squadType") != null && !jsonObj.get("squadType").isJsonNull()) {
        SquadType.validateJsonElement(jsonObj.get("squadType"));
      }
      // validate the optional field `campaignElementIdentifier`
      if (jsonObj.get("campaignElementIdentifier") != null && !jsonObj.get("campaignElementIdentifier").isJsonNull()) {
        CampaignElementIdentifier.validateJsonElement(jsonObj.get("campaignElementIdentifier"));
      }
      if ((jsonObj.get("iconPrefab") != null && !jsonObj.get("iconPrefab").isJsonNull()) && !jsonObj.get("iconPrefab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconPrefab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconPrefab").toString()));
      }
      if ((jsonObj.get("promotionKey") != null && !jsonObj.get("promotionKey").isJsonNull()) && !jsonObj.get("promotionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotionKey").toString()));
      }
      if ((jsonObj.get("portraitIcon") != null && !jsonObj.get("portraitIcon").isJsonNull()) && !jsonObj.get("portraitIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portraitIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portraitIcon").toString()));
      }
      // validate the optional field `raidSim`
      if (jsonObj.get("raidSim") != null && !jsonObj.get("raidSim").isJsonNull()) {
        GuildRaidSim.validateJsonElement(jsonObj.get("raidSim"));
      }
      if ((jsonObj.get("infoImage") != null && !jsonObj.get("infoImage").isJsonNull()) && !jsonObj.get("infoImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infoImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infoImage").toString()));
      }
      // validate the optional field `lockout`
      if (jsonObj.get("lockout") != null && !jsonObj.get("lockout").isJsonNull()) {
        GuildRaidLockout.validateJsonElement(jsonObj.get("lockout"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("currencyReward") != null && !jsonObj.get("currencyReward").isJsonNull() && !jsonObj.get("currencyReward").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyReward` to be an array in the JSON string but got `%s`", jsonObj.get("currencyReward").toString()));
      }
      if ((jsonObj.get("audioVictoryKey") != null && !jsonObj.get("audioVictoryKey").isJsonNull()) && !jsonObj.get("audioVictoryKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audioVictoryKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audioVictoryKey").toString()));
      }
      if ((jsonObj.get("audioDefeatKey") != null && !jsonObj.get("audioDefeatKey").isJsonNull()) && !jsonObj.get("audioDefeatKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audioDefeatKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audioDefeatKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuildRaid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuildRaid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuildRaid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuildRaid.class));

       return (TypeAdapter<T>) new TypeAdapter<GuildRaid>() {
           @Override
           public void write(JsonWriter out, GuildRaid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuildRaid read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuildRaid given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuildRaid
   * @throws IOException if the JSON string is invalid with respect to GuildRaid
   */
  public static GuildRaid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuildRaid.class);
  }

  /**
   * Convert an instance of GuildRaid to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
