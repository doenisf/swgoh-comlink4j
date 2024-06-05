package io.github.doenisf.comlink4j.model.endpoints.events.territorywar;

import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class UnitTierSummary {
    private String id;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
