package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum WarNodeType {
    WarNodeType_DEFAULT(0),
    NODETYPEOPPONENT(1),
    NODETYPECHESTCOMMON(2),
    NODETYPECHESTRARE(3),
    NODETYPECHESTEPIC(4);

    private final int value;

    WarNodeType(int value) {
        this.value = value;
    }

    public static WarNodeType fromValue(int value) {
        for (WarNodeType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<WarNodeType> {

        @Override
        public void write(JsonWriter out, WarNodeType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public WarNodeType read(JsonReader in) throws IOException {
            return WarNodeType.fromValue(in.nextInt());
        }
    }
}
