package de.sf.commlink4j.model.events.raid;

import de.sf.commlink4j.model.player.stat.StatMod;
import de.sf.commlink4j.model.player.unit.Rarity;
import de.sf.commlink4j.model.player.unit.UnitTier;
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
