package de.sf.commlink4j.model.events.raid;

import de.sf.commlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildRaidResult {
    private String raidId;
    private CampaignElementIdentifier identifier;
    private Long duration;
    private Float progress;
    private List<RaidMember> raidMember;
    private Long endTime;
    private RaidOutcome outcome;
    private List<Long> encounterProgress;
    private Long guildRewardScore;
    private CachedRaidRewards cachedRewards;
}
