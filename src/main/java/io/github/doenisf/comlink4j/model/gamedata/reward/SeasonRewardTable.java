package io.github.doenisf.comlink4j.model.gamedata.reward;

import lombok.Getter;

import java.util.List;

@Getter
public class SeasonRewardTable {
    private String id;
    private List<SeasonRewardTableRow> row;
}
