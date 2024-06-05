package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.ItemType;
import io.github.doenisf.comlink4j.model.gamedata.mod.StatMod;
import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

@Getter
public class BucketItem {
    private String id;
    private ItemType type;
    private Integer minQuantity;
    private Integer maxQuantity;
    private Rarity rarity;
    private StatMod statMod;
    private Integer previewPriority;
    private Integer unitLevel;
    private UnitTier unitTier;
    private Boolean primaryReward;
}
