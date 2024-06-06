package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.misc.description.DynamicDescription;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ItemType;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import io.github.doenisf.comlink4j.model.gamedata.item.ConditionalBucket;
import io.github.doenisf.comlink4j.model.gamedata.misc.point.Position;
import io.github.doenisf.comlink4j.model.gamedata.raid.RaidPointsStructure;
import io.github.doenisf.comlink4j.model.gamedata.reference.AbilityReference;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import io.github.doenisf.comlink4j.model.gamedata.squad.ForcedPlayerSquad;
import io.github.doenisf.comlink4j.model.gamedata.unit.UnitReplacement;
import lombok.Getter;

import java.util.List;

@Getter
public class CampaignNodeMission {
    private String id;
    private String nameKey;
    private String descKey;
    private CombatType combatType;
    private List<BucketItem> enemyPreview;
    private List<BucketItem> rewardPreview;
    private List<CampaignNodeEncounter> campaignNodeEncounter;
    private String audioKey;
    private CampaignElementProgress progress;
    private List<BucketItem> entryCostRequirement;
    private EntryCategoryAllowed entryCategoryAllowed;
    private String shortNameKey;
    private String groupNameKey;
    private String groupImage;
    private String unlockRequirementLocalizationKey;
    private String cooldownKey;
    private String dailyBattleCapKey;
    private List<BucketItem> firstCompleteRewardPreview;
    private List<CampaignMissionEnemyPreview> enemyUnitPreview;
    private String prefab;
    private Position position;
    private List<AbilityReference> playerAbilityRef;
    private List<BucketItem> activateCost;
    private List<RankRewardPreview> rankRewardPreview;
    private String detailImage;
    private String detailDescKey;
    private String raidConfigId;
    private List<DynamicDescription> dynamicDescription;
    private ItemType nodeDisplayItem;
    private Boolean grindEnabled;
    private Boolean hasForcedAlly;
    private Boolean battleSupportAllowed;
    private Boolean autoBattleEnabled;
    private Boolean retreatEnabled;
    private ForcedPlayerSquad forcedPlayerSquad;
    private List<MissionGrantedAbility> grantedAbilities;
    private String cooldownConditionalOverrideKey;
    private String holonodePlantePrefabName;
    private Boolean battleSpeedAdjustable;
    private String requirementOverrideKey;
    private Boolean simmableOverrideEnabled;
    private List<ConditionalBucket> conditionalRewardsPreview;
    private ConditionalBucket conditionalEntryCostOverride;
    private String recommendationKey;
    private List<BucketItem> instanceFirstCompleteRewardPreview;
    private String overviewLocKey;
    private Integer recommendedGp;
    private Long battleDurationLimit;
    private Integer recommendedUnitGp;
    private Boolean volatileAccess;
    private String unlockRequirementId;
    private String visibilityRequirementId;
    private RaidPointsStructure raidPointsStructure;
    private Boolean featured;
    private List<RankRewardPreview> immediateRegularRankRewardPreview;
    private Integer maxPointsPerAttempt;
    private List<UnitReplacement> unitReplacement;
}