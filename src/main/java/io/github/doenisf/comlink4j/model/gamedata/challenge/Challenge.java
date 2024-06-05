package io.github.doenisf.comlink4j.model.gamedata.challenge;

import io.github.doenisf.comlink4j.model.gamedata.enums.ChallengeClaimType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ChallengeRewardType;
import io.github.doenisf.comlink4j.model.gamedata.enums.ChallengeType;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import io.github.doenisf.comlink4j.model.gamedata.misc.ActionLink;
import io.github.doenisf.comlink4j.model.gamedata.message.ContextualMessageGroup;
import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

import java.util.List;

@Getter
public class Challenge {
    private String id;
    private ChallengeType type;
    private String nameKey;
    private String descKey;
    private Requirement viewRequirement;
    private List<BucketItem> reward;
    private String platformAchievementId;
    private ActionLink actionLinkDef;
    private ChallengeClaimType claimType;
    private ChallengeRewardType rewardType;
    private Float rewardRation;
    private List<ChallengeTask> task;
    private ContextualMessageGroup messageGroup;
    private String styleId;
    private Integer priority;
    private String nextChallengeId;
    private String rewardDialogKey;
    private Boolean starterGuildGraduation;
    private Integer rewardPoints;
    private String detailsKey;
    private Boolean hiddenInMainQuest;
}
