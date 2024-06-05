package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.misc.description.DynamicDescription;
import io.github.doenisf.comlink4j.model.gamedata.enums.GuildMemberLevel;
import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryRewardStructure;
import io.github.doenisf.comlink4j.model.gamedata.environment.Environment;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryLocalNote;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryStatMapCategory;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabName;
    private Integer roundCount;
    private String iconPrefab;
    private String detailImage;
    private Integer roundTallyDuration;
    private List<DynamicDescription> dynamicDescription;
    private List<RankRewardPreview> firstRewardPreview;
    private List<RankRewardPreview> secondRewardPreview;
    private Integer matchmakingDuration;
    private Integer setupDuration;
    private List<MissionGrantedAbility> grantedAbilities;
    private Integer minParticipants;
    private String terrainPrefabName;
    private Integer maxParticipants;
    private Long minScoreRequirement;
    private List<TerritoryWarConflictZoneDefinition> warConflictZoneDefinition;
    private List<TerritoryReconZoneDefinition> reconZoneDefinition;
    private List<TerritoryStatMapCategory> statCategory;
    private TerritoryRewardStructure rewardStructure;
    private String uniqueJoinId;
    private Boolean hideLeaderboard;
    private List<TerritoryLocalNote> localNotifications;
    private GuildMemberLevel minMemberLevelForReportingOpponent;
    private GuildMemberLevel minMemberLevelForCommandingGuild;
    private Integer commandNotificationCooldownDuration;
    private String mapTypeNameKey;
    private Boolean showTimerOnEvent;
    private Boolean restrictSetupDuringAttackPhase;
    private List<Environment> defaultCharacterEnvironments;
    private List<Environment> defaultShipBattleEnvironments;
    private String minimapPrefab;
    private Float defensiveCharacterDeployWarningThreshold;
    private Float defensiveShipDeployWarningThreshold;
    private String leaderboardKey;
    private Integer minPlayerScoreRequirement;
}
