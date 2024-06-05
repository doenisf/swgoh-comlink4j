package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CalendarCatchUp {
    DISABLED(0),
    MISSEDDAY(1),
    ANYDAY(2);

    private final int value;

    CalendarCatchUp(int value) {
        this.value = value;
    }

    public static CalendarCatchUp fromValue(int value) {
        for (CalendarCatchUp type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CalendarCatchUp> {

        @Override
        public void write(JsonWriter out, CalendarCatchUp value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CalendarCatchUp read(JsonReader in) throws IOException {
            return CalendarCatchUp.fromValue(in.nextInt());
        }
    }
}
