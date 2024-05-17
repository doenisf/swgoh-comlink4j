package de.sf.model.events.territorybattle.zone.recon;

import de.sf.model.player.unit.RelicTier;
import de.sf.model.player.unit.UnitTier;
import lombok.Getter;

@Getter
public class TerritoryReconZoneUnit {
    private String unitIdentifier;
    private Integer level;
    private String memberId;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
