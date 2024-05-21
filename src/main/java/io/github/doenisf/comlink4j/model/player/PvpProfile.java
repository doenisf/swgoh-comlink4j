package io.github.doenisf.comlink4j.model.player;

import io.github.doenisf.comlink4j.model.pvp.pvp.Squad;
import lombok.Getter;

@Getter
public class PvpProfile {
    private PlayerProfileTab tab;
    private Integer rank;
    private Squad squad;
    private String eventId;
}
