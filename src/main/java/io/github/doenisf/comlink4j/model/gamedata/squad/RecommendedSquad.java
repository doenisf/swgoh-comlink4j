package io.github.doenisf.comlink4j.model.gamedata.squad;

import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import io.github.doenisf.comlink4j.model.gamedata.misc.ActionLink;
import lombok.Getter;

import java.util.List;

@Getter
public class RecommendedSquad {
    private String descriptionKey;
    private String thumbnail;
    private List<String> unitDefId;
    private String name;
    private Requirement showRequirement;
    private Requirement hideRequirement;
    private ActionLink actionLink;
    private String id;
}
