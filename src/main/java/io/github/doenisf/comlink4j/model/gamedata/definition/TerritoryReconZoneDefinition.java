package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.TerritoryBattleZoneUnitType;
import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryReconZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private List<TerritoryReconPlatoonDefinition> platoonDefinition;
    private String abilityImage;
    private String abilityShortDescKey;
    private String abilityLongDescKey;
    private String goalDescKey;
    private Rarity unitRarity;
    private String rewardDescKey;
    private String subTitleKey;
    private List<MissionGrantedAbility> grantedAbilities;
    private List<MissionGrantedAbility> strategicAbilities;
    private CombatType combatType;
    private TerritoryBattleZoneUnitType territoryBattleZoneUnitType;
    private RelicTier unitRelicTier;
}
