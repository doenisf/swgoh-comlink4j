package de.sf.commlink4j.model.guild;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CampaignNodeDifficulty {
    NOTSET(0),
    NORMALDIFF(4),
    HARDDIFF(5),
    NIGHTMAREDIFF(6),
    SPECIALDIFF(7),
    IDIFF(8),
    IIDIFF(9),
    IIIDIFF(10),
    IVDIFF(11),
    VDIFF(12),
    VIDIFF(13);

    private final int value;

    CampaignNodeDifficulty(int value) {
        this.value = value;
    }

    public static CampaignNodeDifficulty fromValue(int value) {
        for (CampaignNodeDifficulty difficulty : values()) {
            if (difficulty.value == value) {
                return difficulty;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CampaignNodeDifficulty> {
        @Override
        public void write(JsonWriter out, CampaignNodeDifficulty value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public CampaignNodeDifficulty read(JsonReader in) throws IOException {
            return CampaignNodeDifficulty.fromValue(in.nextInt());
        }
    }
}
