package io.github.doenisf.comlink4j.model.gamedata.conquest;

import lombok.Getter;

import java.util.List;

@Getter
public class ConquestSector {
    private String id;
    private List<ConquestNode> node;
    private String prefabName;
    private String artTile;
    private String titleKey;
    private String environmentTitleKey;
    private String backgroundPrefabName;
}
