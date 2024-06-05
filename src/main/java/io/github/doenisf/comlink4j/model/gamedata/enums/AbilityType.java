package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityType {
    AbilityType_DEFAULT(0),
    ABILITYACTIVATED(7),
    ABILITYPASSIVE(8),
    ABILITYREINFORCEMENT(9),
    ABILITYACTIVATEDALLYSELECT(10),
    ABILITYHARDWARE(11);

    private final int value;

    AbilityType(int value) {
        this.value = value;
    }

    public static AbilityType fromValue(int value) {
        for (AbilityType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityType> {

        @Override
        public void write(JsonWriter out, AbilityType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityType read(JsonReader in) throws IOException {
            return AbilityType.fromValue(in.nextInt());
        }
    }
}
