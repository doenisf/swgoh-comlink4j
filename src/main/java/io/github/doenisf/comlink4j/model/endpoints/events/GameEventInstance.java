package io.github.doenisf.comlink4j.model.endpoints.events;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.modifier.SystemModifier;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
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
