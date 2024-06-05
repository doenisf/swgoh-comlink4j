package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryRewardType {
    TerritoryRewardType_DEFAULT(0),
    GALACTICSCORE(1),
    VICTORYPOINT(2),
    MYSTERYBOXCONFLICT(3);

    private final int value;

    TerritoryRewardType(int value) {
        this.value = value;
    }

    public static TerritoryRewardType fromValue(int value) {
        for (TerritoryRewardType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryRewardType> {

        @Override
        public void write(JsonWriter out, TerritoryRewardType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public TerritoryRewardType read(JsonReader in) throws IOException {
            return TerritoryRewardType.fromValue(in.nextInt());
        }
    }
}
