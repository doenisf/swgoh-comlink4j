package io.github.doenisf.comlink4j.model.gamedata.territory;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryTournamentDailyRewardTableRow {
    private Integer league;
    private Integer division;
    private List<BucketItem> primaryReward;
    private List<BucketItem> detailedReward;
}
