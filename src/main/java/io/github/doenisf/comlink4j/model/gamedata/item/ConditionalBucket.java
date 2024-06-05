package io.github.doenisf.comlink4j.model.gamedata.item;

import lombok.Getter;

import java.util.List;

@Getter
public class ConditionalBucket {
    private String requirementId;
    private List<BucketItem> bucketItem;
}
