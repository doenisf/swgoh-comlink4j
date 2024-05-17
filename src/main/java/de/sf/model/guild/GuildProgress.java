package de.sf.model.guild;

import de.sf.model.events.raid.GuildRaidProgress;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildProgress {
    private List<GuildRaidProgress> raidProgress;
}
