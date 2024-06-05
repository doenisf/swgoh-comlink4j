package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CampaignType {
    CampaignType_DEFAULT(0),
    STANDARD(1),
    ONBOARDING(2),
    CAMPAIGNEVENT(3),
    GUILDRAID(4),
    CAMPAIGNPVELIGHT(5),
    CAMPAIGNPVEDARK(6),
    CAMPAIGNPVEMODBATTLES(7),
    CAMPAIGNPVEHOLOCRON(8),
    CAMPAIGNSHIPPVE(9),
    TERRITORYBATTLE(11),
    ARCADERAIDBATTLES(12);

    private final int value;

    CampaignType(int value) {
        this.value = value;
    }

    public static CampaignType fromValue(int value) {
        for (CampaignType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CampaignType> {

        @Override
        public void write(JsonWriter out, CampaignType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CampaignType read(JsonReader in) throws IOException {
            return CampaignType.fromValue(in.nextInt());
        }
    }
}
