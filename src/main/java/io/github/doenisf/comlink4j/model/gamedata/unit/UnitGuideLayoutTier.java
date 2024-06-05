package io.github.doenisf.comlink4j.model.gamedata.unit;

import lombok.Getter;

import java.util.List;

@Getter
public class UnitGuideLayoutTier {
    private String titleKey;
    private String subtitleKey;
    private List<UnitGuideLayoutLine> layoutLine;
}
