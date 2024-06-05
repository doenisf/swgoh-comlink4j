package io.github.doenisf.comlink4j;

import io.github.doenisf.comlink4j.exception.ApiException;
import io.github.doenisf.comlink4j.model.endpoints.guild.Guild;
import io.github.doenisf.comlink4j.model.endpoints.player.Player;
import io.github.doenisf.comlink4j.model.endpoints.player.PlayerArenaProfile;
import io.github.doenisf.comlink4j.model.gamedata.GameData;
import io.github.doenisf.comlink4j.model.misc.GameMetaData;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwgohComlinkClientTest {
    SwgohComlinkApi client;

    @Before
    public void initTests() {
        client = new SwgohComlinkClient();
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

    @Test
    public void testGetGameDataWithoutVersion() {
        String expectedResponse = "Request failed with status code 400: Client is requesting gamedata version , which doesn't match the latest version on this server.";
        try {
            client.getGameData("");
        } catch (ApiException e) {
            assertEquals(expectedResponse, e.getCause().getMessage());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetGameData() {
        try {
            String version = client.getGameMetaData().getLatestGamedataVersion();
            GameData gameData = client.getGameData(version);
            assertNotNull(gameData);
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetGameMetaData() {
        try {
            GameMetaData metaData = client.getGameMetaData();
            assertNotNull(metaData.getLatestGamedataVersion());
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }

    }

}