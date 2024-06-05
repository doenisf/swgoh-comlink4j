package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.conquest.ConquestDifficulty;
import io.github.doenisf.comlink4j.model.gamedata.conquest.ConquestPurchasePassMiscTextEntry;
import io.github.doenisf.comlink4j.model.gamedata.conquest.ConquestVisibility;
import io.github.doenisf.comlink4j.model.gamedata.misc.ConsumableDetails;
import lombok.Getter;

import java.util.List;

@Getter
public class ConquestDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private List<ConquestDifficulty> conquestDifficulty;
    private String staminaStatAllowlist;
    private List<ConsumableDetails> consumableDetail;
    private List<ConquestVisibility> visibility;
    private List<ConquestPurchasePassMiscTextEntry> miscEntry;
}
