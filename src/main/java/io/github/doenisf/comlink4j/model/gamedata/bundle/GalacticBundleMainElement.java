package io.github.doenisf.comlink4j.model.gamedata.bundle;

import io.github.doenisf.comlink4j.model.gamedata.enums.GalacticBundleMainElementInventoryType;
import io.github.doenisf.comlink4j.model.gamedata.enums.GalacticBundleMainElementType;
import lombok.Getter;

import java.util.List;

@Getter
public class GalacticBundleMainElement {
    private List<GalacticBundleMainElementPage> page;
    private GalacticBundleMainElementType elementType;
    private String image;
    private String title;
    private String description;
    private GalacticBundleMainElementInventoryType inventoryType;
}
