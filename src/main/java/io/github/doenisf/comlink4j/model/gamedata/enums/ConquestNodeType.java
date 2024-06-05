package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ConquestNodeType {
    ConquestNodeType_DEFAULT(0),
    COMBATNODE(1),
    ARTIFACTNODE(2),
    MERCHANTNODE(3),
    STARTNODE(4),
    BOSSNODE(5),
    COMBATNOPOINTSNODE(6);

    private final int value;

    ConquestNodeType(int value) {
        this.value = value;
    }

    public static ConquestNodeType fromValue(int value) {
        for (ConquestNodeType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ConquestNodeType> {

        @Override
        public void write(JsonWriter out, ConquestNodeType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ConquestNodeType read(JsonReader in) throws IOException {
            return ConquestNodeType.fromValue(in.nextInt());
        }
    }
}
