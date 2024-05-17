package de.sf.commlink4j.model.events.territorybattle.zone;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryCovertMissionResult {
    UNATTEMPTED(0),
    ATTEMPTEDFAILED(1),
    ATTEMPTEDSUCCEEDED(2);

    private final int value;

    TerritoryCovertMissionResult(int value) {
        this.value = value;
    }

    public static TerritoryCovertMissionResult fromValue(int value) {
        for (TerritoryCovertMissionResult result : values()) {
            if (result.value == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryCovertMissionResult> {
        @Override
        public void write(JsonWriter out, TerritoryCovertMissionResult value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public TerritoryCovertMissionResult read(JsonReader in) throws IOException {
            return TerritoryCovertMissionResult.fromValue(in.nextInt());
        }
    }
}
