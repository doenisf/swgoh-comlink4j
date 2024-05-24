package io.github.doenisf.comlink4j.model.unit.unit;

import io.github.doenisf.comlink4j.model.stat.stat.StatDef;
import io.github.doenisf.comlink4j.model.stat.stat.StatMod;
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