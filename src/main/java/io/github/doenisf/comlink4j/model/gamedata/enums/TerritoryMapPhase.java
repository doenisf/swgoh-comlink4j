package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum TerritoryMapPhase {
    TerritoryMapPhase_DEFAULT(0),
    TERRITORYMAPOPTIN(1),
    TERRITORYMAPMATCHMAKING(2),
    TERRITORYMAPSETINITIALDEFENSE(3),
    TERRITORYMAPATTACK(4),
    TERRITORYMAPREVIEW(5),
    TERRITORYMAPEXPIRED(6);

    private final int value;

    TerritoryMapPhase(int value) {
        this.value = value;
    }

    public static TerritoryMapPhase fromValue(int value) {
        for (TerritoryMapPhase type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<TerritoryMapPhase> {

        @Override
        public void write(JsonWriter out, TerritoryMapPhase value) throws IOException {
            out.value(value.name());
        }

        @Override
        public TerritoryMapPhase read(JsonReader in) throws IOException {
            return TerritoryMapPhase.fromValue(in.nextInt());
        }
    }
}
