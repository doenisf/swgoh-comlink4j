package io.github.doenisf.comlink4j.model.gamedata.ability;

import io.github.doenisf.comlink4j.model.gamedata.reference.EffectReference;
import io.github.doenisf.comlink4j.model.gamedata.misc.EffectTag;
import lombok.Getter;

import java.util.List;

@Getter
public class AbilityTier {
    private String descKey;
    private String upgradeDescKey;
    private Integer cooldownMaxOverride;
    private List<EffectReference> effectReference;
    private List<EffectTag> interactsWithTag;
    private String blockingEffectId;
    private String blockedLocKey;
}
