package io.github.doenisf.comlink4j.model.events.raid;

import io.github.doenisf.comlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class GuildRaidLaunchConfig {
    private String raidId;
    private CampaignElementIdentifier campaignMissionIdentifier;
    private Boolean autoLaunch;
    private Boolean autoLaunchImmediately;
    private Long autoLaunchTime;
    private Long joinPeriodDuration;
    private Boolean autoSimEnabled;
    private Boolean immediate;
    private Long scheduledUtcOffsetSeconds;
}
