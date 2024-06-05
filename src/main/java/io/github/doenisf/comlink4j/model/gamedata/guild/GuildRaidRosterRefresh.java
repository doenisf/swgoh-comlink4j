package io.github.doenisf.comlink4j.model.gamedata.guild;

import lombok.Getter;

import java.util.List;

@Getter
public class GuildRaidRosterRefresh {
    private String type;
    private List<Integer> value;
}
