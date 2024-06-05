package io.github.doenisf.comlink4j.model.gamedata.configuration;

import io.github.doenisf.comlink4j.model.gamedata.definition.TimeZoneDefinition;
import lombok.Getter;

import java.util.List;

@Getter
public class TimeZoneChangeConfig {
    private Integer allowedChangesPerPeriod;
    public String allowedChangesLocKey;
    private String allowedChangesResetLocKey;
    private Integer maxTimeZoneChangeHoursExclusive;
    private List<TimeZoneDefinition> timeZoneDefinition;
    private String timeZoneChangeCooldownId;
}
