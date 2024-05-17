package de.sf.model.events.territorywar;

import lombok.Getter;

@Getter
public class TerritoryWarParticipant {
    private String memberId;
    private Long joinTime;
    private Boolean eligible;
    private Integer power;
}
