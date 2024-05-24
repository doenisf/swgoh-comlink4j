package io.github.doenisf.comlink4j.model.pvp.pvp;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum SquadUnitType {
    SquadUnitType_DEFAULT(0),
    UNITTYPEDEFAULT(1),
    UNITTYPELEADER(2),
    UNITTYPECOMMANDER(3),
    UNITTYPESUPPORT(4),
    UNITTYPEREINFORCEMENT(5);

    private final int value;

    SquadUnitType(int value) {
        this.value = value;
    }

    public static SquadUnitType fromValue(int value) {
        for (SquadUnitType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<SquadUnitType> {

        @Override
        public void write(JsonWriter out, SquadUnitType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public SquadUnitType read(JsonReader in) throws IOException {
            return SquadUnitType.fromValue(in.nextInt());
        }
    }
}
