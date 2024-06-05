package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EnergyRewardInstanceType {
    EnergyRewardInstanceType_DEFAULT(0),
    HOUROFDAY(1);

    private final int value;

    EnergyRewardInstanceType(int value) {
        this.value = value;
    }

    public static EnergyRewardInstanceType fromValue(int value) {
        for (EnergyRewardInstanceType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EnergyRewardInstanceType> {

        @Override
        public void write(JsonWriter out, EnergyRewardInstanceType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EnergyRewardInstanceType read(JsonReader in) throws IOException {
            return EnergyRewardInstanceType.fromValue(in.nextInt());
        }
    }
}
