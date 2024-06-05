package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

@Getter
public class UnlockAnnouncementDefinition {
    private String feature;
    private Integer startOffset;
    private Integer interval;
    private String messageKey;
}
