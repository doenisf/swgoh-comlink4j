package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone;

import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryZoneCommandState;
import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryZoneState;
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
