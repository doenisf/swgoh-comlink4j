package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum LinkedStoreItemType {
    LinkedStoreItemType_DEFAULT(0),
    LINKEDSTOREITEMUNIT(1),
    LINKEDSTOREITEMEVENT(2),
    LINKEDSTOREITEMRAID(3),
    LINKEDSTOREITEMPREVIEW(4);

    private final int value;

    LinkedStoreItemType(int value) {
        this.value = value;
    }

    public static LinkedStoreItemType fromValue(int value) {
        for (LinkedStoreItemType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<LinkedStoreItemType> {

        @Override
        public void write(JsonWriter out, LinkedStoreItemType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public LinkedStoreItemType read(JsonReader in) throws IOException {
            return LinkedStoreItemType.fromValue(in.nextInt());
        }
    }
}
