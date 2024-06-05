package io.github.doenisf.comlink4j.model.gamedata.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.doenisf.comlink4j.util.GsonEnumAdapter;
import lombok.Getter;

import java.io.IOException;

@Getter
@GsonEnumAdapter
public enum ConquestPurchasePassMiscTextEntryType {
    ConquestPurchasePassMiscTextEntryType_DEFAULT(0),
    PASSWITHEXTRAS(1),
    PASSONLY(2),
    ALLPASSVARIANTS(3);

    private final int value;

    ConquestPurchasePassMiscTextEntryType(int value) {
        this.value = value;
    }

    public static ConquestPurchasePassMiscTextEntryType fromValue(int value) {
        for (ConquestPurchasePassMiscTextEntryType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static class Adapter extends TypeAdapter<ConquestPurchasePassMiscTextEntryType> {

        @Override
        public void write(JsonWriter out, ConquestPurchasePassMiscTextEntryType value) throws IOException {
            out.value(value.name());
        }

        @Override
        public ConquestPurchasePassMiscTextEntryType read(JsonReader in) throws IOException {
            return ConquestPurchasePassMiscTextEntryType.fromValue(in.nextInt());
        }
    }
}
