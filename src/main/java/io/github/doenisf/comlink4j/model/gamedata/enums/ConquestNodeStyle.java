package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ConquestNodeStyle {
    ConquestNodeStyle_DEFAULT(0),
    DEFAULTSTYLE(1),
    LEGEND(2),
    DATACRONSTYLE(3);

    private final int value;

    ConquestNodeStyle(int value) {
        this.value = value;
    }

    public static ConquestNodeStyle fromValue(int value) {
        for (ConquestNodeStyle type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ConquestNodeStyle> {

        @Override
        public void write(JsonWriter out, ConquestNodeStyle value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ConquestNodeStyle read(JsonReader in) throws IOException {
            return ConquestNodeStyle.fromValue(in.nextInt());
        }
    }
}
