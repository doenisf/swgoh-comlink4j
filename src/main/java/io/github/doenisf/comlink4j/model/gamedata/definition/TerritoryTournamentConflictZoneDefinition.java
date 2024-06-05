package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryRewardBracket;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryTournamentConflictZoneDefinition {
    private CombatType combatType;
    private List<TerritoryRewardBracket> victoryPointRewards;
    private TerritoryZoneDefinition zoneDefinition;
}
