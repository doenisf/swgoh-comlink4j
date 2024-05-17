package de.sf.model.events.territorybattle;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryMapStat {
    private String mapStatId;
    private List<TerritoryPlayerStat> playerStat;
}
