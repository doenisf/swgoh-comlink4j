package io.github.doenisf.comlink4j.model.gamedata.reference;

import io.github.doenisf.comlink4j.model.gamedata.enums.SeasonLeaguePromoteSystem;
import io.github.doenisf.comlink4j.model.gamedata.reward.LeagueDivisionRewardPreview;
import lombok.Getter;

import java.util.List;

@Getter
public class SeasonLeagueReference {
    private String definitionId;
    private SeasonLeaguePromoteSystem promoteSystem;
    private Integer promoteCondition;
    private List<LeagueDivisionRewardPreview> rewardPreview;
    private String promoteConditionTable;
}
