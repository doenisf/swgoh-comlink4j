package de.sf.commlink4j.model.events.raid;

import de.sf.commlink4j.model.guild.CampaignElementIdentifier;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildRaidStatus {
    private String raidId;
    private Long expireTime;
    private Float raidProgress;
    private List<GuildRaidMember> raidMemberOld;
    private List<BattleUnitState> opponentUnitState;
    private List<BattleUnitState> playerUnitState;
    private CampaignElementIdentifier identifier;
    private String instanceId;
    private Long rosterRefreshTime;
    private RaidState raidState;
    private Long tallyEndTime;
    private Boolean eligibleForRewards;
    private Long activeTimeMs;
    private Boolean forbidLateEntry;
    private Long joinPeriodEndTimeMs;
    private List<RaidMember> raidMember;
    private Boolean simEnabled;
    private String encounterId;
    private Integer currentEncounterPointsScored;
    private Long guildRewardScore;
    private List<String> ineligibleMemberId;
    private List<Integer> claimedImmediateRewards;
    private CachedRaidRewards cachedRewards;
}
