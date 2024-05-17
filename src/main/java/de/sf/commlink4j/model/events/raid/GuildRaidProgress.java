package de.sf.commlink4j.model.events.raid;

import de.sf.commlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidProgress {
    private CampaignElementIdentifier identifier;
    private CampaignElementProgress progress;
    private Integer winCount;
}
