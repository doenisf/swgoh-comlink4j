package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class CampaignMap {
    private String id;
    private List<CampaignNodeDifficultyGroup> campaignNodeDifficultyGroup;
    private CampaignElementProgress progress;
    private List<BucketItem> entryOwnershipRequirement;
    private String unlockRequirementLocalizationKey;
    private Boolean isPlayerSquadSupplied;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private Boolean grindEnabled;
    private String gameModeKey;
}
