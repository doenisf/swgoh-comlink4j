package de.sf.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GameEventType {
    GameEventType_DEFAULT(0),
    SCHEDULED(1),
    KEYCARD(2),
    PROGRESSION(3),
    MODS(4),
    PVPEVENT(5),
    ECONOMYEVENT(6),
    TERRITORYMAPEVENT(7),
    TERRITORYWAREVENT(8),
    TERRITORYBATTLEEVENT(9),
    TERRITORYTOURNAMENTEVENT(10),
    ARCADERAID(11),
    SEASON(12),
    LIFECYCLED(13),
    CONQUESTEVENT(14);

    private final int value;

    GameEventType(int value) {
        this.value = value;
    }

    public static GameEventType fromValue(int value) {
        for (GameEventType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }


    public static class Adapter extends TypeAdapter<GameEventType> {

        @Override
        public void write(JsonWriter out, GameEventType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GameEventType read(JsonReader in) throws IOException {
            return GameEventType.fromValue(in.nextInt());
        }
    }
}