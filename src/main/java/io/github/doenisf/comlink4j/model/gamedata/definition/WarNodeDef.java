package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.enums.WarNodeType;
import io.github.doenisf.comlink4j.model.gamedata.misc.point.Position;
import lombok.Getter;

@Getter
public class WarNodeDef {
    private String id;
    private WarNodeType type;
    private CombatType combatType;
    private Position position;
}
