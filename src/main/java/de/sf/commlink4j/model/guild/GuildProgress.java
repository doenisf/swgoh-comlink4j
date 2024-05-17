package de.sf.commlink4j.model.guild;

import de.sf.commlink4j.model.events.raid.GuildRaidProgress;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildProgress {
    private List<GuildRaidProgress> raidProgress;
}
