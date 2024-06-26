package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum UnitHealthState {
    UnitHealthState_DEFAULT(0),
    UNITHEALTHSTATEANY(1),
    UNITHEALTHSTATEALIVE(2),
    UNITHEALTHSTATEDEAD(3);

    private final int value;

    UnitHealthState(int value) {
        this.value = value;
    }

    public static UnitHealthState fromValue(int value) {
        for (UnitHealthState type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<UnitHealthState> {

        @Override
        public void write(JsonWriter out, UnitHealthState value) throws IOException {
            out.value(value.name());
        }

        @Override
        public UnitHealthState read(JsonReader in) throws IOException {
            return UnitHealthState.fromValue(in.nextInt());
        }
    }
}
