package de.sf.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GameEventDetailsType {
    GameEventDetailsType_DEFAULT(0),
    EVENTDEFAULT(1),
    EVENTMODULAR(2);

    private final int value;

    GameEventDetailsType(int value) {
        this.value = value;
    }

    public static GameEventDetailsType fromValue(int value) {
        for (GameEventDetailsType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GameEventDetailsType> {

        @Override
        public void write(JsonWriter out, GameEventDetailsType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GameEventDetailsType read(JsonReader in) throws IOException {
            return GameEventDetailsType.fromValue(in.nextInt());
        }
    }
}
