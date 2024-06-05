package io.github.doenisf.comlink4j.model.gamedata.ability;

import lombok.Getter;

import java.util.List;

@Getter
public class AbilityAIParams {
    private String preferredAllyTargetingRuleId;
    private String preferredEnemyTargetingRuleId;
    private Boolean requireEnemyPreferredTargets;
    private Boolean requireAllyTargets;
    private List<String> preferredAllyTargetingRuleIdList;
    private List<String> preferredEnemyTargetingRuleIdList;
}
