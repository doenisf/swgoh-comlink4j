package de.sf.model.events.territorywar;

import de.sf.model.events.territorybattle.TerritoryPlayerUnitStatus;
import de.sf.model.player.datacron.DatacronBattleStat;
import de.sf.model.player.stat.UnitBattleStat;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarPlayerStatus {
    private List<TerritoryPlayerUnitStatus> unitStatus;
    private List<UnitBattleStat> warRoster;
    private List<DatacronBattleStat> datacronRoster;
    private List<TerritoryPlayerDatacronStatus> datacronStatus;
}
