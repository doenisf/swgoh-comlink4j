package io.github.doenisf.comlink4j.model.player.pvp;

import io.github.doenisf.comlink4j.model.player.datacron.DatacronBattleStat;
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