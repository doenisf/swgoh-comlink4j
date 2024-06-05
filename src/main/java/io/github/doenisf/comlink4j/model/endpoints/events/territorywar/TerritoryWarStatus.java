package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.TerritoryMapStat;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarStatus {
    private String instanceId;
    private String definitionId;
    private Integer currentRound;
    private Long currentRoundEndTime;
    private String channelId;
    private TerritoryWarGuildStatus homeGuild;
    private TerritoryWarGuildStatus awayGuild;
    private TerritoryWarPlayerStatus playerStatus;
    private List<TerritoryMapStat> currentStat;
    private List<String> optedInMemberId;
    private List<TerritoryWarParticipant> optedInMember;
    private Boolean excludedFromWar;
    private Boolean hasReportedEnemyGuild;
    private Long lastCommandNotificationTime;
    private Boolean mapCompletedEarly;
}
