package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EffectApplyType {
    EffectApplyType_DEFAULT(0),
    UNAVOIDABLE(1),
    PHYSICAL(2),
    MENTAL(3);

    private final int value;

    EffectApplyType(int value) {
        this.value = value;
    }

    public static EffectApplyType fromValue(int value) {
        for (EffectApplyType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EffectApplyType> {

        @Override
        public void write(JsonWriter out, EffectApplyType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EffectApplyType read(JsonReader in) throws IOException {
            return EffectApplyType.fromValue(in.nextInt());
        }
    }
}
