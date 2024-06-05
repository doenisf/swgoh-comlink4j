package io.github.doenisf.comlink4j.model.endpoints.guild;

import io.github.doenisf.comlink4j.model.gamedata.item.CurrencyItem;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildInventory {
    private List<CurrencyItem> currencyItem;
    private List<CurrencyItem> currentDailyLimit;
}
