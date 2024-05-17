package de.sf.model.modifier;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ModifierLocationType {
    ModifierLocationType_DEFAULT(0),
    MODIFIERLOCATIONCAMPAIGN(1),
    MODIFIERLOCATIONGALACTICWAR(2);

    private final int value;

    ModifierLocationType(int value) {
        this.value = value;
    }

    public static ModifierLocationType fromValue(int value) {
        for (ModifierLocationType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ModifierLocationType> {

        @Override
        public void write(JsonWriter out, ModifierLocationType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ModifierLocationType read(JsonReader in) throws IOException {
            return ModifierLocationType.fromValue(in.nextInt());
        }
    }
}
