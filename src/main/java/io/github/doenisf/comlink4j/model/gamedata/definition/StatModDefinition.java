package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.StatModSlot;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupActionLink;
import io.github.doenisf.comlink4j.model.gamedata.misc.lookup.LookupMission;
import lombok.Getter;

import java.util.List;

@Getter
public class StatModDefinition {
    private String id;
    private StatModSlot slot;
    private String setId;
    private Rarity rarity;
    private String descKey;
    private List<LookupMission> missionLookup;
    private List<LookupMission> raidLookup;
    private List<LookupActionLink> actionLinkLookup;
    private String levelTableId;
    private String promotionId;
    private String promotionRecipeId;
    private String tierUpRecipeTableId;
    private String overclockRecipeTableId;
    private String rerollCapTableId;
    private List<LookupMission> raidImmediateLookup;
}
