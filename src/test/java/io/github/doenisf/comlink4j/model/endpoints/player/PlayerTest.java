package io.github.doenisf.comlink4j.model.endpoints.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.doenisf.comlink4j.model.gamedata.GameData;
import io.github.doenisf.comlink4j.util.GsonAdapterRegistrar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class PlayerTest {

    @Test
    public void testPlayerParser() {
        Integer allyCode = 315242232;

        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        Gson gson = builder.create();
        try {
            // Read resource file as InputStream
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("io/github/doenisf/comlink4j/model/endpoints/player/PlayerResponse.json");
            assertNotNull(inputStream, "Resource not found: io/github/doenisf/comlink4j/model/endpoints/player/PlayerResponse.json");

            // Read content of input file
            String jsonContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            // Close InputStream
            inputStream.close();
            Player player = gson.fromJson(jsonContent, Player.class);
            assertNotNull(player);
            assertEquals(allyCode.toString(), player.getAllyCode());
        } catch (Exception e) {
            fail(e);
        }
    }


}