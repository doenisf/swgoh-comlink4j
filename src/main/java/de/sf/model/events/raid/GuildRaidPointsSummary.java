package de.sf.model.events.raid;

import de.sf.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidPointsSummary {
    private CampaignElementIdentifier identifier;
    private Long totalPoints;
}
