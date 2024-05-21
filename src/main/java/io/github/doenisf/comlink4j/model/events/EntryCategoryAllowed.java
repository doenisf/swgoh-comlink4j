package io.github.doenisf.comlink4j.model.events;

import io.github.doenisf.comlink4j.model.unit.unit.Rarity;
import io.github.doenisf.comlink4j.model.unit.unit.RelicTier;
import io.github.doenisf.comlink4j.model.unit.unit.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class EntryCategoryAllowed {
    private List<String> categoryId;
    private Integer maximumAllowedUnitQuantity;
    private CategoryMatchType matchType;
    private Integer minimumRequiredUnitQuantity;
    private Rarity minimumUnitRarity;
    private Integer minimumUnitLevel;
    private UnitTier minimumUnitTier;
    private Integer maximumReinforcement;
    private List<String> commanderCategoryId;
    private Integer minimumReinforcement;
    private Integer minimumGalacticPower;
    private List<MandatoryRosterUnit> mandatoryRosterUnit;
    private List<String> excludeCategoryId;
    private RelicTier minimumRelicTier;
    private Rarity minimumModRarity;
    private Integer minimumAbilityLevelAvg;
    private Integer minimumAbilityLevelAll;
    private Integer legendLimit;
    private Integer unitGuideMinimumRequiredUnitQuantity;
    private Integer bigUnitLimit;
}
