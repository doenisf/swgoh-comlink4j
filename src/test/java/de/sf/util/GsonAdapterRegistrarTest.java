package de.sf.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import de.sf.model.player.PlayerProfileTab;
import org.junit.jupiter.api.Test;

class GsonAdapterRegistrarTest {


    @Test
    public void testRegisterEnumAdapters() {
        GsonBuilder builder = new GsonBuilder();
        GsonAdapterRegistrar.registerEnumAdapters(builder);

        Gson gson = builder.create();
        TypeAdapter<PlayerProfileTab> adapter = gson.getAdapter(PlayerProfileTab.class);
    }
}