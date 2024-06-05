package io.github.doenisf.comlink4j.model.gamedata.misc.upgrade;

import io.github.doenisf.comlink4j.model.gamedata.enums.Rarity;
import io.github.doenisf.comlink4j.model.gamedata.enums.RelicTier;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitTier;
import lombok.Getter;

import java.util.List;

@Getter
public class UnitUpgrade {
    private String id;
    private Integer level;
    private Rarity rarity;
    private UnitTier tier;
    private Integer skillTier;
    private List<SkillUpgrade> skillOverride;
    private RelicTier relicTier;
}
