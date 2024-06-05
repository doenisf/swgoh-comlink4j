package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum PointAtRotationBehavior {
    PointAtRotationBehavior_DEFAULT(0),
    ROTATIONBEHAVIORNONE(1),
    ROTATIONBEHAVIORAUTOFROMCENTER(2),
    ROTATIONBEHAVIORAUTOFROMCENTERIFCLAMPED(3);

    private final int value;

    PointAtRotationBehavior(int value) {
        this.value = value;
    }

    public static PointAtRotationBehavior fromValue(int value) {
        for (PointAtRotationBehavior type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<PointAtRotationBehavior> {

        @Override
        public void write(JsonWriter out, PointAtRotationBehavior value) throws IOException {
            out.value(value.name());
        }

        @Override
        public PointAtRotationBehavior read(JsonReader in) throws IOException {
            return PointAtRotationBehavior.fromValue(in.nextInt());
        }
    }
}
