package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import lombok.Getter;

@Getter
public class ConsumableTierDefinition {
    private String id;
    private Rarity rarity;
    private String nameKey;
    private String iconKey;
    private String effectIconFrameKey;
}
