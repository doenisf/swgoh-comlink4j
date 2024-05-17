package de.sf.model.player.pvp;

import de.sf.model.player.PlayerProfileTab;
import lombok.Getter;

@Getter
public class PvpProfile {
    private PlayerProfileTab tab;
    private Integer rank;
    private Squad squad;
    private String eventId;
}
