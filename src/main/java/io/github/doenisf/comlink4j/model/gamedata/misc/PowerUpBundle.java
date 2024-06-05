package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class PowerUpBundle {
    private String id;
    private Integer targetLevel;
    private UnitTier targetGearTier;
    private Boolean autoSelectTier;
}
