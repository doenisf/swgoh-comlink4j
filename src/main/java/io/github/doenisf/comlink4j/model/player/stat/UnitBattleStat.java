package io.github.doenisf.comlink4j.model.player.stat;

import io.github.doenisf.comlink4j.model.player.unit.RelicTier;
import io.github.doenisf.comlink4j.model.player.unit.Skill;
import io.github.doenisf.comlink4j.model.player.unit.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class UnitBattleStat {
    private Integer actionCountMin;
    private Integer actionCountMax;
    private StatDef battleStat;
    private Integer level;
    private UnitTier tier;
    private List<Skill> skill;
    private List<StatMod> statMod;
    private String unitDefId;
    private String unitId;
    private RelicTier unitRelicTier;
    private String purchasedAbilityId;
    private Double overrideAllStatsMultiplier;
    private List<Stat> overrideStatMultiplier;
    private Boolean skipStatsOverwrite;
    private Boolean enableLeaderAbility;
    private ThreatLevel threatLevelOverride;
    private String overrideAllStatsTable;
}
