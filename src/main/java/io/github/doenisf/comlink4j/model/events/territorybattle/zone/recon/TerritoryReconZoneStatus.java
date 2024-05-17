package io.github.doenisf.comlink4j.model.events.territorybattle.zone.recon;

import io.github.doenisf.comlink4j.model.events.territorybattle.zone.TerritoryConflictZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryReconZoneStatus extends TerritoryConflictZoneStatus {
    private List<TerritoryReconZonePlatoon> platoon;
}
