package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone;

import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryCovertMissionResult;
import lombok.Getter;

@Getter
public class TerritoryStatCovertZoneResult {
    private String covertZoneId;
    private TerritoryCovertMissionResult result;
}
