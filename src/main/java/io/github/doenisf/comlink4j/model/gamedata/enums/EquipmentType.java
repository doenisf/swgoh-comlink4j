package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EquipmentType {
    EquipmentType_DEFAULT(0),
    EQUIPMENTEQUIPPABLE(1),
    EQUIPMENTUNRELEASED(2),
    EQUIPMENTMATERIAL(3);

    private final int value;

    EquipmentType(int value) {
        this.value = value;
    }

    public static EquipmentType fromValue(int value) {
        for (EquipmentType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EquipmentType> {

        @Override
        public void write(JsonWriter out, EquipmentType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EquipmentType read(JsonReader in) throws IOException {
            return EquipmentType.fromValue(in.nextInt());
        }
    }
}
