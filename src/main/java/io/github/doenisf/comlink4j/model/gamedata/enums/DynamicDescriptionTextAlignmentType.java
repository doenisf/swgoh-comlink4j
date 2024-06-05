package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum DynamicDescriptionTextAlignmentType {
    DynamicDescriptionTextAlignmentType_DEFAULT(0),
    TEXTALIGNMENTLEFT(1),
    TEXTALIGNMENTRIGHT(2),
    TEXTALIGNMENTCENTER(3);

    private final int value;

    DynamicDescriptionTextAlignmentType(int value) {
        this.value = value;
    }

    public static DynamicDescriptionTextAlignmentType fromValue(int value) {
        for (DynamicDescriptionTextAlignmentType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<DynamicDescriptionTextAlignmentType> {

        @Override
        public void write(JsonWriter out, DynamicDescriptionTextAlignmentType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public DynamicDescriptionTextAlignmentType read(JsonReader in) throws IOException {
            return DynamicDescriptionTextAlignmentType.fromValue(in.nextInt());
        }
    }
}
