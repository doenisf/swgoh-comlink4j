package de.sf.model.player.pvp;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum BattleTargetingTactic {
    BattleTargetingTactic_DEFAULT(0),
    TARGETRANDOM(1),
    TARGETRANDOMSWITCH(2),
    TARGETRANDOMOVERKILL(3),
    TARGETRANDOMWEIGHTEDSWITCH(4);

    private final int value;

    BattleTargetingTactic(int value) {
        this.value = value;
    }

    public static BattleTargetingTactic fromValue(int value) {
        for (BattleTargetingTactic tactic : values()) {
            if (tactic.value == value) {
                return tactic;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<BattleTargetingTactic> {

        @Override
        public void write(JsonWriter out, BattleTargetingTactic value) throws IOException {
            out.value(value.name());
        }

        @Override
        public BattleTargetingTactic read(JsonReader in) throws IOException {
            return BattleTargetingTactic.fromValue(in.nextInt());
        }
    }
}
