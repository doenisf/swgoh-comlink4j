package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.StatModSlot;
import io.github.doenisf.comlink4j.model.gamedata.enums.StatModTier;
import lombok.Getter;

import java.util.List;

@Getter
public class MysteryStatModDefinition {
    private String id;
    private StatModSlot slotOld;
    private String setId;
    private Rarity minRarity;
    private Rarity maxRarity;
    private StatModTier minTier;
    private StatModTier maxTier;
    private List<StatModSlot> slot;
    private String descKey;
}
