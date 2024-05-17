package de.sf.model.player;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum PlayerProfileTab {
    PlayerProfileTab_DEFAULT(0),
    PROFILEPVPCHARACTER(1),
    PROFILEPVPSHIP(2),
    PROFILEPVPTOURNAMENT(3);

    private final int value;

    PlayerProfileTab(int value) {
        this.value = value;
    }

    public static PlayerProfileTab fromValue(int value) {
        for (PlayerProfileTab tab : values()) {
            if (tab.value == value) {
                return tab;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<PlayerProfileTab> {

        @Override
        public void write(JsonWriter out, PlayerProfileTab value) throws IOException {
            out.value(value.name());
        }

        @Override
        public PlayerProfileTab read(JsonReader in) throws IOException {
            return PlayerProfileTab.fromValue(in.nextInt());
        }
    }
}
