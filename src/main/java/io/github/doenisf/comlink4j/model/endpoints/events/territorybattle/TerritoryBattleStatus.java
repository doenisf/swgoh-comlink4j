package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle;

import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.TerritoryConflictZoneStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.TerritoryStrikeZoneStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.recon.TerritoryReconZoneStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.TerritoryCovertZoneStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattleStatus {
    private String instanceId;
    private String definitionId;
    private List<TerritoryConflictZoneStatus> conflictZoneStatus;
    private List<TerritoryStrikeZoneStatus> strikeZoneStatus;
    private List<TerritoryReconZoneStatus> reconZoneStatus;
    private TerritoryBattlePlayerStatus playerStatus;
    private Integer currentRound;
    private Long currentRoundEndTime;
    private String channelId;
    private List<TerritoryCovertZoneStatus> covertZoneStatus;
    private List<TerritoryMapStat> currentStat;
    private Long lastCommandNotificationTime;
    private Boolean mapCompletedEarly;
    private Boolean selected;
}
