package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignNodeDifficulty;
import lombok.Getter;

import java.util.List;

@Getter
public class CampaignNodeDifficultyGroup {
    private CampaignNodeDifficulty campaignNodeDifficulty;
    private List<CampaignNode> campaignNode;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private Boolean grindEnabled;
}
