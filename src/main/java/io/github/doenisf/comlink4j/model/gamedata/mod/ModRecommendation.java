package io.github.doenisf.comlink4j.model.gamedata.mod;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitStat;
import lombok.Getter;

import java.util.List;

@Getter
public class ModRecommendation {
    private String id;
    private List<ModRecommendationSetBonus> setRecommendation;
    private List<ModRecommendationPrimaryStat> primaryStatRecommendation;
    private List<UnitStat> secondaryStatRecommendation;
    private String tipKey;
}
