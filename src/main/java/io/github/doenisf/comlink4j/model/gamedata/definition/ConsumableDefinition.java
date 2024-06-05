package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.stat.TargetedStat;
import lombok.Getter;

import java.util.List;

@Getter
public class ConsumableDefinition {
    private String id;
    private String tierId;
    private String nameKey;
    private String descriptionKey;
    private Integer totalBattleUse;
    private List<MissionGrantedAbility> grantedAbility;
    private Integer staminaRecovery;
    private List<TargetedStat> targetedStat;
    private String consumableTypeId;
    private String effectIconKey;
    private Long activeTimeInSeconds;
    private Integer staminaRegenTimeReduction;
    private Integer energyRegenTimeReduction;
}
