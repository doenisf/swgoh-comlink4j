package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityDecisionTarget {
    AbilityDecisionTarget_DEFAULT(0),
    SELF(1),
    ALLY(2),
    ENEMY(3),
    DEADALLY(4);

    private final int value;

    AbilityDecisionTarget(int value) {
        this.value = value;
    }

    public static AbilityDecisionTarget fromValue(int value) {
        for (AbilityDecisionTarget type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityDecisionTarget> {

        @Override
        public void write(JsonWriter out, AbilityDecisionTarget value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityDecisionTarget read(JsonReader in) throws IOException {
            return AbilityDecisionTarget.fromValue(in.nextInt());
        }
    }
}
