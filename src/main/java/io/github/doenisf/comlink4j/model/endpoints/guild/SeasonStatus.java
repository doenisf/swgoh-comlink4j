package io.github.doenisf.comlink4j.model.endpoints.guild;

import lombok.Getter;

@Getter
public class SeasonStatus {
    private String seasonId;
    private String eventInstanceId;
    private String league;
    private Integer wins;
    private Integer losses;
    private Integer seasonPoints;
    private Integer division;
    private Long joinTime;
    private Long endTime;
    private Boolean remove;
    private Integer rank;
}
