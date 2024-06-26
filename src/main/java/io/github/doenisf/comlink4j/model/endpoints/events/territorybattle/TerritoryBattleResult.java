package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattleResult {
    private String instanceId;
    private String definitionId;
    private Long endTime;
    private Long totalStars;
    private List<TerritoryMapStat> finalStat;
}
