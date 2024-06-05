package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityDecisionResultTarget {
    AbilityDecisionResultTarget_DEFAULT(0),
    ALL(1),
    LOWESTABSOLUTEHEALTH(2);

    private final int value;

    AbilityDecisionResultTarget(int value) {
        this.value = value;
    }

    public static AbilityDecisionResultTarget fromValue(int value) {
        for (AbilityDecisionResultTarget type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityDecisionResultTarget> {

        @Override
        public void write(JsonWriter out, AbilityDecisionResultTarget value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityDecisionResultTarget read(JsonReader in) throws IOException {
            return AbilityDecisionResultTarget.fromValue(in.nextInt());
        }
    }
}
