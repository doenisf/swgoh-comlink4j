package de.sf.model.player.pvp;

import de.sf.model.player.stat.UnitBattleStat;
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
