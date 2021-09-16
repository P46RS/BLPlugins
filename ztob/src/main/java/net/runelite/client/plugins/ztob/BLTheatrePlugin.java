/*
 * THIS SOFTWARE WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI
 * No rights reserved. Use, redistribute, and modify at your own discretion,
 * and in accordance with Yagex and RuneLite guidelines.
 * However, aforementioned monkey would prefer if you don't sell this plugin for profit.
 * Good luck on your raids!
 */

package net.runelite.client.plugins.ztob;

import com.google.inject.Binder;
import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.ztob.rooms.BLBloat.BLBloat;
import net.runelite.client.plugins.ztob.rooms.BLMaiden.BLMaiden;
import net.runelite.client.plugins.ztob.rooms.BLNylocas.BLNylocas;
import net.runelite.client.plugins.ztob.rooms.BLSotetseg.BLSotetseg;
import net.runelite.client.plugins.ztob.rooms.BLVerzik.BLVerzik;
import net.runelite.client.plugins.ztob.rooms.BLXarpus.BLXarpus;
import org.pf4j.Extension;

import javax.inject.Inject;

@Extension
@PluginDescriptor(
        name = "BL xz_Theatre",
        description = "BL's All-in-one plugin for Theatre of Blood",
        tags = {"ToB", "bluelite"},
        enabledByDefault = false
)

public class BLTheatrePlugin extends Plugin
{
    private BLRoom[] rooms = null;

    @Inject
    private EventBus eventBus;

    @Inject
    private BLMaiden maiden;
    @Inject
    private BLBloat bloat;
    @Inject
    private BLNylocas nylocas;
    @Inject
    private BLSotetseg sotetseg;
    @Inject
    private BLXarpus xarpus;
    @Inject
    private BLVerzik verzik;
    @Inject
    private Client client;

    @Override
    public void configure(Binder binder)
    {
        binder.bind(BLTheatreInputListener.class);
    }

    @Provides
    BLTheatreConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(BLTheatreConfig.class);
    }

    @Override
    protected void startUp()
    {
        if (rooms == null)
        {
            rooms = new BLRoom[]{maiden, bloat, nylocas, sotetseg, xarpus, verzik};
            for (BLRoom room : rooms)
            {
                room.init();
            }
        }

        for(BLRoom room : rooms)
        {
            room.load();
            eventBus.register(room);
        }
    }

    @Override
    protected void shutDown()
    {
        for(BLRoom room : rooms)
        {
            eventBus.unregister(room);
            room.unload();
        }
    }
}
