package io.github.doenisf.comlink4j.model.gamedata.modifier;

import io.github.doenisf.comlink4j.model.gamedata.misc.ActionLink;
import lombok.Getter;

import java.util.List;

@Getter
public class SystemModifier {
    private String id;
    private ScaleItemModifier scaleItemModifier;
    private List<ModifierLocation> location;
    private AdditionalItemModifier additionalItemModifier;
    private String descKey;
    private ActionLink actionLink;
}
