package io.github.doenisf.comlink4j.model.player.stat;

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
