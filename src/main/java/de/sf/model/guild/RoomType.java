package de.sf.model.guild;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum RoomType {
    RoomType_DEFAULT(0),
    GUILDDEFAULT(1),
    GUILDCHAT(2),
    GUILDCHATOFFICER(3),
    PLAYERDIRECTCHAT(4),
    PLAYERGROUPCHAT(5);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public static RoomType fromValue(int value) {
        for (RoomType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<RoomType> {

        @Override
        public void write(JsonWriter out, RoomType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public RoomType read(JsonReader in) throws IOException {
            return RoomType.fromValue(in.nextInt());
        }
    }
}
