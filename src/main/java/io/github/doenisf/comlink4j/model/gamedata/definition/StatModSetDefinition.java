package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.mod.StatModSetBonus;
import lombok.Getter;

@Getter
public class StatModSetDefinition {
    private String id;
    private String name;
    private String icon;
    private StatModSetBonus completeBonus;
    private StatModSetBonus maxLevelBonus;
    private Integer setCount;
    private StatModSetBonus overclockBonus;
}
