package io.github.doenisf.comlink4j.model.endpoints.player;

import io.github.doenisf.comlink4j.model.gamedata.enums.PlayerProfileTab;
import io.github.doenisf.comlink4j.model.gamedata.squad.Squad;
import lombok.Getter;

@Getter
public class PvpProfile {
    private PlayerProfileTab tab;
    private Integer rank;
    private Squad squad;
    private String eventId;
}
