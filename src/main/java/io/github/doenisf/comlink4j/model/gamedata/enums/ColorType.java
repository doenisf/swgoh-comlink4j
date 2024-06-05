package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ColorType {
    ColorType_DEFAULT(0),
    WHITE(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6);

    private final int value;

    ColorType(int value) {
        this.value = value;
    }

    public static ColorType fromValue(int value) {
        for (ColorType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ColorType> {

        @Override
        public void write(JsonWriter out, ColorType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ColorType read(JsonReader in) throws IOException {
            return ColorType.fromValue(in.nextInt());
        }
    }
}
