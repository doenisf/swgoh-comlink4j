package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum AbilityDecisionType {
    AbilityDecisionType_DEFAULT(0),
    SINGLEHEALTH(1),
    MEDIANHEALTH(2),
    NUMBEROFTARGETS(3),
    PERSISTENTEFFECT(4),
    NUMBEROFENEMIESALIVE(5),
    REINFORCEAVAILABLE(6),
    OUTNUMBERED(7),
    SINGLESURVIVABILITYPERCENT(8),
    SUMMONAVAILABLE(9),
    SINGLEPROTECTION(10),
    SINGLESPEEDFILL(11),
    TARGETBYUNITIDS(12);

    private final int value;

    AbilityDecisionType(int value) {
        this.value = value;
    }

    public static AbilityDecisionType fromValue(int value) {
        for (AbilityDecisionType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<AbilityDecisionType> {

        @Override
        public void write(JsonWriter out, AbilityDecisionType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public AbilityDecisionType read(JsonReader in) throws IOException {
            return AbilityDecisionType.fromValue(in.nextInt());
        }
    }
}
