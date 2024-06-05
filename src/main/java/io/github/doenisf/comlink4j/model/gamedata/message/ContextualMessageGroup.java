package io.github.doenisf.comlink4j.model.gamedata.message;

import lombok.Getter;

import java.util.List;

@Getter
public class ContextualMessageGroup {
    private String groupId;
    private String startMessage;
    private List<ContextualMessage> message;
    private Integer priority;
    private Boolean canDismissWhileHidden;
    private Long startTime;
    private Long endTime;
    private Boolean isFtue;
}
