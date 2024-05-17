package de.sf.model.player.unit;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum Rarity {
    Rarity_DEFAULT(0),
    ONESTAR(1),
    TWOSTAR(2),
    THREESTAR(3),
    FOURSTAR(4),
    FIVESTAR(5),
    SIXSTAR(6),
    SEVENSTAR(7),
    NOSTAR(8);

    private final int value;

    Rarity(int value) {
        this.value = value;
    }

    public static Rarity fromValue(int value) {
        for (Rarity rarity : values()) {
            if (rarity.value == value) {
                return rarity;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<Rarity> {

        @Override
        public void write(JsonWriter out, Rarity value) throws IOException {
            out.value(value.name());
        }

        @Override
        public Rarity read(JsonReader in) throws IOException {
            return Rarity.fromValue(in.nextInt());
        }
    }
}
