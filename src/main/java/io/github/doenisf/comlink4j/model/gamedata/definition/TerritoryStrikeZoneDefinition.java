package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class TerritoryStrikeZoneDefinition {
    private CampaignElementIdentifier campaignElementIdentifier;
    private TerritoryZoneDefinition zoneDefinition;
    private String encounterRewardTable;
    private CombatType combatType;
}
