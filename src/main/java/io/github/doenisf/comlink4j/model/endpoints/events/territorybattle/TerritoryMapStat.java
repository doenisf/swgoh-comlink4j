package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryMapStat {
    private String mapStatId;
    private List<TerritoryPlayerStat> playerStat;
}
