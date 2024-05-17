package de.sf.commlink4j.model.guild;

import de.sf.commlink4j.model.player.unit.CurrencyItem;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildInventory {
    private List<CurrencyItem> currencyItem;
    private List<CurrencyItem> currentDailyLimit;
}
