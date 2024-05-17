package de.sf.commlink4j.model.modifier;

import de.sf.commlink4j.model.events.raid.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class AdditionalItemModifier {
    private List<BucketItem> addedItem;
}
