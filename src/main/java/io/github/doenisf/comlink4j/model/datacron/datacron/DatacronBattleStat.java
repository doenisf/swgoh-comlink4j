package io.github.doenisf.comlink4j.model.datacron.datacron;

import lombok.Getter;

import java.util.List;

@Getter
public class DatacronBattleStat {
    private String id;
    private Integer setId;
    private String templateId;
    private List<String> tag;
    private List<DatacronAffix> affix;
}
