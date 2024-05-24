package io.github.doenisf.comlink4j.model.events.territorywar;

import io.github.doenisf.comlink4j.model.events.territorybattle.TerritoryPlayerUnitStatus;
import io.github.doenisf.comlink4j.model.datacron.datacron.DatacronBattleStat;
import io.github.doenisf.comlink4j.model.stat.stat.UnitBattleStat;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarPlayerStatus {
    private List<TerritoryPlayerUnitStatus> unitStatus;
    private List<UnitBattleStat> warRoster;
    private List<DatacronBattleStat> datacronRoster;
    private List<TerritoryPlayerDatacronStatus> datacronStatus;
}
