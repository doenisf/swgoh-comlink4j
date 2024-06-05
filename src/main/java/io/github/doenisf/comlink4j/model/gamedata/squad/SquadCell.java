package io.github.doenisf.comlink4j.model.gamedata.squad;

import io.github.doenisf.comlink4j.model.gamedata.enums.SquadUnitType;
import io.github.doenisf.comlink4j.model.gamedata.stat.UnitBattleStat;
import lombok.Getter;

import java.util.List;

@Getter
public class SquadCell {
    private String unitId;
    private String unitDefId;
    private Integer cellIndex;
    private UnitBattleStat unitBattleStat;
    private String messageReticle;
    private Boolean progressItem;
    private SquadUnitType squadUnitType;
    private List<UnitBattleStat> crewBattleStat;
    private UnitBattleStat unitState;
    private Boolean selectable;
    private Boolean overkillItem;
    private String inheritFromDefinitionId;
}
