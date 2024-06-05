package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.EvaluationType;
import io.github.doenisf.comlink4j.model.gamedata.item.RequirementItem;
import lombok.Getter;

import java.util.List;

@Getter
public class Requirement {
    private EvaluationType evalType;
    private List<RequirementItem> requirementItem;
    private String id;
    private String descKey;
}
