package io.github.doenisf.comlink4j.model.endpoints.guild;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.doenisf.comlink4j.model.endpoints.player.Player;
import io.github.doenisf.comlink4j.util.GsonAdapterRegistrar;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GuildTest {
    @Test
    public void testGuildParser() {
        String guildId = "c2rZ5wg3RBOUQ8Ie2A77jg";

        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);
        Gson gson = builder.create();
        try {
            // Read resource file as InputStream
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("io/github/doenisf/comlink4j/model/endpoints/guild/GuildResponse.json");
            assertNotNull(inputStream, "Resource not found: io/github/doenisf/comlink4j/model/endpoints/guild/GuildResponse.json");

            // Read content of input file
            String jsonContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            // Close InputStream
            inputStream.close();
            Guild guild = gson.fromJson(jsonContent, GuildResponse.class).getGuild();
            assertNotNull(guild);
            assertEquals(guildId, guild.getProfile().getId());
        } catch (Exception e) {
            fail(e);
        }
    }
}