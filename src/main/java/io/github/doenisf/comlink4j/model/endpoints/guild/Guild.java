package io.github.doenisf.comlink4j.model.endpoints.guild;

import io.github.doenisf.comlink4j.model.endpoints.events.GameEvent;
import io.github.doenisf.comlink4j.model.endpoints.guild.member.GuildMember;
import io.github.doenisf.comlink4j.model.endpoints.events.raid.GuildRaidPointsSummary;
import io.github.doenisf.comlink4j.model.endpoints.events.raid.GuildRaidResult;
import io.github.doenisf.comlink4j.model.endpoints.events.raid.GuildRaidStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.TerritoryBattleResult;
import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.TerritoryBattleStatus;
import io.github.doenisf.comlink4j.model.endpoints.events.territorywar.TerritoryWarResult;
import io.github.doenisf.comlink4j.model.endpoints.events.territorywar.TerritoryWarStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class Guild {
    private GuildProfile profile;
    private List<GuildMember> member;
    private List<GuildInviteStatus> inviteStatus;
    private List<GuildRaidStatus> raidStatus;
    private List<GuildInventory> inventory;
    private List<GuildRaidResult> raidResult;
    private GuildProgress progress;
    private List<TerritoryBattleStatus> territoryBattleStatus;
    private List<GameEvent> guildEvents;
    private List<TerritoryBattleResult> territoryBattleResult;
    private List<TerritoryWarStatus> territoryWarStatus;
    private List<RoomData> roomAvailable;
    private Long nextChallengesRefresh;
    private List<GuildStat> stat;
    private List<GuildRaidResult> recentRaidResult;
    private List<TerritoryWarResult> recentTerritoryWarResult;
    private List<GuildRaidPointsSummary> lastRaidPointsSummary;
}
