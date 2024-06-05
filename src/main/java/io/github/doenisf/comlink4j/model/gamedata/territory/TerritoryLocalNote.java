package io.github.doenisf.comlink4j.model.gamedata.territory;

import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryMapPhase;
import lombok.Getter;

@Getter
public class TerritoryLocalNote {
    private String messageKey;
    private String titleKey;
    private Boolean optedIn;
    private TerritoryMapPhase phase;
    private Integer phaseTimeOffsetSeconds;
    private Boolean finalMatchOnly;
    private Boolean perSubPhaseRoundEnd;
}
