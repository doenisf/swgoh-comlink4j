package io.github.doenisf.comlink4j.model.endpoints.events.territorybattle.zone.recon;

import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class TerritoryReconZoneUnit {
    private String unitIdentifier;
    private Integer level;
    private String memberId;
    private UnitTier tier;
    private RelicTier unitRelicTier;
}
