package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum UnitTier {
    TIERUNDEFINED(0),
    TIER01(1),
    TIER02(2),
    TIER03(3),
    TIER04(4),
    TIER05(5),
    TIER06(6),
    TIER07(7),
    TIER08(8),
    TIER09(9),
    TIER10(10),
    TIER11(11),
    TIER12(12),
    TIER13(13),
    TIER14(14),
    TIER15(15),
    TIER16(16),
    TIER17(17),
    TIER18(18),
    TIER19(19),
    TIER20(20);

    private final int value;

    UnitTier(int value) {
        this.value = value;
    }

    public static UnitTier fromValue(int value) {
        for (UnitTier tier : values()) {
            if (tier.value == value) {
                return tier;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<UnitTier> {

        @Override
        public void write(JsonWriter out, UnitTier value) throws IOException {
            out.value(value.name());
        }

        @Override
        public UnitTier read(JsonReader in) throws IOException {
            return UnitTier.fromValue(in.nextInt());
        }
    }
}

