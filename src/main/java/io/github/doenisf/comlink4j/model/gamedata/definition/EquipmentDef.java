package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.item.CurrencyItem;
import io.github.doenisf.comlink4j.model.gamedata.enums.EquipmentType;
import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupActionLink;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupMission;
import lombok.Getter;

import java.util.List;

@Getter
public class EquipmentDef {
    private String id;
    private String nameKey;
    private String iconKey;
    private Integer requiredLevel;
    private StatDef equipmentStat;
    private String recipeId;
    private UnitTier tier;
    private CurrencyItem sellValue;
    private List<LookupMission> lookupMission;
    private String mark;
    private Long obtainableTime;
    private List<LookupMission> raidLookup;
    private EquipmentType type;
    private List<LookupActionLink> actionLinkLookup;
    private Rarity requiredRarity;
    private Boolean findFlowDisabled;
    private List<LookupMission> raidImmediateLookup;
}
