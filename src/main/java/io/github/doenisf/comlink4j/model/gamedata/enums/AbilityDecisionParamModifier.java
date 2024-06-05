package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityDecisionParamModifier {
    AbilityDecisionParamModifier_DEFAULT(0),
    GREATERTHAN(1),
    EQUALTO(2),
    LESSTHAN(3);

    private final int value;

    AbilityDecisionParamModifier(int value) {
        this.value = value;
    }

    public static AbilityDecisionParamModifier fromValue(int value) {
        for (AbilityDecisionParamModifier type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityDecisionParamModifier> {

        @Override
        public void write(JsonWriter out, AbilityDecisionParamModifier value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityDecisionParamModifier read(JsonReader in) throws IOException {
            return AbilityDecisionParamModifier.fromValue(in.nextInt());
        }
    }
}
