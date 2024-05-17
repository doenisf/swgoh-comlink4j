package de.sf.model.player.pvp;

import de.sf.model.player.datacron.DatacronBattleStat;
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