package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CalendarCompletionBehavior {
    REMAIN(0),
    REMOVE(1),
    REPEAT(2);

    private final int value;

    CalendarCompletionBehavior(int value) {
        this.value = value;
    }

    public static CalendarCompletionBehavior fromValue(int value) {
        for (CalendarCompletionBehavior type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CalendarCompletionBehavior> {

        @Override
        public void write(JsonWriter out, CalendarCompletionBehavior value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CalendarCompletionBehavior read(JsonReader in) throws IOException {
            return CalendarCompletionBehavior.fromValue(in.nextInt());
        }
    }
}
