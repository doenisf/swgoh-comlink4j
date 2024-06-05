package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ChallengeRewardType {
    ChallengeRewardType_DEFAULT(0),
    CHALLENGEREWARDFIXED(1),
    CHALLENGEREWARDRATIO(2);

    private final int value;

    ChallengeRewardType(int value) {
        this.value = value;
    }

    public static ChallengeRewardType fromValue(int value) {
        for (ChallengeRewardType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ChallengeRewardType> {

        @Override
        public void write(JsonWriter out, ChallengeRewardType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ChallengeRewardType read(JsonReader in) throws IOException {
            return ChallengeRewardType.fromValue(in.nextInt());
        }
    }
}
