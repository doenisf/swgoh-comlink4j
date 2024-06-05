package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.CurrencyType;
import lombok.Getter;

@Getter
public class CurrencyItem {
    private CurrencyType currency;
    private Integer quantity;
    private Integer bonusQuantity;
}
