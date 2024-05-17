package de.sf.commlink4j.model.player.pvp;

import de.sf.commlink4j.model.player.PlayerProfileTab;
import lombok.Getter;

@Getter
public class PvpProfile {
    private PlayerProfileTab tab;
    private Integer rank;
    private Squad squad;
    private String eventId;
}
