package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryCovertZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private CampaignElementIdentifier campaignElementIdentifier;
    private List<BucketItem> victoryReward;
    private Boolean disableRewardOnMap;
    private CombatType combatType;
}
