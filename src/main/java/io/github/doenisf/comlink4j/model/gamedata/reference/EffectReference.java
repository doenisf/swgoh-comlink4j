package io.github.doenisf.comlink4j.model.gamedata.reference;

import lombok.Getter;

import java.util.List;

@Getter
public class EffectReference {
    private String id;
    private List<Integer> contextIndex;
    private Integer maxBonusMove;
}
