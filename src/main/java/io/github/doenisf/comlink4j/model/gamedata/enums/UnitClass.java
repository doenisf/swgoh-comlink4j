package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum UnitClass {
    UnitClass_DEFAULT(0),
    UNITCLASSSTANDARD(6),
    UNITCLASSCOMMANDER(7);

    private final int value;

    UnitClass(int value) {
        this.value = value;
    }

    public static UnitClass fromValue(int value) {
        for (UnitClass type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<UnitClass> {

        @Override
        public void write(JsonWriter out, UnitClass value) throws IOException {
            out.value(value.name());
        }

        @Override
        public UnitClass read(JsonReader in) throws IOException {
            return UnitClass.fromValue(in.nextInt());
        }
    }
}
