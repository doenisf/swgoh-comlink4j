package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum StatModTier {
    StatModTier_DEFAULT(0),
    STATMODTIER01(1),
    STATMODTIER02(2),
    STATMODTIER03(3),
    STATMODTIER04(4),
    STATMODTIER05(5);

    private final int value;

    StatModTier(int value) {
        this.value = value;
    }

    public static StatModTier fromValue(int value) {
        for (StatModTier tier : values()) {
            if (tier.value == value) {
                return tier;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<StatModTier> {

        @Override
        public void write(JsonWriter out, StatModTier value) throws IOException {
            out.value(value.name());
        }

        @Override
        public StatModTier read(JsonReader in) throws IOException {
            return StatModTier.fromValue(in.nextInt());
        }
    }
}
