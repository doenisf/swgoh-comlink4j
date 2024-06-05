package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone;

import lombok.Getter;

@Getter
public class TerritoryCovertZoneStatus extends TerritoryConflictZoneStatus{
    private Integer playersParticipated;
    private Integer successfulAttempts;
}
