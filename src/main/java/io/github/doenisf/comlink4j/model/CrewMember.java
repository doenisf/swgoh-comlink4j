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
import io.github.doenisf.comlink4j.SkillDefinitionReference;
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
 * CrewMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class CrewMember {
  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_SLOT = "slot";
  @SerializedName(SERIALIZED_NAME_SLOT)
  private Integer slot;

  public static final String SERIALIZED_NAME_SKILL_REFERENCE = "skillReference";
  @SerializedName(SERIALIZED_NAME_SKILL_REFERENCE)
  private List<SkillDefinitionReference> skillReference = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKILLLESS_CREW_ABILITY_ID = "skilllessCrewAbilityId";
  @SerializedName(SERIALIZED_NAME_SKILLLESS_CREW_ABILITY_ID)
  private String skilllessCrewAbilityId;

  public CrewMember() {
  }

  public CrewMember unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Get unitId
   * @return unitId
   */
  @javax.annotation.Nullable
  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public CrewMember slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
   */
  @javax.annotation.Nullable
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  public CrewMember skillReference(List<SkillDefinitionReference> skillReference) {
    this.skillReference = skillReference;
    return this;
  }

  public CrewMember addSkillReferenceItem(SkillDefinitionReference skillReferenceItem) {
    if (this.skillReference == null) {
      this.skillReference = new ArrayList<>();
    }
    this.skillReference.add(skillReferenceItem);
    return this;
  }

  /**
   * Get skillReference
   * @return skillReference
   */
  @javax.annotation.Nullable
  public List<SkillDefinitionReference> getSkillReference() {
    return skillReference;
  }

  public void setSkillReference(List<SkillDefinitionReference> skillReference) {
    this.skillReference = skillReference;
  }


  public CrewMember skilllessCrewAbilityId(String skilllessCrewAbilityId) {
    this.skilllessCrewAbilityId = skilllessCrewAbilityId;
    return this;
  }

  /**
   * Get skilllessCrewAbilityId
   * @return skilllessCrewAbilityId
   */
  @javax.annotation.Nullable
  public String getSkilllessCrewAbilityId() {
    return skilllessCrewAbilityId;
  }

  public void setSkilllessCrewAbilityId(String skilllessCrewAbilityId) {
    this.skilllessCrewAbilityId = skilllessCrewAbilityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrewMember crewMember = (CrewMember) o;
    return Objects.equals(this.unitId, crewMember.unitId) &&
        Objects.equals(this.slot, crewMember.slot) &&
        Objects.equals(this.skillReference, crewMember.skillReference) &&
        Objects.equals(this.skilllessCrewAbilityId, crewMember.skilllessCrewAbilityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, slot, skillReference, skilllessCrewAbilityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrewMember {\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    skillReference: ").append(toIndentedString(skillReference)).append("\n");
    sb.append("    skilllessCrewAbilityId: ").append(toIndentedString(skilllessCrewAbilityId)).append("\n");
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
    openapiFields.add("unitId");
    openapiFields.add("slot");
    openapiFields.add("skillReference");
    openapiFields.add("skilllessCrewAbilityId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CrewMember
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CrewMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CrewMember is not found in the empty JSON string", CrewMember.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CrewMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CrewMember` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("unitId") != null && !jsonObj.get("unitId").isJsonNull()) && !jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
      if (jsonObj.get("skillReference") != null && !jsonObj.get("skillReference").isJsonNull()) {
        JsonArray jsonArrayskillReference = jsonObj.getAsJsonArray("skillReference");
        if (jsonArrayskillReference != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skillReference").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skillReference` to be an array in the JSON string but got `%s`", jsonObj.get("skillReference").toString()));
          }

          // validate the optional field `skillReference` (array)
          for (int i = 0; i < jsonArrayskillReference.size(); i++) {
            SkillDefinitionReference.validateJsonElement(jsonArrayskillReference.get(i));
          };
        }
      }
      if ((jsonObj.get("skilllessCrewAbilityId") != null && !jsonObj.get("skilllessCrewAbilityId").isJsonNull()) && !jsonObj.get("skilllessCrewAbilityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skilllessCrewAbilityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skilllessCrewAbilityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CrewMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CrewMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CrewMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CrewMember.class));

       return (TypeAdapter<T>) new TypeAdapter<CrewMember>() {
           @Override
           public void write(JsonWriter out, CrewMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CrewMember read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CrewMember given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CrewMember
   * @throws IOException if the JSON string is invalid with respect to CrewMember
   */
  public static CrewMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CrewMember.class);
  }

  /**
   * Convert an instance of CrewMember to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
