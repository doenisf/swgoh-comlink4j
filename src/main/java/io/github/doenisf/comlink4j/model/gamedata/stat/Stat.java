package io.github.doenisf.comlink4j.model.gamedata.stat;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitStat;
import lombok.Getter;

@Getter
public class Stat {
    private UnitStat unitStatId;
    private Long statValueDecimal;
    private Long unscaledDecimalValue;
    private Long uiDisplayOverrideValue;
    private Long scalar;
}
