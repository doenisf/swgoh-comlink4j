package io.github.doenisf.comlink4j.model.gamedata;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.doenisf.comlink4j.util.GsonAdapterRegistrar;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class GameDataTest {

    @Test
    public void testGameDataParser() {
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        Gson gson = builder.create();
        try {
            // Read resource file as InputStream
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("io/github/doenisf/comlink4j/model/gamedata/GameDataResponse.json");
            assertNotNull(inputStream, "Resource not found: io/github/doenisf/comlink4j/model/gamedata/GameDataResponse.json");

            // Read content of input file
            String jsonContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            // Close InputStream
            inputStream.close();
            GameData gameData = gson.fromJson(jsonContent, GameData.class);
            assertNotNull(gameData);
        } catch (Exception e) {
            fail(e);
        }
    }

}