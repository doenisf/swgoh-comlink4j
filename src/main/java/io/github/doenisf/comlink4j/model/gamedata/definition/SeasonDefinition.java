package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.reference.SeasonDivisionReference;
import io.github.doenisf.comlink4j.model.gamedata.reference.SeasonLeagueReference;
import io.github.doenisf.comlink4j.model.gamedata.misc.SeasonDivisionSkillBoundary;
import lombok.Getter;

import java.util.List;

@Getter
public class SeasonDefinition {
    private String id;
    private String nameKey;
    private List<SeasonLeagueReference> seasonLeagueReference;
    private List<SeasonDivisionReference> seasonDivisionReference;
    private String seasonRewardTableId;
    private Integer minimumBannerSeasonRewardThreshold;
    private List<SeasonDivisionSkillBoundary>  divisionSkillBoundary;
}
