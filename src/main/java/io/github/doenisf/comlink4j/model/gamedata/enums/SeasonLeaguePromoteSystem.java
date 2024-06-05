package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum SeasonLeaguePromoteSystem {
    SEASONLEAGUEPROMOTENONE(0),
    SEASONLEAGUEPROMOTESEASONPOINTS(3);

    private final int value;

    SeasonLeaguePromoteSystem(int value) {
        this.value = value;
    }

    public static SeasonLeaguePromoteSystem fromValue(int value) {
        for (SeasonLeaguePromoteSystem type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<SeasonLeaguePromoteSystem> {

        @Override
        public void write(JsonWriter out, SeasonLeaguePromoteSystem value) throws IOException {
            out.value(value.name());
        }

        @Override
        public SeasonLeaguePromoteSystem read(JsonReader in) throws IOException {
            return SeasonLeaguePromoteSystem.fromValue(in.nextInt());
        }
    }
}
