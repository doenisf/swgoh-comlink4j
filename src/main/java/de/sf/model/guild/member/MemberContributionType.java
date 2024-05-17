package de.sf.model.guild.member;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum MemberContributionType {
    MemberContributionType_DEFAULT(0),
    CONTRIBUTIONTYPECOMMENDATION(1),
    CONTRIBUTIONTYPETRIBUTE(2),
    CONTRIBUTIONTYPEDONATION(3);

    private final int value;

    MemberContributionType(int value) {
        this.value = value;
    }

    public static MemberContributionType fromValue(int value) {
        for (MemberContributionType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<MemberContributionType> {
        @Override
        public void write(JsonWriter out, MemberContributionType value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public MemberContributionType read(JsonReader in) throws IOException {
            return MemberContributionType.fromValue(in.nextInt());
        }
    }
}
