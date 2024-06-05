package io.github.doenisf.comlink4j.model.gamedata.ability;

import lombok.Getter;

import java.util.List;

@Getter
public class AbilityDecisionTree {
    private String abilityDecisionTreeId;
    private List<AbilityDecisionNode> abilityDecisionNode;
}
