package de.sf.model.player.stat;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ThreatLevel {
    ThreatLevel_DEFAULT(0),
    NORMAL(1),
    ELITE(2),
    BOSS(3),
    ANY(4),
    SUMMON(5);

    private final int value;

    ThreatLevel(int value) {
        this.value = value;
    }

    public static ThreatLevel fromValue(int value) {
        for (ThreatLevel level : values()) {
            if (level.value == value) {
                return level;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ThreatLevel> {
        @Override
        public void write(JsonWriter out, ThreatLevel value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ThreatLevel read(JsonReader in) throws IOException {
            return ThreatLevel.valueOf(in.nextString());
        }
    }
}
