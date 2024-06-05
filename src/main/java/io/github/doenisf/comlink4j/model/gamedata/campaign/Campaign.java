package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignElementProgress;
import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignType;
import lombok.Getter;

import java.util.List;

@Getter
public class Campaign {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String image;
    private CampaignType campaignType;
    private List<CampaignMap> campaignMap;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private Boolean grindEnabled;
}
