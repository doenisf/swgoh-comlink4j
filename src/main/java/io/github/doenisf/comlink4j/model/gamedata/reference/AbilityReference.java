package io.github.doenisf.comlink4j.model.gamedata.reference;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class AbilityReference {
    private String abilityId;
    private UnitTier requiredTier;
    private Rarity requiredRarity;
    private Integer requiredSkillTier;
    private RelicTier requiredRelicTier;
    private Boolean overrideAlwaysDisplayInBattleUi;
    private String overrideIcon;
    private String overrideNameKey;
    private String overrideDescKey;
    private String powerAdditiveTag;
    private String unlockRecipeId;
    private String inheritMappingId;
}
