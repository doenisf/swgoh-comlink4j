package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class SkillTierDefinition {
    private String recipeId;
    private Integer requiredUnitLevel;
    private Rarity requiredUnitRarity;
    private UnitTier requiredUnitTier;
    private String powerOverrideTag;
    private RelicTier requiredRelicTier;
    private Boolean isZetaTier;
    private Boolean isOmicronTier;
}
