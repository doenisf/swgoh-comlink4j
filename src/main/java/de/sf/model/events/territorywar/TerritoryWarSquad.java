package de.sf.model.events.territorywar;

import de.sf.model.player.pvp.Squad;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarSquad {
    private String playerId;
    private String playerName;
    private Integer power;
    private Squad squad;
    private TerritoryWarSquadStatus squadStatus;
    private String lockName;
    private Integer successfulDefends;
    private List<UnitTierSummary> crewInfo;
}
