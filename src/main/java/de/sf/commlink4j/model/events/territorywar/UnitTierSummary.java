package de.sf.commlink4j.model.events.territorywar;

import de.sf.commlink4j.model.player.unit.RelicTier;
import de.sf.commlink4j.model.player.unit.UnitTier;
import lombok.Getter;

@Getter
public class UnitTierSummary {
    private String id;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
