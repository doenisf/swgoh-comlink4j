package io.github.doenisf.comlink4j.model.events.territorybattle.zone.recon;

import io.github.doenisf.comlink4j.model.unit.unit.RelicTier;
import io.github.doenisf.comlink4j.model.unit.unit.UnitTier;
import lombok.Getter;

@Getter
public class TerritoryReconZoneUnit {
    private String unitIdentifier;
    private Integer level;
    private String memberId;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
