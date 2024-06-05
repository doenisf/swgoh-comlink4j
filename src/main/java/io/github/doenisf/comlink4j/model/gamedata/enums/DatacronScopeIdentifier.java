package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum DatacronScopeIdentifier {
    DatacronScopeIdentifier_DEFAULT(0),
    STATSCOPE(1),
    ALIGNMENTSCOPE(2),
    FACTIONSCOPE(3),
    CHARACTERSCOPE(4);

    private final int value;

    DatacronScopeIdentifier(int value) {
        this.value = value;
    }

    public static DatacronScopeIdentifier fromValue(int value) {
        for (DatacronScopeIdentifier type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<DatacronScopeIdentifier> {

        @Override
        public void write(JsonWriter out, DatacronScopeIdentifier value) throws IOException {
            out.value(value.name());
        }

        @Override
        public DatacronScopeIdentifier read(JsonReader in) throws IOException {
            return DatacronScopeIdentifier.fromValue(in.nextInt());
        }
    }
}
