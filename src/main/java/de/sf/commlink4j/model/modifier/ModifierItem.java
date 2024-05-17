package de.sf.commlink4j.model.modifier;

import de.sf.commlink4j.model.events.raid.ItemType;
import lombok.Getter;

@Getter
public class ModifierItem {
    private ItemType type;
    private MaterialType materialType;
    private String id;
    private String category;
}
