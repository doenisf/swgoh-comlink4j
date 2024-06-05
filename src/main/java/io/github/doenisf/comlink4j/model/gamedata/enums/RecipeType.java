package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum RecipeType {
    RecipeType_DEFAULT(0),
    RECIPEINVALID(1),
    RECIPEPROMOTION(2),
    RECIPESHIP(3),
    RECIPECONSUMABLE(4),
    RECIPECHARACTER(5),
    RECIPESKILL(6),
    RECIPEEQUIPMENT(7),
    RECIPEMODSLICING(8),
    RECIPEMATERIAL(9),
    RECIPERELIC(10),
    RECIPEDATACRON(11);

    private final int value;

    RecipeType(int value) {
        this.value = value;
    }

    public static RecipeType fromValue(int value) {
        for (RecipeType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<RecipeType> {

        @Override
        public void write(JsonWriter out, RecipeType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public RecipeType read(JsonReader in) throws IOException {
            return RecipeType.fromValue(in.nextInt());
        }
    }
}
