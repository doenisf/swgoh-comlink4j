package de.sf.model.events.raid;

import lombok.Getter;

import java.util.List;

@Getter
public class RankRewardPreview {
    private Integer rankStart;
    private Integer rankEnd;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
