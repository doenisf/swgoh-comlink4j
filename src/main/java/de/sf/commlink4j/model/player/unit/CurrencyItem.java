package de.sf.commlink4j.model.player.unit;

import lombok.Getter;

@Getter
public class CurrencyItem {
    private CurrencyType currency;
    private Integer quantity;
    private Integer bonusQuantity;
}
