package de.sf.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GameEventStatus {
    GameEventStatus_DEFAULT(0),
    EVENTLOCKED(1),
    EVENTUNLOCKED(2);

    private final int value;

    GameEventStatus(int value) {
        this.value = value;
    }

    public static GameEventStatus fromValue(int value) {
        for (GameEventStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GameEventStatus> {

        @Override
        public void write(JsonWriter out, GameEventStatus value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GameEventStatus read(JsonReader in) throws IOException {
            return GameEventStatus.fromValue(in.nextInt());
        }
    }
}
