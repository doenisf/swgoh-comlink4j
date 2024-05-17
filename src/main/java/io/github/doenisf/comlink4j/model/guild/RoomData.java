package io.github.doenisf.comlink4j.model.guild;

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
