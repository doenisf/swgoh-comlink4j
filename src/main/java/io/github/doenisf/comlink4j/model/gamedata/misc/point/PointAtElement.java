package io.github.doenisf.comlink4j.model.gamedata.misc.point;

import io.github.doenisf.comlink4j.model.gamedata.enums.PointAtRotationBehavior;
import io.github.doenisf.comlink4j.model.gamedata.enums.PointerType;
import lombok.Getter;

@Getter
public class PointAtElement {
    private String elementId;
    private Integer offsetX;
    private Integer offsetY;
    private Float rotation;
    private Integer textOffsetX;
    private Integer textOffsetY;
    private String textOffsetAnchor;
    private Boolean update;
    private Boolean clamp;
    private PointAtRotationBehavior rotationBehavior;
    private Float delaySeconds;
    private Boolean showArrow;
    private Boolean showHighlight;
    private String imageSource;
    private Integer imageWidth;
    private Integer imageHeight;
    private Integer imageOffsetX;
    private Integer imageOffsetY;
    private PointerType pointerType;
    private Boolean tapDismiss;
    private Boolean scrimVisible;
    private Boolean scrimBlocking;
    private Boolean showText;
    private Boolean showBartender;
    private String bartenderTexture;
}
