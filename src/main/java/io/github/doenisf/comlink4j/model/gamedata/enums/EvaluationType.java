package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EvaluationType {
    EvaluationType_DEFAULT(0),
    AND(1),
    OR(2);

    private final int value;

    EvaluationType(int value) {
        this.value = value;
    }

    public static EvaluationType fromValue(int value) {
        for (EvaluationType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EvaluationType> {

        @Override
        public void write(JsonWriter out, EvaluationType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EvaluationType read(JsonReader in) throws IOException {
            return EvaluationType.fromValue(in.nextInt());
        }
    }
}
