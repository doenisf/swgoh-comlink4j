package io.github.doenisf.comlink4j.model.events.territorybattle.zone;

import lombok.Getter;

@Getter
public class TerritoryZoneStatus {
    private String zoneId;
    private TerritoryZoneState zoneState;
    private Long score;
    private String channelId;
    private String commandMessage;
    private TerritoryZoneCommandState commandState;
}
