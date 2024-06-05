package io.github.doenisf.comlink4j.model.endpoints.guild;

import io.github.doenisf.comlink4j.model.gamedata.enums.GuildInviteType;
import io.github.doenisf.comlink4j.model.gamedata.unit.Unit;
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
