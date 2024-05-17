package de.sf.model.modifier;

import de.sf.model.events.raid.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class AdditionalItemModifier {
    private List<BucketItem> addedItem;
}
