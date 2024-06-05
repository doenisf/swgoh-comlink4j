package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryReward;
import io.github.doenisf.comlink4j.model.gamedata.environment.Environment;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryWarPointStructure;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarConflictZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private CombatType combatType;
    private String conflictImage;
    private String conflictRequirement;
    private String conflictDetails;
    private EntryCategoryAllowed entryCategoryAllowed;
    private EntryCategoryAllowed defenseEntryCategoryAllowed;
    private TerritoryReward deployDefensiveSquadReward;
    private TerritoryReward offensiveWinReward;
    private TerritoryReward completeZoneReward;
    private TerritoryReward completeZoneRewardPerDefensiveSquad;
    private List<Environment> battleEnvironments;
    private TerritoryWarPointStructure pointStructure;
}
