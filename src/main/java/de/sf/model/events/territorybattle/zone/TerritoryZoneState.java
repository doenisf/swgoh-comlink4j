package de.sf.model.events.territorybattle.zone;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;
@Getter
@GsonEnumAdapter
public enum TerritoryZoneState {
    TerritoryZoneState_DEFAULT(0),
    ZONELOCKED(1),
    ZONEACTIVE(2),
    ZONEOPEN(3),
    ZONECOMPLETED(4);

    private final int value;

    TerritoryZoneState(int value) {
        this.value = value;
    }

    public static TerritoryZoneState fromValue(int value) {
        for (TerritoryZoneState state : values()) {
            if (state.value == value) {
                return state;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryZoneState> {
        @Override
        public void write(JsonWriter out, TerritoryZoneState value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public TerritoryZoneState read(JsonReader in) throws IOException {
            return TerritoryZoneState.fromValue(in.nextInt());
        }
    }
}
