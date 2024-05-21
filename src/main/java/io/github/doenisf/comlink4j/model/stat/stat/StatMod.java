package io.github.doenisf.comlink4j.model.stat.stat;

import io.github.doenisf.comlink4j.model.unit.unit.CurrencyItem;
import lombok.Getter;

import java.util.List;

@Getter
public class StatMod {
    private String id;
    private String definitionId;
    private Integer level;
    private StatModTier tier;
    private CurrencyItem sellValue;
    private CurrencyItem removeCost;
    private Boolean locked;
    private StatModStat primaryStat;
    private List<StatModStat> secondaryStat;
    private Integer xp;
    private CurrencyItem levelCost;
    private Integer bonusQuantity;
    // TODO: add converted Item
    private Integer rerolledCount;
}
