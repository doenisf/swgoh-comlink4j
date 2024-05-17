package de.sf.model.modifier;

import de.sf.model.events.raid.ItemType;
import lombok.Getter;

@Getter
public class ModifierItem {
    private ItemType type;
    private MaterialType materialType;
    private String id;
    private String category;
}
