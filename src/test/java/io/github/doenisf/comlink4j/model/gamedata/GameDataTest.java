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
    Path workingDir;

    @Before
    public void init() {
        this.workingDir = Path.of("", "src/test/resources");
    }

    @Test
    public void testGameDataParser() {
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        Gson gson = builder.create();
        try {
            String path = "src/test/resources/io/github.doenisf.comlink4j/model/gamedata/GameDataResponse.json";

            File file = new File(path);

            BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String jsonString = sb.toString();
            GameData gameData = gson.fromJson(jsonString, GameData.class);
        } catch (Exception e) {
            fail(e);
        }
    }

}