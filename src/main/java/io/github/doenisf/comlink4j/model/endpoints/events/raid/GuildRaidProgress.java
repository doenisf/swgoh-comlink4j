package io.github.doenisf.comlink4j.model.endpoints.events.raid;

import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidProgress {
    private CampaignElementIdentifier identifier;
    private CampaignElementProgress progress;
    private Integer winCount;
}
