package io.github.doenisf.comlink4j.model.endpoints.guild;

import io.github.doenisf.comlink4j.model.gamedata.enums.RoomType;
import lombok.Getter;

@Getter
public class RoomData {
    private String roomId;
    private RoomType type;
    private String name;
    private String topic;
    private Long creationTime;
    private String ownerId;
}
