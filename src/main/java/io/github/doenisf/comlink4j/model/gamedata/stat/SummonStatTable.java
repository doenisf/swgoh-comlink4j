package io.github.doenisf.comlink4j.model.gamedata.stat;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import lombok.Getter;

@Getter
public class SummonStatTable {
    private Rarity rarity;
    private String statTable;
}
