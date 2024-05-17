package de.sf.commlink4j.model.events.territorywar;

import lombok.Getter;

@Getter
public class TerritoryWarResult {
    private String territoryWarId;
    private Long score;
    private Integer power;
    private Long opponentScore;
    private Long endTimeSeconds;
}
