package de.sf.model.guild;

import de.sf.model.player.unit.CurrencyItem;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildInventory {
    private List<CurrencyItem> currencyItem;
    private List<CurrencyItem> currentDailyLimit;
}
