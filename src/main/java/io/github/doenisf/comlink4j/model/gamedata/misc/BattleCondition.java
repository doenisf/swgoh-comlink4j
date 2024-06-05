package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.ConditionType;
import lombok.Getter;

@Getter
public class BattleCondition {
    private ConditionType conditionType;
    private String conditionValue;
    private Integer priority;
}
