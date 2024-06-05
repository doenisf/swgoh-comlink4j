package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

import java.util.List;

@Getter
public class GuildBannerDef {
    private List<String> logo;
    private List<GuildBannerColorDef> color;
    private List<GuildBannerLogoDef> logoDefinition;
}
