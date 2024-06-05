package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CalendarMissedConsequence {
    IGNOREMISSED(0),
    SKIPMISSED(1),
    RESETONMISS(2);

    private final int value;

    CalendarMissedConsequence(int value) {
        this.value = value;
    }

    public static CalendarMissedConsequence fromValue(int value) {
        for (CalendarMissedConsequence type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CalendarMissedConsequence> {

        @Override
        public void write(JsonWriter out, CalendarMissedConsequence value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CalendarMissedConsequence read(JsonReader in) throws IOException {
            return CalendarMissedConsequence.fromValue(in.nextInt());
        }
    }
}
