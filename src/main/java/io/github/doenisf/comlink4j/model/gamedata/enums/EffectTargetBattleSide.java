package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EffectTargetBattleSide {
    EffectTargetBattleSide_DEFAULT(0),
    BOTHSIDES(1),
    ALLYSIDE(2),
    ENEMYSIDE(3),
    PLAYERSIDE(4),
    OPPONENTSIDE(5);

    private final int value;

    EffectTargetBattleSide(int value) {
        this.value = value;
    }

    public static EffectTargetBattleSide fromValue(int value) {
        for (EffectTargetBattleSide type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EffectTargetBattleSide> {

        @Override
        public void write(JsonWriter out, EffectTargetBattleSide value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EffectTargetBattleSide read(JsonReader in) throws IOException {
            return EffectTargetBattleSide.fromValue(in.nextInt());
        }
    }
}
