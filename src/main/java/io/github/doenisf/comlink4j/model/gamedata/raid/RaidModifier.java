package io.github.doenisf.comlink4j.model.gamedata.raid;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class RaidModifier {
    private String descKey;
    private List<MissionGrantedAbility> grantedAbility;
    private Long scoreMultiplierUnscaled;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
    private List<RaidAbilityOverride> abilityOverride;
}
