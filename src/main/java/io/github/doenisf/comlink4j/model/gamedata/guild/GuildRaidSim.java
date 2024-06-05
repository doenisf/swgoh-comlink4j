package io.github.doenisf.comlink4j.model.gamedata.guild;

import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildRaidSim {
    private List<BucketItem> simReward;
    private CampaignElementIdentifier campaignElementIdentifier;
    private String requirementId;
}
