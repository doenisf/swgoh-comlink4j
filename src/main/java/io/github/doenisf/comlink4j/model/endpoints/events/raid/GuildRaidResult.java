package io.github.doenisf.comlink4j.model.endpoints.events.raid;

import io.github.doenisf.comlink4j.model.gamedata.enums.RaidOutcome;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
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
