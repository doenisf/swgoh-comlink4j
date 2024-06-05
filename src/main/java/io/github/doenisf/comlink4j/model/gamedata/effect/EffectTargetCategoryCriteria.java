package io.github.doenisf.comlink4j.model.gamedata.effect;

import lombok.Getter;

import java.util.List;

@Getter
public class EffectTargetCategoryCriteria {
    private Boolean exclude;
    private List<String> categoryId;
    private List<EffectTargetCategory> category;
}
