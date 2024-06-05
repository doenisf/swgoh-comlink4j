package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ForceAlignment;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitClass;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class CampaignNode {
    private String id;
    private String nameKey;
    private List<CampaignNodeMission> campaignNodeMission;
    private String homePrefab;
    private ForceAlignment forceAlignment;
    private UnitClass dominantClass;
    private CombatType combatType;
    private Boolean isCannon;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private String cooldownKey;
    private Boolean grindEnabled;
    private String cooldownConditionalOverrideKey;
    private List<BucketItem> firstTimeFinishCost;
}
