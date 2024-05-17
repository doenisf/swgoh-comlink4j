package de.sf.model.events.raid;

import de.sf.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidProgress {
    private CampaignElementIdentifier identifier;
    private CampaignElementProgress progress;
    private Integer winCount;
}
