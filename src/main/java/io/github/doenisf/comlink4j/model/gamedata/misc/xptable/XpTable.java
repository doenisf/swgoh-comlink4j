package io.github.doenisf.comlink4j.model.gamedata.misc.xptable;

import lombok.Getter;

import java.util.List;

@Getter
public class XpTable {
    private String id;
    private List<XpTableRow> row;
}
