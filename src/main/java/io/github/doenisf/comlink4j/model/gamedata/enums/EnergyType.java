package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EnergyType {
    EnergyType_DEFAULT(0),
    PVE(1),
    PVP(2),
    SHIPPVE(3),
    SHIPPVP(4),
    CANTINAPVE(5),
    MOD(6),
    CONQUEST(7);

    private final int value;

    EnergyType(int value) {
        this.value = value;
    }

    public static EnergyType fromValue(int value) {
        for (EnergyType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EnergyType> {

        @Override
        public void write(JsonWriter out, EnergyType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EnergyType read(JsonReader in) throws IOException {
            return EnergyType.fromValue(in.nextInt());
        }
    }
}
