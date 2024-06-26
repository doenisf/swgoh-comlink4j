package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum HelpType {
    HelpType_DEFAULT(0),
    BATTLE(1),
    SQUAD(2),
    PROGRESS(3);

    private final int value;

    HelpType(int value) {
        this.value = value;
    }

    public static HelpType fromValue(int value) {
        for (HelpType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<HelpType> {

        @Override
        public void write(JsonWriter out, HelpType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public HelpType read(JsonReader in) throws IOException {
            return HelpType.fromValue(in.nextInt());
        }
    }
}
