package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.recon.TerritoryReconZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarGuildStatus {
    private TerritoryGuildProfile profile;
    private List<TerritoryWarConflictZoneStatus> conflictStatus;
    private List<TerritoryReconZoneStatus> reconStatus;
}
