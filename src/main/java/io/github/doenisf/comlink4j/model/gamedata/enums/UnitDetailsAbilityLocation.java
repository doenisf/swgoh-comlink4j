package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum UnitDetailsAbilityLocation {
    UnitDetailsAbilityLocation_DEFAULT(0),
    ABILITYLOCATIONNORMAL(1),
    ABILITYLOCATIONADVANCED(2),
    ABILITYLOCATIONCREW(3),
    ABILITYLOCATIONHIDDEN(4);

    private final int value;

    UnitDetailsAbilityLocation(int value) {
        this.value = value;
    }

    public static UnitDetailsAbilityLocation fromValue(int value) {
        for (UnitDetailsAbilityLocation location : values()) {
            if (location.value == value) {
                return location;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<UnitDetailsAbilityLocation> {

        @Override
        public void write(JsonWriter out, UnitDetailsAbilityLocation value) throws IOException {
            out.value(value.name());
        }

        @Override
        public UnitDetailsAbilityLocation read(JsonReader in) throws IOException {
            return UnitDetailsAbilityLocation.fromValue(in.nextInt());
        }
    }
}
