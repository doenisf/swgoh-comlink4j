package io.github.doenisf.comlink4j.model.modifier;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ActionLinkType {
    ActionLinkType_DEFAULT(0),
    INTERNAL(1),
    EXTERNAL(2);

    private final int value;

    ActionLinkType(int value) {
        this.value = value;
    }

    public static ActionLinkType fromValue(int value) {
        for (ActionLinkType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ActionLinkType> {

        @Override
        public void write(JsonWriter out, ActionLinkType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ActionLinkType read(JsonReader in) throws IOException {
            return ActionLinkType.fromValue(in.nextInt());
        }
    }
}
