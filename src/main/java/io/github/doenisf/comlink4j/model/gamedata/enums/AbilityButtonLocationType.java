package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityButtonLocationType {
    AbilityButtonLocationType_DEFAULT(0),
    ABILITYSTANDARD(1),
    ABILITYADDITIONAL(2),
    ABILITYHIDDEN(3),
    ABILITYSECONDSTANDARD(4);

    private final int value;

    AbilityButtonLocationType(int value) {
        this.value = value;
    }

    public static AbilityButtonLocationType fromValue(int value) {
        for (AbilityButtonLocationType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityButtonLocationType> {

        @Override
        public void write(JsonWriter out, AbilityButtonLocationType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityButtonLocationType read(JsonReader in) throws IOException {
            return AbilityButtonLocationType.fromValue(in.nextInt());
        }
    }
}
