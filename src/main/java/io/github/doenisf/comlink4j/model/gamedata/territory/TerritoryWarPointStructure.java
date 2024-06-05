package io.github.doenisf.comlink4j.model.gamedata.territory;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryWarPointStructure {
    private TerritoryReward deployDefensiveSquadReward;
    private TerritoryReward offensiveWinReward;
    private TerritoryReward completedZoneReward;
    private TerritoryReward completeZoneRewardPerDefensiveSquad;
    private List<GraduatingTerritoryReward> defendDefeatBonus;
    private TerritoryReward emptySquadSlotBonus;
    private TerritoryReward survivingSquadUnitBonus;
    private TerritoryReward fullHealthUnitBonus;
    private TerritoryReward fullProtectionUnitBonus;
    private TerritoryReward firstAttackBonus;
    private TerritoryReward enemyDefeatedBonus;
}
