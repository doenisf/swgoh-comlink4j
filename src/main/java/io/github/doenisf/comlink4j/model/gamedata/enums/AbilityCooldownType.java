package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityCooldownType {
    AbilityCooldownType_DEFAULT(0),
    ABILITYCOOLDOWNTURNBASED(1),
    ABILITYCOOLDOWNSPEEDBASED(2);

    private final int value;

    AbilityCooldownType(int value) {
        this.value = value;
    }

    public static AbilityCooldownType fromValue(int value) {
        for (AbilityCooldownType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityCooldownType> {

        @Override
        public void write(JsonWriter out, AbilityCooldownType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityCooldownType read(JsonReader in) throws IOException {
            return AbilityCooldownType.fromValue(in.nextInt());
        }
    }
}
