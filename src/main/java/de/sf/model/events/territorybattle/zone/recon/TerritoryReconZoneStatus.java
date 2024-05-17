package de.sf.model.events.territorybattle.zone.recon;

import de.sf.model.events.territorybattle.zone.TerritoryConflictZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryReconZoneStatus extends TerritoryConflictZoneStatus {
    private List<TerritoryReconZonePlatoon> platoon;
}
