package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum GalacticBundleMainElementInventoryType {
    GalacticBundleMainElementInventoryType_DEFAULT(0),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPENONE(1),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPECHARACTERS(2),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPESHIPS(3),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPEUNITS(4),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPEITEMS(5),
    GALACTICBUNDLEMAINELEMENTINVENTORYTYPEALL(6);

    private final int value;

    GalacticBundleMainElementInventoryType(int value) {
        this.value = value;
    }

    public static GalacticBundleMainElementInventoryType fromValue(int value) {
        for (GalacticBundleMainElementInventoryType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<GalacticBundleMainElementInventoryType> {

        @Override
        public void write(JsonWriter out, GalacticBundleMainElementInventoryType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public GalacticBundleMainElementInventoryType read(JsonReader in) throws IOException {
            return GalacticBundleMainElementInventoryType.fromValue(in.nextInt());
        }
    }
}
