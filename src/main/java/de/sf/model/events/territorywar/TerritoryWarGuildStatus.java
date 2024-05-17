package de.sf.model.events.territorywar;

import de.sf.model.events.territorybattle.zone.recon.TerritoryReconZoneStatus;
import de.sf.model.events.territorywar.zone.TerritoryWarConflictZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarGuildStatus {
    private TerritoryGuildProfile profile;
    private List<TerritoryWarConflictZoneStatus> conflictStatus;
    private List<TerritoryReconZoneStatus> reconStatus;
}
