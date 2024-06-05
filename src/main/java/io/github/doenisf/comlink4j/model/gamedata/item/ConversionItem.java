package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.ItemType;
import lombok.Getter;

@Getter
public class ConversionItem {
    private String id;
    private ItemType type;
    private Integer pointValue;
}
