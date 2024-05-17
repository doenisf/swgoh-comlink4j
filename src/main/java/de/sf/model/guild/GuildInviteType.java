package de.sf.model.guild;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

@Getter
public enum GuildInviteType {
    GuildInviteType_DEFAULT(0),
    GUILDJOINREQUEST(1),
    GUILDINVITATION(2);

    private final int value;

    GuildInviteType(int value) {
        this.value = value;
    }

    public static GuildInviteType fromValue(int value) {
        for (GuildInviteType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GuildInviteType> {
        @Override
        public void write(JsonWriter out, GuildInviteType value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public GuildInviteType read(JsonReader in) throws IOException {
            return GuildInviteType.fromValue(in.nextInt());
        }
    }
}
