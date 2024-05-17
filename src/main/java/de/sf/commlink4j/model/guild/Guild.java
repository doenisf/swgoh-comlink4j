package de.sf.commlink4j.model.guild;

import de.sf.commlink4j.model.events.GameEvent;
import de.sf.commlink4j.model.events.raid.GuildRaidPointsSummary;
import de.sf.commlink4j.model.events.raid.GuildRaidResult;
import de.sf.commlink4j.model.events.raid.GuildRaidStatus;
import de.sf.commlink4j.model.events.territorybattle.TerritoryBattleResult;
import de.sf.commlink4j.model.events.territorybattle.TerritoryBattleStatus;
import de.sf.commlink4j.model.events.territorywar.TerritoryWarResult;
import de.sf.commlink4j.model.events.territorywar.TerritoryWarStatus;
import de.sf.commlink4j.model.guild.member.GuildMember;
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
