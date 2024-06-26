package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattlePlayerStatus {
    private List<TerritoryPlayerZoneStatus> zoneStatus;
    private List<TerritoryPlayerUnitStatus> unitStatus;
}
