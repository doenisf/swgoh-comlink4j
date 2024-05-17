package de.sf.model.player.datacron;

import de.sf.model.player.unit.RelicTier;
import de.sf.model.player.unit.UnitTier;
import de.sf.model.player.stat.UnitStat;
import lombok.Getter;

import java.util.List;

@Getter
public class DatacronAffix {
    private String targetRule;
    private String abilityId;
    private UnitStat statType;
    private Long statValue;
    private List<String> tag;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
    private String scopeIcon;
}
