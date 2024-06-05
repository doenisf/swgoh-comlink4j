package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum OmicronMode {
    OmicronMode_DEFAULT(0),
    ALLOMICRON(1),
    PVEOMICRON(2),
    PVPOMICRON(3),
    GUILDRAIDOMICRON(4),
    TERRITORYSTRIKEOMICRON(5),
    TERRITORYCOVERTOMICRON(6),
    TERRITORYBATTLEBOTHOMICRON(7),
    TERRITORYWAROMICRON(8),
    TERRITORYTOURNAMENTOMICRON(9),
    WAROMICRON(10),
    CONQUESTOMICRON(11),
    GALACTICCHALLENGEOMICRON(12),
    PVEEVENTOMICRON(13),
    TERRITORYTOURNAMENT3OMICRON(14),
    TERRITORYTOURNAMENT5OMICRON(15),
    GALACTICCHALLENGE3OMICRON(16),
    GALACTICCHALLENGE5OMICRON(17);

    private final int value;

    OmicronMode(int value) {
        this.value = value;
    }

    public static OmicronMode fromValue(int value) {
        for (OmicronMode type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<OmicronMode> {

        @Override
        public void write(JsonWriter out, OmicronMode value) throws IOException {
            out.value(value.name());
        }

        @Override
        public OmicronMode read(JsonReader in) throws IOException {
            return OmicronMode.fromValue(in.nextInt());
        }
    }
}
