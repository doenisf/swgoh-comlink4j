package io.github.doenisf.comlink4j.model.endpoints.guild;

import io.github.doenisf.comlink4j.model.endpoints.events.raid.GuildRaidProgress;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildProgress {
    private List<GuildRaidProgress> raidProgress;
}
