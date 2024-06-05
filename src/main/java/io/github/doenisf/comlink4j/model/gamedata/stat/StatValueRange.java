package io.github.doenisf.comlink4j.model.gamedata.stat;

import io.github.doenisf.comlink4j.model.gamedata.enums.BattleUnitStateStat;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitStat;
import lombok.Getter;

@Getter
public class StatValueRange {
    private UnitStat stat;
    private BattleUnitStateStat battleStat;
    private StatValueRangeNumber min;
    private StatValueRangeNumber max;
}
