package io.github.doenisf.comlink4j.model.gamedata.configuration;

import io.github.doenisf.comlink4j.model.gamedata.guild.GuildRaidLockout;
import lombok.Getter;

@Getter
public class GuildRaidGlobalConfig {
    private GuildRaidLockout guildRaidLockout;
    private Long lateEntryParticipationLockoutSeconds;
}
