package de.sf.model.events.raid;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

@Getter
public enum ItemType {
    ItemType_DEFAULT(0),
    EMPTY(1),
    UNIT(2),
    CURRENCY(3),
    BUCKET(4),
    XP(6),
    MATERIAL(7),
    ENERGY(8),
    EQUIPMENT(11),
    EVENTKEYCARD(12),
    POWERUPBUNDLE(13),
    MYSTERYBOX(14),
    STATMOD(15),
    MYSTERYSTATMOD(16),
    PLAYERTITLE(17),
    STATMODPARAMETERIZED(18),
    PLAYERPORTRAIT(19),
    SEASONPOINT(20),
    GALACTICBUNDLE(21),
    CONQUESTPOINT(22),
    ARTIFACT(23),
    CONQUESTCONSUMABLE(24),
    BATTLEPASS(25),
    LOGINCALENDAR(26),
    CONQUESTSTAMINAREGENREDUCE(27),
    CONQUESTENERGYREGENREDUCE(28),
    CONQUESTARTIFACTFREESWAPBONUS(29),
    DATACRON(30);

    private final int value;

    ItemType(int value) {
        this.value = value;
    }

    public static ItemType fromValue(int value) {
        for (ItemType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ItemType> {
        @Override
        public void write(JsonWriter out, ItemType value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public ItemType read(JsonReader in) throws IOException {
            return ItemType.fromValue(in.nextInt());
        }
    }
}
