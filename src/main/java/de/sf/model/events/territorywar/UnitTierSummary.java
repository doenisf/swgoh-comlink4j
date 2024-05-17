package de.sf.model.events.territorywar;

import de.sf.model.player.unit.RelicTier;
import de.sf.model.player.unit.UnitTier;
import lombok.Getter;

@Getter
public class UnitTierSummary {
    private String id;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
