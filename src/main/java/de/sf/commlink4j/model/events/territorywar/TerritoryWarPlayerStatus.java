package de.sf.commlink4j.model.events.territorywar;

import de.sf.commlink4j.model.events.territorybattle.TerritoryPlayerUnitStatus;
import de.sf.commlink4j.model.player.datacron.DatacronBattleStat;
import de.sf.commlink4j.model.player.stat.UnitBattleStat;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarPlayerStatus {
    private List<TerritoryPlayerUnitStatus> unitStatus;
    private List<UnitBattleStat> warRoster;
    private List<DatacronBattleStat> datacronRoster;
    private List<TerritoryPlayerDatacronStatus> datacronStatus;
}
