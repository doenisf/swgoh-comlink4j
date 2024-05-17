package de.sf.model.events.territorybattle.zone;

import lombok.Getter;

@Getter
public class TerritoryCovertZoneStatus extends TerritoryConflictZoneStatus{
    private Integer playersParticipated;
    private Integer successfulAttempts;
}
