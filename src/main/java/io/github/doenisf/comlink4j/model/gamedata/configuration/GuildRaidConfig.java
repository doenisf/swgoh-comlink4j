package io.github.doenisf.comlink4j.model.gamedata.configuration;

import io.github.doenisf.comlink4j.model.gamedata.enums.GuildRaidRosterRefreshType;
import io.github.doenisf.comlink4j.model.gamedata.enums.GuildRaidType;
import io.github.doenisf.comlink4j.model.gamedata.guild.GuildRaidRosterRefresh;
import lombok.Getter;

@Getter
public class GuildRaidConfig {
    private String id;
    private GuildRaidType raidType;
    private GuildRaidRosterRefreshType rosterRefreshType;
    private GuildRaidRosterRefresh rosterRefresh;
    private Long raidDuration;
}
