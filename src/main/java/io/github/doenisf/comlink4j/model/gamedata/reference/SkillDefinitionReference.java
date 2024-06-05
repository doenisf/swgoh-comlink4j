package io.github.doenisf.comlink4j.model.gamedata.reference;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class SkillDefinitionReference {
    private String skillId;
    private UnitTier requiredTier;
    private Rarity requiredRarity;
    private RelicTier requiredRelicTier;
}
