package io.github.doenisf.comlink4j.model.gamedata.mod;

import io.github.doenisf.comlink4j.model.gamedata.enums.StatModSlot;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitStat;
import lombok.Getter;

import java.util.List;

@Getter
public class ModRecommendationPrimaryStat {
    private StatModSlot slot;
    private List<UnitStat> stat;
}
