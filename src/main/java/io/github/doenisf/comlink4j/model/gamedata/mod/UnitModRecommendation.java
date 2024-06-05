package io.github.doenisf.comlink4j.model.gamedata.mod;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class UnitModRecommendation {
    private String recommendationSetId;
    private UnitTier unitTier;
}
