package io.github.doenisf.comlink4j.model.gamedata.social;

import lombok.Getter;

import java.util.List;

@Getter
public class SocialStatus {
    private List<SocialStatusIcon> chatIcons;
    private List<SocialStatusTitle> chatTitles;
    private List<SocialStatusGuildBannerLogo> guildLogo;
    private List<SocialStatusGuildBannerColor> guildColor;
    private List<SocialStatusPortrait> chatPortraits;
}
