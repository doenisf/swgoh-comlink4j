package io.github.doenisf.comlink4j.model.gamedata.challenge;

import io.github.doenisf.comlink4j.model.gamedata.misc.ActionLink;
import lombok.Getter;

@Getter
public class ChallengeTask {
    private String id;
    private String nameKey;
    private String descKey;
    private ActionLink actionLinkDef;
    private Boolean hideToast;
}
