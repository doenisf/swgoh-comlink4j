package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum UnitGuideActivityType {
    UnitGuideActivityType_DEFAULT(0),
    GUIDEACTIVITYEVENT(1),
    GUIDEACTIVITYRAID(2),
    GUIDEACTIVITYTERRITORYBATTLE(4),
    GUIDEACTIVITYUNDEFINED(5);

    private final int value;

    UnitGuideActivityType(int value) {
        this.value = value;
    }

    public static UnitGuideActivityType fromValue(int value) {
        for (UnitGuideActivityType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<UnitGuideActivityType> {

        @Override
        public void write(JsonWriter out, UnitGuideActivityType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public UnitGuideActivityType read(JsonReader in) throws IOException {
            return UnitGuideActivityType.fromValue(in.nextInt());
        }
    }
}
