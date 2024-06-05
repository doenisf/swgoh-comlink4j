package io.github.doenisf.comlink4j.model.gamedata.conquest;

import io.github.doenisf.comlink4j.model.gamedata.enums.ConquestPurchasePassMiscTextEntryType;
import lombok.Getter;

@Getter
public class ConquestPurchasePassMiscTextEntry {
    private String spriteName;
    public String textId;
    private ConquestPurchasePassMiscTextEntryType type;
}
