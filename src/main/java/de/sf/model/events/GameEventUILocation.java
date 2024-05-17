package de.sf.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

@Getter
public enum GameEventUILocation {
    GameEventUILocation_DEFAULT(0),
    GAMEEVENTUILOCATIONTRIALS(1),
    GAMEEVENTUILOCATIONEVENTS(2),
    GAMEEVENTUILOCATIONMODS(3),
    GAMEEVENTUILOCATIONSHIPTRIALS(4),
    GAMEEVENTUILOCATIONNONE(5),
    GAMEEVENTUILOCATIONSEASONHUB(6),
    GAMEEVENTUILOCATIONCONQUEST(7);

    private final int value;

    GameEventUILocation(int value) {
        this.value = value;
    }

    public static GameEventUILocation fromValue(int value) {
        for (GameEventUILocation location : values()) {
            if (location.value == value) {
                return location;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GameEventUILocation> {

        @Override
        public void write(JsonWriter out, GameEventUILocation value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GameEventUILocation read(JsonReader in) throws IOException {
            return GameEventUILocation.fromValue(in.nextInt());
        }
    }
}
