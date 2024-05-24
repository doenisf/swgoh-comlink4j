package io.github.doenisf.comlink4j.model.guild;

import io.github.doenisf.comlink4j.model.unit.unit.Unit;
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
