package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ChallengeClaimType {
    ChallengeClaimType_DEFAULT(0),
    CHALLENGECLAIMMANUAL(1),
    CHALLENGECLAIMAUTOMATIC(2);

    private final int value;

    ChallengeClaimType(int value) {
        this.value = value;
    }

    public static ChallengeClaimType fromValue(int value) {
        for (ChallengeClaimType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ChallengeClaimType> {

        @Override
        public void write(JsonWriter out, ChallengeClaimType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ChallengeClaimType read(JsonReader in) throws IOException {
            return ChallengeClaimType.fromValue(in.nextInt());
        }
    }
}
