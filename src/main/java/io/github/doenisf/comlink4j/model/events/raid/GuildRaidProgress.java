package io.github.doenisf.comlink4j.model.events.raid;

import io.github.doenisf.comlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidProgress {
    private CampaignElementIdentifier identifier;
    private CampaignElementProgress progress;
    private Integer winCount;
}
