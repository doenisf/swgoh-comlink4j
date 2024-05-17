package de.sf.commlink4j.model.events.territorybattle.zone;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryZoneCommandState {
    TerritoryZoneCommandState_DEFAULT(0),
    NOCOMMAND(1),
    FOCUSED(2),
    IGNORED(3);

    private final int value;

    TerritoryZoneCommandState(int value) {
        this.value = value;
    }

    public static TerritoryZoneCommandState fromValue(int value) {
        for (TerritoryZoneCommandState state : values()) {
            if (state.value == value) {
                return state;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryZoneCommandState> {
        @Override
        public void write(JsonWriter out, TerritoryZoneCommandState value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public TerritoryZoneCommandState read(JsonReader in) throws IOException {
            return TerritoryZoneCommandState.fromValue(in.nextInt());
        }
    }
}
