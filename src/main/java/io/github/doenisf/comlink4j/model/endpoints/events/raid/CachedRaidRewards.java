package io.github.doenisf.comlink4j.model.endpoints.events.raid;

import io.github.doenisf.comlink4j.model.gamedata.reward.RankRewardPreview;
import lombok.Getter;

import java.util.List;

@Getter
public class CachedRaidRewards {
    private List<RankRewardPreview> rankRewardPreview;
    private List<RankRewardPreview> immediateRegularRankRewardPreview;
}
