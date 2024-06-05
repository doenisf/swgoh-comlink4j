package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.misc.description.DynamicDescription;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryLocalNote;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryTournamentDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabName;
    private String detailImage;
    private String territoryCategory;
    private String minimapPrefab;
    private Integer roundCount;
    private Integer roundTallyDuration;
    private Integer matchmakingDuration;
    private List<DynamicDescription> dynamicDescription;
    private List<RankRewardPreview> rankRewardPreview;
    private List<MissionGrantedAbility> grantedAbilities;
    private List<TerritoryLocalNote> localNotifications;
    private Boolean restrictSetupDuringAttackPhase;
    private List<TerritoryTournamentConflictZoneDefinition> conflictZoneDefinition;
    private List<TerritoryTournamentDuelZoneDefinition> duelZoneDefinition;
    private Integer noJoinDuration;
    private Float defensiveCharacterDeployWarningThreshold;
    private Float defensiveShipDeployWarningThreshold;
    private Integer matchCount;
    private List<RankRewardPreview> roundRewardPreview;
    private Integer seasonPointsPerBannerPercent;
    private String roundSeasonRewardTableId;
    private Integer minimumBannerRoundRewardThreshold;
    private Integer minimumBannerEventRewardThreshold;
    private String savedSquadConfigId;
}
