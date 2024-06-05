package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

import java.util.List;

@Getter
public class WarBracketDef {
    private Integer min;
    private Integer max;
    private List<WarNodeDef> node;
}
