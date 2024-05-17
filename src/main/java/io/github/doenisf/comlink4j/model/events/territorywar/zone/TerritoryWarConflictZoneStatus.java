package io.github.doenisf.comlink4j.model.events.territorywar.zone;

import io.github.doenisf.comlink4j.model.events.territorybattle.zone.TerritoryZoneStatus;
import io.github.doenisf.comlink4j.model.events.territorywar.TerritoryWarSquad;
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
