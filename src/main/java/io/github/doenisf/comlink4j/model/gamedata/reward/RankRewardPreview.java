package io.github.doenisf.comlink4j.model.gamedata.reward;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class RankRewardPreview {
    private Integer rankStart;
    private Integer rankEnd;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
