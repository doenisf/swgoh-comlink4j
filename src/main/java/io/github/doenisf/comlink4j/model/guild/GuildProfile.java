package io.github.doenisf.comlink4j.model.guild;

import io.github.doenisf.comlink4j.model.events.raid.GuildRaidLaunchConfig;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildProfile {
    private String id;
    private String name;
    private String externalMessageKey;
    private List<String> messageCriteriaKey;
    private String logoBackground;
    private EnrollmentStatus enrollmentStatus;
    private Integer trophy;
    private Integer memberCount;
    private Integer maxMember;
    private Integer level;
    private Integer rank;
    private Integer levelRequirement;
    private Integer raidWin;
    private Long leaderboardScore;
    private String bannerColorId;
    private String bannerLogoId;
    private Long guildGalacticPower;
    private String chatChannelId;
    private String guildType;
    private List<GuildRaidLaunchConfig> raidLaunchConfig;
    private List<GuildEventTracker> guildEventTracker;
    private Long guildGalacticPowerForRequirement;
    private GuildRaidLaunchConfig singleLaunchConfig;
    private GuildRaidLaunchConfig autoLaunchConfig;

}
