package io.github.doenisf.comlink4j.model.gamedata.datacron;

import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class DatacronTemplateTier {
    private Integer id;
    private List<String> affixTemplateSetId;
    private List<String> initialAffixTemplateSetIds;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
}
