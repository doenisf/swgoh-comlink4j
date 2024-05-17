package de.sf.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

@Getter
public enum CombatType {
    CombatType_DEFAULT(0),
    CHARACTER(1),
    SHIP(2);

    private final int value;

    CombatType(int value) {
        this.value = value;
    }

    public static CombatType fromValue(int value) {
        for (CombatType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CombatType> {

        @Override
        public void write(JsonWriter out, CombatType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CombatType read(JsonReader in) throws IOException {
            return CombatType.fromValue(in.nextInt());
        }
    }
}
