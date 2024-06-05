package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.ActionLinkType;
import lombok.Getter;

@Getter
public class ActionLink {
    private String link;
    private ActionLinkType type;
}
