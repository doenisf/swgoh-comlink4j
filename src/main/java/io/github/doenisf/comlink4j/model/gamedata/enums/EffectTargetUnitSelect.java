package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EffectTargetUnitSelect {
    EffectTargetUnitSelect_DEFAULT(0),
    SELECTALL(1),
    SELECTEDTARGET(2),
    SELECTRANDOM(3),
    SELECTSELF(4),
    SELECTPREVIOUS(5),
    SELECTLASTREINFORCEMENT(6),
    SELECTLOWESTSURVIVABILITY(7),
    SELECTHIGHESTSURVIVABILITY(8),
    SELECTLEADER(9),
    SELECTSUPPORT(10),
    SELECTLASTSUMMON(11);

    private final int value;

    EffectTargetUnitSelect(int value) {
        this.value = value;
    }

    public static EffectTargetUnitSelect fromValue(int value) {
        for (EffectTargetUnitSelect type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EffectTargetUnitSelect> {

        @Override
        public void write(JsonWriter out, EffectTargetUnitSelect value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EffectTargetUnitSelect read(JsonReader in) throws IOException {
            return EffectTargetUnitSelect.fromValue(in.nextInt());
        }
    }
}
