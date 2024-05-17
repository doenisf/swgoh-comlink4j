package de.sf.model.events.territorybattle;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattlePlayerStatus {
    private List<TerritoryPlayerZoneStatus> zoneStatus;
    private List<TerritoryPlayerUnitStatus> unitStatus;
}
