package io.github.doenisf.comlink4j.model.gamedata.datacron;

import io.github.doenisf.comlink4j.model.gamedata.enums.DatacronScopeIdentifier;
import lombok.Getter;

import java.util.List;

@Getter
public class DatacronSetTier {
    private Integer id;
    private String upgradeCostRecipeId;
    private String dustGrandRecipeId;
    private List<String> rerollCostRecipeId;
    private DatacronScopeIdentifier scopeIdentifier;
}
