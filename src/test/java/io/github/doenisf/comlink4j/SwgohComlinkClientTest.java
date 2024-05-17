package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.SwgohComlinkClient;
import io.github.doenisf.comlink4j.model.guild.Guild;
import io.github.doenisf.comlink4j.model.player.Player;
import io.github.doenisf.comlink4j.model.player.PlayerArenaProfile;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwgohComlinkClientTest {

    @Test
    public void testGetPlayerByAllyCode() {
        SwgohComlinkClient client = new SwgohComlinkClient();
        Integer allyCode = 315242232;

        try {
            Player player = client.getPlayerByAllyCode(allyCode);
            assertNotNull(player);
            assertEquals(allyCode.toString(), player.getAllyCode());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerById() {
        SwgohComlinkClient client = new SwgohComlinkClient();
        String id = "DTKHijF-Qtah6ExyOB9eFA";

        try {
            Player player = client.getPlayerById(id);
            assertNotNull(player);
            assertEquals(id, player.getPlayerId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerArenaProfileByAllyCode() {
        SwgohComlinkClient client = new SwgohComlinkClient();
        Integer allyCode = 315242232;

        try {
            PlayerArenaProfile playerArenaProfile = client.getPlayerArenaProfileByAllyCode(allyCode);
            assertNotNull(playerArenaProfile);
            assertEquals(allyCode.longValue(), playerArenaProfile.getAllyCode());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerArenaProfileById() {
        SwgohComlinkClient client = new SwgohComlinkClient();
        String id = "DTKHijF-Qtah6ExyOB9eFA";

        try {
            PlayerArenaProfile playerArenaProfile = client.getPlayerArenaProfileById(id);
            assertNotNull(playerArenaProfile);
            assertEquals(id, playerArenaProfile.getPlayerId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetGuildById() {
        SwgohComlinkClient client = new SwgohComlinkClient();
        String guildId = "c2rZ5wg3RBOUQ8Ie2A77jg";

        try {
            Guild guild = client.getGuildById(guildId);
            assertNotNull(guild);
            assertEquals(guildId, guild.getProfile().getId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

}