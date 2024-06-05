package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.enums.CampaignNodeDifficulty;
import io.github.doenisf.comlink4j.model.gamedata.enums.CombatType;
import lombok.Getter;

import java.util.List;

@Getter
public class WarDef {
    private String id;
    private CombatType type;
    private CampaignNodeDifficulty difficulty;
    private String dailyResetCapKey;
    private List<WarNodeDef> node;
    private List<WarBracketDef> bracket;
}
