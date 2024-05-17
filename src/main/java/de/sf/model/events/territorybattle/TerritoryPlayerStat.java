package de.sf.model.events.territorybattle;

import de.sf.model.events.territorybattle.zone.TerritoryStatCovertZoneResult;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryPlayerStat {
    private String memberId;
    private Long score;
    private List<TerritoryStatCovertZoneResult> covertZoneResult;
}
