package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.Ability;
import io.github.doenisf.comlink4j.model.gamedata.misc.CrewMember;
import io.github.doenisf.comlink4j.model.gamedata.enums.*;
import io.github.doenisf.comlink4j.model.gamedata.mod.UnitModRecommendation;
import io.github.doenisf.comlink4j.model.gamedata.reference.AbilityReference;
import io.github.doenisf.comlink4j.model.gamedata.reference.SkillDefinitionReference;
import io.github.doenisf.comlink4j.model.gamedata.squad.RecommendedSquad;
import io.github.doenisf.comlink4j.model.gamedata.stat.SummonStatTable;
import lombok.Getter;

import java.util.List;

@Getter
public class UnitDef {
    private String id;
    private String unitPrefab;
    private String thumbnailName;
    private Rarity rarity;
    private Rarity maxRarity;
    private ForceAlignment forceAlignment;
    private String xpTableId;
    private Integer actionCountMin;
    private Integer actionCountMax;
    private CombatType combatType;
    private String descKey;
    private ThreatLevel threatLevel;
    private Boolean obtainable;
    private String promotionRecipeReference;
    private String statProgressionId;
    private List<String> categoryId;
    private Integer trainingXpWorthBaseValueOverride;
    private Integer maxLevelOverride;
    private Integer trainingCostMultiplierOverride;
    private String creationRecipeReference;
    private List<SkillDefinitionReference> skillReference;
    private Integer basePower;
    private StatDef baseStat;
    private List<UnitTierDef> unitTier;
    private Ability basicAttack;
    private Ability leaderAbility;
    private List<Ability> limitBreak;
    private List<Ability> uniqueAbility;
    private AbilityReference basicAttackRef;
    private AbilityReference leaderAbilityRef;
    private List<AbilityReference> limitBreakRef;
    private List<AbilityReference> uniqueAbilityRef;
    private UnitStat primaryUnitStat;
    private Long obtainableTime;
    private List<CrewMember> crew;
    private Integer commandCost;
    private String crewContributionTableId;
    private UnitClass unitClass;
    private String battlePortraitPrefab;
    private String battlePortraitNameKey;
    private List<UnitModRecommendation> modRecommendation;
    private List<String> effectIconPriorityOverride;
    private List<SummonStatTable> summonStatTable;
    private RelicDefinition relicDefinition;
    private String capitalUnlockKey;
    private Boolean legend;
    private Integer squadPositionPriority;
    private List<RecommendedSquad> exampleSquad;
    private Boolean big;
    private Boolean hideInTurnOrder;
    private String thumbImageTurnOrder;
    private String requireUltimateUnlock;
}
