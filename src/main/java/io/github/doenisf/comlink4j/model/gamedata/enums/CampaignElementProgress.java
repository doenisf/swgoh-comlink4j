package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CampaignElementProgress {
    CampaignElementProgress_DEFAULT(0),
    HIDDEN(1),
    LOCKED(2),
    UNLOCKED(3),
    COMPLETE(4),
    COMPLETEONESTAR(5),
    COMPLETETWOSTAR(6),
    COMPLETETHREESTAR(7);

    private final int value;

    CampaignElementProgress(int value) {
        this.value = value;
    }

    public static CampaignElementProgress fromValue(int value) {
        for (CampaignElementProgress progress : values()) {
            if (progress.value == value) {
                return progress;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CampaignElementProgress> {
        @Override
        public void write(JsonWriter out, CampaignElementProgress value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public CampaignElementProgress read(JsonReader in) throws IOException {
            return CampaignElementProgress.fromValue(in.nextInt());
        }
    }
}
