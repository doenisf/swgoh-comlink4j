package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.ability.MissionGrantedAbility;
import io.github.doenisf.comlink4j.model.gamedata.campaign.CampaignNodeEncounter;
import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import lombok.Getter;

import java.util.List;

@Getter
public class BattleDetails {
    private String id;
    private EntryCategoryAllowed entryCategoryAllowed;
    private List<CampaignNodeEncounter> battleEncounter;
    private Long battleDurationLimit;
    private List<MissionGrantedAbility> grantedAbility;
    private Boolean autoBattleEnabled;
    private Boolean battleSpeedAdjustable;
    private Boolean retreatEnabled;
    private String audioKey;
    private CombatType combatType;
}
