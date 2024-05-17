package io.github.doenisf.comlink4j.model.events.raid;

import lombok.Getter;

import java.util.List;

@Getter
public class CachedRaidRewards {
    private List<RankRewardPreview> rankRewardPreview;
    private List<RankRewardPreview> immediateRegularRankRewardPreview;
}
