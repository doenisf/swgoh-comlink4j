package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.EnergyRewardInstanceType;
import lombok.Getter;

@Getter
public class EnergyRewardInstance {
    private EnergyRewardInstanceType type;
    private Integer start;
    private Integer duration;
    private Integer amount;
}
