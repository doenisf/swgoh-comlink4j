package io.github.doenisf.comlink4j.model.endpoints.events.raid;

import lombok.Getter;

@Getter
public class GuildRaidMember {
    private String playerId;
    private Long memberProgress;
    private Integer memberRank;
}
