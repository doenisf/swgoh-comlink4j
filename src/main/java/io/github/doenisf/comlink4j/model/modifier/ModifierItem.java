package io.github.doenisf.comlink4j.model.modifier;

import io.github.doenisf.comlink4j.model.events.raid.ItemType;
import lombok.Getter;

@Getter
public class ModifierItem {
    private ItemType type;
    private MaterialType materialType;
    private String id;
    private String category;
}
