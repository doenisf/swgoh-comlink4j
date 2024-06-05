package io.github.doenisf.comlink4j.model.gamedata.stat;

import io.github.doenisf.comlink4j.model.gamedata.definition.StatDef;
import io.github.doenisf.comlink4j.model.gamedata.enums.OperationType;
import lombok.Getter;

@Getter
public class StatProgression {
    private String id;
    private StatDef stat;
    private OperationType operation;
}
