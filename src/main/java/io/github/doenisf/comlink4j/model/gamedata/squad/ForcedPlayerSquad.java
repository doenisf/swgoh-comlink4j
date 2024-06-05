package io.github.doenisf.comlink4j.model.gamedata.squad;

import io.github.doenisf.comlink4j.model.gamedata.unit.Unit;
import lombok.Getter;

import java.util.List;

@Getter
public class ForcedPlayerSquad {
    private Squad squad;
    private List<Unit> squadUnit;
}
