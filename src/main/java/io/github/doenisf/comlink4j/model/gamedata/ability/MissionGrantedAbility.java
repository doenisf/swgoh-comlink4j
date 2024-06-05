package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

import java.util.List;

@Getter
public class MissionGrantedAbility {
    private String abilityId;
    private String targetRuleId;
    private Requirement unlockRequirement;
    private String rankLabelOverrideKey;
    private Boolean useOverlayIcon;
    private String overlaySpriteName;
    private List<String> zonesToApplyTo;
    private Boolean showInPlatoonView;
    private AbilityModifierData modifierData;
    private String conditionDescKey;
}
