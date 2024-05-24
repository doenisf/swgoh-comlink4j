package io.github.doenisf.comlink4j.model.guild;

import io.github.doenisf.comlink4j.model.unit.unit.CurrencyItem;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildInventory {
    private List<CurrencyItem> currencyItem;
    private List<CurrencyItem> currentDailyLimit;
}
