package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class MysteryBoxDefinition {
    private String id;
    private String texture;
    private String titleKey;
    private String descKey;
    private String detailsTitleKey;
    private String detailsDescKey;
    private String iconTextKey;
    private List<BucketItem> previewItem;
    private Boolean showPrimaryRewards;
}
