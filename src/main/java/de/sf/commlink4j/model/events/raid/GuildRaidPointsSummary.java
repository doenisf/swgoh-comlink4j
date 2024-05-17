package de.sf.commlink4j.model.events.raid;

import de.sf.commlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidPointsSummary {
    private CampaignElementIdentifier identifier;
    private Long totalPoints;
}
