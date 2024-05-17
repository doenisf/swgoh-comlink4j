package io.github.doenisf.comlink4j.model.modifier;

import io.github.doenisf.comlink4j.model.events.raid.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class AdditionalItemModifier {
    private List<BucketItem> addedItem;
}
