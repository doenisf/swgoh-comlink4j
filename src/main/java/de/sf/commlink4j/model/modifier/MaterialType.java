package de.sf.commlink4j.model.modifier;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum MaterialType {
    MaterialType_DEFAULT(0),
    CRAFTINGMATERIAL(1),
    XPMATERIAL(2),
    UNITSHARDMATERIAL(3),
    PROMOTIONMATERIAL(4),
    SKILLMATERIAL(5),
    SELLMATERIAL(6),
    SHIPXPMATERIAL(7),
    SHIPSKILLMATERIAL(8),
    STATMODSLICINGMATERIAL(9),
    STATMODOVERCLOCKINGMATERIAL(10),
    RELICMATERIAL(11),
    SCRAPMATERIAL(12),
    SCRAPSURPLUS(13),
    DATACRONMATERIAL(14);

    private final int value;

    MaterialType(int value) {
        this.value = value;
    }

    public static MaterialType fromValue(int value) {
        for (MaterialType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<MaterialType> {

        @Override
        public void write(JsonWriter out, MaterialType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public MaterialType read(JsonReader in) throws IOException {
            return MaterialType.fromValue(in.nextInt());
        }
    }
}
