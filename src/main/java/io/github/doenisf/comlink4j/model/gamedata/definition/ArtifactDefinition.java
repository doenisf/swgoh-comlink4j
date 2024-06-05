package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.stat.TargetedStat;
import lombok.Getter;

import java.util.List;

@Getter
public class ArtifactDefinition {
    private String id;
    private Integer powerLevel;
    private List<MissionGrantedAbility> grantedAbility;
    private String nameKey;
    private String descriptionKey;
    private String texture;
    private List<TargetedStat> targetedStat;
    private String tierId;
}
