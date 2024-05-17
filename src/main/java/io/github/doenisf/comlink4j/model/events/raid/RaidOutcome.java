package io.github.doenisf.comlink4j.model.events.raid;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum RaidOutcome {
    RAIDOUTCOMEUNDEFINED(0),
    RAIDOUTCOMEWIN(1),
    RAIDOUTCOMEEXPIRED(2),
    RAIDOUTCOMEINPROGRESS(3),
    RAIDOUTCOMEABANDONED(4),
    RAIDOUTCOMESIMMED(5);

    private final int value;

    RaidOutcome(int value) {
        this.value = value;
    }

    public static RaidOutcome fromValue(int value) {
        for (RaidOutcome outcome : values()) {
            if (outcome.value == value) {
                return outcome;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<RaidOutcome> {
        @Override
        public void write(JsonWriter out, RaidOutcome value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public RaidOutcome read(JsonReader in) throws IOException {
            return RaidOutcome.fromValue(in.nextInt());
        }
    }
}
