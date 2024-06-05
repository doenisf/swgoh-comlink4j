package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryZoneDefinition {
    private String zoneId;
    private String prefabName;
    private String nameKey;
    private String descriptionKey;
    private String linkedConflictId;
    private Integer maxAttemptsAllowed;
    private Requirement unlockRequirement;
    private Integer maxUnitCountPerPlayer;
    private List<MissionGrantedAbility> grantedAbilities;
    private String detailViewIconOverrideName;
    private String mapIconOverrideName;
}
