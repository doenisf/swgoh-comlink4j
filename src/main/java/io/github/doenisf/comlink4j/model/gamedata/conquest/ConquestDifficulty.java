package io.github.doenisf.comlink4j.model.gamedata.conquest;

import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignNodeDifficulty;
import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import lombok.Getter;

import java.util.List;

@Getter
public class ConquestDifficulty {
    private Integer minGp;
    private List<ConquestSector> sector;
    private String nameKey;
    private CampaignNodeDifficulty id;
    private List<RankRewardPreview> rankRewardPreview;
    private List<RankRewardPreview> immediateRankRewardPreview;
    private Integer recommendedMinGp;
    private List<RankRewardPreview> premiumImmediateRankRewardPreview;
}
