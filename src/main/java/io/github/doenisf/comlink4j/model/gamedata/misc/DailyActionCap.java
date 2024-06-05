package io.github.doenisf.comlink4j.model.gamedata.misc;

import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class DailyActionCap {
    private String id;
    private Integer maxActions;
    private List<BucketItem> purchaseCost;
    private Boolean unlimitedPurchases;
}
