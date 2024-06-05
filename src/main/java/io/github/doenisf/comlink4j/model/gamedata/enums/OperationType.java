package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum OperationType {
    OperationType_DEFAULT(0),
    ADDITIVE(1),
    MULTIPLICATIVE(2);

    private final int value;

    OperationType(int value) {
        this.value = value;
    }

    public static OperationType fromValue(int value) {
        for (OperationType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<OperationType> {

        @Override
        public void write(JsonWriter out, OperationType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public OperationType read(JsonReader in) throws IOException {
            return OperationType.fromValue(in.nextInt());
        }
    }
}
