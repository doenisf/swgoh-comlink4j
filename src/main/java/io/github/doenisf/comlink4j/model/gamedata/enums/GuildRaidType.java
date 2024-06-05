package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GuildRaidType {
    GuildRaidType_DEFAULT(0),
    RAIDTYPEPERMANENT(1),
    RAIDTYPETIMELIMITED(2);

    private final int value;

    GuildRaidType(int value) {
        this.value = value;
    }

    public static GuildRaidType fromValue(int value) {
        for (GuildRaidType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GuildRaidType> {

        @Override
        public void write(JsonWriter out, GuildRaidType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GuildRaidType read(JsonReader in) throws IOException {
            return GuildRaidType.fromValue(in.nextInt());
        }
    }
}
