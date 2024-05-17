package de.sf.commlink4j.model.player.datacron;

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
