package de.sf.model.events;

import de.sf.model.guild.CampaignElementIdentifier;
import de.sf.model.events.raid.BucketItem;
import de.sf.model.events.raid.RankRewardPreview;
import de.sf.model.modifier.SystemModifier;
import lombok.Getter;

import java.util.List;

@Getter
public class GameEventInstance {
    private String id;
    private Long startTime;
    private Long endTime;
    private Long displayStartTime;
    private Long displayEndTime;
    private Boolean timeLimited;
    private CampaignElementIdentifier campaignElementIdentifier;
    private List<BucketItem> rewardPreview;
    private List<RankRewardPreview> rankRewardPreview;
    private EntryCategoryAllowed entryCategoryAllowed;
    private Integer defensiveSquadSize;
    private String unitDailyUsageCapKey;
    private Long rosterRefreshTime;
    private Boolean joined;
    private String summaryKey;
    private Long rewardTime;
    private Long defensiveSquadTimeLimit;
    private SystemModifier systemModifier;
    private Boolean supportPushNotifications;
    private List<String> linkedEventId;
}
