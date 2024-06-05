package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.enums.EffectTargetBattleSide;
import lombok.Getter;

@Getter
public class AbilityModifierData {
    private EffectTargetBattleSide battleSide;
    private String tint;
    private String tierKey;
    private String icon;
}
