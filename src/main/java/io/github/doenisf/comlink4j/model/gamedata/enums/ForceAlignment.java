package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ForceAlignment {
    ForceAlignment_DEFAULT(0),
    NEUTRAL(1),
    LIGHT(2),
    DARK(3);

    private final int value;

    ForceAlignment(int value) {
        this.value = value;
    }

    public static ForceAlignment fromValue(int value) {
        for (ForceAlignment forceAlignment : values()) {
            if (forceAlignment.value == value) {
                return forceAlignment;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ForceAlignment> {

        @Override
        public void write(JsonWriter out, ForceAlignment value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ForceAlignment read(JsonReader in) throws IOException {
            return ForceAlignment.fromValue(in.nextInt());
        }
    }
}
