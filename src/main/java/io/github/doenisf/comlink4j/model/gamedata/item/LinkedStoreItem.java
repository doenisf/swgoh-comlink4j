package io.github.doenisf.comlink4j.model.gamedata.item;

import io.github.doenisf.comlink4j.model.gamedata.enums.LinkedStoreItemType;
import lombok.Getter;

import java.util.List;

@Getter
public class LinkedStoreItem {
    private String linkId;
    private List<String> storeItem;
    private LinkedStoreItemType type;
    private List<ContextualStoreItem> contextualStoreItem;
}
