package io.github.doenisf.comlink4j.model.gamedata.mod;

import io.github.doenisf.comlink4j.model.gamedata.stat.Stat;
import lombok.Getter;

import java.util.List;

@Getter
public class StatModStat {
    private Stat stat;
    private List<String> rolls;
    private Integer statRolls;
    private Long statRollerBoundsMin;
    private Long statRollerBoundsMax;
    private List<Long> unscaledRollValue;
}
