package io.github.doenisf.comlink4j.model.gamedata.modifier;

import io.github.doenisf.comlink4j.model.gamedata.enums.ModifierLocationType;
import lombok.Getter;

@Getter
public class ModifierLocation {
    private ModifierLocationType type;
    private String identifier;
}
