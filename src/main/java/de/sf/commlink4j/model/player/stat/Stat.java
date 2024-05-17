package de.sf.commlink4j.model.player.stat;

import lombok.Getter;

@Getter
public class Stat {
    private UnitStat unitStatId;
    private Long statValueDecimal;
    private Long unscaledDecimalValue;
    private Long uiDisplayOverrideValue;
    private Long scalar;
}
