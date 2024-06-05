package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityDecisionParamModifier;
import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityDecisionTarget;
import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityDecisionType;
import lombok.Getter;

import java.util.List;

@Getter
public class AbilityDecisionNode {
    private AbilityDecisionType decisionType;
    private AbilityDecisionTarget decisionTarget;
    private List<String> param;
    private AbilityDecisionParamModifier paramModifier;
    private Boolean targetExcludeSelf;
    private Long chance;
    private Boolean negate;
    private AbilityDecisionResult decisionResult;
}
