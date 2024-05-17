package de.sf.model.events.raid;

import lombok.Getter;

@Getter
public class RaidMember {
    private String playerId;
    private Long memberProgress;
    private Integer memberRank;
    private Integer memberAttempt;
}
