package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.environment.Environment;
import lombok.Getter;

@Getter
public class CampaignCinematic {
    private CinematicTrigger trigger;
    private Environment environment;
    private Environment subsequentViewingEnvironment;
}
