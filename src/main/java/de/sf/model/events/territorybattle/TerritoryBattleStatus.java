package de.sf.model.events.territorybattle;

import de.sf.model.events.territorybattle.zone.TerritoryConflictZoneStatus;
import de.sf.model.events.territorybattle.zone.TerritoryStrikeZoneStatus;
import de.sf.model.events.territorybattle.zone.recon.TerritoryReconZoneStatus;
import de.sf.model.events.territorybattle.zone.TerritoryCovertZoneStatus;
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
