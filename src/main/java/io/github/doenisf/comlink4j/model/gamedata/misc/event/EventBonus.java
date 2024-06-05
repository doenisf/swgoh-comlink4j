package io.github.doenisf.comlink4j.model.gamedata.misc.event;

import lombok.Getter;

@Getter
public class EventBonus {
    private String id;
    private String nameKey;
    private String descKey;
    private String iconKey;
    private Float scoreModifier;
}
