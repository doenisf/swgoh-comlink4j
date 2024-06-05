package io.github.doenisf.comlink4j.model.endpoints.events.raid;

import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidPointsSummary {
    private CampaignElementIdentifier identifier;
    private Long totalPoints;
}
