package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryRewardStructure {
    TerritoryRewardStructure_DEFAULT(0),
    TERRITORYREWARDPERSONAL(1),
    TERRITORYREWARDCUMULATIVE(2);

    private final int value;

    TerritoryRewardStructure(int value) {
        this.value = value;
    }

    public static TerritoryRewardStructure fromValue(int value) {
        for (TerritoryRewardStructure type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryRewardStructure> {

        @Override
        public void write(JsonWriter out, TerritoryRewardStructure value) throws IOException {
            out.value(value.name());
        }

        @Override
        public TerritoryRewardStructure read(JsonReader in) throws IOException {
            return TerritoryRewardStructure.fromValue(in.nextInt());
        }
    }
}
