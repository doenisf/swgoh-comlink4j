package io.github.doenisf.comlink4j.model.endpoints.player;

import io.github.doenisf.comlink4j.model.gamedata.unit.Unit;
import lombok.Getter;

import java.util.List;

@Getter
public class Player {
    private String name;
    private Integer level;
    private String allyCode;
    private String playerId;
    private List<Unit> rosterUnit;
    private List<ProfileStat> profileStat;
    private String guildId;
    private String guildName;
    private String guildLogoBackground;
    private String guildBannerColor;
    private String guildBannerLogo;
    private List<PvpProfile> pvpProfile;
    private Selected selectedPlayerTitle;
    private String guildTypeId;
    private String localTimeZoneOffsetMinutes;
    private String lastActivityTime;
    private Selected selectedPlayerPortrait;
    private String lifetimeSeasonScore;
    private PlayerRating playerRating;
    private String nucleusId;
}
