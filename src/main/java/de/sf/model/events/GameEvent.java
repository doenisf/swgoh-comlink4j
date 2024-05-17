package de.sf.model.events;

import de.sf.model.guild.CampaignElementIdentifier;
import de.sf.model.events.raid.RankRewardPreview;
import de.sf.model.player.pvp.SquadType;
import lombok.Getter;

import java.util.List;

@Getter
public class GameEvent {
    private String id;
    private Integer priority;
    private String nameKey;
    private String summaryKey;
    private String descKey;
    private String image;
    private GameEventType type;
    private List<GameEventInstance> instance;
    private GameEventStatus status;
    private CampaignElementIdentifier campaignElementIdentifier;
    private SquadType squadType;
    private String previewKey;
    private String reviewKey;
    private GameEventUILocation uiLocation;
    private String icon;
    private List<Environment> environment;
    private String descKeyUnitCriteriaMet;
    private SquadType defensiveSquadType;
    private CombatType combatType;
    private String imageEffect;
    private String unlockRequirementLocalizationKey;
    private String territoryMapId;
    private String pushNotificationTitleKey;
    private String pushNotificationDescKey;
    private String seasonDefId;
    private String unlockRequirementId;
    private List<Feat> feat;
    private List<String> linkedStoreItemId;
    private String factionImage;
    private GameEventDetailsType detailsType;
    private String conquestId;
    private List<RankRewardPreview> rankRewardPreview;
    private String iconJoin;
    private String iconSetDefense;
    private String iconAttack;
}
