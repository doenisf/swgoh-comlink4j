package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryBattleZoneUnitType {
    TerritoryBattleZoneUnitType_DEFAULT(0),
    CHARACTERZONE(1),
    SHIPZONE(2),
    MIXEDZONE(3),
    UNDEFINEDZONE(4);

    private final int value;

    TerritoryBattleZoneUnitType(int value) {
        this.value = value;
    }

    public static TerritoryBattleZoneUnitType fromValue(int value) {
        for (TerritoryBattleZoneUnitType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryBattleZoneUnitType> {

        @Override
        public void write(JsonWriter out, TerritoryBattleZoneUnitType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public TerritoryBattleZoneUnitType read(JsonReader in) throws IOException {
            return TerritoryBattleZoneUnitType.fromValue(in.nextInt());
        }
    }
}
