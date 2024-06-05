package io.github.doenisf.comlink4j.model.gamedata.misc.conversion;

import io.github.doenisf.comlink4j.model.gamedata.item.ConversionItem;
import lombok.Getter;

@Getter
public class ConversionItemPrioritized {
    private ConversionItem item;
    private Integer priority;
}
