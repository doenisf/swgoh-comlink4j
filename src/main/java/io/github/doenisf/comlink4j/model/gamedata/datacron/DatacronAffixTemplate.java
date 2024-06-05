package io.github.doenisf.comlink4j.model.gamedata.datacron;

import io.github.doenisf.comlink4j.model.gamedata.enums.UnitStat;
import lombok.Getter;

import java.util.List;

@Getter
public class DatacronAffixTemplate {
    private String abilityId;
    private String targetRule;
    private UnitStat statType;
    private Long statValueMin;
    private Long statValueMax;
    private Integer minTier;
    private Integer maxTier;
    private List<String> tag;
    private String scopeIcon;
}
