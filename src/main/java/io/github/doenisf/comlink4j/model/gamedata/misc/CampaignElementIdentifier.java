package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignNodeDifficulty;
import lombok.Getter;

@Getter
public class CampaignElementIdentifier {
    private String campaignId;
    private String campaignMapId;
    private String campaignNodeId;
    private CampaignNodeDifficulty campaignNodeDifficulty;
    private String campaignMissionId;
}
