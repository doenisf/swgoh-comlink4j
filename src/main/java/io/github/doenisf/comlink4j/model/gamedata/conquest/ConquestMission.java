package io.github.doenisf.comlink4j.model.gamedata.conquest;

import io.github.doenisf.comlink4j.model.gamedata.misc.BattleDetails;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import io.github.doenisf.comlink4j.model.gamedata.item.ConditionalBucket;
import lombok.Getter;

import java.util.List;

@Getter
public class ConquestMission {
    private String id;
    private BattleDetails battleDetails;
    private List<BucketItem> entryCostRequirement;
    private List<BucketItem> rewardPreview;
    private List<ConditionalBucket> conditionalRewardPreview;
    private List<BucketItem> instanceFirstCompleteRewardPreview;
    private String recommendationKey;
}
