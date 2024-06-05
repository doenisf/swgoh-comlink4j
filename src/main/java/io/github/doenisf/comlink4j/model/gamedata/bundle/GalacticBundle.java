package io.github.doenisf.comlink4j.model.gamedata.bundle;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import io.github.doenisf.comlink4j.model.gamedata.misc.upgrade.UnitUpgrade;
import lombok.Getter;

import java.util.List;

@Getter
public class GalacticBundle {
    private String id;
    private Integer targetPlayerLevel;
    private List<UnitUpgrade> unitUpgrade;
    private List<GalacticBundleTab> tabs;
    private List<BucketItem> inventoryItem;
    private String info;
    private Boolean primaryGalacticBundle;
}
