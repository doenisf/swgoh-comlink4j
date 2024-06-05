package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum DynamicDescriptionType {
    DynamicDescriptionType_DEFAULT(0),
    LAYOUTTEXT(1),
    LAYOUTUNIT(2),
    LAYOUTABILITY(3),
    LAYOUTHEADER(4),
    LAYOUTTEXTCOLUMN(5),
    LAYOUTHORIZONTALBREAK(6);

    private final int value;

    DynamicDescriptionType(int value) {
        this.value = value;
    }

    public static DynamicDescriptionType fromValue(int value) {
        for (DynamicDescriptionType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<DynamicDescriptionType> {

        @Override
        public void write(JsonWriter out, DynamicDescriptionType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public DynamicDescriptionType read(JsonReader in) throws IOException {
            return DynamicDescriptionType.fromValue(in.nextInt());
        }
    }
}
