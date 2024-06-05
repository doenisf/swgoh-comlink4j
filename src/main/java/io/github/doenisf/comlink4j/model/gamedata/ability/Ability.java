package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.effect.EffectTarget;
import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityButtonLocationType;
import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityCooldownType;
import io.github.doenisf.comlink4j.model.gamedata.enums.AbilityType;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitDetailsAbilityLocation;
import io.github.doenisf.comlink4j.model.gamedata.message.MessageDialog;
import io.github.doenisf.comlink4j.model.gamedata.misc.BattleCondition;
import io.github.doenisf.comlink4j.model.gamedata.reference.EffectReference;
import io.github.doenisf.comlink4j.model.gamedata.misc.EffectTag;
import lombok.Getter;

import java.util.List;

@Getter
public class Ability {
    private String id;
    private String nameKey;
    private String descKey;
    private String prefabName;
    private List<BattleCondition> triggerCondition;
    private String stackingLineOverride;
    private List<AbilityTier> tier;
    private Integer cooldown;
    private String icon;
    private String applyTypeTooltipKey;
    private List<EffectTag> descriptiveTag;
    private List<EffectReference> effectReference;
    private MessageDialog confirmationMessage;
    private AbilityButtonLocationType buttonLocation;
    private String shortDescKey;
    private AbilityType abilityType;
    private UnitDetailsAbilityLocation detailLocation;
    private String allyTargetingRuleId;
    private Boolean useAsReinforcementDesc;
    private List<EffectTag> interactsWithTag;
    private String subIcon;
    private AbilityAIParams aiParams;
    private AbilityCooldownType cooldownType;
    private Boolean alwaysDisplayInBattleUi;
    private Boolean highlightWhenReadyInBattleUi;
    private Boolean hideCooldownDescription;
    private String blockingEffectId;
    private String blockedLocKey;
    private List<Integer> ultimateChargeRequired;
    private Integer grantedPriority;
    private AbilitySynergy synergy;
    private EffectTarget visualTarget;
}
