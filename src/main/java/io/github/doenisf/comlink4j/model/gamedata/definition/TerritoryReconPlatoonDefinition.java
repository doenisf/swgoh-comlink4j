package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.territory.TerritoryReward;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryReconPlatoonDefinition {
    private String id;
    private String nameKey;
    private List<TerritoryReconSquadDefinition> squad;
    private TerritoryReward reward;
}
