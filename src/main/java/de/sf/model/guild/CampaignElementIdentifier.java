package de.sf.model.guild;

import lombok.Getter;

@Getter
public class CampaignElementIdentifier {
    private String campaignId;
    private String campaignMapId;
    private String campaignNodeId;
    private CampaignNodeDifficulty campaignNodeDifficulty;
    private String campaignMissionId;
}
