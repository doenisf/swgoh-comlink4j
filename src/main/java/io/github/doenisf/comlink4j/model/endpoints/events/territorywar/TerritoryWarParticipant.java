package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import lombok.Getter;

@Getter
public class TerritoryWarParticipant {
    private String memberId;
    private Long joinTime;
    private Boolean eligible;
    private Integer power;
}
