package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.misc.calendar.CalendarExpiry;
import io.github.doenisf.comlink4j.model.gamedata.misc.calendar.CalendarVisuals;
import io.github.doenisf.comlink4j.model.gamedata.enums.CalendarCatchUp;
import io.github.doenisf.comlink4j.model.gamedata.enums.CalendarCompletionBehavior;
import io.github.doenisf.comlink4j.model.gamedata.enums.CalendarMissedConsequence;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

import java.util.List;

@Getter
public class DailyLoginRewardDefinition {
    private String id;
    private String title;
    private String message;
    private BucketItem defaultBucketItem;
    private List<BucketItem> reward;
    private Boolean monthly;
    private CalendarMissedConsequence missedConsequence;
    private CalendarCompletionBehavior completionBehavior;
    private String icon;
    private String category;
    private Boolean dailyFirstReward;
    private CalendarCatchUp catchUp;
    private CalendarExpiry expiry;
    private CalendarVisuals visualOverride;
    private BucketItem catchupCost;
}
