package io.github.doenisf.comlink4j.model.gamedata.misc.lookup;

import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

import java.util.List;

@Getter
public class LookupMission {
    private CampaignElementIdentifier missionIdentifier;
    private List<String> requirementId;
}
