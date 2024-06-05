package io.github.doenisf.comlink4j.model.gamedata.definition;

import lombok.Getter;

import java.util.List;

@Getter
public class StarterGuildDef {
    private String guildType;
    private String nameKey;
    private List<String> allowedRaidId;
    private String messageKey;
    private List<String> allowedRaidCampaignId;
    private String bannerLogoId;
    private String bannerColorId;
    private String externalMessageKey;
    private String subNameKey;
}
