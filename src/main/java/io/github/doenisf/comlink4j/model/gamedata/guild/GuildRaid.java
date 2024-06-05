package io.github.doenisf.comlink4j.model.gamedata.guild;

import io.github.doenisf.comlink4j.model.gamedata.enums.SquadType;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

import java.util.List;

@Getter
public class GuildRaid {
    private String id;
    private Integer priority;
    private String nameKey;
    private String summaryKey;
    private String descKey;
    private String image;
    private SquadType squadType;
    private CampaignElementIdentifier campaignElementIdentifier;
    private String iconPrefab;
    private String promotionKey;
    private String portraitIcon;
    private GuildRaidSim raidSim;
    private String infoImage;
    private GuildRaidLockout lockout;
    private Boolean legacyRaid;
    private List<String> currencyReward;
    private Boolean guildRewardsRequireAttempt;
    private String autoVictoryKey;
    private String autoDefeatKey;
}
