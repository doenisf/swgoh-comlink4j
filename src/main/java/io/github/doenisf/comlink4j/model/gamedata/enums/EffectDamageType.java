package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EffectDamageType {
    EffectDamageType_DEFAULT(0),
    UNMITIGABLE(1),
    ATTACKDAMAGE(2),
    ABILITYPOWER(3);

    private final int value;

    EffectDamageType(int value) {
        this.value = value;
    }

    public static EffectDamageType fromValue(int value) {
        for (EffectDamageType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EffectDamageType> {

        @Override
        public void write(JsonWriter out, EffectDamageType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EffectDamageType read(JsonReader in) throws IOException {
            return EffectDamageType.fromValue(in.nextInt());
        }
    }
}
