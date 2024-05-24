package io.github.doenisf.comlink4j.model.events.territorywar;

import io.github.doenisf.comlink4j.model.unit.unit.RelicTier;
import io.github.doenisf.comlink4j.model.unit.unit.UnitTier;
import lombok.Getter;

@Getter
public class UnitTierSummary {
    private String id;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
