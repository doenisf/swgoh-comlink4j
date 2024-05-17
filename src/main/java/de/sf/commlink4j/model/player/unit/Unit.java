package de.sf.commlink4j.model.player.unit;

import de.sf.commlink4j.model.player.stat.StatDef;
import de.sf.commlink4j.model.player.stat.StatMod;
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
