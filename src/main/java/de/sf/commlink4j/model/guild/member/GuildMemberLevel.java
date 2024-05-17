package de.sf.commlink4j.model.guild.member;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GuildMemberLevel {
    GuildMemberLevel_DEFAULT(0),
    GUILDPENDING(1),
    GUILDMEMBER(2),
    GUILDOFFICER(3),
    GUILDLEADER(4);

    private final int value;

    GuildMemberLevel(int value) {
        this.value = value;
    }

    public static GuildMemberLevel fromValue(int value) {
        for (GuildMemberLevel level : values()) {
            if (level.value == value) {
                return level;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GuildMemberLevel> {
        @Override
        public void write(JsonWriter out, GuildMemberLevel value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public GuildMemberLevel read(JsonReader in) throws IOException {
            return GuildMemberLevel.fromValue(in.nextInt());
        }
    }
}
