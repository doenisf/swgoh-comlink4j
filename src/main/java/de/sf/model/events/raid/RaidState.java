package de.sf.model.events.raid;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum RaidState {
    RaidState_DEFAULT(0),
    RAIDINPROGRESS(1),
    RAIDINTALLY(2),
    RAIDCOMPLETE(3),
    RAIDEXPIRED(4),
    RAIDPENDINGCOMPLETE(5);

    private final int value;

    RaidState(int value) {
        this.value = value;
    }

    public static RaidState fromValue(int value) {
        for (RaidState state : values()) {
            if (state.value == value) {
                return state;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<RaidState> {
        @Override
        public void write(JsonWriter out, RaidState value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public RaidState read(JsonReader in) throws IOException {
            return RaidState.fromValue(in.nextInt());
        }
    }
}
