package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.OmicronMode;
import io.github.doenisf.comlink4j.model.gamedata.enums.SkillType;
import lombok.Getter;

import java.util.List;

@Getter
public class SkillDefinition {
    private String id;
    private String nameKey;
    private String iconKey;
    private List<SkillTierDefinition> tier;
    private String abilityReference;
    private SkillType skillType;
    private Boolean isZeta;
    private OmicronMode omicronMode;
}
