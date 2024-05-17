package de.sf.commlink4j.model.events;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.sf.commlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum CategoryMatchType {
    CategoryMatchType_DEFAULT(0),
    MATCHALL(1),
    MATCHANY(2);

    private final int value;

    CategoryMatchType(int value) {
        this.value = value;
    }

    public static CategoryMatchType fromValue(int value) {
        for (CategoryMatchType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<CategoryMatchType> {

        @Override
        public void write(JsonWriter out, CategoryMatchType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public CategoryMatchType read(JsonReader in) throws IOException {
            return CategoryMatchType.fromValue(in.nextInt());
        }
    }
}
