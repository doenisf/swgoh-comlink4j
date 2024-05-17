package de.sf.model.guild.member;

import lombok.Getter;

@Getter
public class GuildMemberContribution {
    private MemberContributionType type;
    private Long currentValue;
    private Long lifetimeValue;
}
