package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum BattleUnitStateStat {
    BattleUnitStateStat_DEFAULT(0),
    BATTLEUNITSTATUNDEFINED(1),
    BATTLEUNITSTATHEALTH(2),
    BATTLEUNITSTATHEALTHPERCENT(3),
    BATTLEUNITSTATSPEEDFILL(4),
    BATTLEUNITSTATSPEEDFILLPERCENT(5),
    BATTLEUNITSTATSHIELDPERCENT(6);

    private final int value;

    BattleUnitStateStat(int value) {
        this.value = value;
    }

    public static BattleUnitStateStat fromValue(int value) {
        for (BattleUnitStateStat type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<BattleUnitStateStat> {

        @Override
        public void write(JsonWriter out, BattleUnitStateStat value) throws IOException {
            out.value(value.name());
        }

        @Override
        public BattleUnitStateStat read(JsonReader in) throws IOException {
            return BattleUnitStateStat.fromValue(in.nextInt());
        }
    }
}
