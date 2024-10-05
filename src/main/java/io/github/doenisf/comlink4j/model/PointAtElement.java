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
import io.github.doenisf.comlink4j.PointAtRotationBehavior;
import io.github.doenisf.comlink4j.PointerType;
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
 * PointAtElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T16:29:17.254694600+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class PointAtElement {
  public static final String SERIALIZED_NAME_ELEMENT_ID = "elementId";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private String elementId;

  public static final String SERIALIZED_NAME_OFFSET_X = "offsetX";
  @SerializedName(SERIALIZED_NAME_OFFSET_X)
  private Integer offsetX;

  public static final String SERIALIZED_NAME_OFFSET_Y = "offsetY";
  @SerializedName(SERIALIZED_NAME_OFFSET_Y)
  private Integer offsetY;

  public static final String SERIALIZED_NAME_ROTATION = "rotation";
  @SerializedName(SERIALIZED_NAME_ROTATION)
  private Float rotation;

  public static final String SERIALIZED_NAME_TEXT_OFFSET_X = "textOffsetX";
  @SerializedName(SERIALIZED_NAME_TEXT_OFFSET_X)
  private Integer textOffsetX;

  public static final String SERIALIZED_NAME_TEXT_OFFSET_Y = "textOffsetY";
  @SerializedName(SERIALIZED_NAME_TEXT_OFFSET_Y)
  private Integer textOffsetY;

  public static final String SERIALIZED_NAME_TEXT_OFFSET_ANCHOR = "textOffsetAnchor";
  @SerializedName(SERIALIZED_NAME_TEXT_OFFSET_ANCHOR)
  private String textOffsetAnchor;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private Boolean update;

  public static final String SERIALIZED_NAME_CLAMP = "clamp";
  @SerializedName(SERIALIZED_NAME_CLAMP)
  private Boolean clamp;

  public static final String SERIALIZED_NAME_ROTATION_BEHAVIOR = "rotationBehavior";
  @SerializedName(SERIALIZED_NAME_ROTATION_BEHAVIOR)
  private PointAtRotationBehavior rotationBehavior;

  public static final String SERIALIZED_NAME_DELAY_SECONDS = "delaySeconds";
  @SerializedName(SERIALIZED_NAME_DELAY_SECONDS)
  private Float delaySeconds;

  public static final String SERIALIZED_NAME_SHOW_ARROW = "showArrow";
  @SerializedName(SERIALIZED_NAME_SHOW_ARROW)
  private Boolean showArrow;

  public static final String SERIALIZED_NAME_SHOW_HIGHLIGHT = "showHighlight";
  @SerializedName(SERIALIZED_NAME_SHOW_HIGHLIGHT)
  private Boolean showHighlight;

  public static final String SERIALIZED_NAME_IMAGE_SOURCE = "imageSource";
  @SerializedName(SERIALIZED_NAME_IMAGE_SOURCE)
  private String imageSource;

  public static final String SERIALIZED_NAME_IMAGE_WIDTH = "imageWidth";
  @SerializedName(SERIALIZED_NAME_IMAGE_WIDTH)
  private Integer imageWidth;

  public static final String SERIALIZED_NAME_IMAGE_HEIGHT = "imageHeight";
  @SerializedName(SERIALIZED_NAME_IMAGE_HEIGHT)
  private Integer imageHeight;

  public static final String SERIALIZED_NAME_IMAGE_OFFSET_X = "imageOffsetX";
  @SerializedName(SERIALIZED_NAME_IMAGE_OFFSET_X)
  private Integer imageOffsetX;

  public static final String SERIALIZED_NAME_IMAGE_OFFSET_Y = "imageOffsetY";
  @SerializedName(SERIALIZED_NAME_IMAGE_OFFSET_Y)
  private Integer imageOffsetY;

  public static final String SERIALIZED_NAME_POINTER_TYPE = "pointerType";
  @SerializedName(SERIALIZED_NAME_POINTER_TYPE)
  private PointerType pointerType;

  public static final String SERIALIZED_NAME_TAP_DISMISS = "tapDismiss";
  @SerializedName(SERIALIZED_NAME_TAP_DISMISS)
  private Boolean tapDismiss;

  public static final String SERIALIZED_NAME_SCRIM_VISIBLE = "scrimVisible";
  @SerializedName(SERIALIZED_NAME_SCRIM_VISIBLE)
  private Boolean scrimVisible;

  public static final String SERIALIZED_NAME_SCRIM_BLOCKING = "scrimBlocking";
  @SerializedName(SERIALIZED_NAME_SCRIM_BLOCKING)
  private Boolean scrimBlocking;

  public static final String SERIALIZED_NAME_SHOW_TEXT = "showText";
  @SerializedName(SERIALIZED_NAME_SHOW_TEXT)
  private Boolean showText;

  public static final String SERIALIZED_NAME_SHOW_BARTENDER = "showBartender";
  @SerializedName(SERIALIZED_NAME_SHOW_BARTENDER)
  private Boolean showBartender;

  public static final String SERIALIZED_NAME_BARTENDER_TEXTURE = "bartenderTexture";
  @SerializedName(SERIALIZED_NAME_BARTENDER_TEXTURE)
  private String bartenderTexture;

  public PointAtElement() {
  }

  public PointAtElement elementId(String elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
   */
  @javax.annotation.Nullable
  public String getElementId() {
    return elementId;
  }

  public void setElementId(String elementId) {
    this.elementId = elementId;
  }


  public PointAtElement offsetX(Integer offsetX) {
    this.offsetX = offsetX;
    return this;
  }

  /**
   * Get offsetX
   * @return offsetX
   */
  @javax.annotation.Nullable
  public Integer getOffsetX() {
    return offsetX;
  }

  public void setOffsetX(Integer offsetX) {
    this.offsetX = offsetX;
  }


  public PointAtElement offsetY(Integer offsetY) {
    this.offsetY = offsetY;
    return this;
  }

  /**
   * Get offsetY
   * @return offsetY
   */
  @javax.annotation.Nullable
  public Integer getOffsetY() {
    return offsetY;
  }

  public void setOffsetY(Integer offsetY) {
    this.offsetY = offsetY;
  }


  public PointAtElement rotation(Float rotation) {
    this.rotation = rotation;
    return this;
  }

  /**
   * Get rotation
   * @return rotation
   */
  @javax.annotation.Nullable
  public Float getRotation() {
    return rotation;
  }

  public void setRotation(Float rotation) {
    this.rotation = rotation;
  }


  public PointAtElement textOffsetX(Integer textOffsetX) {
    this.textOffsetX = textOffsetX;
    return this;
  }

  /**
   * Get textOffsetX
   * @return textOffsetX
   */
  @javax.annotation.Nullable
  public Integer getTextOffsetX() {
    return textOffsetX;
  }

  public void setTextOffsetX(Integer textOffsetX) {
    this.textOffsetX = textOffsetX;
  }


  public PointAtElement textOffsetY(Integer textOffsetY) {
    this.textOffsetY = textOffsetY;
    return this;
  }

  /**
   * Get textOffsetY
   * @return textOffsetY
   */
  @javax.annotation.Nullable
  public Integer getTextOffsetY() {
    return textOffsetY;
  }

  public void setTextOffsetY(Integer textOffsetY) {
    this.textOffsetY = textOffsetY;
  }


  public PointAtElement textOffsetAnchor(String textOffsetAnchor) {
    this.textOffsetAnchor = textOffsetAnchor;
    return this;
  }

  /**
   * Get textOffsetAnchor
   * @return textOffsetAnchor
   */
  @javax.annotation.Nullable
  public String getTextOffsetAnchor() {
    return textOffsetAnchor;
  }

  public void setTextOffsetAnchor(String textOffsetAnchor) {
    this.textOffsetAnchor = textOffsetAnchor;
  }


  public PointAtElement update(Boolean update) {
    this.update = update;
    return this;
  }

  /**
   * Get update
   * @return update
   */
  @javax.annotation.Nullable
  public Boolean getUpdate() {
    return update;
  }

  public void setUpdate(Boolean update) {
    this.update = update;
  }


  public PointAtElement clamp(Boolean clamp) {
    this.clamp = clamp;
    return this;
  }

  /**
   * Get clamp
   * @return clamp
   */
  @javax.annotation.Nullable
  public Boolean getClamp() {
    return clamp;
  }

  public void setClamp(Boolean clamp) {
    this.clamp = clamp;
  }


  public PointAtElement rotationBehavior(PointAtRotationBehavior rotationBehavior) {
    this.rotationBehavior = rotationBehavior;
    return this;
  }

  /**
   * Get rotationBehavior
   * @return rotationBehavior
   */
  @javax.annotation.Nullable
  public PointAtRotationBehavior getRotationBehavior() {
    return rotationBehavior;
  }

  public void setRotationBehavior(PointAtRotationBehavior rotationBehavior) {
    this.rotationBehavior = rotationBehavior;
  }


  public PointAtElement delaySeconds(Float delaySeconds) {
    this.delaySeconds = delaySeconds;
    return this;
  }

  /**
   * Get delaySeconds
   * @return delaySeconds
   */
  @javax.annotation.Nullable
  public Float getDelaySeconds() {
    return delaySeconds;
  }

  public void setDelaySeconds(Float delaySeconds) {
    this.delaySeconds = delaySeconds;
  }


  public PointAtElement showArrow(Boolean showArrow) {
    this.showArrow = showArrow;
    return this;
  }

  /**
   * Get showArrow
   * @return showArrow
   */
  @javax.annotation.Nullable
  public Boolean getShowArrow() {
    return showArrow;
  }

  public void setShowArrow(Boolean showArrow) {
    this.showArrow = showArrow;
  }


  public PointAtElement showHighlight(Boolean showHighlight) {
    this.showHighlight = showHighlight;
    return this;
  }

  /**
   * Get showHighlight
   * @return showHighlight
   */
  @javax.annotation.Nullable
  public Boolean getShowHighlight() {
    return showHighlight;
  }

  public void setShowHighlight(Boolean showHighlight) {
    this.showHighlight = showHighlight;
  }


  public PointAtElement imageSource(String imageSource) {
    this.imageSource = imageSource;
    return this;
  }

  /**
   * Get imageSource
   * @return imageSource
   */
  @javax.annotation.Nullable
  public String getImageSource() {
    return imageSource;
  }

  public void setImageSource(String imageSource) {
    this.imageSource = imageSource;
  }


  public PointAtElement imageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

  /**
   * Get imageWidth
   * @return imageWidth
   */
  @javax.annotation.Nullable
  public Integer getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
  }


  public PointAtElement imageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

  /**
   * Get imageHeight
   * @return imageHeight
   */
  @javax.annotation.Nullable
  public Integer getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }


  public PointAtElement imageOffsetX(Integer imageOffsetX) {
    this.imageOffsetX = imageOffsetX;
    return this;
  }

  /**
   * Get imageOffsetX
   * @return imageOffsetX
   */
  @javax.annotation.Nullable
  public Integer getImageOffsetX() {
    return imageOffsetX;
  }

  public void setImageOffsetX(Integer imageOffsetX) {
    this.imageOffsetX = imageOffsetX;
  }


  public PointAtElement imageOffsetY(Integer imageOffsetY) {
    this.imageOffsetY = imageOffsetY;
    return this;
  }

  /**
   * Get imageOffsetY
   * @return imageOffsetY
   */
  @javax.annotation.Nullable
  public Integer getImageOffsetY() {
    return imageOffsetY;
  }

  public void setImageOffsetY(Integer imageOffsetY) {
    this.imageOffsetY = imageOffsetY;
  }


  public PointAtElement pointerType(PointerType pointerType) {
    this.pointerType = pointerType;
    return this;
  }

  /**
   * Get pointerType
   * @return pointerType
   */
  @javax.annotation.Nullable
  public PointerType getPointerType() {
    return pointerType;
  }

  public void setPointerType(PointerType pointerType) {
    this.pointerType = pointerType;
  }


  public PointAtElement tapDismiss(Boolean tapDismiss) {
    this.tapDismiss = tapDismiss;
    return this;
  }

  /**
   * Get tapDismiss
   * @return tapDismiss
   */
  @javax.annotation.Nullable
  public Boolean getTapDismiss() {
    return tapDismiss;
  }

  public void setTapDismiss(Boolean tapDismiss) {
    this.tapDismiss = tapDismiss;
  }


  public PointAtElement scrimVisible(Boolean scrimVisible) {
    this.scrimVisible = scrimVisible;
    return this;
  }

  /**
   * Get scrimVisible
   * @return scrimVisible
   */
  @javax.annotation.Nullable
  public Boolean getScrimVisible() {
    return scrimVisible;
  }

  public void setScrimVisible(Boolean scrimVisible) {
    this.scrimVisible = scrimVisible;
  }


  public PointAtElement scrimBlocking(Boolean scrimBlocking) {
    this.scrimBlocking = scrimBlocking;
    return this;
  }

  /**
   * Get scrimBlocking
   * @return scrimBlocking
   */
  @javax.annotation.Nullable
  public Boolean getScrimBlocking() {
    return scrimBlocking;
  }

  public void setScrimBlocking(Boolean scrimBlocking) {
    this.scrimBlocking = scrimBlocking;
  }


  public PointAtElement showText(Boolean showText) {
    this.showText = showText;
    return this;
  }

  /**
   * Get showText
   * @return showText
   */
  @javax.annotation.Nullable
  public Boolean getShowText() {
    return showText;
  }

  public void setShowText(Boolean showText) {
    this.showText = showText;
  }


  public PointAtElement showBartender(Boolean showBartender) {
    this.showBartender = showBartender;
    return this;
  }

  /**
   * Get showBartender
   * @return showBartender
   */
  @javax.annotation.Nullable
  public Boolean getShowBartender() {
    return showBartender;
  }

  public void setShowBartender(Boolean showBartender) {
    this.showBartender = showBartender;
  }


  public PointAtElement bartenderTexture(String bartenderTexture) {
    this.bartenderTexture = bartenderTexture;
    return this;
  }

  /**
   * Get bartenderTexture
   * @return bartenderTexture
   */
  @javax.annotation.Nullable
  public String getBartenderTexture() {
    return bartenderTexture;
  }

  public void setBartenderTexture(String bartenderTexture) {
    this.bartenderTexture = bartenderTexture;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointAtElement pointAtElement = (PointAtElement) o;
    return Objects.equals(this.elementId, pointAtElement.elementId) &&
        Objects.equals(this.offsetX, pointAtElement.offsetX) &&
        Objects.equals(this.offsetY, pointAtElement.offsetY) &&
        Objects.equals(this.rotation, pointAtElement.rotation) &&
        Objects.equals(this.textOffsetX, pointAtElement.textOffsetX) &&
        Objects.equals(this.textOffsetY, pointAtElement.textOffsetY) &&
        Objects.equals(this.textOffsetAnchor, pointAtElement.textOffsetAnchor) &&
        Objects.equals(this.update, pointAtElement.update) &&
        Objects.equals(this.clamp, pointAtElement.clamp) &&
        Objects.equals(this.rotationBehavior, pointAtElement.rotationBehavior) &&
        Objects.equals(this.delaySeconds, pointAtElement.delaySeconds) &&
        Objects.equals(this.showArrow, pointAtElement.showArrow) &&
        Objects.equals(this.showHighlight, pointAtElement.showHighlight) &&
        Objects.equals(this.imageSource, pointAtElement.imageSource) &&
        Objects.equals(this.imageWidth, pointAtElement.imageWidth) &&
        Objects.equals(this.imageHeight, pointAtElement.imageHeight) &&
        Objects.equals(this.imageOffsetX, pointAtElement.imageOffsetX) &&
        Objects.equals(this.imageOffsetY, pointAtElement.imageOffsetY) &&
        Objects.equals(this.pointerType, pointAtElement.pointerType) &&
        Objects.equals(this.tapDismiss, pointAtElement.tapDismiss) &&
        Objects.equals(this.scrimVisible, pointAtElement.scrimVisible) &&
        Objects.equals(this.scrimBlocking, pointAtElement.scrimBlocking) &&
        Objects.equals(this.showText, pointAtElement.showText) &&
        Objects.equals(this.showBartender, pointAtElement.showBartender) &&
        Objects.equals(this.bartenderTexture, pointAtElement.bartenderTexture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementId, offsetX, offsetY, rotation, textOffsetX, textOffsetY, textOffsetAnchor, update, clamp, rotationBehavior, delaySeconds, showArrow, showHighlight, imageSource, imageWidth, imageHeight, imageOffsetX, imageOffsetY, pointerType, tapDismiss, scrimVisible, scrimBlocking, showText, showBartender, bartenderTexture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAtElement {\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    offsetX: ").append(toIndentedString(offsetX)).append("\n");
    sb.append("    offsetY: ").append(toIndentedString(offsetY)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    textOffsetX: ").append(toIndentedString(textOffsetX)).append("\n");
    sb.append("    textOffsetY: ").append(toIndentedString(textOffsetY)).append("\n");
    sb.append("    textOffsetAnchor: ").append(toIndentedString(textOffsetAnchor)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    clamp: ").append(toIndentedString(clamp)).append("\n");
    sb.append("    rotationBehavior: ").append(toIndentedString(rotationBehavior)).append("\n");
    sb.append("    delaySeconds: ").append(toIndentedString(delaySeconds)).append("\n");
    sb.append("    showArrow: ").append(toIndentedString(showArrow)).append("\n");
    sb.append("    showHighlight: ").append(toIndentedString(showHighlight)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageOffsetX: ").append(toIndentedString(imageOffsetX)).append("\n");
    sb.append("    imageOffsetY: ").append(toIndentedString(imageOffsetY)).append("\n");
    sb.append("    pointerType: ").append(toIndentedString(pointerType)).append("\n");
    sb.append("    tapDismiss: ").append(toIndentedString(tapDismiss)).append("\n");
    sb.append("    scrimVisible: ").append(toIndentedString(scrimVisible)).append("\n");
    sb.append("    scrimBlocking: ").append(toIndentedString(scrimBlocking)).append("\n");
    sb.append("    showText: ").append(toIndentedString(showText)).append("\n");
    sb.append("    showBartender: ").append(toIndentedString(showBartender)).append("\n");
    sb.append("    bartenderTexture: ").append(toIndentedString(bartenderTexture)).append("\n");
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
    openapiFields.add("elementId");
    openapiFields.add("offsetX");
    openapiFields.add("offsetY");
    openapiFields.add("rotation");
    openapiFields.add("textOffsetX");
    openapiFields.add("textOffsetY");
    openapiFields.add("textOffsetAnchor");
    openapiFields.add("update");
    openapiFields.add("clamp");
    openapiFields.add("rotationBehavior");
    openapiFields.add("delaySeconds");
    openapiFields.add("showArrow");
    openapiFields.add("showHighlight");
    openapiFields.add("imageSource");
    openapiFields.add("imageWidth");
    openapiFields.add("imageHeight");
    openapiFields.add("imageOffsetX");
    openapiFields.add("imageOffsetY");
    openapiFields.add("pointerType");
    openapiFields.add("tapDismiss");
    openapiFields.add("scrimVisible");
    openapiFields.add("scrimBlocking");
    openapiFields.add("showText");
    openapiFields.add("showBartender");
    openapiFields.add("bartenderTexture");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PointAtElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PointAtElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PointAtElement is not found in the empty JSON string", PointAtElement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PointAtElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PointAtElement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("elementId") != null && !jsonObj.get("elementId").isJsonNull()) && !jsonObj.get("elementId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elementId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elementId").toString()));
      }
      if ((jsonObj.get("textOffsetAnchor") != null && !jsonObj.get("textOffsetAnchor").isJsonNull()) && !jsonObj.get("textOffsetAnchor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textOffsetAnchor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textOffsetAnchor").toString()));
      }
      // validate the optional field `rotationBehavior`
      if (jsonObj.get("rotationBehavior") != null && !jsonObj.get("rotationBehavior").isJsonNull()) {
        PointAtRotationBehavior.validateJsonElement(jsonObj.get("rotationBehavior"));
      }
      if ((jsonObj.get("imageSource") != null && !jsonObj.get("imageSource").isJsonNull()) && !jsonObj.get("imageSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageSource").toString()));
      }
      // validate the optional field `pointerType`
      if (jsonObj.get("pointerType") != null && !jsonObj.get("pointerType").isJsonNull()) {
        PointerType.validateJsonElement(jsonObj.get("pointerType"));
      }
      if ((jsonObj.get("bartenderTexture") != null && !jsonObj.get("bartenderTexture").isJsonNull()) && !jsonObj.get("bartenderTexture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bartenderTexture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bartenderTexture").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PointAtElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PointAtElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PointAtElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PointAtElement.class));

       return (TypeAdapter<T>) new TypeAdapter<PointAtElement>() {
           @Override
           public void write(JsonWriter out, PointAtElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PointAtElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PointAtElement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PointAtElement
   * @throws IOException if the JSON string is invalid with respect to PointAtElement
   */
  public static PointAtElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PointAtElement.class);
  }

  /**
   * Convert an instance of PointAtElement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
