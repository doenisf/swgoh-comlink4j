package io.github.doenisf.comlink4j.model.gamedata.misc.description;

import io.github.doenisf.comlink4j.model.gamedata.enums.DynamicDescriptionTextAlignmentType;
import lombok.Getter;

@Getter
public class DynamicDescriptionTextColumn {
    private String headerKey;
    private String bodyKey;
    private DynamicDescriptionTextAlignmentType bodyAlignment;
    private String tag;
}
