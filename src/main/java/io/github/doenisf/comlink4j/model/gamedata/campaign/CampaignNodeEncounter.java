package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.enums.ColorType;
import io.github.doenisf.comlink4j.model.gamedata.environment.Environment;
import io.github.doenisf.comlink4j.model.gamedata.message.ContextualMessageGroup;
import lombok.Getter;

import java.util.List;

@Getter
public class CampaignNodeEncounter {
    private List<CampaignCinematic> encounterCinematics;
    private List<Environment> environment;
    private List<ContextualMessageGroup> encounterMessage;
    private String audioKey;
    private Boolean allowChanceMechanics;
    private List<ContextualMessageGroup> firstTimeEncounterMessage;
    private String encounterIcon;
    private String encounterDescKey;
    private Integer encounterIconPosition;
    private ColorType raidProgressColor;
    private Integer maxDeployedSquadSize;
    private String environmentCollectionId;
    private String encounterId;
    private Long encounterDurationLimit;
    private Long scoreToComplete;
    private String detailDescKey;
    private Long pointsToComplete;
    private String audioVictoryKey;
    private List<String> displayableEnemyId;
    private List<String> displayableGrantedAbility;
}
