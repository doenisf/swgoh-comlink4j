package de.sf.commlink4j.model.player.unit;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CurrencyType {
    CurrencyType_DEFAULT(0),
    GRIND(1),
    PREMIUM(2),
    REALMONEY(3),
    SOCIAL(4),
    IGCEVENTKEYCARD(8),
    XPEVENTKEYCARD(9),
    PVPCURRENCY(10),
    FORCEPOINT(11),
    PVPSHIPCURRENCY(12),
    FREE(13),
    WARSHIPCURRENCY(14),
    GRINDTICKET(15),
    SHARDCURRENCY(16),
    GUILDCURRENCY(17),
    GUILDBANKCURRENCY(18),
    SHIPGRIND(19),
    GUILDRAIDCURRENCY01(20),
    GUILDRAIDCURRENCY02(21),
    GUILDRAIDCURRENCY03(22),
    GUILDRAIDCURRENCY04(23),
    GUILDRAIDCURRENCY05(24),
    GUILDRAIDCURRENCY06(25),
    GUILDRAIDCURRENCY07(26),
    GUILDRAIDCURRENCY08(27),
    GUILDRAIDCURRENCY09(28),
    GUILDRAIDCURRENCY10(29),
    GUILDRAIDCURRENCY11(30),
    GUILDRAIDCURRENCY12(31),
    TERRITORYBATTLECURRENCY(32),
    SEASONSCURRENCY(33),
    TERRITORYBATTLECURRENCY02(34),
    GALACTICBUNDLECURRENCY(35),
    LIGHTSIDECURRENCY(36),
    DARKSIDECURRENCY(37),
    GALACTICCHALLENGECURRENCY(38),
    CONQUESTCURRENCY(39),
    DATACRONCURRENCY(40),
    MODREROLLCURRENCY(41),
    TERRITORYBATTLECURRENCY03(42),
    RAIDREWARDCURRENCY01(43),
    RAIDREWARDCURRENCY02(44),
    RAIDREWARDCURRENCY03(45),
    RAIDREWARDCURRENCY04(46),
    GLEVENTCURRENCY(47);

    private final int value;

    CurrencyType(int value) {
        this.value = value;
    }

    public static CurrencyType fromValue(int value) {
        for (CurrencyType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CurrencyType> {

        @Override
        public void write(JsonWriter out, CurrencyType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CurrencyType read(JsonReader in) throws IOException {
            return CurrencyType.fromValue(in.nextInt());
        }
    }
}
