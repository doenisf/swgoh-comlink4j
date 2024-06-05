package io.github.doenisf.comlink4j.model.gamedata.conquest;

import io.github.doenisf.comlink4j.model.gamedata.enums.ConquestNodeType;
import lombok.Getter;

@Getter
public class ConquestVisibility {
    private ConquestNodeType type;
    private Integer distance;
}
