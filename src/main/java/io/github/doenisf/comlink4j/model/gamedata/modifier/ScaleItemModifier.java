package io.github.doenisf.comlink4j.model.gamedata.modifier;

import io.github.doenisf.comlink4j.model.gamedata.item.ModifierItem;
import lombok.Getter;

import java.util.List;

@Getter
public class ScaleItemModifier {
    private Integer scale;
    private List<ModifierItem> target;
}
