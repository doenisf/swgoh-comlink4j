package io.github.doenisf.comlink4j.model.gamedata.mod;

import io.github.doenisf.comlink4j.model.gamedata.stat.Stat;
import lombok.Getter;

import java.util.List;

@Getter
public class StatModSetBonus {
    private List<String> abilityId;
    private Stat stat;
}
