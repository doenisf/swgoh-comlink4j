package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.TerritoryZoneStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorywar.TerritoryWarSquad;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarConflictZoneStatus {
    private TerritoryZoneStatus zoneStatus;
    private Integer squadCapacity;
    private List<TerritoryWarSquad> warSquad;
    private Integer squadCount;
    private Integer defeatedSquadCount;
}
