package io.github.doenisf.comlink4j.model.events;

import io.github.doenisf.comlink4j.model.modifier.SystemModifier;
import io.github.doenisf.comlink4j.model.guild.CampaignElementIdentifier;
import io.github.doenisf.comlink4j.model.events.raid.BucketItem;
import io.github.doenisf.comlink4j.model.events.raid.RankRewardPreview;
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
