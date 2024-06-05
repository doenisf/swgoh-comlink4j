package io.github.doenisf.comlink4j.model.gamedata.raid;

import lombok.Getter;

import java.util.List;

@Getter
public class RaidPointsStructure {
    private List<RaidBlackboardPointSource> blackboardPointSource;
    private List<RaidModifier> modifier;
}
