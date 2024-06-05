package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import lombok.Getter;

@Getter
public class RelicTierDefinition {
    private String id;
    private StatDef stat;
    private String relicStatTable;
    private RelicTier tier;
}
