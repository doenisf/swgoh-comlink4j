package de.sf.commlink4j.model.events.territorywar;

import de.sf.commlink4j.model.events.territorywar.zone.TerritoryWarConflictZoneStatus;
import de.sf.commlink4j.model.events.territorybattle.zone.recon.TerritoryReconZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarGuildStatus {
    private TerritoryGuildProfile profile;
    private List<TerritoryWarConflictZoneStatus> conflictStatus;
    private List<TerritoryReconZoneStatus> reconStatus;
}
