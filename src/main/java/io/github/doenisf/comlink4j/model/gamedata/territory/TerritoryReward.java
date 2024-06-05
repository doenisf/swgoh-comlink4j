package io.github.doenisf.comlink4j.model.gamedata.territory;

import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryRewardType;
import lombok.Getter;

@Getter
public class TerritoryReward {
    private TerritoryRewardType type;
    private Long value;
    private String rewardId;
}
