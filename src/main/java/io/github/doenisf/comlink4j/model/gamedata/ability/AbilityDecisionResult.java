package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityDecisionResultTarget;
import lombok.Getter;

import java.util.List;

@Getter
public class AbilityDecisionResult {
    private String chosenAbilityTag;
    private AbilityDecisionResultTarget decisionResultTarget;
    public List<String> allyTargetId;
}
