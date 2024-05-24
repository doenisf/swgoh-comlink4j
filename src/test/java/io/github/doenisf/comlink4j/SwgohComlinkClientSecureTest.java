package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.model.guild.Guild;
import io.github.doenisf.comlink4j.model.player.Player;
import io.github.doenisf.comlink4j.model.player.PlayerArenaProfile;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwgohComlinkClientSecureTest {
    SwgohComlinkApi client;

    @Before
    public void initTests() {
        client = new SwgohComlinkClient("http://localhost:3010", "my-access-key", "my-secret-key");
    }

    @Test
    public void testGetPlayerByAllyCode() {
        Integer allyCode = 315242232;

        try {
            Player player = client.getPlayer(allyCode);
            assertNotNull(player);
            assertEquals(allyCode.toString(), player.getAllyCode());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerById() {
        String id = "DTKHijF-Qtah6ExyOB9eFA";

        try {
            Player player = client.getPlayer(id);
            assertNotNull(player);
            assertEquals(id, player.getPlayerId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerArenaProfileByAllyCode() {
        Integer allyCode = 315242232;

        try {
            PlayerArenaProfile playerArenaProfile = client.getPlayerArenaProfile(allyCode);
            assertNotNull(playerArenaProfile);
            assertEquals(allyCode.longValue(), playerArenaProfile.getAllyCode());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetPlayerArenaProfileById() {
        String id = "DTKHijF-Qtah6ExyOB9eFA";

        try {
            PlayerArenaProfile playerArenaProfile = client.getPlayerArenaProfile(id);
            assertNotNull(playerArenaProfile);
            assertEquals(id, playerArenaProfile.getPlayerId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetGuildById() {
        String guildId = "c2rZ5wg3RBOUQ8Ie2A77jg";

        try {
            Guild guild = client.getGuild(guildId);
            assertNotNull(guild);
            assertEquals(guildId, guild.getProfile().getId());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

}