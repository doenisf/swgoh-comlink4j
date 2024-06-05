package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.RequirementType;
import lombok.Getter;

@Getter
public class RequirementItem {
    private RequirementType type;
    private String id;
    private Integer value;
    private String locKey;
    private Boolean negate;
}
