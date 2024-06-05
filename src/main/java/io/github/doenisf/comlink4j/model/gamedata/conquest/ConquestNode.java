package io.github.doenisf.comlink4j.model.gamedata.conquest;

import io.github.doenisf.comlink4j.model.gamedata.campaign.CampaignMissionEnemyPreview;
import io.github.doenisf.comlink4j.model.gamedata.enums.ConquestNodeStyle;
import io.github.doenisf.comlink4j.model.gamedata.enums.ConquestNodeType;
import lombok.Getter;

import java.util.List;

@Getter
public class ConquestNode {
    private String id;
    private ConquestNodeType type;
    private String conquestMissionId;
    private String nameKey;
    private List<CampaignMissionEnemyPreview> enemyUnitPreview;
    private Boolean conquestCompletionNode;
    private String unlockRequirementId;
    private ConquestNodeStyle style;
    private Boolean finishSector;
}
