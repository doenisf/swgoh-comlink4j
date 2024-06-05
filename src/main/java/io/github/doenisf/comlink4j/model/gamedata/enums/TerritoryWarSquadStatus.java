package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryWarSquadStatus {
    TerritoryWarSquadStatus_DEFAULT(0),
    SQUADAVAILABLE(1),
    SQUADLOCKED(2),
    SQUADDEFEATED(3);

    private final int value;

    TerritoryWarSquadStatus(int value) {
        this.value = value;
    }

    public static TerritoryWarSquadStatus fromValue(int value) {
        for (TerritoryWarSquadStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryWarSquadStatus> {

        @Override
        public void write(JsonWriter out, TerritoryWarSquadStatus value) throws IOException {
            out.value(value.name());
        }

        @Override
        public TerritoryWarSquadStatus read(JsonReader in) throws IOException {
            return TerritoryWarSquadStatus.fromValue(in.nextInt());
        }
    }
}
