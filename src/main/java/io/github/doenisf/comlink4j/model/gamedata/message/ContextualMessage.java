package io.github.doenisf.comlink4j.model.gamedata.message;

import io.github.doenisf.comlink4j.model.gamedata.dialog.CantinaCharacterDialog;
import io.github.doenisf.comlink4j.model.gamedata.dialog.CharacterDialog;
import io.github.doenisf.comlink4j.model.gamedata.dialog.StorePromoDialog;
import io.github.doenisf.comlink4j.model.gamedata.enums.ContextualMessageType;
import io.github.doenisf.comlink4j.model.gamedata.misc.ActionLink;
import io.github.doenisf.comlink4j.model.gamedata.misc.point.PointAtElement;
import io.github.doenisf.comlink4j.model.gamedata.misc.Requirement;
import lombok.Getter;

import java.util.List;

@Getter
public class ContextualMessage {
    private String id;
    private ContextualMessageType type;
    private String titleKey;
    private String textKey;
    private PointAtElement pointAt;
    private List<String> appearEvent;
    private List<String> dismissEvent;
    private List<String> hideEvent;
    private String actionLink;
    private String nextMessageId;
    private Requirement clientRequirement;
    private CharacterDialog characterDialog;
    private String nextMessageIdDecline;
    private Boolean canDismissWhileHidden;
    private Integer ftueSubStep;
    private CantinaCharacterDialog cantinaCharacterDialog;
    private ActionLink actionLinkDef;
    private StorePromoDialog storePromoDialog;
    private Boolean showExitButton;
}
