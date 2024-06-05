package io.github.doenisf.comlink4j.model.gamedata.unit;

import lombok.Getter;

import java.util.List;

@Getter
public class UnitGuideLayout {
    private String id;
    private String tabTitleKey;
    private List<UnitGuideLayoutTier> layoutTier;
}
