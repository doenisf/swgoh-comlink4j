package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.misc.description.DynamicDescription;
import io.github.doenisf.comlink4j.model.gamedata.enums.ForceAlignment;
import io.github.doenisf.comlink4j.model.gamedata.enums.GuildMemberLevel;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryLocalNote;
import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryStatMapCategory;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryBattleDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabName;
    private Long roundDuration;
    private Integer roundCount;
    private List<TerritoryBattleConflictZoneDefinition> conflictZoneDefinition;
    private List<TerritoryStrikeZoneDefinition> strikeZoneDefinition;
    private List<TerritoryReconZoneDefinition> reconZoneDefinition;
    private List<RankRewardPreview> rankRewardPreview;
    private String detailImage;
    private List<DynamicDescription> dynamicDescription;
    private List<TerritoryCovertZoneDefinition> covertZoneDefinition;
    private List<TerritoryStatMapCategory>  statCategory;
    private String territoryCategory;
    private Integer roundTallyDuration;
    private List<MissionGrantedAbility> grantedAbilities;
    private List<TerritoryLocalNote> localNotifications;
    private GuildMemberLevel minMemberLevelForCommandingGuild;
    private Integer commandNotificationCooldownDuration;
    private String minimapPrefab;
    private String searchImage;
    private String infoImage;
    private ForceAlignment forceAlignment;
    private String environmentNameKey;
    private String environmentPrefab;
    private Boolean territoryBattleVersion_3;
    private List<TerritoryBonusZoneDefinition> bonusZoneDefinition;
}
