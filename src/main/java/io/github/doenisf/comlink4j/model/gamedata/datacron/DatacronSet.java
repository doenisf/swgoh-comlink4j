package io.github.doenisf.comlink4j.model.gamedata.datacron;

import lombok.Getter;

import java.util.List;

@Getter
public class DatacronSet {
    private Integer id;
    private String displayName;
    private Long expirationTimeMs;
    private String icon;
    private List<DatacronSetTier> tier;
    private String detailPrefab;
    private List<DatacronSetMaterial> setMaterial;
}
