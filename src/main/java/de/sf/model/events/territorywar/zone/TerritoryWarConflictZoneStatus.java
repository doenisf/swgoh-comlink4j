package de.sf.model.events.territorywar.zone;

import de.sf.model.events.territorybattle.zone.TerritoryZoneStatus;
import de.sf.model.events.territorywar.TerritoryWarSquad;
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
