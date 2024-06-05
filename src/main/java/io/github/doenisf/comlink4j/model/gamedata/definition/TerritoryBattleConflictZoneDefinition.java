package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ForceAlignment;
import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryBattleZoneUnitType;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryRewardBracket;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattleConflictZoneDefinition {
    private CombatType combatType;
    private List<TerritoryRewardBracket> victoryPointRewards;
    private TerritoryZoneDefinition zoneDefinition;
    private String conflictImage;
    private TerritoryBattleZoneUnitType territoryBattleZoneUnitType;
    private Boolean alternateChaseIcon;
    private ForceAlignment forceAlignment;
    private Boolean isBonus;
    private Boolean isNewestBonusZone;
}
