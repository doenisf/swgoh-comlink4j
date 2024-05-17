package de.sf.commlink4j.model.events.raid;

import lombok.Getter;

import java.util.List;

@Getter
public class RankRewardPreview {
    private Integer rankStart;
    private Integer rankEnd;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
