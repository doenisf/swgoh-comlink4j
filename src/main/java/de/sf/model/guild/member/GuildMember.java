package de.sf.model.guild.member;

import de.sf.model.guild.SeasonStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildMember {
    private String playerId;
    private String playerName;
    private Integer playerLevel;
    private GuildMemberLevel memberLevel;
    private Integer guildXp;
    private Long lastActivityTime;
    private Integer squadPower;
    private List<GuildMemberContribution> memberContribution;
    private Long guildJoinTime;
    private Long galacticPower;
    private String playerTitle;
    private String playerPortrait;
    private List<SeasonStatus> seasonStatus;
    private Long lifetimeSeasonScore;
    private String leagueId;
    private Long shipGalacticPower;
    private Long characterGalacticPower;
    private String nucleusId;
}
