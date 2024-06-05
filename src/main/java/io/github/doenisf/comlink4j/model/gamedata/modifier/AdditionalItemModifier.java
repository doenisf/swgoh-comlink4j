package io.github.doenisf.comlink4j.model.gamedata.modifier;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class AdditionalItemModifier {
    private List<BucketItem> addedItem;
}
