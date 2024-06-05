package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum StatModSlot {
    StatModSlot_DEFAULT(0),
    STATMODSLOT01(2),
    STATMODSLOT02(3),
    STATMODSLOT03(4),
    STATMODSLOT04(5),
    STATMODSLOT05(6),
    STATMODSLOT06(7);

    private final int value;

    StatModSlot(int value) {
        this.value = value;
    }

    public static StatModSlot fromValue(int value) {
        for (StatModSlot type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<StatModSlot> {

        @Override
        public void write(JsonWriter out, StatModSlot value) throws IOException {
            out.value(value.name());
        }

        @Override
        public StatModSlot read(JsonReader in) throws IOException {
            return StatModSlot.fromValue(in.nextInt());
        }
    }
}
