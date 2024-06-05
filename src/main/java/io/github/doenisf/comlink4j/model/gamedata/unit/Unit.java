package io.github.doenisf.comlink4j.model.gamedata.unit;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import io.github.doenisf.comlink4j.model.gamedata.definition.StatDef;
import io.github.doenisf.comlink4j.model.gamedata.mod.StatMod;
import io.github.doenisf.comlink4j.model.gamedata.misc.Equipment;
import io.github.doenisf.comlink4j.model.gamedata.misc.Relic;
import io.github.doenisf.comlink4j.model.gamedata.misc.Skill;
import lombok.Getter;

import java.util.List;

@Getter
public class Unit {
    private String id;
    private String definitionId;
    private Rarity currentRarity;
    private Integer currentLevel;
    private Integer currentXp;
    private String promotionRecipeReference;
    private List<Skill> skill;
    private StatDef unitStat;
    private List<Equipment> equipment;
    private UnitTier currentTier;
    private List<String> equippedStatModOld;
    private List<StatMod> equippedStatMod;
    private Relic relic;
    private List<String> purchasedAbilityId;
}
