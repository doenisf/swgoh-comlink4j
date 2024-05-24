package io.github.doenisf.comlink4j.model.guild;

import io.github.doenisf.comlink4j.model.events.raid.GuildRaidProgress;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildProgress {
    private List<GuildRaidProgress> raidProgress;
}
