package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum RelicTier {
    RelicTier_DEFAULT(0),
    RELICLOCKED(1),
    RELICUNLOCKED(2),
    RELICTIER01(3),
    RELICTIER02(4),
    RELICTIER03(5),
    RELICTIER04(6),
    RELICTIER05(7),
    RELICTIER06(8),
    RELICTIER07(9),
    RELICTIER08(10),
    RELICTIER09(11),
    RELICTIER10(12),
    RELICTIER11(13),
    RELICTIER12(14),
    RELICTIER13(15),
    RELICTIER14(16),
    RELICTIER15(17),
    RELICTIER16(18),
    RELICTIER17(19),
    RELICTIER18(20),
    RELICTIER19(21),
    RELICTIER20(22),
    RELICTIER21(23),
    RELICTIER22(24),
    RELICTIER23(25),
    RELICTIER24(26),
    RELICTIER25(27),
    RELICTIER26(28),
    RELICTIER27(29),
    RELICTIER28(30),
    RELICTIER29(31),
    RELICTIER30(32),
    RELICTIER31(33),
    RELICTIER32(34),
    RELICTIER33(35),
    RELICTIER34(36),
    RELICTIER35(37),
    RELICTIER36(38),
    RELICTIER37(39),
    RELICTIER38(40),
    RELICTIER39(41),
    RELICTIER40(42),
    RELICTIER41(43),
    RELICTIER42(44),
    RELICTIER43(45),
    RELICTIER44(46),
    RELICTIER45(47),
    RELICTIER46(48),
    RELICTIER47(49),
    RELICTIER48(50),
    RELICTIER49(51),
    RELICTIER50(52);

    private final int value;

    RelicTier(int value) {
        this.value = value;
    }

    public static RelicTier fromValue(int value) {
        for (RelicTier tier : values()) {
            if (tier.value == value) {
                return tier;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<RelicTier> {

        @Override
        public void write(JsonWriter out, RelicTier value) throws IOException {
            out.value(value.name());
        }

        @Override
        public RelicTier read(JsonReader in) throws IOException {
            return RelicTier.fromValue(in.nextInt());
        }
    }
}

