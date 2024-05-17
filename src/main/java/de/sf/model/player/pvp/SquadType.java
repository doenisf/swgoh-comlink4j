package de.sf.model.player.pvp;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

@Getter
public enum SquadType {
    SquadType_DEFAULT(0),
    SQUADNEUTRAL(1),
    SQUADLIGHT(2),
    SQUADDARK(3),
    SQUADEVENT(4),
    SQUADPVP(5),
    SQUADRESTRICTED(6),
    SQUADSUPPLIED(7),
    SQUADWAR(8),
    SQUADEVENT01(9),
    SQUADEVENT02(10),
    SQUADEVENT03(11),
    SQUADEVENT04(12),
    SQUADEVENT05(13),
    SQUADEVENT06(14),
    SQUADEVENT07(15),
    SQUADEVENT08(16),
    SQUADEVENT09(17),
    SQUADEVENT10(18),
    SQUADEVENT11(19),
    SQUADEVENT12(20),
    SQUADEVENT13(21),
    SQUADEVENT14(22),
    SQUADEVENT15(23),
    SQUADEVENT16(24),
    SQUADEVENT17(25),
    SQUADEVENT18(26),
    SQUADEVENT19(27),
    SQUADEVENT20(28),
    SQUADWARDEFENSIVE(29),
    SQUADGUILDRAID(30),
    SQUADSTATMODBATTLES(31),
    SQUADEVENTDEFENSIVE(32),
    SQUADEVENTDEFENSIVE01(33),
    SQUADEVENTDEFENSIVE02(34),
    SQUADEVENTDEFENSIVE03(35),
    SQUADEVENTDEFENSIVE04(36),
    SQUADEVENTDEFENSIVE05(37),
    SQUADEVENTDEFENSIVE06(38),
    SQUADEVENTDEFENSIVE07(39),
    SQUADEVENTDEFENSIVE08(40),
    SQUADEVENTDEFENSIVE09(41),
    SQUADEVENTDEFENSIVE10(42),
    SQUADEVENTDEFENSIVE11(43),
    SQUADEVENTDEFENSIVE12(44),
    SQUADEVENTDEFENSIVE13(45),
    SQUADEVENTDEFENSIVE14(46),
    SQUADEVENTDEFENSIVE15(47),
    SQUADEVENTDEFENSIVE16(48),
    SQUADEVENTDEFENSIVE17(49),
    SQUADEVENTDEFENSIVE18(50),
    SQUADEVENTDEFENSIVE19(51),
    SQUADEVENTDEFENSIVE20(52),
    SQUADTERRITORYWARATTACK(53),
    SQUADTERRITORYWARDEFENSIVE(54),
    SQUADTERRITORYTOURNAMENTATTACK(55),
    SQUADTERRITORYTOURNAMENTDEFENSIVE(56),
    SQUADARCADERAID(57),
    SQUADCONQUEST(58);

    private final int value;

    SquadType(int value) {
        this.value = value;
    }

    public static SquadType fromValue(int value) {
        for (SquadType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<SquadType> {

        @Override
        public void write(JsonWriter out, SquadType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public SquadType read(JsonReader in) throws IOException {
            return SquadType.fromValue(in.nextInt());
        }
    }
}
