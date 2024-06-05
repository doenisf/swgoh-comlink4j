package io.github.doenisf.comlink4j.model.gamedata.effect;

import io.github.doenisf.comlink4j.model.gamedata.enums.*;
import io.github.doenisf.comlink4j.model.gamedata.stat.StatValueRange;
import lombok.Getter;

import java.util.List;

@Getter
public class EffectTarget {
    private EffectTargetUnitSelect unitSelect;
    private EffectTargetBattleSide battleSide;
    private List<UnitClass> unitClass;
    private List<ForceAlignment> forceAlignment;
    private EffectTargetCategoryCriteria category;
    private UnitHealthState healthState;
    private List<StatValueRange> statValue;
    private List<EffectTagCriteria> activeEffectTagCriteria;
    private BattleDeploymentState battleDeploymentState;
    private String id;
    private Boolean excludeSelf;
    private Boolean excludeSelectedTarget;
    private EffectTargetCategoryCriteria requiredCategory;
    private List<EffectTagCriteria> requiredActiveEffectTagCriteria;
}
