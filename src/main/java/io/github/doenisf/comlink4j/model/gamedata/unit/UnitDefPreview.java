package io.github.doenisf.comlink4j.model.gamedata.unit;

import io.github.doenisf.comlink4j.model.gamedata.reference.AbilityReference;
import lombok.Getter;

import java.util.List;

@Getter
public class UnitDefPreview {
    private String id;
    private String thumbnailName;
    private String nameKey;
    private AbilityReference basicAttackRef;
    private List<AbilityReference> limitBreakRef;
    private List<AbilityReference> uniqueAbilityRef;
}
