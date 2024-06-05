package io.github.doenisf.comlink4j.model.gamedata.misc.category;

import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import lombok.Getter;

import java.util.List;

@Getter
public class Category {
    private String id;
    private String descKey;
    private Boolean visible;
    private List<CombatType> uiFilter;
}
