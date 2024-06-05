package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.misc.EnergyRewardInstance;
import io.github.doenisf.comlink4j.model.gamedata.enums.EnergyType;
import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

import java.util.List;

@Getter
public class EnergyRewardDefinition {
    private EnergyType energyType;
    private List<EnergyRewardInstance> instance;
    private String claimableTitleKey;
    private String claimableDescKey;
    private String upcomingTitleKey;
    private String upcomingDescKey;
    private Requirement showRequirement;
}
