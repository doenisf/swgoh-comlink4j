package io.github.doenisf.comlink4j.model.gamedata.effect;

import io.github.doenisf.comlink4j.model.gamedata.misc.BattleCondition;
import io.github.doenisf.comlink4j.model.gamedata.enums.*;
import io.github.doenisf.comlink4j.model.gamedata.reference.EffectReference;
import io.github.doenisf.comlink4j.model.gamedata.reference.PersistentVfxReference;
import io.github.doenisf.comlink4j.model.gamedata.misc.EffectTag;
import lombok.Getter;

import java.util.List;

@Getter
public class Effect {
    private String id;
    private EffectType type;
    private List<String> param;
    private Integer chance;
    private List<EffectTarget> target;
    private List<EffectTag> descriptiveTag;
    private List<EffectTag> effectedTag;
    private List<BattleCondition> triggerCondition;
    private List<Effect> effectDefinition;
    private List<Integer> contextIndex;
    private List<BattleCondition> expirationCondition;
    private EffectApplyType applyType;
    private EffectDamageType damageType;
    private String persistentIcon;
    private String triggeredVfx;
    private String triggeredLocKey;
    private Integer maxBonusMoves;
    private List<EffectReference> effectReference;
    private Integer multiplierAmountDecimal;
    private Integer contextMultiplierDecimal;
    private Long additiveAmountDecimal;
    private Integer resultVarianceDecimal;
    private String persistentLocKey;
    private String stackingLineOverride;
    private String persistentIconOverlay;
    private Integer persistentIconPriority;
    private String iconColor;
    private Boolean persistentIconGroupable;
    private PersistentVfxReference persistentVfxReference;
    private String blackboardName;
    private String summonId;
    private List<Effect> summonEffect;
    private Integer summonLevel;
    private UnitTier summonTier;
    private Rarity summonRarity;
    private Integer summonSquadIncrease;
    private Boolean ignoreDamageAnimation;
    private List<String> infiniteCycleEffect;
    private String blackboardCompareName;
    private Integer summonMarkerIndex;
    private Boolean summonEnableInitialVfx;
    private Integer summonCount;
}
