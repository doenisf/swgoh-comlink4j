package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import lombok.Getter;

@Getter
public class TerritoryWarResult {
    private String territoryWarId;
    private Long score;
    private Integer power;
    private Long opponentScore;
    private Long endTimeSeconds;
}
