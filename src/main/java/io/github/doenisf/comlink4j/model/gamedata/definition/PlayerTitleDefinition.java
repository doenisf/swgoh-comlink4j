package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

@Getter
public class PlayerTitleDefinition {
    private String id;
    private String nameKey;
    private String descKey;
    private Boolean obtainable;
    private Boolean hidden;
    private String shortDescKey;
}
