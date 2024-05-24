package io.github.doenisf.comlink4j.model.datacron.datacron;

import io.github.doenisf.comlink4j.model.unit.unit.RelicTier;
import io.github.doenisf.comlink4j.model.unit.unit.UnitTier;
import io.github.doenisf.comlink4j.model.stat.stat.UnitStat;
import lombok.Getter;

import java.util.List;

@Getter
public class DatacronAffix {
    private String targetRule;
    private String abilityId;
    private UnitStat statType;
    private Long statValue;
    private List<String> tag;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
    private String scopeIcon;
}
