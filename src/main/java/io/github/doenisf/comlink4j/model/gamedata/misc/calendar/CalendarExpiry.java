package io.github.doenisf.comlink4j.model.gamedata.misc.calendar;

import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

@Getter
public class CalendarExpiry {
    private Long duration;
    private Long endTime;
    private Requirement expiryRequirement;
}
