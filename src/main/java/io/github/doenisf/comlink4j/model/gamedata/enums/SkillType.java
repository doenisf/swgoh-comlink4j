package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum SkillType {
    SkillType_DEFAULT(0),
    UNITSKILL(1),
    CREWSKILL(2);

    private final int value;

    SkillType(int value) {
        this.value = value;
    }

    public static SkillType fromValue(int value) {
        for (SkillType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<SkillType> {

        @Override
        public void write(JsonWriter out, SkillType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public SkillType read(JsonReader in) throws IOException {
            return SkillType.fromValue(in.nextInt());
        }
    }
}
