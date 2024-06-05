package io.github.doenisf.comlink4j.model.gamedata.reward;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class LeagueDivisionRewardPreview {
    private Integer division;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
