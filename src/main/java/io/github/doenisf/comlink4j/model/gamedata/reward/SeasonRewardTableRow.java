package io.github.doenisf.comlink4j.model.gamedata.reward;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class SeasonRewardTableRow {
    private SeasonRewardTableKey key;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
