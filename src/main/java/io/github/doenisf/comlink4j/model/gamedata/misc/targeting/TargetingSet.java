package io.github.doenisf.comlink4j.model.gamedata.misc.targeting;

import lombok.Getter;

import java.util.List;

@Getter
public class TargetingSet {
    private String id;
    private List<TargetingWeight> weight;
}
