package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.MaterialType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ItemType;
import lombok.Getter;

@Getter
public class ModifierItem {
    private ItemType type;
    private MaterialType materialType;
    private String id;
    private String category;
}
