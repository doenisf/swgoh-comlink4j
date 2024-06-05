package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum BattleDeploymentState {
    BattleDeploymentState_DEFAULT(0),
    BATTLEDEPLOYMENTSTATEANY(1),
    BATTLEDEPLOYMENTSTATEDEPLOYED(2),
    BATTLEDEPLOYMENTSTATEREINFORCEMENT(3);

    private final int value;

    BattleDeploymentState(int value) {
        this.value = value;
    }

    public static BattleDeploymentState fromValue(int value) {
        for (BattleDeploymentState type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<BattleDeploymentState> {

        @Override
        public void write(JsonWriter out, BattleDeploymentState value) throws IOException {
            out.value(value.name());
        }

        @Override
        public BattleDeploymentState read(JsonReader in) throws IOException {
            return BattleDeploymentState.fromValue(in.nextInt());
        }
    }
}
