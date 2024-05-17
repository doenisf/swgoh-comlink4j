package de.sf.commlink4j.model.guild;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum EnrollmentStatus {
    EnrollmentStatus_DEFAULT(0),
    ENROLLMENTOPEN(1),
    ENROLLMENTINVITE(2),
    ENROLLMENTCLOSED(3);

    private final int value;

    EnrollmentStatus(int value) {
        this.value = value;
    }

    public static EnrollmentStatus fromValue(int value) {
        for (EnrollmentStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<EnrollmentStatus> {
        @Override
        public void write(JsonWriter out, EnrollmentStatus value) throws IOException {
            out.value(value.getValue());
        }

        @Override
        public EnrollmentStatus read(JsonReader in) throws IOException {
            return EnrollmentStatus.fromValue(in.nextInt());
        }
    }
}
