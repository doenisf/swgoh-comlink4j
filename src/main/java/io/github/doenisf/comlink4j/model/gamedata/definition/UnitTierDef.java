package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class UnitTierDef {
    private UnitTier tier;
    private List<String> equipmentSet;
    private StatDef baseStat;
}
