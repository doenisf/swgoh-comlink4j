package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.item.CurrencyItem;
import io.github.doenisf.comlink4j.model.gamedata.enums.MaterialType;
import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupActionLink;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupMission;
import lombok.Getter;

import java.util.List;

@Getter
public class CraftingMaterialDef {
    private String id;
    private String nameKey;
    private String descKey;
    private String iconKey;
    private CurrencyItem sellValue;
    private List<LookupMission> lookupMission;
    private Integer xpValue;
    private MaterialType type;
    private Rarity rarity;
    private Integer trainingCost;
    private Integer trainingCostMaxLevel;
    private String unitDefReference;
    private UnitTier tier;
    private Long obtainableTime;
    private List<LookupMission> raidLookup;
    private List<LookupActionLink> actionLinkLookup;
    private String recipeId;
    private List<LookupMission> raidImmediateLookup;
}
