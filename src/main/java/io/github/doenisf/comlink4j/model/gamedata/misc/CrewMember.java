package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.reference.SkillDefinitionReference;
import lombok.Getter;

import java.util.List;

@Getter
public class CrewMember {
    private String unitId;
    private Integer slot;
    private List<SkillDefinitionReference> skillReference;
    private String skilllessCrewAbility;
}
