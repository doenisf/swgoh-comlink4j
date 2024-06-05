package io.github.doenisf.comlink4j.model.gamedata.misc.conversion;

import io.github.doenisf.comlink4j.model.gamedata.item.ConversionItem;
import lombok.Getter;

import java.util.List;

@Getter
public class ConversionSet {
    private ConversionItemPrioritized output;
    private List<ConversionItem> consumable;
    private ConversionItem surplus;
}
