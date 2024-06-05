package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum PointerType {
    PointerType_DEFAULT(0),
    POINT(1),
    CLICK(2),
    SWIPE(3);

    private final int value;

    PointerType(int value) {
        this.value = value;
    }

    public static PointerType fromValue(int value) {
        for (PointerType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<PointerType> {

        @Override
        public void write(JsonWriter out, PointerType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public PointerType read(JsonReader in) throws IOException {
            return PointerType.fromValue(in.nextInt());
        }
    }
}
