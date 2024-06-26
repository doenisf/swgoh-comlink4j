package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle;

import io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.TerritoryStatCovertZoneResult;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryPlayerStat {
    private String memberId;
    private Long score;
    private List<TerritoryStatCovertZoneResult> covertZoneResult;
}
