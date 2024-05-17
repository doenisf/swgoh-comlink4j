package de.sf.model.guild;

import de.sf.model.player.unit.Unit;
import lombok.Getter;

@Getter
public class GuildInviteStatus {
    private String guildId;
    private Long expireTime;
    private String playerId;
    private GuildInviteType type;
    private Unit leaderUnit;
    private Long sentTime;
    private Integer playerLevel;
    private String playerName;
}
