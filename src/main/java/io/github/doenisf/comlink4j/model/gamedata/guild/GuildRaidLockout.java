package io.github.doenisf.comlink4j.model.gamedata.guild;

import lombok.Getter;

@Getter
public class GuildRaidLockout {
    private Long lockoutStartTime;
    private Long lockoutEndTime;
}
