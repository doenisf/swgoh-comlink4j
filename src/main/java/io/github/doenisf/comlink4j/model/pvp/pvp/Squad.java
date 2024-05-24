package io.github.doenisf.comlink4j.model.pvp.pvp;

import io.github.doenisf.comlink4j.model.datacron.datacron.DatacronBattleStat;
import lombok.Getter;

import java.util.List;

@Getter
public class Squad {
    private List<SquadCell> cell;
    private BattleTargetingTactic targetingTactic;
    private SquadType squadType;
    private String targetingSetId;
    private Long expireTime;
    private Long lastSaveTime;
    private String supportInheritFromDefinitionId;
    private DatacronBattleStat datacron;
}