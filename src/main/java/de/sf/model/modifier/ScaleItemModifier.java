package de.sf.model.modifier;

import lombok.Getter;

import java.util.List;

@Getter
public class ScaleItemModifier {
    private Integer scale;
    private List<ModifierItem> target;
}
