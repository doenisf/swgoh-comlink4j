package io.github.doenisf.comlink4j.model.gamedata.misc.description;

import io.github.doenisf.comlink4j.model.gamedata.enums.DynamicDescriptionTextAlignmentType;
import io.github.doenisf.comlink4j.model.gamedata.enums.DynamicDescriptionType;
import lombok.Getter;

import java.util.List;

@Getter
public class DynamicDescription {
    private DynamicDescriptionType descriptionType;
    private String unitTexture;
    private String unitNameKey;
    private String abilityNameKey;
    private String abilityDescriptionKey;
    private String abilityTexture;
    private String headerKey;
    private Integer marginLeft;
    private List<DynamicDescriptionTextColumn> textColumn;
    private DynamicDescriptionTextAlignmentType textAlignment;
    private String backgroundOverrideSprite;
}
