package io.github.doenisf.comlink4j.model.player;

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
