package io.github.doenisf.comlink4j.model.gamedata.stat;

import io.github.doenisf.comlink4j.model.gamedata.definition.StatDef;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.ThreatLevel;
import io.github.doenisf.comlink4j.model.gamedata.misc.Skill;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import io.github.doenisf.comlink4j.model.gamedata.mod.StatMod;
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
