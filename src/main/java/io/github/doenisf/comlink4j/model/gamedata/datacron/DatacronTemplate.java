package io.github.doenisf.comlink4j.model.gamedata.datacron;

import lombok.Getter;

import java.util.List;

@Getter
public class DatacronTemplate {
    private String id;
    public Integer setId;
    private Integer initialTiers;
    private String referenceTemplateId;
    private List<String> fixedTag;
    private List<DatacronTemplateTier> tier;
    private Integer maxRerolls;
    private Boolean allowReroll;
}
