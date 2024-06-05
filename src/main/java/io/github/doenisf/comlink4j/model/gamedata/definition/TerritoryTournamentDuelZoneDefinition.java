package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.environment.Environment;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryWarPointStructure;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryTournamentDuelZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private String duelImage;
    private String duelRequirement;
    private String duelDetail;
    private EntryCategoryAllowed entryCategoryAllowed;
    private EntryCategoryAllowed defenseEntryCategoryAllowed;
    private List<Environment> battleEnvironments;
    private TerritoryWarPointStructure pointStructure;
    private Integer saveSquadZoneNumber;
}
