package de.sf.commlink4j.model.player;

import de.sf.commlink4j.model.player.pvp.PvpProfile;
import lombok.Getter;

import java.util.List;

@Getter
public class PlayerArenaProfile {
    private String name;
    private Integer level;
    private Long allyCode;
    private String playerId;
    private List<PvpProfile> pvpProfile;
    private Integer localTimeZoneOffsetMinutes;
    private Long lifetimeSeasonScore;
    private PlayerRating playerRating;
    private String nucleusId;
}
