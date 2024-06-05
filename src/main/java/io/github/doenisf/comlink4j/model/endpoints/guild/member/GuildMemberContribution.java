package io.github.doenisf.comlink4j.model.endpoints.guild.member;

import io.github.doenisf.comlink4j.model.gamedata.enums.MemberContributionType;
import lombok.Getter;

@Getter
public class GuildMemberContribution {
    private MemberContributionType type;
    private Long currentValue;
    private Long lifetimeValue;
}
