package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

import java.util.List;

@Getter
public class RelicDefinition {
    private List<String> relicTierDefinitionId;
    private String upgradeTableId;
    private String alignmentColorOverride;
    private String texture;
    private String nameKey;
}
