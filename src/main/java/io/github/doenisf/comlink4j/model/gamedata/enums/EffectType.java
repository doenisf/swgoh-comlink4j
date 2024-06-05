package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EffectType {
    EffectType_DEFAULT(0),
    DAMAGE(1),
    RECOVER(2),
    PARALYSIS(3),
    CURSE(4),
    DISPELL(5),
    IMMUNITY(6),
    BONUSMOVE(7),
    MODIFYSTAT(8),
    APPLYEFFECT(9),
    DISTRIBUTERECOVERY(10),
    QUERYCOUNT(11),
    QUERYSTAT(12),
    REVIVEUNIT(13),
    SCRIPTCOMPONENT(14),
    FLEE(15),
    DESTROY(16),
    REINFORCE(17),
    GRANTSHIELD(18),
    GRANTABILITY(19),
    HEALTHLIMIT(20),
    BLACKBOARDMODIFY(21),
    BLACKBOARDQUERY(22),
    STATLIMIT(23),
    SUMMONUNIT(24),
    QUERYCOOLDOWN(25),
    QUERYUNITVALUE(26),
    BATTLERESOLUTION(27),
    MODIFYULTIMATECHARGE(28),
    MODIFYDAMAGE(29),
    FORCEABILITY(30),
    OVERHEADDISPLAY(31),
    QUERYBATTLETYPE(32),
    MODIFYRECOVER(33),
    QUERYDATACRONLEVEL(34),
    SQUADBLACKBOARDMODIFY(35),
    SQUADBLACKBOARDQUERY(36),
    MODIFYCOOLDOWN(37),
    MODIFYCATEGORY(38),
    MODIFYOWNERSHIP(39),
    BLACKBOARDCOMPARE(40),
    SQUADBLACKBOARDCOMPARE(41),
    BLACKBOARDLIMIT(42),
    SQUADBLACKBOARDLIMIT(43);

    private final int value;

    EffectType(int value) {
        this.value = value;
    }

    public static EffectType fromValue(int value) {
        for (EffectType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EffectType> {

        @Override
        public void write(JsonWriter out, EffectType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public EffectType read(JsonReader in) throws IOException {
            return EffectType.fromValue(in.nextInt());
        }
    }
}
