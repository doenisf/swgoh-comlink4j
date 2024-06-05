package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GalacticBundleMainElementType {
    GalacticBundleMainElementType_DEFAULT(0),
    GALACTICBUNDLEMAINELEMENTTYPEPAGINATION(1),
    GALACTICBUNDLEMAINELEMENTTYPEINVENTORY(2),
    GALACTICBUNDLEMAINELEMENTTYPESPLIT(3),
    GALACTICBUNDLEMAINELEMENTTYPEHIGHTLIGHTS(4),
    GALACTICBUNDLEMAINELEMENTTYPEACCESS(5);

    private final int value;

    GalacticBundleMainElementType(int value) {
        this.value = value;
    }

    public static GalacticBundleMainElementType fromValue(int value) {
        for (GalacticBundleMainElementType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GalacticBundleMainElementType> {

        @Override
        public void write(JsonWriter out, GalacticBundleMainElementType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GalacticBundleMainElementType read(JsonReader in) throws IOException {
            return GalacticBundleMainElementType.fromValue(in.nextInt());
        }
    }
}
