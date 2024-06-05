package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.enums.RecipeType;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class Recipe {
    private String id;
    private String descKey;
    private BucketItem result;
    private List<BucketItem> ingredients;
    private RecipeType type;
    private Requirement viewRequirement;
    private Integer unlockLevel;
    private Requirement craftRequirement;
}
